/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bp2;

import java.awt.CardLayout;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nurettin YILDIZ
 */
public class Yeni_Satış extends javax.swing.JFrame {

    /**
     * Creates new form Yeni_Satış
     */
    CardLayout cardLayout;

    public Yeni_Satış() {
        initComponents();
        DefaultTableModel table_products_model = (DefaultTableModel) table_products.getModel();
        ArrayList<Product> products = Company_db.getProductsName();
        table_products_model.setRowCount(0);
        for (Product p1 : products) {
            table_products_model.addRow(new Object[]{p1.productId, p1.productName, p1.productCategory, p1.productPrice, p1.productStock});

        }

        cardLayout = (CardLayout) (pnl_cards.getLayout());
    }
      // bu method sepet içindeki toplam tutarı hesaplar her bir quantity ve price değerini çarparak toplam tutaru bulur.
    private double calculateTotalPrice() {
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();
        double totalPrice = 0.0;
        for (int row = 0; row < dt.getRowCount(); row++) {
            int quantity = (int) dt.getValueAt(row, 2);
            double price = (double) dt.getValueAt(row, 3);
            double productTotalPrice = quantity * price;
            totalPrice += productTotalPrice;
        }

        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(Locale.US);
        decimalFormat.applyPattern("#.##");
        String formattedTotalPrice = decimalFormat.format(totalPrice);

        try {
            return (NumberFormat.getInstance(Locale.US).parse(formattedTotalPrice)).doubleValue();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return 0.0; // Hata durumunda varsayılan değer döndürülür
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnl_cards = new javax.swing.JPanel();
        pnl_food_menu = new javax.swing.JPanel();
        btn_dinner_plate = new javax.swing.JButton();
        lbl_dinnet_plate = new javax.swing.JLabel();
        lbl_zinger_combo = new javax.swing.JLabel();
        btn_zinger_combp = new javax.swing.JButton();
        lbl_zinger_mini_bucket = new javax.swing.JLabel();
        btn_zinger_mini_bucket = new javax.swing.JButton();
        btn_piece_rice_plate = new javax.swing.JButton();
        lbl_piece_rice_plate = new javax.swing.JLabel();
        pnl_drink_fruit_juice = new javax.swing.JPanel();
        pnl_drink_soda = new javax.swing.JPanel();
        btn_drink_fanta = new javax.swing.JButton();
        lbl_fanta = new javax.swing.JLabel();
        lbl_cola = new javax.swing.JLabel();
        btn_drink_cola = new javax.swing.JButton();
        btn_drink_soda = new javax.swing.JButton();
        lbl_soda = new javax.swing.JLabel();
        btn_drink_su = new javax.swing.JButton();
        lbl_su = new javax.swing.JLabel();
        pnl_menu_chips = new javax.swing.JPanel();
        btn_chips = new javax.swing.JButton();
        lbl_chips = new javax.swing.JLabel();
        lbl_chips_yeşillik = new javax.swing.JLabel();
        btn_chips_yeşillik = new javax.swing.JButton();
        lbl_chips_sea_salt = new javax.swing.JLabel();
        btn_chips_sea_salt = new javax.swing.JButton();
        lbl_chips_paprika = new javax.swing.JLabel();
        btn_chips_paprika = new javax.swing.JButton();
        pnl_food_solo = new javax.swing.JPanel();
        btn_colonel_burger = new javax.swing.JButton();
        lbl_colonel_burger = new javax.swing.JLabel();
        lbl_zinger_burger = new javax.swing.JLabel();
        btn_zinger_burger = new javax.swing.JButton();
        lbl_zinger_wrap = new javax.swing.JLabel();
        btn_zinger_wrap = new javax.swing.JButton();
        pnl_junk_food_candy = new javax.swing.JPanel();
        btn_alpella_triangle = new javax.swing.JButton();
        lbl_alpella_triangle = new javax.swing.JLabel();
        btn_ülker_chocalate = new javax.swing.JButton();
        lbl_ülker_chocalate = new javax.swing.JLabel();
        btn_eti_fıstıklı = new javax.swing.JButton();
        lbl_eti_fıstıklı = new javax.swing.JLabel();
        btn_eti_fındıklı = new javax.swing.JButton();
        lbl_eti_fındıklı = new javax.swing.JLabel();
        tbl_pnl = new javax.swing.JScrollPane();
        table_products = new javax.swing.JTable();
        pnl_payment = new javax.swing.JPanel();
        lbl_total = new javax.swing.JLabel();
        lbl_cahs = new javax.swing.JLabel();
        lbl_balance_00 = new javax.swing.JLabel();
        lbl_total_0 = new javax.swing.JLabel();
        lbl_balance = new javax.swing.JLabel();
        txt_cash = new javax.swing.JTextField();
        btn_print = new javax.swing.JButton();
        btn_pay = new javax.swing.JButton();
        BTN_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_tools = new javax.swing.JTable();
        btn_product_add = new javax.swing.JButton();
        spn_products = new javax.swing.JSpinner();
        BTN_update = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_foods = new javax.swing.JMenu();
        menu_item_food_solo = new javax.swing.JCheckBoxMenuItem();
        menu_item_menus = new javax.swing.JCheckBoxMenuItem();
        menu_drinks = new javax.swing.JMenu();
        menu_item_fruit_juice = new javax.swing.JCheckBoxMenuItem();
        menu_item_sodas = new javax.swing.JCheckBoxMenuItem();
        menu_junk_foods = new javax.swing.JMenu();
        menu_item_cips = new javax.swing.JCheckBoxMenuItem();
        menu_item_candy = new javax.swing.JCheckBoxMenuItem();
        menu_exit = new javax.swing.JMenu();
        menu_item_exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("New Sale");

        pnl_cards.setLayout(new java.awt.CardLayout());

        pnl_food_menu.setBackground(new java.awt.Color(255, 255, 255));

        btn_dinner_plate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\DinnerPlate.jpg")); // NOI18N
        btn_dinner_plate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dinner_plateActionPerformed(evt);
            }
        });

        lbl_dinnet_plate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dinnet_plate.setText("0");

        lbl_zinger_combo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_zinger_combo.setText("0");

        btn_zinger_combp.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\ZingerCombo.jpg")); // NOI18N
        btn_zinger_combp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_zinger_combpActionPerformed(evt);
            }
        });

        lbl_zinger_mini_bucket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_zinger_mini_bucket.setText("0");

        btn_zinger_mini_bucket.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\MiniBucket.jpg")); // NOI18N
        btn_zinger_mini_bucket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_zinger_mini_bucketActionPerformed(evt);
            }
        });

        btn_piece_rice_plate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\PieceRicePlate.jpg")); // NOI18N
        btn_piece_rice_plate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_piece_rice_plateActionPerformed(evt);
            }
        });

        lbl_piece_rice_plate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_piece_rice_plate.setText("0");

        javax.swing.GroupLayout pnl_food_menuLayout = new javax.swing.GroupLayout(pnl_food_menu);
        pnl_food_menu.setLayout(pnl_food_menuLayout);
        pnl_food_menuLayout.setHorizontalGroup(
            pnl_food_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_food_menuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnl_food_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_food_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_dinner_plate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_dinnet_plate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_zinger_mini_bucket, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_zinger_mini_bucket, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(pnl_food_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_piece_rice_plate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_piece_rice_plate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_zinger_combp, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_zinger_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        pnl_food_menuLayout.setVerticalGroup(
            pnl_food_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_food_menuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnl_food_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_food_menuLayout.createSequentialGroup()
                        .addComponent(btn_zinger_combp, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_zinger_combo))
                    .addGroup(pnl_food_menuLayout.createSequentialGroup()
                        .addComponent(btn_dinner_plate, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_dinnet_plate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_food_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_food_menuLayout.createSequentialGroup()
                        .addComponent(btn_zinger_mini_bucket, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_zinger_mini_bucket))
                    .addGroup(pnl_food_menuLayout.createSequentialGroup()
                        .addComponent(btn_piece_rice_plate, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_piece_rice_plate)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pnl_cards.add(pnl_food_menu, "card3");

        pnl_drink_fruit_juice.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_drink_fruit_juiceLayout = new javax.swing.GroupLayout(pnl_drink_fruit_juice);
        pnl_drink_fruit_juice.setLayout(pnl_drink_fruit_juiceLayout);
        pnl_drink_fruit_juiceLayout.setHorizontalGroup(
            pnl_drink_fruit_juiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        pnl_drink_fruit_juiceLayout.setVerticalGroup(
            pnl_drink_fruit_juiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        pnl_cards.add(pnl_drink_fruit_juice, "card4");

        pnl_drink_soda.setBackground(new java.awt.Color(255, 255, 255));

        btn_drink_fanta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\fanta.png")); // NOI18N
        btn_drink_fanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_drink_fantaActionPerformed(evt);
            }
        });

        lbl_fanta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_fanta.setText("0");

        lbl_cola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cola.setText("0");

        btn_drink_cola.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\cola.png")); // NOI18N
        btn_drink_cola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_drink_colaActionPerformed(evt);
            }
        });

        btn_drink_soda.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\soda.png")); // NOI18N
        btn_drink_soda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_drink_sodaActionPerformed(evt);
            }
        });

        lbl_soda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_soda.setText("0");

        btn_drink_su.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\su.png")); // NOI18N
        btn_drink_su.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_drink_suActionPerformed(evt);
            }
        });

        lbl_su.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_su.setText("0");

        javax.swing.GroupLayout pnl_drink_sodaLayout = new javax.swing.GroupLayout(pnl_drink_soda);
        pnl_drink_soda.setLayout(pnl_drink_sodaLayout);
        pnl_drink_sodaLayout.setHorizontalGroup(
            pnl_drink_sodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_drink_sodaLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(pnl_drink_sodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_drink_sodaLayout.createSequentialGroup()
                        .addGroup(pnl_drink_sodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_drink_fanta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_fanta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(pnl_drink_sodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_drink_cola, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cola, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_drink_sodaLayout.createSequentialGroup()
                        .addGroup(pnl_drink_sodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_drink_soda, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_soda, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(pnl_drink_sodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_drink_su, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_su, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        pnl_drink_sodaLayout.setVerticalGroup(
            pnl_drink_sodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_drink_sodaLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(pnl_drink_sodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_drink_sodaLayout.createSequentialGroup()
                        .addComponent(btn_drink_cola, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_cola))
                    .addGroup(pnl_drink_sodaLayout.createSequentialGroup()
                        .addComponent(btn_drink_fanta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_fanta)))
                .addGap(29, 29, 29)
                .addGroup(pnl_drink_sodaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_drink_sodaLayout.createSequentialGroup()
                        .addComponent(btn_drink_soda, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_soda))
                    .addGroup(pnl_drink_sodaLayout.createSequentialGroup()
                        .addComponent(btn_drink_su, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_su)))
                .addGap(32, 32, 32))
        );

        pnl_cards.add(pnl_drink_soda, "card5");

        pnl_menu_chips.setBackground(new java.awt.Color(255, 255, 255));

        btn_chips.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\lays.png")); // NOI18N
        btn_chips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chipsActionPerformed(evt);
            }
        });

        lbl_chips.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_chips.setText("0");

        lbl_chips_yeşillik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_chips_yeşillik.setText("0");

        btn_chips_yeşillik.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\yeşillikli cips.png")); // NOI18N
        btn_chips_yeşillik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chips_yeşillikActionPerformed(evt);
            }
        });

        lbl_chips_sea_salt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_chips_sea_salt.setText("0");

        btn_chips_sea_salt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\output-onlinepngtools (1).png")); // NOI18N
        btn_chips_sea_salt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chips_sea_saltActionPerformed(evt);
            }
        });

        lbl_chips_paprika.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_chips_paprika.setText("0");

        btn_chips_paprika.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\output-onlinepngtools.png")); // NOI18N
        btn_chips_paprika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chips_paprikaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_menu_chipsLayout = new javax.swing.GroupLayout(pnl_menu_chips);
        pnl_menu_chips.setLayout(pnl_menu_chipsLayout);
        pnl_menu_chipsLayout.setHorizontalGroup(
            pnl_menu_chipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menu_chipsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnl_menu_chipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_menu_chipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_chips, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_chips, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_chips_sea_salt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_chips_sea_salt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(pnl_menu_chipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_chips_paprika, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_chips_paprika, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_chips_yeşillik, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_chips_yeşillik, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        pnl_menu_chipsLayout.setVerticalGroup(
            pnl_menu_chipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menu_chipsLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnl_menu_chipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_menu_chipsLayout.createSequentialGroup()
                        .addComponent(btn_chips_yeşillik, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_chips_yeşillik))
                    .addGroup(pnl_menu_chipsLayout.createSequentialGroup()
                        .addComponent(btn_chips, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_chips)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_menu_chipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_menu_chipsLayout.createSequentialGroup()
                        .addComponent(btn_chips_sea_salt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_chips_sea_salt))
                    .addGroup(pnl_menu_chipsLayout.createSequentialGroup()
                        .addComponent(btn_chips_paprika, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_chips_paprika)))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pnl_cards.add(pnl_menu_chips, "card6");

        pnl_food_solo.setBackground(new java.awt.Color(255, 255, 255));

        btn_colonel_burger.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\ColonelBurger.jpg")); // NOI18N
        btn_colonel_burger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_colonel_burgerActionPerformed(evt);
            }
        });

        lbl_colonel_burger.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_colonel_burger.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_colonel_burger.setText("0");

        lbl_zinger_burger.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_zinger_burger.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_zinger_burger.setText("0");

        btn_zinger_burger.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\ZingerBurger.jpg")); // NOI18N
        btn_zinger_burger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_zinger_burgerActionPerformed(evt);
            }
        });

        lbl_zinger_wrap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_zinger_wrap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_zinger_wrap.setText("0");

        btn_zinger_wrap.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\ZingerRiceWrap.jpg")); // NOI18N
        btn_zinger_wrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_zinger_wrapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_food_soloLayout = new javax.swing.GroupLayout(pnl_food_solo);
        pnl_food_solo.setLayout(pnl_food_soloLayout);
        pnl_food_soloLayout.setHorizontalGroup(
            pnl_food_soloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_food_soloLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnl_food_soloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_food_soloLayout.createSequentialGroup()
                        .addComponent(lbl_zinger_wrap, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_food_soloLayout.createSequentialGroup()
                        .addComponent(btn_zinger_wrap, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_food_soloLayout.createSequentialGroup()
                        .addGroup(pnl_food_soloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_colonel_burger, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_colonel_burger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(pnl_food_soloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_zinger_burger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_zinger_burger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
        );
        pnl_food_soloLayout.setVerticalGroup(
            pnl_food_soloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_food_soloLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnl_food_soloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_zinger_burger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_colonel_burger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_food_soloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_zinger_burger)
                    .addComponent(lbl_colonel_burger))
                .addGap(20, 20, 20)
                .addComponent(btn_zinger_wrap, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_zinger_wrap)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pnl_cards.add(pnl_food_solo, "card2");

        pnl_junk_food_candy.setBackground(new java.awt.Color(255, 255, 255));

        btn_alpella_triangle.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\alpella-üçgen.png")); // NOI18N
        btn_alpella_triangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alpella_triangleActionPerformed(evt);
            }
        });

        lbl_alpella_triangle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_alpella_triangle.setText("0");

        btn_ülker_chocalate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\ülker-çikolatalı-gofret.png")); // NOI18N
        btn_ülker_chocalate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ülker_chocalateActionPerformed(evt);
            }
        });

        lbl_ülker_chocalate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ülker_chocalate.setText("0");

        btn_eti_fıstıklı.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\eti_fıstıklı.png")); // NOI18N
        btn_eti_fıstıklı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eti_fıstıklıActionPerformed(evt);
            }
        });

        lbl_eti_fıstıklı.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_eti_fıstıklı.setText("0");

        btn_eti_fındıklı.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\eti-fındıklı-çikolata.png")); // NOI18N
        btn_eti_fındıklı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eti_fındıklıActionPerformed(evt);
            }
        });

        lbl_eti_fındıklı.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_eti_fındıklı.setText("0");

        javax.swing.GroupLayout pnl_junk_food_candyLayout = new javax.swing.GroupLayout(pnl_junk_food_candy);
        pnl_junk_food_candy.setLayout(pnl_junk_food_candyLayout);
        pnl_junk_food_candyLayout.setHorizontalGroup(
            pnl_junk_food_candyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_junk_food_candyLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnl_junk_food_candyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_junk_food_candyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_alpella_triangle, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_alpella_triangle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_junk_food_candyLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnl_junk_food_candyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_eti_fıstıklı, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_eti_fıstıklı, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(83, 83, 83)
                .addGroup(pnl_junk_food_candyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_eti_fındıklı, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_eti_fındıklı, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ülker_chocalate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ülker_chocalate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        pnl_junk_food_candyLayout.setVerticalGroup(
            pnl_junk_food_candyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_junk_food_candyLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnl_junk_food_candyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_junk_food_candyLayout.createSequentialGroup()
                        .addComponent(btn_ülker_chocalate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_ülker_chocalate))
                    .addGroup(pnl_junk_food_candyLayout.createSequentialGroup()
                        .addComponent(btn_alpella_triangle, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_alpella_triangle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_junk_food_candyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_junk_food_candyLayout.createSequentialGroup()
                        .addComponent(btn_eti_fıstıklı, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_eti_fıstıklı))
                    .addGroup(pnl_junk_food_candyLayout.createSequentialGroup()
                        .addComponent(btn_eti_fındıklı, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_eti_fındıklı)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pnl_cards.add(pnl_junk_food_candy, "card7");

        table_products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Category", "Price", "Stock"
            }
        ));
        tbl_pnl.setViewportView(table_products);

        lbl_total.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_total.setText("TOTAL :");

        lbl_cahs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_cahs.setForeground(new java.awt.Color(0, 204, 0));
        lbl_cahs.setText("CASH  :");

        lbl_balance_00.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_balance_00.setText("00");

        lbl_total_0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_total_0.setText("00");

        lbl_balance.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_balance.setForeground(new java.awt.Color(204, 204, 0));
        lbl_balance.setText("BALANCE :");

        txt_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cashActionPerformed(evt);
            }
        });

        btn_print.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-print-25.png")); // NOI18N
        btn_print.setText("PRİNT");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_pay.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\sales_menu.png")); // NOI18N
        btn_pay.setText("PAY");
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_paymentLayout = new javax.swing.GroupLayout(pnl_payment);
        pnl_payment.setLayout(pnl_paymentLayout);
        pnl_paymentLayout.setHorizontalGroup(
            pnl_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_paymentLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnl_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_paymentLayout.createSequentialGroup()
                        .addGroup(pnl_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_cahs, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_total_0, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_paymentLayout.createSequentialGroup()
                        .addComponent(lbl_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_balance_00, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        pnl_paymentLayout.setVerticalGroup(
            pnl_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_paymentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_paymentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_total_0, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cahs, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cash))
                .addGap(18, 18, 18)
                .addGroup(pnl_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_balance_00, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        BTN_delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\remove.png")); // NOI18N
        BTN_delete.setText("DELETE");
        BTN_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_deleteActionPerformed(evt);
            }
        });

        txt_area.setEditable(false);
        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        table_tools.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Quantity", "Price"
            }
        ));
        jScrollPane2.setViewportView(table_tools);

        btn_product_add.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-add-25 (1).png")); // NOI18N
        btn_product_add.setText("ADD");
        btn_product_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_product_addActionPerformed(evt);
            }
        });

        spn_products.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        BTN_update.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\update.png")); // NOI18N
        BTN_update.setText("UPDATE");
        BTN_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_updateActionPerformed(evt);
            }
        });

        menu_foods.setText("Food");

        buttonGroup1.add(menu_item_food_solo);
        menu_item_food_solo.setText("Solo Burgers");
        menu_item_food_solo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                menu_item_food_soloİtemStateChanged(evt);
            }
        });
        menu_foods.add(menu_item_food_solo);

        buttonGroup1.add(menu_item_menus);
        menu_item_menus.setText("Menus");
        menu_item_menus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                menu_item_menusİtemStateChanged(evt);
            }
        });
        menu_foods.add(menu_item_menus);

        jMenuBar1.add(menu_foods);

        menu_drinks.setText("Drink");

        buttonGroup1.add(menu_item_fruit_juice);
        menu_item_fruit_juice.setText("Fruit juice");
        menu_item_fruit_juice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                menu_item_fruit_juiceİtemStateChanged(evt);
            }
        });
        menu_drinks.add(menu_item_fruit_juice);

        buttonGroup1.add(menu_item_sodas);
        menu_item_sodas.setText("Sodas");
        menu_item_sodas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                menu_item_sodasİtemStateChanged(evt);
            }
        });
        menu_drinks.add(menu_item_sodas);

        jMenuBar1.add(menu_drinks);

        menu_junk_foods.setText("Junk food");

        buttonGroup1.add(menu_item_cips);
        menu_item_cips.setText("Chips");
        menu_item_cips.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                menu_item_cipsİtemStateChanged(evt);
            }
        });
        menu_junk_foods.add(menu_item_cips);

        buttonGroup1.add(menu_item_candy);
        menu_item_candy.setText("Candy");
        menu_item_candy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                menu_item_candyİtemStateChanged(evt);
            }
        });
        menu_item_candy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_candyActionPerformed(evt);
            }
        });
        menu_junk_foods.add(menu_item_candy);

        jMenuBar1.add(menu_junk_foods);

        menu_exit.setText("Exit");

        menu_item_exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-exit-25 (1).png")); // NOI18N
        menu_item_exit.setText("Exit");
        menu_item_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_exitActionPerformed(evt);
            }
        });
        menu_exit.add(menu_item_exit);

        jMenuBar1.add(menu_exit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_cards, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_product_add)
                                .addGap(18, 18, 18)
                                .addComponent(spn_products, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tbl_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl_payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                        .addComponent(BTN_update, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTN_delete)
                        .addGap(318, 318, 318))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_cards, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_delete)
                            .addComponent(BTN_update))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbl_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spn_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_product_add))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_item_food_soloİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_menu_item_food_soloİtemStateChanged
        // TODO add your handling code here:
        cardLayout.show(pnl_cards, "card2");


    }//GEN-LAST:event_menu_item_food_soloİtemStateChanged

    private void menu_item_menusİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_menu_item_menusİtemStateChanged
        // TODO add your handling code here:
        cardLayout.show(pnl_cards, "card3");
    }//GEN-LAST:event_menu_item_menusİtemStateChanged

    private void btn_zinger_burgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_zinger_burgerActionPerformed
        //  Bu ve bunun gibi butonlar hızlı menu dediğimiz en çok satılan ürünler için kolaylık sağlar id değeri ile isim ve fiyat değerleri alınarak sepet kısmına eklenir.
        int id = 18;

        int counter = Integer.parseInt(lbl_zinger_burger.getText());
        ++counter;
        lbl_zinger_burger.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_zinger_burger.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }

    }//GEN-LAST:event_btn_zinger_burgerActionPerformed

    private void btn_zinger_wrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_zinger_wrapActionPerformed
        // TODO add your handling code here:
        int id = 19;
        int counter = Integer.parseInt(lbl_zinger_wrap.getText());
        ++counter;
        lbl_zinger_wrap.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_zinger_wrap.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice};
                dt.addRow(row);
            }

        }


    }//GEN-LAST:event_btn_zinger_wrapActionPerformed

    private void menu_item_cipsİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_menu_item_cipsİtemStateChanged
        // TODO add your handling code here:
        cardLayout.show(pnl_cards, "card6");
    }//GEN-LAST:event_menu_item_cipsİtemStateChanged

    private void menu_item_candyİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_menu_item_candyİtemStateChanged
        // TODO add your handling code here:
        cardLayout.show(pnl_cards, "card7");
    }//GEN-LAST:event_menu_item_candyİtemStateChanged

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        // Fiş oluşturmak için kullanılır bütün sepetteki değerleri döner ve fis formatı oluşturur.
        StringBuilder receiptBuilder = new StringBuilder();
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();
        receiptBuilder.append("********** Receipt **********\n\n");

        // Tablodaki ürünleri dolaşarak fişe eklemek
        for (int row = 0; row < dt.getRowCount(); row++) {
            String productName = (String) dt.getValueAt(row, 1);
            int quantity = (int) dt.getValueAt(row, 2);
            double price = (double) dt.getValueAt(row, 3);

            receiptBuilder.append("Product: ").append(productName).append("\n");
            receiptBuilder.append("Quantity: ").append(quantity).append("\n");
            receiptBuilder.append("Price: $").append(price).append("\n");
            receiptBuilder.append("Subtotal: $").append(quantity * price).append("\n\n");
        }

        receiptBuilder.append("******************************");

        // Text alanına fişi yazdırma
        txt_area.setText(receiptBuilder.toString());
    }//GEN-LAST:event_btn_printActionPerformed

    private void menu_item_sodasİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_menu_item_sodasİtemStateChanged
        // TODO add your handling code here:
        cardLayout.show(pnl_cards, "card5");
    }//GEN-LAST:event_menu_item_sodasİtemStateChanged

    private void menu_item_fruit_juiceİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_menu_item_fruit_juiceİtemStateChanged
        // TODO add your handling code here:
        cardLayout.show(pnl_cards, "card4");
    }//GEN-LAST:event_menu_item_fruit_juiceİtemStateChanged

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
        // Bu kısım  ödeme işlemi tamamlar ve güncel stoğu ürünler verileri için günceller
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();
        int currentStock;

        for (int row = 0; row < dt.getRowCount(); row++) {
            int productId = (int) dt.getValueAt(row, 0);
            int quantity = (int) dt.getValueAt(row, 2);
            String productName = (String) dt.getValueAt(row, 1);
            double productPrice = (double) dt.getValueAt(row, 3);
            int person_id = Ana_Menu.currentUserId;
            String person_name = Ana_Menu.currentNameSurname;
            String serialNumber = Company_db.getProductSerialNumberById(productId);
            currentStock = Company_db.getProductStockById(productId) - quantity;
            Sales s1 = new Sales();
            s1.personId = person_id;
            s1.name_surname = person_name;
            s1.productName = productName;
            s1.productSerialNumber = serialNumber;
            s1.productPrice = productPrice;
            s1.amount = quantity;
            if (Company_db.addSales(s1)) {
                Company_db.UpdateProductStock(productId, currentStock);
                JOptionPane.showMessageDialog(null, "Payment Transaction Successful");

            } else {
                JOptionPane.showMessageDialog(null, "Payment Transaction Not Successful");
            }

        }
        DefaultTableModel table_products_model = (DefaultTableModel) table_products.getModel();
        ArrayList<Product> products = Company_db.getProductsName();
        table_products_model.setRowCount(0);
        for (Product p1 : products) {
            table_products_model.addRow(new Object[]{p1.productId, p1.productName, p1.productCategory, p1.productPrice, p1.productStock});

        }
        txt_area.setText("");
        txt_cash.setText("");
        lbl_balance_00.setText("");
        lbl_total_0.setText("");
        DefaultTableModel model = (DefaultTableModel) table_tools.getModel();
        model.setRowCount(0);

    }//GEN-LAST:event_btn_payActionPerformed

    private void BTN_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_deleteActionPerformed
        //  bu kısım sepetteki istenmeyen ürünleri silmek için kullanılır ve butonların altındaki labelları set eder.

        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();
        String r = dt.getValueAt(table_tools.getSelectedRow(), 0).toString();
        int selectedRow = table_tools.getSelectedRow();
        dt.removeRow(selectedRow);

        switch (r) {
            case "1":
                lbl_ülker_chocalate.setText("0");
                break;
            case "2":
                lbl_alpella_triangle.setText("0");
                break;
            case "3":
                lbl_eti_fındıklı.setText("0");
                break;
            case "4":
                lbl_eti_fıstıklı.setText("0");
                break;
            case "5":
                lbl_dinnet_plate.setText("0");
                break;
            case "6":
                lbl_zinger_combo.setText("0");
                break;
            case "7":
                lbl_zinger_mini_bucket.setText("0");
                break;
            case "8":
                lbl_piece_rice_plate.setText("0");
                break;
            case "9":
                lbl_fanta.setText("0");
                break;
            case "10":
                lbl_cola.setText("0");
                break;
            case "11":
                lbl_soda.setText("0");
                break;
            case "12":
                lbl_su.setText("0");
                break;
            case "13":
                lbl_chips.setText("0");
                break;
            case "14":
                lbl_chips_yeşillik.setText("0");
                break;
            case "15":
                lbl_chips_sea_salt.setText("0");
                break;
            case "16":
                lbl_chips_paprika.setText("0");
                break;
            case "17":
                lbl_colonel_burger.setText("0");
                break;
            case "18":
                lbl_zinger_burger.setText("0");
                break;
            case "19":
                lbl_zinger_wrap.setText("0");
                break;
        }

    }//GEN-LAST:event_BTN_deleteActionPerformed

    private void btn_product_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_product_addActionPerformed
        // Bu kısım ise manuel olarak tablodan gelen veriler aracılığla sepete tablosuna spinnerdan aldığı değeri ekler. Stokta ürün yoksa hata verir.
        int quantity = (int) spn_products.getValue();
        int id = (int) table_products.getValueAt(table_products.getSelectedRow(), 0);
        String name = Company_db.getProductNameById(id);
        double price = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();
        if (productStock < quantity) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_dinnet_plate.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(quantity, row, 2);

                    dt.setValueAt(price, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, name, quantity, price,};
                dt.addRow(row);
            }
        }

    }//GEN-LAST:event_btn_product_addActionPerformed

    private void btn_dinner_plateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dinner_plateActionPerformed
        // TODO add your handling code here:
        int id = 5;
        int counter = Integer.parseInt(lbl_dinnet_plate.getText());
        ++counter;
        lbl_dinnet_plate.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_dinnet_plate.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }

    }//GEN-LAST:event_btn_dinner_plateActionPerformed

    private void btn_zinger_combpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_zinger_combpActionPerformed
        // TODO add your handling code here:
        int id = 6;
        int counter = Integer.parseInt(lbl_zinger_combo.getText());
        ++counter;
        lbl_zinger_combo.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_zinger_burger.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }
    }//GEN-LAST:event_btn_zinger_combpActionPerformed

    private void btn_zinger_mini_bucketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_zinger_mini_bucketActionPerformed
        // TODO add your handling code here:
        int id = 7;
        int counter = Integer.parseInt(lbl_zinger_mini_bucket.getText());
        ++counter;
        lbl_zinger_mini_bucket.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_zinger_mini_bucket.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }

    }//GEN-LAST:event_btn_zinger_mini_bucketActionPerformed

    private void btn_piece_rice_plateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_piece_rice_plateActionPerformed
        // TODO add your handling code here:
        int id = 8;
        int counter = Integer.parseInt(lbl_piece_rice_plate.getText());
        ++counter;
        lbl_piece_rice_plate.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_piece_rice_plate.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }
    }//GEN-LAST:event_btn_piece_rice_plateActionPerformed

    private void btn_drink_fantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_drink_fantaActionPerformed
        // TODO add your handling code here:
        int id = 9;
        int counter = Integer.parseInt(lbl_fanta.getText());
        ++counter;
        lbl_fanta.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_fanta.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }
    }//GEN-LAST:event_btn_drink_fantaActionPerformed

    private void btn_drink_colaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_drink_colaActionPerformed
        // TODO add your handling code here:
        int id = 10;
        int counter = Integer.parseInt(lbl_cola.getText());
        ++counter;
        lbl_cola.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_cola.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }
    }//GEN-LAST:event_btn_drink_colaActionPerformed

    private void btn_drink_sodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_drink_sodaActionPerformed
        // TODO add your handling code here:
        int id = 11;
        int counter = Integer.parseInt(lbl_soda.getText());
        ++counter;
        lbl_soda.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_soda.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }
    }//GEN-LAST:event_btn_drink_sodaActionPerformed

    private void btn_drink_suActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_drink_suActionPerformed
        // TODO add your handling code here:
        int id = 12;
        int counter = Integer.parseInt(lbl_su.getText());
        ++counter;
        lbl_su.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_su.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }
    }//GEN-LAST:event_btn_drink_suActionPerformed

    private void btn_chipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chipsActionPerformed
        // TODO add your handling code here:
        int id = 13;
        int counter = Integer.parseInt(lbl_chips.getText());
        ++counter;
        lbl_chips.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_chips.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }
    }//GEN-LAST:event_btn_chipsActionPerformed

    private void btn_chips_yeşillikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chips_yeşillikActionPerformed
        // TODO add your handling code here:
        int id = 14;
        int counter = Integer.parseInt(lbl_chips_yeşillik.getText());
        ++counter;
        lbl_chips_yeşillik.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_chips_yeşillik.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }
    }//GEN-LAST:event_btn_chips_yeşillikActionPerformed

    private void btn_chips_sea_saltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chips_sea_saltActionPerformed
        // TODO add your handling code here:
        int id = 15;
        int counter = Integer.parseInt(lbl_chips_sea_salt.getText());
        ++counter;
        lbl_chips_sea_salt.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_chips_sea_salt.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }
    }//GEN-LAST:event_btn_chips_sea_saltActionPerformed

    private void btn_chips_paprikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chips_paprikaActionPerformed
        // TODO add your handling code here:
        int id = 16;
        int counter = Integer.parseInt(lbl_chips_paprika.getText());
        ++counter;
        lbl_chips_paprika.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_chips_paprika.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }
    }//GEN-LAST:event_btn_chips_paprikaActionPerformed

    private void btn_alpella_triangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alpella_triangleActionPerformed
        // TODO add your handling code here:
        int id = 2;
        int counter = Integer.parseInt(lbl_alpella_triangle.getText());
        ++counter;
        lbl_alpella_triangle.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_alpella_triangle.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }


    }//GEN-LAST:event_btn_alpella_triangleActionPerformed

    private void btn_ülker_chocalateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ülker_chocalateActionPerformed
        // TODO add your handling code here:
        int id = 1;
        int counter = Integer.parseInt(lbl_ülker_chocalate.getText());
        ++counter;
        lbl_ülker_chocalate.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_ülker_chocalate.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }


    }//GEN-LAST:event_btn_ülker_chocalateActionPerformed

    private void btn_eti_fıstıklıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eti_fıstıklıActionPerformed
        // TODO add your handling code here:
        int id = 4;
        int counter = Integer.parseInt(lbl_eti_fıstıklı.getText());
        ++counter;
        lbl_eti_fıstıklı.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_alpella_triangle.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }

    }//GEN-LAST:event_btn_eti_fıstıklıActionPerformed

    private void btn_eti_fındıklıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eti_fındıklıActionPerformed
        // TODO add your handling code here:
        int id = 3;
        int counter = Integer.parseInt(lbl_eti_fındıklı.getText());
        ++counter;
        lbl_eti_fındıklı.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_eti_fındıklı.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }
    }//GEN-LAST:event_btn_eti_fındıklıActionPerformed

    private void btn_colonel_burgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_colonel_burgerActionPerformed
        // TODO add your handling code here:
        int id = 17;
        int counter = Integer.parseInt(lbl_colonel_burger.getText());
        ++counter;
        lbl_colonel_burger.setText(String.valueOf(counter));
        DefaultTableModel dt = (DefaultTableModel) table_tools.getModel();

        String productName = Company_db.getProductNameById(id);
        Double productPrice = Company_db.getProductPriceById(id);
        int productStock = Company_db.getProductStockById(id);

        if (productStock < counter) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
            lbl_colonel_burger.setText(String.valueOf(productStock));
            return;
        } else {
            boolean productExists = false;
            int existingRowIndex = -1;

            for (int row = 0; row < dt.getRowCount(); row++) {
                int existingProductId = (int) dt.getValueAt(row, 0);
                String existingProductName = (String) dt.getValueAt(row, 1);
                int existingProductQuantity = (int) dt.getValueAt(row, 2);
                double existingProductPrice = (double) dt.getValueAt(row, 3);

                if (existingProductId == id) {
                    // Aynı ürün zaten var, satırı güncelle
                    productExists = true;
                    existingRowIndex = row;

                    // Yeni miktarı ekle
                    dt.setValueAt(counter, row, 2);

                    dt.setValueAt(productPrice, row, 3);

                    break;
                }
            }

            if (!productExists) {
                // Yeni ürünü ekle
                Object[] row = {id, productName, counter, productPrice,};
                dt.addRow(row);
            }
        }


    }//GEN-LAST:event_btn_colonel_burgerActionPerformed

    private void menu_item_candyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_candyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_item_candyActionPerformed

    private void BTN_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_updateActionPerformed
        // TODO add your handling code here:
        lbl_total_0.setText(String.valueOf(calculateTotalPrice()));
    }//GEN-LAST:event_BTN_updateActionPerformed

    private void txt_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cashActionPerformed
        // TODO add your handling code here:
        String cash = txt_cash.getText();
        try {
            double cashDouble = Double.parseDouble(cash);
            double total = calculateTotalPrice();
            double balance = cashDouble - total;
            lbl_balance_00.setText(String.format("%.2f", balance));
            txt_cash.setText("");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txt_cashActionPerformed

    private void menu_item_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_menu_item_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Yeni_Satış.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Yeni_Satış.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Yeni_Satış.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Yeni_Satış.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Yeni_Satış().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_delete;
    private javax.swing.JButton BTN_update;
    private javax.swing.JButton btn_alpella_triangle;
    private javax.swing.JButton btn_chips;
    private javax.swing.JButton btn_chips_paprika;
    private javax.swing.JButton btn_chips_sea_salt;
    private javax.swing.JButton btn_chips_yeşillik;
    private javax.swing.JButton btn_colonel_burger;
    private javax.swing.JButton btn_dinner_plate;
    private javax.swing.JButton btn_drink_cola;
    private javax.swing.JButton btn_drink_fanta;
    private javax.swing.JButton btn_drink_soda;
    private javax.swing.JButton btn_drink_su;
    private javax.swing.JButton btn_eti_fındıklı;
    private javax.swing.JButton btn_eti_fıstıklı;
    private javax.swing.JButton btn_pay;
    private javax.swing.JButton btn_piece_rice_plate;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_product_add;
    private javax.swing.JButton btn_zinger_burger;
    private javax.swing.JButton btn_zinger_combp;
    private javax.swing.JButton btn_zinger_mini_bucket;
    private javax.swing.JButton btn_zinger_wrap;
    private javax.swing.JButton btn_ülker_chocalate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_alpella_triangle;
    private javax.swing.JLabel lbl_balance;
    private javax.swing.JLabel lbl_balance_00;
    private javax.swing.JLabel lbl_cahs;
    private javax.swing.JLabel lbl_chips;
    private javax.swing.JLabel lbl_chips_paprika;
    private javax.swing.JLabel lbl_chips_sea_salt;
    private javax.swing.JLabel lbl_chips_yeşillik;
    private javax.swing.JLabel lbl_cola;
    private javax.swing.JLabel lbl_colonel_burger;
    private javax.swing.JLabel lbl_dinnet_plate;
    private javax.swing.JLabel lbl_eti_fındıklı;
    private javax.swing.JLabel lbl_eti_fıstıklı;
    private javax.swing.JLabel lbl_fanta;
    private javax.swing.JLabel lbl_piece_rice_plate;
    private javax.swing.JLabel lbl_soda;
    private javax.swing.JLabel lbl_su;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_total_0;
    private javax.swing.JLabel lbl_zinger_burger;
    private javax.swing.JLabel lbl_zinger_combo;
    private javax.swing.JLabel lbl_zinger_mini_bucket;
    private javax.swing.JLabel lbl_zinger_wrap;
    private javax.swing.JLabel lbl_ülker_chocalate;
    private javax.swing.JMenu menu_drinks;
    private javax.swing.JMenu menu_exit;
    private javax.swing.JMenu menu_foods;
    private javax.swing.JCheckBoxMenuItem menu_item_candy;
    private javax.swing.JCheckBoxMenuItem menu_item_cips;
    private javax.swing.JMenuItem menu_item_exit;
    private javax.swing.JCheckBoxMenuItem menu_item_food_solo;
    private javax.swing.JCheckBoxMenuItem menu_item_fruit_juice;
    private javax.swing.JCheckBoxMenuItem menu_item_menus;
    private javax.swing.JCheckBoxMenuItem menu_item_sodas;
    private javax.swing.JMenu menu_junk_foods;
    private javax.swing.JPanel pnl_cards;
    private javax.swing.JPanel pnl_drink_fruit_juice;
    private javax.swing.JPanel pnl_drink_soda;
    private javax.swing.JPanel pnl_food_menu;
    private javax.swing.JPanel pnl_food_solo;
    private javax.swing.JPanel pnl_junk_food_candy;
    private javax.swing.JPanel pnl_menu_chips;
    private javax.swing.JPanel pnl_payment;
    private javax.swing.JSpinner spn_products;
    private javax.swing.JTable table_products;
    private javax.swing.JTable table_tools;
    private javax.swing.JScrollPane tbl_pnl;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextField txt_cash;
    // End of variables declaration//GEN-END:variables
}
