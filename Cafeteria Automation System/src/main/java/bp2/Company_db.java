/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nurettin YILDIZ
 */
public class Company_db {

    private static final String connectionString = "jdbc:mysql://127.0.0.1:3306/company_db?user=root&password=FSMBLM";
    private static Connection conn;

    public static boolean AddPersonel(Personel p1) { 
        // TODO: Add personel to database
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO company_db.employee_table (person_id, user_name, name_surname, email, password, gender, position) "
                    + "VALUES (" + p1.personId + ", '" + p1.user_name + "', '" + p1.name_surname + "', '"
                    + p1.email + "', '" + p1.password + "', " + p1.gender + ", '" + p1.position + "')";
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static ArrayList<Personel> SearchByNameEmailOrPersonId(String search) {
        ArrayList<Personel> plist = new ArrayList<>();
        // TODO: Search personel by name, email or person id
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM company_db.employee_table WHERE name_surname LIKE  '%" + search + "%' OR email LIKE '%" + search + "%' OR person_id LIKE '%" + search + "%' ";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Personel np1 = new Personel();
                np1.personId = rs.getInt("person_id");
                np1.user_name = rs.getString("user_name");
                np1.name_surname = rs.getString("name_surname");
                np1.email = rs.getString("email");
                np1.password = rs.getString("password");
                np1.gender = rs.getInt("gender");
                np1.position = rs.getString("position");
                plist.add(np1);

            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return plist;

    }

    public static Personel Login(String email, String password) {
        // TODO: Login personel
        Personel personel = null;
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM company_db.employee_table WHERE email = '" + email + "' AND password = '" + password + "'";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                personel = new Personel();
                personel.personId = rs.getInt("person_id");
                personel.user_name = rs.getString("user_name");
                personel.name_surname = rs.getString("name_surname");
                personel.email = rs.getString("email");
                personel.password = rs.getString("password");
                personel.gender = rs.getInt("gender");
                personel.position = rs.getString("position");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return personel;

    }

    public static boolean AddSupplier(Supplier s1) {
            // TODO: Add supplier to database
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO company_db.supplier_table (supplier_id, supplier_name, supplier_company) "
                    + "VALUES (" + s1.supplierId + ", '" + s1.supplierName + "', '" + s1.supplierCompany + "')";
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static boolean AddCategory(Category c1) {
        // TODO: Add category to database
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO company_db.category_table (category_id, category_name) "
                    + "VALUES (" + c1.categoryId + ", '" + c1.categoryName + "')";
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static ArrayList<Category> SearchCategoryByName(String search) {
        ArrayList<Category> clist = new ArrayList<>();
            // TODO: Search category by name
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM company_db.category_table WHERE category_name LIKE  '%" + search + "%' ";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Category cp1 = new Category();
                cp1.categoryId = rs.getInt("category_id");
                cp1.categoryName = rs.getString("category_name");
                clist.add(cp1);

            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clist;

    }

    public static boolean AddProduct(Product p1) {
        // TODO: Add product to database
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO company_db.product_table (product_id, product_name, product_serial_number, product_category, product_price, product_stock,product_supplier) "
                    + "VALUES (" + p1.productId + ", '" + p1.productName + "', '" + p1.productSerialNumber + "', '" + p1.productCategory + "', " + p1.productPrice + ", " + p1.productStock + ", '" + p1.productSupplier + "')";
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static ArrayList<Category> getCategoryName() {
        // TODO: Get category name from database
        ArrayList<Category> cnlist = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM company_db.category_table";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Category cp1 = new Category();
                cp1.categoryId = rs.getInt("category_id");
                cp1.categoryName = rs.getString("category_name");
                cnlist.add(cp1);

            }
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnlist;

    }

    public static ArrayList<Supplier> getSupplierName() {
        // TODO: Get supplier name from database
        ArrayList<Supplier> splist = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM company_db.supplier_table";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Supplier s1 = new Supplier();
                s1.supplierId = rs.getInt("supplier_id");
                s1.supplierName = rs.getString("supplier_name");
                s1.supplierCompany = rs.getString("supplier_company");
                splist.add(s1);

            }
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return splist;

    }

    public static String generateSerialNumber() {
        // TODO: Generate serial number
        Random random = new Random();
        int number = random.nextInt(1000000); // 0 ile 999999 arasında rastgele bir sayı üretiyoruz
        String serialNumber = String.format("#%06d", number); // Sayıyı 6 haneli string formatına dönüştürüyoruz
        return serialNumber;
    }



    public static ArrayList<Product> getProductsName() {
        // TODO: Get product name from database
        ArrayList<Product> pnlist = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM company_db.product_table";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Product p1 = new Product();
                p1.productId = rs.getInt("product_id");
                p1.productName = rs.getString("product_name");
                p1.productSerialNumber = rs.getString("product_serial_number");
                p1.productCategory = rs.getString("product_category");
                p1.productPrice = rs.getDouble("product_price");
                p1.productStock = rs.getInt("product_stock");
                p1.productSupplier = rs.getString("product_supplier");
                pnlist.add(p1);

            }
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pnlist;

    }

    public static boolean UpdateProduct(Product p1) {
        // TODO: Update product in database
        try {
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "UPDATE company_db.product_table SET product_name = '" + p1.productName + "', product_serial_number = '" + p1.productSerialNumber + "', product_category = '" + p1.productCategory + "', product_price = " + p1.productPrice + ", product_stock = " + p1.productStock + ", product_supplier = '" + p1.productSupplier + "' WHERE product_id = " + p1.productId;
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static Product SearchProductById(int id) {
        // TODO: Search product by id in database
        Product p1 = new Product();
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM company_db.product_table WHERE product_id = " + id;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                p1.productId = rs.getInt("product_id");
                p1.productName = rs.getString("product_name");
                p1.productSerialNumber = rs.getString("product_serial_number");
                p1.productCategory = rs.getString("product_category");
                p1.productPrice = rs.getDouble("product_price");
                p1.productStock = rs.getInt("product_stock");
                p1.productSupplier = rs.getString("product_supplier");
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p1;
    }

    public static ArrayList<Supplier> SearchBySupplierIdNameOrCompany(String search) {
        // TODO: Search supplier by id, name or company in database
        ArrayList<Supplier> Slist = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM company_db.supplier_table WHERE supplier_id LIKE '%" + search + "%' OR supplier_name LIKE '%" + search + "%' OR supplier_company LIKE '%" + search + "%'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Supplier np1 = new Supplier();
                np1.supplierId = rs.getInt("supplier_id");
                np1.supplierName = rs.getString("supplier_name");
                np1.supplierCompany = rs.getString("supplier_company");
                Slist.add(np1);

            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Slist;

    }

    public static String getProductNameById(int id) {
        // TODO: Get product name by id from database
        String name = "";
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT product_name FROM company_db.product_table WHERE product_id = " + id;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                name = rs.getString("product_name");
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return name;
    }

    public static Double getProductPriceById(int id) {
        // TODO: Get product price by id from database
        Double price = 0.0;
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT product_price FROM company_db.product_table WHERE product_id = " + id;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                price = rs.getDouble("product_price");
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return price;
    }

    public static int getProductStockById(int id) {
        // TODO: Get product stock by id from database
        int stock = 0;
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT product_stock FROM company_db.product_table WHERE product_id = " + id;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                stock = rs.getInt("product_stock");
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stock;
    }

    public static boolean addSales(Sales s1) {
        // TODO: Add sales to database
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO company_db.sales_table (sales_id, person_id, name_surname, product_name, serial_number, product_price, amount) VALUES (" + s1.saleId + ", " + s1.personId + ", '" + s1.name_surname + "', '" + s1.productName + "', '" + s1.productSerialNumber + "', " + s1.productPrice + ", " + s1.amount + ")";
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static ArrayList<Personel> searchPersonByEmail(String email) {
        // TODO: Search person by email in database
        ArrayList<Personel> plist = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM company_db.employee_table WHERE email LIKE '%" + email + "%'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Personel p1 = new Personel();
                p1.personId = rs.getInt("person_id");
                p1.user_name = rs.getString("user_name");
                p1.name_surname = rs.getString("name_surname");
                p1.email = rs.getString("email");
                p1.password = rs.getString("password");
                p1.gender = rs.getInt("gender");
                p1.position = rs.getString("position");
                plist.add(p1);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return plist;

    }

    public static String getProductSerialNumberById(int id) {
        // TODO: Get product serial number by id from database
        String serialNumber = "";
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT product_serial_number FROM company_db.product_table WHERE product_id = " + id;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                serialNumber = rs.getString("product_serial_number");
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return serialNumber;

    }

    public static boolean UpdateProductStock(int id, int stock) {
        // TODO: Update product stock by id from database
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "UPDATE company_db.product_table SET product_stock = " + stock + " WHERE product_id = " + id;
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public static ArrayList<Sales> searchByProductNameOrPersonelName(String search) {
        // TODO: Search by product name or personel name in database
        ArrayList<Sales> slist = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM company_db.sales_table WHERE name_surname LIKE '%" + search + "%' OR product_name LIKE '%" + search + "%'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Sales cp1 = new Sales();
                cp1.saleId = rs.getInt("sales_id");
                cp1.personId = rs.getInt("person_id");
                cp1.name_surname = rs.getString("name_surname");
                cp1.productName = rs.getString("product_name");
                cp1.productSerialNumber = rs.getString("serial_number");
                cp1.productPrice = rs.getDouble("product_price");
                cp1.amount = rs.getInt("amount");
                slist.add(cp1);

            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return slist;

    }
    public static boolean  UpdateSupplier (Supplier s1){
        // TODO: Update supplier by id from database
        try{
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "UPDATE company_db.supplier_table SET supplier_name = '" + s1.supplierName + "', supplier_company = '"+ s1.supplierCompany + "' WHERE supplier_id = " + s1.supplierId;
            stmt.executeUpdate(query);
            conn.close();
            return true;
        }
        catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public static Supplier getSupplierById(int id){
        // TODO: Get supplier by id from database
        Supplier s1 = new Supplier();
        try{
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM company_db.supplier_table WHERE supplier_id = " + id;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                s1.supplierId = rs.getInt("supplier_id");
                s1.supplierName = rs.getString("supplier_name");
                s1.supplierCompany = rs.getString("supplier_company");
            }
            conn.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s1;

    }
    public static boolean DeleteSupplierById(int id) {
        // TODO: Delete supplier by id from database
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "DELETE FROM company_db. supplier_table WHERE supplier_id=" + id;
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public static boolean DeleteProductById(int id) {
        // TODO: Delete product by id from database
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "DELETE FROM company_db. product_table WHERE product_id=" + id;
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Company_db.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        }
    }







}
