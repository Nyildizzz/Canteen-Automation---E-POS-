/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bp2;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nurettin YILDIZ
 */
public class Ana_Menu extends javax.swing.JFrame {

    CardLayout cardLayout;
    DefaultTableModel tbl_table_product;
    DefaultTableModel tbl_table_suppliers;
    public static String currentUserName;
    public static int currentUserId;
    public static String currentNameSurname;

    public Ana_Menu() {
        initComponents();
        // bu kısımda arraylistler ve company_db'den gelen değerler sayesinde combo boxlar ve tablolara veriler eklenir.
        ArrayList<Personel> personelList = Company_db.searchPersonByEmail(Giriş_Ekranı.loginEmail);
        for (Personel personel : personelList) {
            currentNameSurname = personel.name_surname;
            currentUserId = personel.personId;
            currentUserName = personel.user_name;

        }
        ArrayList<Category> clist = Company_db.getCategoryName();
        for (Category category : clist) {
            cmbx_category.addItem(category.categoryName);
        }
        ArrayList<Supplier> slist = Company_db.getSupplierName();
        for (Supplier supplier : slist) {
            cmbx_supplier.addItem(supplier.supplierCompany);

        }
        txt_seri_no1.setText(Company_db.generateSerialNumber());

        Component[] components = this.getContentPane().getComponents();
        for (Component component : components) {
            if (component instanceof JButton) {
                ((JButton) component).setUI(new BasicButtonUI());

            }

        }
        tbl_table_product = new DefaultTableModel();
        tbl_table_product.setColumnIdentifiers(new Object[]{"Pid", "ProductName", "SeriNo", "Category", "Price", "Stock", "Supplier"});
        tbl_add_product_products.setModel(tbl_table_product);

        ArrayList<Product> plist = Company_db.getProductsName();
        tbl_table_product.setRowCount(0);
        for (Product p1 : plist) {
            tbl_table_product.addRow(new Object[]{p1.productId, p1.productName, p1.productSerialNumber, p1.productCategory, p1.productPrice, p1.productStock, p1.productSupplier});

        }
        tbl_table_suppliers = new DefaultTableModel();
        tbl_table_suppliers.setColumnIdentifiers(new Object[]{"SupplierId", "SupplierCompany", "SupplierName"});
        tbl_search_supplier.setModel(tbl_table_suppliers);
        lbl_current_name.setText(currentUserName);

        cardLayout = (CardLayout) (pnl_cards.getLayout());

    }

    private double calculateTotalPrice() {
        DefaultTableModel dt = (DefaultTableModel) tbl_sales.getModel();
        double totalPrice = 0.0;
        for (int row = 0; row < dt.getRowCount(); row++) {
            Object quantityObj = dt.getValueAt(row, 5);
            Object priceObj = dt.getValueAt(row, 6);

            if (quantityObj != null && quantityObj instanceof Number && priceObj != null && priceObj instanceof Number) {
                int quantity = ((Number) quantityObj).intValue();
                double price = ((Number) priceObj).doubleValue();
                double productTotalPrice = quantity * price;
                totalPrice += productTotalPrice;
            }
        }

        return Math.round(totalPrice * 100.0) / 100.0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        menu_dark_mode = new javax.swing.JMenuItem();
        menu_light_mode = new javax.swing.JMenuItem();
        jSplitPane2 = new javax.swing.JSplitPane();
        lbl_left = new javax.swing.JPanel();
        btn_Sales = new javax.swing.JButton();
        btn_Supplier = new javax.swing.JButton();
        btn_product = new javax.swing.JButton();
        btn_about = new javax.swing.JButton();
        lbl_logo_sales = new javax.swing.JLabel();
        lbl_logo_supplier = new javax.swing.JLabel();
        lbl_logo_product = new javax.swing.JLabel();
        lbl_logo_about = new javax.swing.JLabel();
        pnl_current_acount = new javax.swing.JPanel();
        lbl_current_name = new javax.swing.JLabel();
        pnl_logo_current_account = new javax.swing.JPanel();
        lbl_logo_current_account = new javax.swing.JLabel();
        lbl_footer_1 = new javax.swing.JLabel();
        lbl_footer = new javax.swing.JLabel();
        btn_refresh = new javax.swing.JButton();
        lbl_refresh = new javax.swing.JLabel();
        pnl_cards = new javax.swing.JPanel();
        pnl_card1 = new javax.swing.JPanel();
        pnl_sales = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_sales = new javax.swing.JTable();
        txt_sales_search = new javax.swing.JTextField();
        lbl_sales_search = new javax.swing.JLabel();
        btn_sales_search = new javax.swing.JButton();
        lbl_sales = new javax.swing.JLabel();
        lbl_total_sales = new javax.swing.JLabel();
        lbl_total_sales_00 = new javax.swing.JLabel();
        pnl_card2 = new javax.swing.JPanel();
        pnl_supplier = new javax.swing.JPanel();
        lbl_search_supplier_id = new javax.swing.JLabel();
        lbl_supplier_title = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_search_supplier = new javax.swing.JTable();
        txt_supplier_seacrh = new javax.swing.JTextField();
        pnl_card3 = new javax.swing.JPanel();
        tbn_pnl_product = new javax.swing.JTabbedPane();
        pnl_add_product = new javax.swing.JPanel();
        pnl_add = new javax.swing.JPanel();
        lbl_pid = new javax.swing.JLabel();
        lbl_product_name = new javax.swing.JLabel();
        lbl_category = new javax.swing.JLabel();
        lbl_price = new javax.swing.JLabel();
        lbl_seri_no = new javax.swing.JLabel();
        lbl_stock1 = new javax.swing.JLabel();
        txt_pid = new javax.swing.JTextField();
        txt_product_name = new javax.swing.JTextField();
        txt_seri_no1 = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_stock = new javax.swing.JTextField();
        cmbx_category = new javax.swing.JComboBox<>();
        btn_delete_product = new javax.swing.JButton();
        btn_add_product = new javax.swing.JButton();
        btn_product_update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_add_product_products = new javax.swing.JTable();
        cmbx_supplier = new javax.swing.JComboBox<>();
        lbl_supplier = new javax.swing.JLabel();
        pnl_card5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel1 = new bp2.KGradientPanel();
        lbl_invertory_system = new javax.swing.JLabel();
        menu_bar_top = new javax.swing.JMenuBar();
        menu_general = new javax.swing.JMenu();
        menu_item_newSale = new javax.swing.JMenuItem();
        menu_item_exit = new javax.swing.JMenuItem();
        menu_item_logOut = new javax.swing.JMenuItem();
        menu_extras = new javax.swing.JMenu();
        menu_item_employee = new javax.swing.JMenuItem();
        menu_item_settings = new javax.swing.JMenuItem();
        menu_navigation = new javax.swing.JMenu();
        menu_item_sales = new javax.swing.JMenuItem();
        menu_item_supplier = new javax.swing.JMenuItem();
        menu_item_produt = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        menu_dark_mode.setText("Dark Mode");
        menu_dark_mode.setComponentPopupMenu(jPopupMenu1);
        menu_dark_mode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_dark_modeActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menu_dark_mode);

        menu_light_mode.setText("Light");
        menu_light_mode.setComponentPopupMenu(jPopupMenu1);
        menu_light_mode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_light_modeActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menu_light_mode);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Main Menu");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        lbl_left.setBackground(new java.awt.Color(0, 0, 0));
        lbl_left.setComponentPopupMenu(jPopupMenu1);
        lbl_left.setMaximumSize(new java.awt.Dimension(150, 200));
        lbl_left.setMinimumSize(new java.awt.Dimension(150, 200));
        lbl_left.setPreferredSize(new java.awt.Dimension(150, 200));
        lbl_left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Sales.setBackground(new java.awt.Color(23, 199, 204));
        btn_Sales.setForeground(new java.awt.Color(0, 0, 0));
        btn_Sales.setText("Sales");
        btn_Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalesActionPerformed(evt);
            }
        });
        lbl_left.add(btn_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 30));

        btn_Supplier.setBackground(new java.awt.Color(23, 199, 204));
        btn_Supplier.setForeground(new java.awt.Color(0, 0, 0));
        btn_Supplier.setText("Supplier");
        btn_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SupplierActionPerformed(evt);
            }
        });
        lbl_left.add(btn_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, 30));

        btn_product.setBackground(new java.awt.Color(23, 199, 204));
        btn_product.setForeground(new java.awt.Color(0, 0, 0));
        btn_product.setText("Product");
        btn_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productActionPerformed(evt);
            }
        });
        lbl_left.add(btn_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, 30));

        btn_about.setBackground(new java.awt.Color(23, 199, 204));
        btn_about.setForeground(new java.awt.Color(0, 0, 0));
        btn_about.setText("About");
        btn_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutActionPerformed(evt);
            }
        });
        lbl_left.add(btn_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 120, 30));

        lbl_logo_sales.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-sales-25.png")); // NOI18N
        lbl_left.add(lbl_logo_sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        lbl_logo_supplier.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-supplier-25.png")); // NOI18N
        lbl_left.add(lbl_logo_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 25, 25));

        lbl_logo_product.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-product-25.png")); // NOI18N
        lbl_left.add(lbl_logo_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 25, 25));

        lbl_logo_about.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-about-25.png")); // NOI18N
        lbl_left.add(lbl_logo_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 24, -1));

        pnl_current_acount.setBackground(new java.awt.Color(23, 199, 204));

        lbl_current_name.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_current_name.setForeground(new java.awt.Color(0, 0, 0));
        lbl_current_name.setText("Account");

        pnl_logo_current_account.setBackground(new java.awt.Color(0, 0, 0));

        lbl_logo_current_account.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-account-48.png")); // NOI18N

        javax.swing.GroupLayout pnl_logo_current_accountLayout = new javax.swing.GroupLayout(pnl_logo_current_account);
        pnl_logo_current_account.setLayout(pnl_logo_current_accountLayout);
        pnl_logo_current_accountLayout.setHorizontalGroup(
            pnl_logo_current_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_logo_current_accountLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_logo_current_account, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_logo_current_accountLayout.setVerticalGroup(
            pnl_logo_current_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_logo_current_accountLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_logo_current_account, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_current_acountLayout = new javax.swing.GroupLayout(pnl_current_acount);
        pnl_current_acount.setLayout(pnl_current_acountLayout);
        pnl_current_acountLayout.setHorizontalGroup(
            pnl_current_acountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_current_acountLayout.createSequentialGroup()
                .addComponent(pnl_logo_current_account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_current_name, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_current_acountLayout.setVerticalGroup(
            pnl_current_acountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_current_acountLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lbl_current_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_current_acountLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_logo_current_account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbl_left.add(pnl_current_acount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 150, 40));

        lbl_footer_1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_footer_1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_footer_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_footer_1.setText("All rights reserved.");
        lbl_left.add(lbl_footer_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 120, 20));

        lbl_footer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_footer.setForeground(new java.awt.Color(255, 255, 255));
        lbl_footer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_footer.setText("© 2023 Ebizmarts");
        lbl_left.add(lbl_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 120, 20));

        btn_refresh.setBackground(new java.awt.Color(0, 0, 0));
        btn_refresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-refresh-48.png")); // NOI18N
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        lbl_left.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 40, 50));

        lbl_refresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_refresh.setForeground(new java.awt.Color(23, 199, 204));
        lbl_refresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_refresh.setText("Refresh");
        lbl_left.add(lbl_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 100, 30));

        jSplitPane2.setLeftComponent(lbl_left);

        pnl_cards.setBackground(new java.awt.Color(102, 102, 102));
        pnl_cards.setLayout(new java.awt.CardLayout());

        pnl_card1.setBackground(new java.awt.Color(0, 0, 0));

        pnl_sales.setBackground(new java.awt.Color(0, 255, 255));
        pnl_sales.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbl_sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Sales_id", "person_id", "Name_surname", "ProductName", "SeriNo", "Price", "Amount"
            }
        ));
        jScrollPane2.setViewportView(tbl_sales);

        txt_sales_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sales_searchActionPerformed(evt);
            }
        });

        lbl_sales_search.setBackground(new java.awt.Color(0, 0, 0));
        lbl_sales_search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_sales_search.setText("Search");

        btn_sales_search.setBackground(new java.awt.Color(0, 0, 0));
        btn_sales_search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_sales_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_sales_search.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\search x30.png")); // NOI18N
        btn_sales_search.setText("SEARCH");
        btn_sales_search.setBorder(null);
        btn_sales_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sales_searchActionPerformed(evt);
            }
        });

        lbl_sales.setBackground(new java.awt.Color(0, 0, 0));
        lbl_sales.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lbl_sales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sales.setText("SALES");

        lbl_total_sales.setBackground(new java.awt.Color(0, 0, 0));
        lbl_total_sales.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_total_sales.setForeground(new java.awt.Color(0, 0, 0));
        lbl_total_sales.setText("Total Sales :");

        lbl_total_sales_00.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_total_sales_00.setForeground(new java.awt.Color(0, 0, 0));
        lbl_total_sales_00.setText("00");

        javax.swing.GroupLayout pnl_salesLayout = new javax.swing.GroupLayout(pnl_sales);
        pnl_sales.setLayout(pnl_salesLayout);
        pnl_salesLayout.setHorizontalGroup(
            pnl_salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_salesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnl_salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_sales, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_salesLayout.createSequentialGroup()
                        .addComponent(lbl_sales_search, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txt_sales_search, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(225, 225, 225))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_salesLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(pnl_salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_salesLayout.createSequentialGroup()
                        .addComponent(btn_sales_search, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_salesLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(pnl_salesLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lbl_total_sales, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_total_sales_00, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_salesLayout.setVerticalGroup(
            pnl_salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_salesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl_sales, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(pnl_salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sales_search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sales_search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btn_sales_search, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(pnl_salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_total_sales, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_total_sales_00, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_card1Layout = new javax.swing.GroupLayout(pnl_card1);
        pnl_card1.setLayout(pnl_card1Layout);
        pnl_card1Layout.setHorizontalGroup(
            pnl_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_card1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl_sales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnl_card1Layout.setVerticalGroup(
            pnl_card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_card1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(pnl_sales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pnl_cards.add(pnl_card1, "card2");

        pnl_card2.setBackground(new java.awt.Color(0, 0, 0));

        pnl_supplier.setBackground(new java.awt.Color(0, 255, 255));
        pnl_supplier.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_supplier.setPreferredSize(new java.awt.Dimension(694, 500));

        lbl_search_supplier_id.setBackground(new java.awt.Color(0, 0, 0));
        lbl_search_supplier_id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_search_supplier_id.setText("Search By supplier id, name or company");

        lbl_supplier_title.setBackground(new java.awt.Color(0, 0, 0));
        lbl_supplier_title.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbl_supplier_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_supplier_title.setText("Searching Supplier");

        tbl_search_supplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SupplierId", "SupplierName", "SupplierCompany"
            }
        ));
        jScrollPane3.setViewportView(tbl_search_supplier);

        txt_supplier_seacrh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_supplier_seacrhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_supplierLayout = new javax.swing.GroupLayout(pnl_supplier);
        pnl_supplier.setLayout(pnl_supplierLayout);
        pnl_supplierLayout.setHorizontalGroup(
            pnl_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_supplierLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(pnl_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_supplierLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_supplierLayout.createSequentialGroup()
                        .addComponent(lbl_search_supplier_id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_supplier_seacrh, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_supplierLayout.createSequentialGroup()
                        .addComponent(lbl_supplier_title, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))))
        );
        pnl_supplierLayout.setVerticalGroup(
            pnl_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_supplierLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbl_supplier_title, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addGroup(pnl_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_search_supplier_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_supplier_seacrh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_card2Layout = new javax.swing.GroupLayout(pnl_card2);
        pnl_card2.setLayout(pnl_card2Layout);
        pnl_card2Layout.setHorizontalGroup(
            pnl_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_card2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(pnl_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        pnl_card2Layout.setVerticalGroup(
            pnl_card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_card2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(pnl_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pnl_cards.add(pnl_card2, "card3");

        pnl_card3.setBackground(new java.awt.Color(255, 255, 255));

        tbn_pnl_product.setBackground(new java.awt.Color(0, 255, 255));
        tbn_pnl_product.setOpaque(true);

        pnl_add_product.setBackground(new java.awt.Color(0, 0, 0));

        pnl_add.setBackground(new java.awt.Color(0, 255, 255));
        pnl_add.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_pid.setBackground(new java.awt.Color(0, 0, 0));
        lbl_pid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_pid.setText("Pid");

        lbl_product_name.setBackground(new java.awt.Color(0, 0, 0));
        lbl_product_name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_product_name.setText("Product Name");

        lbl_category.setBackground(new java.awt.Color(0, 0, 0));
        lbl_category.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_category.setText("Catagory");

        lbl_price.setBackground(new java.awt.Color(0, 0, 0));
        lbl_price.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_price.setText("Price");

        lbl_seri_no.setBackground(new java.awt.Color(0, 0, 0));
        lbl_seri_no.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_seri_no.setText("Seri No");

        lbl_stock1.setBackground(new java.awt.Color(0, 0, 0));
        lbl_stock1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_stock1.setText("Stock");

        txt_pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pidActionPerformed(evt);
            }
        });

        cmbx_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbx_categoryActionPerformed(evt);
            }
        });

        btn_delete_product.setBackground(new java.awt.Color(0, 0, 0));
        btn_delete_product.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_delete_product.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete_product.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\remove.png")); // NOI18N
        btn_delete_product.setText("DELETE");
        btn_delete_product.setBorder(null);
        btn_delete_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_productActionPerformed(evt);
            }
        });

        btn_add_product.setBackground(new java.awt.Color(0, 0, 0));
        btn_add_product.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_add_product.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_product.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-add-25 (1).png")); // NOI18N
        btn_add_product.setText("ADD");
        btn_add_product.setBorder(null);
        btn_add_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_productActionPerformed(evt);
            }
        });

        btn_product_update.setBackground(new java.awt.Color(0, 0, 0));
        btn_product_update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_product_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_product_update.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\update.png")); // NOI18N
        btn_product_update.setText("UPDATE");
        btn_product_update.setBorder(null);
        btn_product_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_product_updateActionPerformed(evt);
            }
        });

        tbl_add_product_products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Pid", "ProductName", "SeriNo", "Category", "Price", "Stock", "Supplier	"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_add_product_products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_add_product_productsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_add_product_products);

        lbl_supplier.setBackground(new java.awt.Color(0, 0, 0));
        lbl_supplier.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_supplier.setText("Supplier");

        javax.swing.GroupLayout pnl_addLayout = new javax.swing.GroupLayout(pnl_add);
        pnl_add.setLayout(pnl_addLayout);
        pnl_addLayout.setHorizontalGroup(
            pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
            .addGroup(pnl_addLayout.createSequentialGroup()
                .addGroup(pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_addLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btn_add_product, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_product_update, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete_product, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_addLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnl_addLayout.createSequentialGroup()
                                .addComponent(lbl_pid, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_pid, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_addLayout.createSequentialGroup()
                                .addComponent(lbl_seri_no, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_seri_no1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_addLayout.createSequentialGroup()
                                .addComponent(lbl_product_name)
                                .addGap(13, 13, 13)
                                .addComponent(txt_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_addLayout.createSequentialGroup()
                                .addComponent(lbl_category, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbx_category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnl_addLayout.createSequentialGroup()
                                    .addComponent(lbl_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbx_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(pnl_addLayout.createSequentialGroup()
                                        .addComponent(lbl_stock1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_stock))
                                    .addGroup(pnl_addLayout.createSequentialGroup()
                                        .addComponent(lbl_price, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(430, Short.MAX_VALUE))
        );
        pnl_addLayout.setVerticalGroup(
            pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_addLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_seri_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_seri_no1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_category, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbx_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_stock1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbx_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add_product, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_product_update, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_product, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_add_productLayout = new javax.swing.GroupLayout(pnl_add_product);
        pnl_add_product.setLayout(pnl_add_productLayout);
        pnl_add_productLayout.setHorizontalGroup(
            pnl_add_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_add_productLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pnl_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_add_productLayout.setVerticalGroup(
            pnl_add_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_add_productLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        tbn_pnl_product.addTab("Add Product", new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-product-25 (1).png"), pnl_add_product); // NOI18N

        javax.swing.GroupLayout pnl_card3Layout = new javax.swing.GroupLayout(pnl_card3);
        pnl_card3.setLayout(pnl_card3Layout);
        pnl_card3Layout.setHorizontalGroup(
            pnl_card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbn_pnl_product)
        );
        pnl_card3Layout.setVerticalGroup(
            pnl_card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbn_pnl_product)
        );

        pnl_cards.add(pnl_card3, "card4");

        pnl_card5.setBackground(new java.awt.Color(0, 255, 255));

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Ebizmarts is a leading ePos canteen automation company, specializing in tailored solutions \nfor foodservice operations. With our advanced ePos systems, we streamline canteen\nmanagement, optimize workflows, and deliver exceptional customer experiences.\n\n\nBacked by extensive industry experience, our robust platform seamlessly integrates with\nhardware devices for real-time sales, inventory, and employee performance management. \nDesigned to handle high-volume transactions, our solutions ensure smooth operations with \nutmost accuracy and security.\n\n\n\nCommitted to your success, our dedicated team provides unparalleled support from setup\nto ongoing maintenance. Join the growing number of canteens benefiting from automation\nwith Ebizmarts and transform your canteen into a modern, efficient hub.\n\nContact us today to embark on this exciting journey.\n\n");
        jScrollPane4.setViewportView(jTextArea1);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("About Company");

        javax.swing.GroupLayout pnl_card5Layout = new javax.swing.GroupLayout(pnl_card5);
        pnl_card5.setLayout(pnl_card5Layout);
        pnl_card5Layout.setHorizontalGroup(
            pnl_card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_card5Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(pnl_card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_card5Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_card5Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220))))
        );
        pnl_card5Layout.setVerticalGroup(
            pnl_card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_card5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pnl_cards.add(pnl_card5, "card6");

        jSplitPane2.setRightComponent(pnl_cards);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(23, 199, 204));

        lbl_invertory_system.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbl_invertory_system.setForeground(new java.awt.Color(0, 0, 0));
        lbl_invertory_system.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_invertory_system.setText("Inventory System");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl_invertory_system)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbl_invertory_system, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        menu_general.setText("General");

        menu_item_newSale.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-sale-25.png")); // NOI18N
        menu_item_newSale.setText("New Sale");
        menu_item_newSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_newSaleActionPerformed(evt);
            }
        });
        menu_general.add(menu_item_newSale);

        menu_item_exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-exit-25 (1).png")); // NOI18N
        menu_item_exit.setText("Exit");
        menu_item_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_exitActionPerformed(evt);
            }
        });
        menu_general.add(menu_item_exit);

        menu_item_logOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-open-pane-25.png")); // NOI18N
        menu_item_logOut.setText("Log Out");
        menu_item_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_logOutActionPerformed(evt);
            }
        });
        menu_general.add(menu_item_logOut);

        menu_bar_top.add(menu_general);

        menu_extras.setText("Extra");

        menu_item_employee.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-employee-25.png")); // NOI18N
        menu_item_employee.setText("Staff");
        menu_item_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_employeeActionPerformed(evt);
            }
        });
        menu_extras.add(menu_item_employee);

        menu_item_settings.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-settings-25.png")); // NOI18N
        menu_item_settings.setText("Settings");
        menu_item_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_settingsActionPerformed(evt);
            }
        });
        menu_extras.add(menu_item_settings);

        menu_bar_top.add(menu_extras);

        menu_navigation.setText("Navigation");
        menu_navigation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_navigationActionPerformed(evt);
            }
        });

        menu_item_sales.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-sales-25.png")); // NOI18N
        menu_item_sales.setText("Sales");
        menu_item_sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_salesActionPerformed(evt);
            }
        });
        menu_navigation.add(menu_item_sales);

        menu_item_supplier.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-customer-25.png")); // NOI18N
        menu_item_supplier.setText("Supplier");
        menu_item_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_supplierActionPerformed(evt);
            }
        });
        menu_navigation.add(menu_item_supplier);

        menu_item_produt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-product-25.png")); // NOI18N
        menu_item_produt.setText("Product");
        menu_item_produt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_produtActionPerformed(evt);
            }
        });
        menu_navigation.add(menu_item_produt);

        menu_bar_top.add(menu_navigation);

        setJMenuBar(menu_bar_top);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalesActionPerformed
        // TODO add your handling code here:
        cardLayout.show(pnl_cards, "card2");

    }//GEN-LAST:event_btn_SalesActionPerformed

    private void btn_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SupplierActionPerformed
        // TODO add your handling code here:
        cardLayout.show(pnl_cards, "card3");
    }//GEN-LAST:event_btn_SupplierActionPerformed

    private void btn_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutActionPerformed
        // TODO add your handling code here:
        cardLayout.show(pnl_cards, "card6");
    }//GEN-LAST:event_btn_aboutActionPerformed

    private void menu_item_produtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_produtActionPerformed
        // TODO add your handling code here:
        cardLayout.show(pnl_cards, "card4");
    }//GEN-LAST:event_menu_item_produtActionPerformed

    private void txt_pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pidActionPerformed

    private void txt_sales_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sales_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sales_searchActionPerformed

    private void btn_delete_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_productActionPerformed
        // Ürün silme için arraylist ve database kullanımı
        int rowIndex = tbl_add_product_products.getSelectedRow();
        int id = Integer.parseInt(tbl_table_product.getValueAt(rowIndex, 0).toString());
        Company_db.DeleteProductById(id);
        ArrayList<Product> plist = Company_db.getProductsName();
        tbl_table_product.setRowCount(0);
        for (Product p1 : plist) {
            tbl_table_product.addRow(new Object[]{p1.productId, p1.productName, p1.productSerialNumber, p1.productCategory, p1.productPrice, p1.productStock, p1.productSupplier});

        }
        JOptionPane.showMessageDialog(rootPane, "Product is deleted");
        btn_add_product.setEnabled(true);
        txt_pid.setText("");
        txt_product_name.setText("");
        txt_seri_no1.setText("");
        txt_price.setText("");
        txt_stock.setText("");
        cmbx_category.setSelectedIndex(0);
        cmbx_supplier.setSelectedIndex(0);


    }//GEN-LAST:event_btn_delete_productActionPerformed

    private void btn_product_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_product_updateActionPerformed
        // Ürün güncelleme için arraylist ve database kullanımı
        Product p1 = new Product();
        p1.productId = Integer.parseInt(txt_pid.getText());
        p1.productName = txt_product_name.getText();
        p1.productSerialNumber = txt_seri_no1.getText();
        p1.productCategory = cmbx_category.getSelectedItem().toString();
        p1.productPrice = Double.parseDouble(txt_price.getText());
        p1.productStock = Integer.parseInt(txt_stock.getText());
        p1.productSupplier = cmbx_supplier.getSelectedItem().toString();

        Company_db.UpdateProduct(p1);
        ArrayList<Product> plist = Company_db.getProductsName();
        tbl_table_product.setRowCount(0);
        for (Product p2 : plist) {
            tbl_table_product.addRow(new Object[]{p2.productId, p2.productName, p2.productSerialNumber, p2.productCategory, p2.productPrice, p2.productStock, p2.productSupplier});

        }
        txt_pid.setText("");
        txt_pid.setEnabled(true);
        txt_price.setText("");
        txt_product_name.setText("");
        txt_seri_no1.setText("");
        txt_seri_no1.setEnabled(true);
        txt_stock.setText("");
        btn_add_product.setEnabled(true);
        JOptionPane.showMessageDialog(rootPane, "Product is updated");
    }//GEN-LAST:event_btn_product_updateActionPerformed

    private void btn_add_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_productActionPerformed
        // Ürün ekleme için arraylist ve database kullanımı
      try {
    Product p1 = new Product();

    String productIdText = txt_pid.getText().trim();
    if (productIdText.isEmpty()) {
        throw new Exception("Product Id is empty");
    }
    p1.productId = Integer.parseInt(productIdText);

    String productName = txt_product_name.getText().trim();
    if (productName.isEmpty()) {
        throw new Exception("Product Name is empty");
    }
    p1.productName = productName;

    String productSerialNumber = txt_seri_no1.getText().trim();
    if (productSerialNumber.isEmpty()) {
        throw new Exception("Product Serial Number is empty");
    }
    p1.productSerialNumber = productSerialNumber;

    String productCategory = cmbx_category.getSelectedItem().toString().trim();
    p1.productCategory = productCategory;

    String priceText = txt_price.getText().trim();
    if (priceText.isEmpty()) {
        throw new Exception("Product Price is empty");
    }
    p1.productPrice = Double.parseDouble(priceText);

    String stockText = txt_stock.getText().trim();
    if (stockText.isEmpty()) {
        throw new Exception("Product Stock is empty");
    }
    p1.productStock = Integer.parseInt(stockText);

    String productSupplier = cmbx_supplier.getSelectedItem().toString().trim();
    p1.productSupplier = productSupplier;

    if (Company_db.AddProduct(p1)) {
        JOptionPane.showMessageDialog(rootPane, "Product is added");
        txt_pid.setText("");
        txt_price.setText("");
        txt_product_name.setText("");
        txt_seri_no1.setText(Company_db.generateSerialNumber());
        txt_stock.setText("");
    } else {
        JOptionPane.showMessageDialog(rootPane, "Product is not added");
    }
} catch (Exception ex) {
    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
}

    }//GEN-LAST:event_btn_add_productActionPerformed

    private void cmbx_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbx_categoryActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbx_categoryActionPerformed

    private void tbl_add_product_productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_add_product_productsMouseClicked
        // mouse click sayesinde tablodan gelen veriyi textfieldlara aktarılır.
        if (tbl_add_product_products.getSelectedRow() < 0) {
            return;
        }

        int id = (int) tbl_table_product.getValueAt(tbl_add_product_products.getSelectedRow(), 0);
        Product p1 = Company_db.SearchProductById(id);
        Company_db.SearchProductById(id);
        txt_pid.setText(String.valueOf(p1.productId));
        txt_pid.setEnabled(false);
        txt_product_name.setText(p1.productName);
        txt_seri_no1.setText(p1.productSerialNumber);
        txt_seri_no1.setEnabled(false);
        cmbx_category.setSelectedItem(p1.productCategory.toString());
        txt_price.setText(String.valueOf(p1.productPrice));
        txt_stock.setText(String.valueOf(p1.productStock));
        cmbx_supplier.setSelectedItem(p1.productSupplier.toString());

        btn_add_product.setEnabled(false);
    }//GEN-LAST:event_tbl_add_product_productsMouseClicked

    private void txt_supplier_seacrhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_supplier_seacrhActionPerformed
        // Tedarikçiyi aramak için arraylist ve database kullanımı
        String search = txt_supplier_seacrh.getText();
        ArrayList<Supplier> slist = Company_db.SearchBySupplierIdNameOrCompany(search);
        tbl_table_suppliers.setRowCount(0);
        for (Supplier s1 : slist) {
            tbl_table_suppliers.addRow(new Object[]{s1.supplierId, s1.supplierName, s1.supplierCompany});

        }
    }//GEN-LAST:event_txt_supplier_seacrhActionPerformed

    private void menu_item_newSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_newSaleActionPerformed
        // TODO add your handling code here:
        Yeni_Satış y1 = new Yeni_Satış();
        y1.setVisible(true);
    }//GEN-LAST:event_menu_item_newSaleActionPerformed

    private void btn_sales_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sales_searchActionPerformed
        // Yapılan Satışları aramak için arraylist ve database kullanımı
        String search = txt_sales_search.getText();
        DefaultTableModel dt = (DefaultTableModel) tbl_sales.getModel();
        ArrayList<Sales> slist = Company_db.searchByProductNameOrPersonelName(search);
        dt.setRowCount(0);
        for (Sales np1 : slist) {
            dt.addRow(new Object[]{np1.saleId, np1.personId, np1.name_surname, np1.productName, np1.productSerialNumber, np1.productPrice, np1.amount});

        }
        lbl_total_sales_00.setText(String.valueOf(calculateTotalPrice()));


    }//GEN-LAST:event_btn_sales_searchActionPerformed

    private void btn_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productActionPerformed
        // TODO add your handling code here:
        cardLayout.show(pnl_cards, "card4");
    }//GEN-LAST:event_btn_productActionPerformed

    private void menu_item_salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_salesActionPerformed
        // TODO add your handling code here:
        cardLayout.show(pnl_cards, "card2");
    }//GEN-LAST:event_menu_item_salesActionPerformed

    private void menu_item_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_supplierActionPerformed
        // TODO add your handling code here:
        cardLayout.show(pnl_cards, "card3");
    }//GEN-LAST:event_menu_item_supplierActionPerformed

    private void menu_navigationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_navigationActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_menu_navigationActionPerformed

    private void menu_item_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_employeeActionPerformed
        // TODO add your handling code here:
        String email = JOptionPane.showInputDialog("Enter your email");
        String managerEmail = "nyildiz61@gmail.com";
        String managerPassword = "Mypassword";
        if (email.equals(managerEmail)) {
            String password = JOptionPane.showInputDialog("Enter your password");
            if (password.equals(managerPassword)) {
                Calısanlar_Ekranı c1 = new Calısanlar_Ekranı();
                c1.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Wrong password");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Wrong email");
        }

    }//GEN-LAST:event_menu_item_employeeActionPerformed

    private void menu_item_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menu_item_exitActionPerformed

    private void menu_item_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_logOutActionPerformed
        // TODO add your handling code here:
        Giriş_Ekranı g1 = new Giriş_Ekranı();
        g1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_item_logOutActionPerformed

    private void menu_item_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_settingsActionPerformed
        // TODO add your handling code here:
        Ayarlar_Ekranı a1 = new Ayarlar_Ekranı();
        a1.setVisible(true);

    }//GEN-LAST:event_menu_item_settingsActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // combo boxları ve tabloyu güncellemek için databasedan gelen değerleri kullanarak
        DefaultTableModel dt = (DefaultTableModel) tbl_add_product_products.getModel();
        dt.setRowCount(0);
        ArrayList<Product> plist = Company_db.getProductsName();
        for (Product p1 : plist) {
            dt.addRow(new Object[]{p1.productId, p1.productName, p1.productSerialNumber, p1.productCategory, p1.productPrice, p1.productStock, p1.productSupplier});
        }
        ArrayList<Category> clist = Company_db.getCategoryName();
        for (Category category : clist) {
            cmbx_category.addItem(category.categoryName);
        }
        ArrayList<Supplier> slist = Company_db.getSupplierName();
        for (Supplier supplier : slist) {
            cmbx_supplier.addItem(supplier.supplierCompany);

        }

    }//GEN-LAST:event_btn_refreshActionPerformed

    private void menu_dark_modeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_dark_modeActionPerformed
        // pop up menu kullanarak  ana menuyu dark mode yapmak için
        lbl_left.setBackground(Color.black);
        pnl_card1.setBackground(Color.black);
        pnl_card2.setBackground(Color.black);
        pnl_add_product.setBackground(Color.black);
        pnl_card5.setBackground(Color.black);
        btn_refresh.setBackground(Color.black);
        lbl_footer.setForeground(Color.white);
        lbl_footer_1.setForeground(Color.white);
        pnl_logo_current_account.setBackground(Color.black);


    }//GEN-LAST:event_menu_dark_modeActionPerformed

    private void menu_light_modeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_light_modeActionPerformed
        //  pop up menu kullanarak  ana menuyu light mode yapmak için
        lbl_left.setBackground(Color.white);
        pnl_card1.setBackground(Color.white);
        pnl_card2.setBackground(Color.white);
        pnl_add_product.setBackground(Color.white);
        pnl_card5.setBackground(Color.white);
        btn_refresh.setBackground(Color.white);
        lbl_footer.setForeground(Color.black);
        lbl_footer_1.setForeground(Color.black);
        pnl_logo_current_account.setBackground(Color.white);

    }//GEN-LAST:event_menu_light_modeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ana_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ana_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ana_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ana_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ana_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Sales;
    private javax.swing.JButton btn_Supplier;
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_add_product;
    private javax.swing.JButton btn_delete_product;
    private javax.swing.JButton btn_product;
    private javax.swing.JButton btn_product_update;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_sales_search;
    private javax.swing.JComboBox<String> cmbx_category;
    private javax.swing.JComboBox<String> cmbx_supplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextArea jTextArea1;
    private bp2.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lbl_category;
    private javax.swing.JLabel lbl_current_name;
    private javax.swing.JLabel lbl_footer;
    private javax.swing.JLabel lbl_footer_1;
    private javax.swing.JLabel lbl_invertory_system;
    private javax.swing.JPanel lbl_left;
    private javax.swing.JLabel lbl_logo_about;
    private javax.swing.JLabel lbl_logo_current_account;
    private javax.swing.JLabel lbl_logo_product;
    private javax.swing.JLabel lbl_logo_sales;
    private javax.swing.JLabel lbl_logo_supplier;
    private javax.swing.JLabel lbl_pid;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_product_name;
    private javax.swing.JLabel lbl_refresh;
    private javax.swing.JLabel lbl_sales;
    private javax.swing.JLabel lbl_sales_search;
    private javax.swing.JLabel lbl_search_supplier_id;
    private javax.swing.JLabel lbl_seri_no;
    private javax.swing.JLabel lbl_stock1;
    private javax.swing.JLabel lbl_supplier;
    private javax.swing.JLabel lbl_supplier_title;
    private javax.swing.JLabel lbl_total_sales;
    private javax.swing.JLabel lbl_total_sales_00;
    private javax.swing.JMenuBar menu_bar_top;
    private javax.swing.JMenuItem menu_dark_mode;
    private javax.swing.JMenu menu_extras;
    private javax.swing.JMenu menu_general;
    private javax.swing.JMenuItem menu_item_employee;
    private javax.swing.JMenuItem menu_item_exit;
    private javax.swing.JMenuItem menu_item_logOut;
    private javax.swing.JMenuItem menu_item_newSale;
    private javax.swing.JMenuItem menu_item_produt;
    private javax.swing.JMenuItem menu_item_sales;
    private javax.swing.JMenuItem menu_item_settings;
    private javax.swing.JMenuItem menu_item_supplier;
    private javax.swing.JMenuItem menu_light_mode;
    private javax.swing.JMenu menu_navigation;
    private javax.swing.JPanel pnl_add;
    private javax.swing.JPanel pnl_add_product;
    private javax.swing.JPanel pnl_card1;
    private javax.swing.JPanel pnl_card2;
    private javax.swing.JPanel pnl_card3;
    private javax.swing.JPanel pnl_card5;
    private javax.swing.JPanel pnl_cards;
    private javax.swing.JPanel pnl_current_acount;
    private javax.swing.JPanel pnl_logo_current_account;
    private javax.swing.JPanel pnl_sales;
    private javax.swing.JPanel pnl_supplier;
    private javax.swing.JTable tbl_add_product_products;
    private javax.swing.JTable tbl_sales;
    private javax.swing.JTable tbl_search_supplier;
    private javax.swing.JTabbedPane tbn_pnl_product;
    private javax.swing.JTextField txt_pid;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_product_name;
    private javax.swing.JTextField txt_sales_search;
    private javax.swing.JTextField txt_seri_no1;
    private javax.swing.JTextField txt_stock;
    private javax.swing.JTextField txt_supplier_seacrh;
    // End of variables declaration//GEN-END:variables
}
