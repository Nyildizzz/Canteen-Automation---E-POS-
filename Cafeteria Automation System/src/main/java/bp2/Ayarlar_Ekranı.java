/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bp2;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nurettin YILDIZ
 */
public class Ayarlar_Ekranı extends javax.swing.JFrame {

    /**
     * Creates new form Ayarlar_Ekranı
     */
    DefaultListModel<String> jlist_model = new DefaultListModel<>();
    DefaultTableModel table_model = new DefaultTableModel();

    public Ayarlar_Ekranı() {
        initComponents();
        // burada yapılandırıcı içine yazarak model oluşumu ve tedarikçi tablosunu getSupplierName() methodu sayesinde dolduruyorum.
        table_model = new DefaultTableModel();
        table_model.setColumnIdentifiers(new String[]{"Supplier_id", "Supplier_name", "Supplier_company"});
        tbl_supplier.setModel(table_model);
        lst_category.setModel(jlist_model);
        ArrayList<Supplier> suppliers = Company_db.getSupplierName();
        table_model.setRowCount(0);
        for (Supplier supplier : suppliers) {
            table_model.addRow(new Object[]{supplier.supplierId, supplier.supplierName, supplier.supplierCompany});
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbn_pnl = new javax.swing.JTabbedPane();
        pnl_category_editing = new javax.swing.JPanel();
        pnl_search = new javax.swing.JPanel();
        lbl_search_category = new javax.swing.JLabel();
        txt_search_category = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_category = new javax.swing.JList<>();
        lbl_search = new javax.swing.JLabel();
        pnl_add = new javax.swing.JPanel();
        lbl_add_category = new javax.swing.JLabel();
        txt_add_category = new javax.swing.JTextField();
        lbl_add = new javax.swing.JLabel();
        btn_category_add = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        pnl_supplier_settings = new javax.swing.JPanel();
        pnl_supplier = new javax.swing.JPanel();
        lbl_supplier_company = new javax.swing.JLabel();
        txt_supplier_id = new javax.swing.JTextField();
        txt_supplier_company = new javax.swing.JTextField();
        lbl_supplier_id = new javax.swing.JLabel();
        txt_supplier_name = new javax.swing.JTextField();
        lbl_supplier_name = new javax.swing.JLabel();
        btn_supplier_add = new javax.swing.JButton();
        lbl_supplier_title = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_supplier = new javax.swing.JTable();
        btn_supplier_delete = new javax.swing.JButton();
        btn_supplier_update = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Settings");

        tbn_pnl.setBackground(new java.awt.Color(0, 0, 0));
        tbn_pnl.setForeground(new java.awt.Color(255, 255, 255));
        tbn_pnl.setOpaque(true);

        pnl_category_editing.setBackground(new java.awt.Color(23, 199, 204));
        pnl_category_editing.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnl_search.setBackground(new java.awt.Color(255, 255, 255));
        pnl_search.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_search_category.setText("Search Category");

        txt_search_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search_categoryActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lst_category);

        lbl_search.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbl_search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_search.setText("Search");

        javax.swing.GroupLayout pnl_searchLayout = new javax.swing.GroupLayout(pnl_search);
        pnl_search.setLayout(pnl_searchLayout);
        pnl_searchLayout.setHorizontalGroup(
            pnl_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_searchLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lbl_search_category)
                .addGap(26, 26, 26)
                .addComponent(txt_search_category, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_searchLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(pnl_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_searchLayout.createSequentialGroup()
                    .addContainerGap(146, Short.MAX_VALUE)
                    .addComponent(lbl_search, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(136, 136, 136)))
        );
        pnl_searchLayout.setVerticalGroup(
            pnl_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_searchLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(pnl_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_search_category, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search_category, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(pnl_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_searchLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(lbl_search, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(262, Short.MAX_VALUE)))
        );

        pnl_add.setBackground(new java.awt.Color(255, 255, 255));
        pnl_add.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_add_category.setText("Category Name");

        lbl_add.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbl_add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_add.setText("Add");

        btn_category_add.setBackground(new java.awt.Color(153, 153, 153));
        btn_category_add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_category_add.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-add-25 (1).png")); // NOI18N
        btn_category_add.setText("ADD");
        btn_category_add.setBorder(null);
        btn_category_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_category_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_addLayout = new javax.swing.GroupLayout(pnl_add);
        pnl_add.setLayout(pnl_addLayout);
        pnl_addLayout.setHorizontalGroup(
            pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_addLayout.createSequentialGroup()
                .addGroup(pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_addLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(lbl_add, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_addLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lbl_add_category)
                        .addGap(29, 29, 29)
                        .addComponent(txt_add_category, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_addLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btn_category_add, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        pnl_addLayout.setVerticalGroup(
            pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_addLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_add, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_add_category, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btn_category_add, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        btn_exit.setBackground(new java.awt.Color(0, 0, 0));
        btn_exit.setForeground(new java.awt.Color(23, 199, 204));
        btn_exit.setText("X");
        btn_exit.setBorder(null);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_category_editingLayout = new javax.swing.GroupLayout(pnl_category_editing);
        pnl_category_editing.setLayout(pnl_category_editingLayout);
        pnl_category_editingLayout.setHorizontalGroup(
            pnl_category_editingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_category_editingLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(pnl_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(pnl_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_category_editingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        pnl_category_editingLayout.setVerticalGroup(
            pnl_category_editingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_category_editingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_category_editingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        tbn_pnl.addTab("Category Editing", new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-category-25.png"), pnl_category_editing); // NOI18N

        pnl_supplier_settings.setBackground(new java.awt.Color(23, 199, 204));

        pnl_supplier.setBackground(new java.awt.Color(255, 255, 255));
        pnl_supplier.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_supplier_company.setText("Supplier Company");

        lbl_supplier_id.setText("Supplier Id");

        lbl_supplier_name.setText("Supplier Name");

        btn_supplier_add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_supplier_add.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-add-25 (1).png")); // NOI18N
        btn_supplier_add.setText("ADD");
        btn_supplier_add.setBorder(null);
        btn_supplier_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supplier_addActionPerformed(evt);
            }
        });

        lbl_supplier_title.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbl_supplier_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_supplier_title.setText("Supplier Settings");

        tbl_supplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "supplier_id", "supplier_name", "supplier_company"
            }
        ));
        tbl_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_supplierMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_supplier);

        btn_supplier_delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_supplier_delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\remove.png")); // NOI18N
        btn_supplier_delete.setText("DELETE");
        btn_supplier_delete.setBorder(null);
        btn_supplier_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supplier_deleteActionPerformed(evt);
            }
        });

        btn_supplier_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_supplier_update.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\update.png")); // NOI18N
        btn_supplier_update.setText("UPDATE");
        btn_supplier_update.setBorder(null);
        btn_supplier_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supplier_updateActionPerformed(evt);
            }
        });

        btn_refresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_refresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-refresh-48.png")); // NOI18N
        btn_refresh.setText("REFRESH");
        btn_refresh.setBorder(null);
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_supplierLayout = new javax.swing.GroupLayout(pnl_supplier);
        pnl_supplier.setLayout(pnl_supplierLayout);
        pnl_supplierLayout.setHorizontalGroup(
            pnl_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_supplierLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(pnl_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_supplierLayout.createSequentialGroup()
                        .addGroup(pnl_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_supplierLayout.createSequentialGroup()
                                .addComponent(lbl_supplier_id, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_supplier_id, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(lbl_supplier_name, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_supplier_name, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_supplierLayout.createSequentialGroup()
                                .addComponent(lbl_supplier_company, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_supplier_company, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_supplierLayout.createSequentialGroup()
                        .addComponent(lbl_supplier_title, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_supplierLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnl_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_supplierLayout.createSequentialGroup()
                        .addComponent(btn_supplier_add, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btn_supplier_update, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(btn_supplier_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        pnl_supplierLayout.setVerticalGroup(
            pnl_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_supplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_supplier_title, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(pnl_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_supplierLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnl_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_supplier_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_supplier_id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_supplier_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_supplier_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnl_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_supplier_company, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_supplier_company, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_supplier_add, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_supplier_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_supplier_update, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout pnl_supplier_settingsLayout = new javax.swing.GroupLayout(pnl_supplier_settings);
        pnl_supplier_settings.setLayout(pnl_supplier_settingsLayout);
        pnl_supplier_settingsLayout.setHorizontalGroup(
            pnl_supplier_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_supplier_settingsLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(pnl_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        pnl_supplier_settingsLayout.setVerticalGroup(
            pnl_supplier_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_supplier_settingsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pnl_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tbn_pnl.addTab("Supplier Settings", new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-supplier-25 (1).png"), pnl_supplier_settings); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbn_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbn_pnl, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_supplier_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supplier_addActionPerformed
                // Tedarikçi ekleme işlemlerini ve yeni exceptionlar atarak  hem boşluk için hemde ekleme işlemlerini yapıyorum.
              try {                              
            Supplier s1 = new Supplier();

            String supplierIdText = txt_supplier_id.getText().trim();
            if (supplierIdText.isEmpty()) {
                throw new Exception("Supplier Id is empty");
            }
            s1.supplierId = Integer.parseInt(supplierIdText);

            String supplierName = txt_supplier_name.getText().trim();
            if (supplierName.isEmpty()) {
                throw new Exception("Supplier Name is empty");
            }
            s1.supplierName = supplierName;

            String supplierCompany = txt_supplier_company.getText().trim();
            if (supplierCompany.isEmpty()) {
                throw new Exception("Supplier Company is empty");
            }
            s1.supplierCompany = supplierCompany;

            if (Company_db.AddSupplier(s1)) {
                JOptionPane.showMessageDialog(rootPane, "Supplier is added");
                txt_supplier_id.setText("");
                txt_supplier_company.setText("");
                txt_supplier_name.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Supplier is not added");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

    }//GEN-LAST:event_btn_supplier_addActionPerformed

    private void btn_category_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_category_addActionPerformed
        // Kategori ekleme işlemelerini  yapıyorum.
        try {
            Category c1 = new Category();

            String categoryName = txt_add_category.getText().trim();
            if (categoryName.isEmpty()) {
                throw new Exception("Category Name is empty");
            }
            c1.categoryName = categoryName;

            if (Company_db.AddCategory(c1)) {
                JOptionPane.showMessageDialog(rootPane, "Category is added");
                txt_add_category.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Category is not added");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

    }//GEN-LAST:event_btn_category_addActionPerformed

    private void txt_search_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search_categoryActionPerformed
        // kategoriyi Jlist içinde aramayı sağlıyor.:
        String search = txt_search_category.getText();
        ArrayList<Category> clist = Company_db.SearchCategoryByName(search);
        jlist_model.removeAllElements();
        for (Category c1 : clist) {

            jlist_model.addElement(c1.categoryName);

        }
        txt_search_category.setText("");
    }//GEN-LAST:event_txt_search_categoryActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_supplier_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supplier_deleteActionPerformed
        // Tedarikçiyi databesaden silme işlmelerini ve bu işlemi tabledan aldığı id değeri sayesinde yapar.
        int rowIndex = tbl_supplier.getSelectedRow();
        int id = Integer.parseInt(table_model.getValueAt(rowIndex, 0).toString());
        Company_db.DeleteSupplierById(id);
        ArrayList<Supplier> slist = Company_db.getSupplierName();
        table_model.setRowCount(0);
        for (Supplier s1 : slist) {
            table_model.addRow(new Object[]{s1.supplierId, s1.supplierName, s1.supplierCompany});

        }
        JOptionPane.showMessageDialog(rootPane, "Supplier is deleted");
        txt_supplier_id.setText("");
        txt_supplier_id.setEnabled(true);
        txt_supplier_name.setText("");
        txt_supplier_company.setText("");
        txt_supplier_company.setEnabled(true);
        btn_supplier_add.setEnabled(true);
    }//GEN-LAST:event_btn_supplier_deleteActionPerformed

    private void btn_supplier_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supplier_updateActionPerformed
        // Tedarikçi objesi oluşturarak ve company_db.getSupplierName() sayesinde tablodan aldığım verileri textfieldlara aktarıp update işlemini yapar.
        Supplier s1 = new Supplier();
        s1.supplierId = Integer.parseInt(txt_supplier_id.getText());
        s1.supplierName = txt_supplier_name.getText();
        s1.supplierCompany = txt_supplier_company.getText();

        Company_db.UpdateSupplier(s1);
        ArrayList<Supplier> slist = Company_db.getSupplierName();
        table_model.setRowCount(0);
        for (Supplier s2 : slist) {
            Object[] row = {s2.supplierId, s2.supplierName, s2.supplierCompany};
            table_model.addRow(row);
        }
        txt_supplier_id.setText("");
        txt_supplier_id.setEnabled(true);
        txt_supplier_name.setText("");
        txt_supplier_company.setText("");
        txt_supplier_company.setEnabled(true);
        JOptionPane.showMessageDialog(rootPane, "Supplier is updated");


    }//GEN-LAST:event_btn_supplier_updateActionPerformed

    private void tbl_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_supplierMouseClicked
        // Table üzerine basıldığında textfieldlari doldurur.
        int row = tbl_supplier.getSelectedRow();
        if (row < 0) {
            return;
        }
        int id = (int) tbl_supplier.getValueAt(row, 0);
        Supplier s1 = Company_db.getSupplierById(id);
        txt_supplier_id.setText(String.valueOf(s1.supplierId));
        txt_supplier_id.setEnabled(false);
        txt_supplier_name.setText(s1.supplierName);
        txt_supplier_company.setText(s1.supplierCompany);
        txt_supplier_company.setEnabled(false);

        btn_supplier_add.setEnabled(false);


    }//GEN-LAST:event_tbl_supplierMouseClicked

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // Tedarikçi verilerinin tabloda update edilmesini sağlar
        DefaultTableModel dt = (DefaultTableModel) tbl_supplier.getModel();
        ArrayList<Supplier> slist = Company_db.getSupplierName();
        dt.setRowCount(0);
        for (Supplier s1 : slist) {
            table_model.addRow(new Object[]{s1.supplierId, s1.supplierName, s1.supplierCompany});

        }

    }//GEN-LAST:event_btn_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(Ayarlar_Ekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ayarlar_Ekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ayarlar_Ekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ayarlar_Ekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ayarlar_Ekranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_category_add;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_supplier_add;
    private javax.swing.JButton btn_supplier_delete;
    private javax.swing.JButton btn_supplier_update;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_add;
    private javax.swing.JLabel lbl_add_category;
    private javax.swing.JLabel lbl_search;
    private javax.swing.JLabel lbl_search_category;
    private javax.swing.JLabel lbl_supplier_company;
    private javax.swing.JLabel lbl_supplier_id;
    private javax.swing.JLabel lbl_supplier_name;
    private javax.swing.JLabel lbl_supplier_title;
    private javax.swing.JList<String> lst_category;
    private javax.swing.JPanel pnl_add;
    private javax.swing.JPanel pnl_category_editing;
    private javax.swing.JPanel pnl_search;
    private javax.swing.JPanel pnl_supplier;
    private javax.swing.JPanel pnl_supplier_settings;
    private javax.swing.JTable tbl_supplier;
    private javax.swing.JTabbedPane tbn_pnl;
    private javax.swing.JTextField txt_add_category;
    private javax.swing.JTextField txt_search_category;
    private javax.swing.JTextField txt_supplier_company;
    private javax.swing.JTextField txt_supplier_id;
    private javax.swing.JTextField txt_supplier_name;
    // End of variables declaration//GEN-END:variables
}
