import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * selection.java
 *
 * Created on 24 Nov, 2014, 10:57:50 PM
 */

/**
 *
 * @author Samrat
 */
public class selection extends javax.swing.JFrame {
    Connection con;
Statement stmt;

    /** Creates new form selection */
    public selection() {
        
  
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2560, 1440));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(2560, 1440));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 340, 90);

        jTextField1.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(400, 50, 720, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Magnifying Glass.PNG"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1140, 10, 160, 160);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ProductId", "ProductName", "CompanyName", "ProductCategory", "Quantity", "PricePerUnit"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(410, 200, 670, 320);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("BY NAME");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(400, 10, 150, 37);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton2.setText("BY ProductId");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(710, 10, 170, 37);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Show all");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1030, 30, 80, 22);

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 51));
        jButton2.setText("Medicines");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 200, 320, 40);

        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 51));
        jButton3.setText("Companies");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(40, 280, 320, 40);

        jButton4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 51));
        jButton4.setText("View Sales Records");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(40, 350, 320, 50);

        jButton5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 51));
        jButton5.setText("New Sales");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(40, 430, 320, 50);

        jButton6.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 0, 0));
        jButton6.setText("LOG OUT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(40, 640, 230, 60);

        jButton7.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 153, 51));
        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(920, 100, 110, 30);

        jButton8.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 102, 102));
        jButton8.setText("Change Password");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(40, 560, 360, 50);

        jButton9.setBackground(new java.awt.Color(255, 51, 153));
        jButton9.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jButton9.setText("MANAGE USERS");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(40, 503, 320, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medicine.jpg"))); // NOI18N
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentShown(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 3870, 2600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
         if(jRadioButton1.isSelected()){
         jButton1.setVisible(false);
           }
            String  text=jTextField1.getText();
            
            int  n=Integer.parseInt(jTextField1.getText());


             DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        int rows = model.getRowCount();
        if(rows>0)
          for(int i=0; i<rows;i++)
          {model.removeRow(0);
          }
        String query="Select * from medicines where productid ="+n+";";
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                String pid= rs.getString("productid");
                String pname= rs.getString("productname");
                String cname= rs.getString("companyname");
                String pcategory= rs.getString("productcategory");
                String qty= rs.getString("quantity");
                String price= rs.getString("priceperunit");
                model.addRow(new Object[]{pid,pname,cname,pcategory,qty,price});

            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:

       if(jRadioButton1.isSelected())
        {
            String  text=jTextField1.getText();
             DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        int rows = model.getRowCount();
        if(rows>0)
          for(int i=0; i<rows;i++)
          {model.removeRow(0);
          }
        String query="Select * from medicines where productname like'%"+text+"%'";
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                String pid= rs.getString("productid");
                String pname= rs.getString("productname");
                String cname= rs.getString("companyname");
                String pcategory= rs.getString("productcategory");
                
                String qty= rs.getString("quantity");
                String price= rs.getString("priceperunit");
                model.addRow(new Object[]{pid,pname,cname,pcategory,qty,price});

            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        }
        

        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
         DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        int rows = model.getRowCount();
        if(rows>0)
          for(int i=0; i<rows;i++)
          {model.removeRow(0);
          }
        String query="Select * from medicines "+";";
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                String pid= rs.getString("productid");
                String pname= rs.getString("productname");
                String cname= rs.getString("companyname");
                String pcategory= rs.getString("productcategory");
                String qty= rs.getString("quantity");
                String price= rs.getString("priceperunit");
                model.addRow(new Object[]{pid,pname,cname,pcategory,qty,price});

            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new medicines().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentShown
        // TODO add your handling code here:


    }//GEN-LAST:event_jLabel1ComponentShown

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new company().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(null);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new viewsales().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new newsales().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
          new changepassword().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
          new manageuserlogin().setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        // TODO add your handling code here:
          if(jRadioButton2.isSelected()){
         jButton1.setVisible(true);
           }
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jButton1.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        // TODO add your handling code here:
            jButton1.setVisible(false);
    }//GEN-LAST:event_jRadioButton1MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selection().setVisible(true);
          }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}