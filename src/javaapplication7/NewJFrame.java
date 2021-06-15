/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication7;

import java.sql.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import java.sql.ResultSet; 
public class NewJFrame extends javax.swing.JFrame {

    /** Creates new form NewJFrame */
    public NewJFrame() {
        initComponents();
         this.setLocationRelativeTo(null);
          Home.setVisible(true);     
         update();
         update2();
    }
//    public NewJFrame(String data) {
//         initComponents();  
//           DefaultTableModel RecordTable = (DefaultTableModel)jTable3.getModel();
//           RecordTable.addRow(data);
//            
//       
//    }
    public void update2()
    {
            try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
              PreparedStatement pst=con.prepareStatement("select *from inventory");
              
              ResultSet rs = pst.executeQuery();
              ResultSetMetaData stData = rs.getMetaData();
              int q =stData.getColumnCount();
              DefaultTableModel RecordTable = (DefaultTableModel)jTable2.getModel();
              RecordTable.setRowCount(0);
            
              while(rs.next())
              {
                  Vector columnData= new Vector();
                  for ( int x=1; x<=q; x++)
                  {
                      columnData.add(rs.getString("menuName"));
                      columnData.add(rs.getString("price"));
                   
                  } 
                  RecordTable.addRow(columnData);
              }
       
        } 
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    public void update(){
        
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
              PreparedStatement pst=con.prepareStatement("select *from inventory");
              
              ResultSet rs = pst.executeQuery();
              ResultSetMetaData stData = rs.getMetaData();
              int q =stData.getColumnCount();
              DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
              RecordTable.setRowCount(0);
            
              while(rs.next())
              {
                  Vector columnData= new Vector();
                  for ( int x=1; x<=q; x++)
                  {
                    
                     columnData.add(rs.getString("id"));
                      columnData.add(rs.getString("menuName"));
                      columnData.add(rs.getString("price"));
                      columnData.add(rs.getString("stocks"));
                  } 
                  RecordTable.addRow(columnData);
              }
       
        } 
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        panel1 = new java.awt.Panel();
        sidebar = new java.awt.Panel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        product = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        price = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        stocks = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        Home = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        name_field = new javax.swing.JTextField();
        price_field = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        total_field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setMinimumSize(new java.awt.Dimension(1000, 508));
        panel1.setPreferredSize(new java.awt.Dimension(987, 508));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebar.setBackground(new java.awt.Color(25, 125, 200));
        sidebar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Add New Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        sidebar.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 220, 56));

        jButton5.setText("Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        sidebar.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, 56));

        jButton2.setText("Add New Stocks");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        sidebar.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 220, 56));

        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        sidebar.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 220, 56));

        panel1.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 510));

        product.setBackground(new java.awt.Color(21, 101, 192));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Menu Name");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        menuName.setBackground(new java.awt.Color(175, 194, 208));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Stock");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Add New Menu ");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTable1.setBackground(new java.awt.Color(227, 242, 253));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Menu Name", "Price", "Stocks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        price.setBackground(new java.awt.Color(175, 194, 208));

        add.setBackground(new java.awt.Color(175, 194, 208));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        stocks.setBackground(new java.awt.Color(175, 194, 208));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Price");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        delete.setBackground(new java.awt.Color(175, 194, 208));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout productLayout = new org.jdesktop.layout.GroupLayout(product);
        product.setLayout(productLayout);
        productLayout.setHorizontalGroup(
            productLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(productLayout.createSequentialGroup()
                .add(productLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(productLayout.createSequentialGroup()
                        .add(68, 68, 68)
                        .add(productLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, add, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(delete, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)))
                    .add(productLayout.createSequentialGroup()
                        .add(productLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(productLayout.createSequentialGroup()
                                .add(35, 35, 35)
                                .add(productLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel1)
                                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, productLayout.createSequentialGroup()
                                .addContainerGap()
                                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(productLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(menuName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .add(price)
                            .add(stocks))))
                .add(38, 38, 38)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .add(20, 20, 20))
            .add(productLayout.createSequentialGroup()
                .add(133, 133, 133)
                .add(title, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 316, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        productLayout.setVerticalGroup(
            productLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(productLayout.createSequentialGroup()
                .addContainerGap()
                .add(title, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(productLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(productLayout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 32, Short.MAX_VALUE)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 397, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(30, 30, 30))
                    .add(productLayout.createSequentialGroup()
                        .add(54, 54, 54)
                        .add(productLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(menuName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(productLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(price, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(6, 6, 6)
                        .add(productLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(stocks, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(65, 65, 65)
                        .add(add, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(26, 26, 26)
                        .add(delete, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        panel1.add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 770, 510));

        Home.setBackground(new java.awt.Color(21, 101, 192));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Menu Name ", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Litas Barbeque");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu Name ", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Price");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("List of Item");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Name");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Quantity");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("List of Order");

        jButton3.setText("Chech Out ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout HomeLayout = new org.jdesktop.layout.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(HomeLayout.createSequentialGroup()
                .add(14, 14, 14)
                .add(HomeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(HomeLayout.createSequentialGroup()
                        .add(116, 116, 116)
                        .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(16, 16, 16)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 281, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .add(HomeLayout.createSequentialGroup()
                        .add(HomeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 330, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, HomeLayout.createSequentialGroup()
                                .add(8, 8, 8)
                                .add(HomeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(HomeLayout.createSequentialGroup()
                                        .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(102, 102, 102))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, HomeLayout.createSequentialGroup()
                                        .add(name_field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(6, 6, 6)
                                        .add(price_field)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(quantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                        .add(HomeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(HomeLayout.createSequentialGroup()
                                .add(183, 183, 183)
                                .add(total_field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, HomeLayout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 64, Short.MAX_VALUE)
                                .add(HomeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, HomeLayout.createSequentialGroup()
                                        .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 269, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(51, 51, 51))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, HomeLayout.createSequentialGroup()
                                        .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 347, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(15, 15, 15))))))))
            .add(HomeLayout.createSequentialGroup()
                .add(75, 75, 75)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 215, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(HomeLayout.createSequentialGroup()
                .add(HomeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(HomeLayout.createSequentialGroup()
                        .add(14, 14, 14)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 45, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, HomeLayout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(HomeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .add(HomeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(HomeLayout.createSequentialGroup()
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 224, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(HomeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(HomeLayout.createSequentialGroup()
                                .add(total_field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(HomeLayout.createSequentialGroup()
                                .add(HomeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(HomeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                        .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(HomeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(name_field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(price_field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(quantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 224, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        panel1.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 770, 510));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
         if(add.getText() == "Add")
         {
                try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
                 PreparedStatement pst= con.prepareStatement("insert into inventory(menuName,price,stocks) value(?, ? ,?)");
                         
                         pst.setString(1,menuName.getText());
                          pst.setString(2,price.getText());
                           pst.setString(3,stocks.getText());
                           
                           pst.executeUpdate();
                           JOptionPane.showMessageDialog(this,"Record added"); 
                           update();
                           update2();
            }
               catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,e);
                    }
         }
         else
         {
               DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel(); 
     int SelectedRows  = jTable1.getSelectedRow();        
       var id =(RecordTable.getValueAt(SelectedRows,0 ).toString());
        var stock =(RecordTable.getValueAt(SelectedRows,3 ).toString());
       int total = Integer.parseInt(stock) + Integer.parseInt(stocks.getText());
      JOptionPane.showMessageDialog(null,"total add:"+total+" id:"+id);
        try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
                 PreparedStatement pst= con.prepareStatement("update inventory set stocks=? where id ='"+ id +"' ");

                           pst.setString(1,Integer.toString(total));                          
                           pst.executeUpdate();
                           JOptionPane.showMessageDialog(this,"Added New Stocks"); 
                           update();
                           update2();
            }
               catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,e);
                    }
             
         }
        
     
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
   
        // DELETE ITEMS
       DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
       int SelectRows = jTable1.getSelectedRow();
       try
       {
           int id = Integer.parseInt(RecordTable.getValueAt(SelectRows,0).toString());
          System.out.println(id);
           var deleteItem =JOptionPane.showConfirmDialog(null,"Confirm if you want to delete item ","Warning",JOptionPane.YES_NO_OPTION);
           if(deleteItem == JOptionPane.YES_OPTION)
           {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
                PreparedStatement pst=  con.prepareStatement("delete from inventory where id=?");
                pst.setInt(1,id);
                pst.executeUpdate();
              //  JOptionPane.showMessageDiaolog(this,"record updated");
                update();
                   update2();
                menuName.setText("");
                price.setText("");
                stocks.setText("");
           }
       }
         catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     if(title.getText()=="Add New Stock")
     {
     add.setText("Update");
     DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel(); 
     int SelectedRows  = jTable1.getSelectedRow();
     
     menuName.setText(RecordTable.getValueAt(SelectedRows,1 ).toString());
     price.setText(RecordTable.getValueAt(SelectedRows,2 ).toString());
     stocks.setText(RecordTable.getValueAt(SelectedRows,3 ).toString());
     
     }    
     else
     {
     DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel(); 
     int SelectedRows  = jTable1.getSelectedRow();
     
     menuName.setText(RecordTable.getValueAt(SelectedRows,1 ).toString());
     price.setText(RecordTable.getValueAt(SelectedRows,2 ).toString());
     stocks.setText(RecordTable.getValueAt(SelectedRows,3 ).toString());
        
     }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        //Home table event handler
         DefaultTableModel RecordTable = (DefaultTableModel)jTable2.getModel(); 
     int SelectedRows  = jTable2.getSelectedRow();
     
   name_field.setText(RecordTable.getValueAt(SelectedRows,0 ).toString());
     price_field.setText(RecordTable.getValueAt(SelectedRows,1 ).toString());
     
//     String _name = name ;
//     String _price = price;
//     new form2(_name,_price).setVisible(true);
//     setVisible(true);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try{
      DefaultTableModel RecordTable = (DefaultTableModel)jTable3.getModel(); 
  
       int total = Integer.parseInt(quantity.getText()) * Integer.parseInt(price_field.getText());
        String data[] = {name_field.getText(),price_field.getText(),quantity.getText(),Integer.toString(total)};
       
         RecordTable.addRow(data);
         
      int sum = 0 ;
      for (int i=0;i <jTable3.getRowCount(); i++)
      {
          sum =sum + Integer.parseInt(jTable3.getValueAt(i,3).toString());
          
    }
      total_field.setText(Integer.toString(sum));
        
        
     
     }
    catch(Exception e)
         
     {
         JOptionPane.showMessageDialog(null,"Input How many Quantity you want to order");
     }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//          int sum = 0 ;
//        DefaultTableModel RecordTable = (DefaultTableModel)jTable3.getModel();  
//        for (int i=0;i <jTable3.getRowCount(); i++)
//      {
//          sum =sum + Integer.parseInt(jTable3.getValueAt(i,3).toString());
//          
//    }
        
        JOptionPane.showMessageDialog(null,"ORDER SUCCESS");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        title.setText("Add New Stock") ;
        product.setVisible(true);  // panel product
       Home.setVisible(false);        // panel Home
       price.setEnabled(false);
       delete.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       // new itemclicked
     
         menuName.setText("");
        price.setText("");
        stocks.setText("");
        add.setText("Add");
        title.setText("Add New Menu");
        product.setVisible(true); // panel product
       Home.setVisible(false);     // panel Home
       delete.setEnabled(true);
       
       price.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        product.setVisible(false);  // panel product
       Home.setVisible(true); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   this.dispose(); 
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Home;
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField menuName;
    private javax.swing.JTextField name_field;
    private java.awt.Panel panel1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField price_field;
    private javax.swing.JPanel product;
    private javax.swing.JTextField quantity;
    private java.awt.Panel sidebar;
    private javax.swing.JTextField stocks;
    private javax.swing.JLabel title;
    private javax.swing.JTextField total_field;
    // End of variables declaration//GEN-END:variables

}
