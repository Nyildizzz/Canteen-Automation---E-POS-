/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bp2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Nurettin YILDIZ
 */
public class Kayıt_Ekranı extends javax.swing.JFrame {

    /**
     * Creates new form Kayıt_Ekranı
     */
    public Kayıt_Ekranı() {
        initComponents();
        txt_sign_up_username.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_sign_up_password.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_sign_up_email.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_sign_up_name_surname.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_sign_up_person_id.setBackground(new java.awt.Color(0, 0, 0, 1));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdnbtn_group_gender = new javax.swing.ButtonGroup();
        kGradientPanel1 = new bp2.KGradientPanel();
        lbl_txt_top = new javax.swing.JLabel();
        txt_sign_up_username = new javax.swing.JTextField();
        txt_sign_up_email = new javax.swing.JTextField();
        txt_sign_up_password = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btn_sign_up = new javax.swing.JButton();
        lbl_username = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        rdbnt_female = new javax.swing.JRadioButton();
        rdnbtn_male = new javax.swing.JRadioButton();
        lbl_icon_user = new javax.swing.JLabel();
        lbl_icon_password = new javax.swing.JLabel();
        lbl_icon_email = new javax.swing.JLabel();
        lbl_icon_gender = new javax.swing.JLabel();
        lbl_icon_name_username = new javax.swing.JLabel();
        lbl_name_surname = new javax.swing.JLabel();
        txt_sign_up_name_surname = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_icon_person_id = new javax.swing.JLabel();
        lbl_person_id = new javax.swing.JLabel();
        txt_sign_up_person_id = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btn_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setMaximumSize(new java.awt.Dimension(400, 450));
        setMinimumSize(new java.awt.Dimension(400, 450));

        kGradientPanel1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 204));

        lbl_txt_top.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lbl_txt_top.setText("Sign Up");

        txt_sign_up_username.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txt_sign_up_username.setForeground(new java.awt.Color(0, 0, 0));
        txt_sign_up_username.setText("admin123");
        txt_sign_up_username.setBorder(null);

        txt_sign_up_email.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txt_sign_up_email.setForeground(new java.awt.Color(0, 0, 0));
        txt_sign_up_email.setText("admin123@gmail.com");
        txt_sign_up_email.setBorder(null);

        txt_sign_up_password.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txt_sign_up_password.setForeground(new java.awt.Color(0, 0, 0));
        txt_sign_up_password.setText("12345");
        txt_sign_up_password.setBorder(null);

        btn_sign_up.setBackground(new java.awt.Color(255, 255, 255));
        btn_sign_up.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btn_sign_up.setForeground(new java.awt.Color(0, 0, 0));
        btn_sign_up.setText("Sign Up");
        btn_sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sign_upActionPerformed(evt);
            }
        });

        lbl_username.setBackground(new java.awt.Color(255, 255, 255));
        lbl_username.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 255, 255));
        lbl_username.setText("UserName");

        lbl_email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(255, 255, 255));
        lbl_email.setText("Email");

        lbl_password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(255, 255, 255));
        lbl_password.setText("Password");

        rdnbtn_group_gender.add(rdbnt_female);
        rdbnt_female.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdbnt_female.setForeground(new java.awt.Color(255, 255, 255));
        rdbnt_female.setText("Female");

        rdnbtn_group_gender.add(rdnbtn_male);
        rdnbtn_male.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdnbtn_male.setForeground(new java.awt.Color(255, 255, 255));
        rdnbtn_male.setText("Male");

        lbl_icon_user.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-user-25.png")); // NOI18N

        lbl_icon_password.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-password-25.png")); // NOI18N

        lbl_icon_email.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-email-25.png")); // NOI18N

        lbl_icon_gender.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-gender-25.png")); // NOI18N

        lbl_icon_name_username.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-user-25.png")); // NOI18N

        lbl_name_surname.setBackground(new java.awt.Color(255, 255, 255));
        lbl_name_surname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_name_surname.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name_surname.setText("Name&Surname");

        txt_sign_up_name_surname.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txt_sign_up_name_surname.setForeground(new java.awt.Color(0, 0, 0));
        txt_sign_up_name_surname.setText("admin");
        txt_sign_up_name_surname.setBorder(null);

        lbl_icon_person_id.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nurettin YILDIZ\\Documents\\NetBeansProjects\\bp2Project2\\src\\main\\java\\Images\\icons8-user-25.png")); // NOI18N

        lbl_person_id.setBackground(new java.awt.Color(255, 255, 255));
        lbl_person_id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_person_id.setForeground(new java.awt.Color(255, 255, 255));
        lbl_person_id.setText("Person Id");

        txt_sign_up_person_id.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txt_sign_up_person_id.setForeground(new java.awt.Color(0, 0, 0));
        txt_sign_up_person_id.setBorder(null);

        btn_cancel.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(lbl_txt_top))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btn_cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_sign_up, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                            .addComponent(lbl_icon_name_username)
                            .addGap(18, 18, 18)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_name_surname)
                                .addComponent(txt_sign_up_name_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(lbl_icon_email)
                                    .addGap(18, 18, 18)
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_email)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_sign_up_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(lbl_icon_user)
                                    .addGap(18, 18, 18)
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_username)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_sign_up_username, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbl_icon_gender)
                                        .addComponent(lbl_icon_password))
                                    .addGap(18, 18, 18)
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_password)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_sign_up_password, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                            .addComponent(rdbnt_female)
                                            .addGap(18, 18, 18)
                                            .addComponent(rdnbtn_male)))))
                            .addGap(136, 136, 136)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_icon_person_id)
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_person_id)
                            .addComponent(txt_sign_up_person_id, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(lbl_txt_top, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_person_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_sign_up_person_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_icon_person_id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_name_surname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_sign_up_name_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_icon_name_username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lbl_username)
                .addGap(15, 15, 15)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_sign_up_username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_icon_user, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_email)
                .addGap(19, 19, 19)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_sign_up_email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_icon_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_password)
                .addGap(15, 15, 15)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_sign_up_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_icon_password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_icon_gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbnt_female)
                        .addComponent(rdnbtn_male)))
                .addGap(27, 27, 27)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sign_up, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sign_upActionPerformed
        // Personel sınıfından bir obje oluşturup gerekli regex kurallarına uyarak kişinin kayıt işlemlerini gerçekleştiriyorum. Hem de execption sayesinde yazı kısımlaraında boşluk
        // kalmışsa  yeni bir exception atarak düzeltmesini sağlıyorum.
        Personel p1 = new Personel();

        String personIdText = txt_sign_up_person_id.getText().trim();
        if (personIdText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Person Id is empty");
            return;
        }
        p1.personId = Integer.parseInt(personIdText);

        String userName = txt_sign_up_username.getText().trim();
        if (userName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username is empty");
            return;
        }
        p1.user_name = userName;

        String nameSurname = txt_sign_up_name_surname.getText().trim();
        if (nameSurname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name and Surname is empty");
            return;
        }
        p1.name_surname = nameSurname;

        String email = txt_sign_up_email.getText().trim();
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email is empty");
            return;
        }
        p1.email = email;

        String password = txt_sign_up_password.getText().trim();
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password is empty");
            return;
        }
        p1.password = password;

        p1.position = "employee";

        String nameSurnameRegex = "^[A-Z][a-z]+ [A-Z][a-z]+$"; // name and surname regex
        String usernameRegex = "^[a-z0-9_-]{3,15}$"; // username regex
        String emailRegex = "^[a-zA-Z]+\\w*@((gmail)|(hotmail))\\.com$"; // email regex
        String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$"; // password regex

        Pattern patternNameSurname = Pattern.compile(nameSurnameRegex);
        Pattern patternUsername = Pattern.compile(usernameRegex);
        Pattern patternEmail = Pattern.compile(emailRegex);
        Pattern patternPassword = Pattern.compile(passwordRegex);

        Matcher matcherNameSurname = patternNameSurname.matcher(p1.name_surname);
        Matcher matcherUsername = patternUsername.matcher(p1.user_name);
        Matcher matcherEmail = patternEmail.matcher(p1.email);
        Matcher matcherPassword = patternPassword.matcher(p1.password);

        if (rdbnt_female.isSelected()) {
            p1.gender = 1;
        } else if (rdnbtn_male.isSelected()) {
            p1.gender = 0;
        } else {
            JOptionPane.showMessageDialog(null, "Please select a gender");
            return;
        }

        if (matcherNameSurname.matches()) {
            if (matcherUsername.matches()) {
                if (matcherEmail.matches()) {
                    if (matcherPassword.matches()) {
                        if (Company_db.AddPersonel(p1)) {
                            JOptionPane.showMessageDialog(rootPane, "Person is added");
                            Giriş_Ekranı g1 = new Giriş_Ekranı();
                            g1.setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Person is not added");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Password must be at least 8 characters and must contain at least one letter and one number");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Email must be gmail or hotmail and must be at least 3 characters");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Username must be at least 3 characters and can only contain letters, numbers, underscores and hyphens");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Name and surname must start with a capital letter and must be at least 2 words");
        }


    }//GEN-LAST:event_btn_sign_upActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        Giriş_Ekranı g1 = new Giriş_Ekranı();
        g1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(Kayıt_Ekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kayıt_Ekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kayıt_Ekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kayıt_Ekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kayıt_Ekranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_sign_up;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private bp2.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_icon_email;
    private javax.swing.JLabel lbl_icon_gender;
    private javax.swing.JLabel lbl_icon_name_username;
    private javax.swing.JLabel lbl_icon_password;
    private javax.swing.JLabel lbl_icon_person_id;
    private javax.swing.JLabel lbl_icon_user;
    private javax.swing.JLabel lbl_name_surname;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_person_id;
    private javax.swing.JLabel lbl_txt_top;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JRadioButton rdbnt_female;
    private javax.swing.ButtonGroup rdnbtn_group_gender;
    private javax.swing.JRadioButton rdnbtn_male;
    private javax.swing.JTextField txt_sign_up_email;
    private javax.swing.JTextField txt_sign_up_name_surname;
    private javax.swing.JTextField txt_sign_up_password;
    private javax.swing.JTextField txt_sign_up_person_id;
    private javax.swing.JTextField txt_sign_up_username;
    // End of variables declaration//GEN-END:variables
}
