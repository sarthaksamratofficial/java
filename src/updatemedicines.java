import javax.swing.DefaultComboBoxModel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * updatemedicines.java
 *
 * Created on 10 Dec, 2014, 3:02:07 AM
 */

/**
 *
 * @author Samrat
 */
public class updatemedicines extends javax.swing.JFrame {

    /** Creates new form updatemedicines */
    public updatemedicines() {
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

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(2550, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(2550, 1080));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Product Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 100, 220, 40);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(540, 90, 310, 40);

        jComboBox1.setModel(new DefaultComboBoxModel());
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(540, 130, 210, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ProductID", "Product Name", "Company Name", "Product Category", "Narcotic", "Quantity", "Price Per Unit"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(272, 410, 700, 190);

        jLabel3.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("search");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(540, 70, 90, 24);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("update quantity");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(410, 250, 250, 42);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(650, 260, 240, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("update price");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 320, 183, 40);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(650, 330, 240, 30);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(910, 240, 210, 50);

        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(910, 320, 210, 50);

        jButton3.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 153));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 640, 210, 50);

        jButton5.setFont(new java.awt.Font("Vodafone ExB", 1, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 0, 0));
        jButton5.setText("Log Out\n\n");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(990, 630, 260, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medicine.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1450, 890);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
             DefaultComboBoxModel cm=(DefaultComboBoxModel)jComboBox1.getModel();

               String tf=(String) jComboBox1.getSelectedItem();
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            String query="select productname from medicines"+";";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
               String add=rs.getString(1);

               if(cm.getIndexOf(add)== -1){
                   cm.addElement(add);
               }
                jComboBox1.setModel(cm);
          }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
          DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        int rows = model.getRowCount();
        if(rows>0)
          for(int i=0; i<rows;i++)
          {model.removeRow(0);
          }
        String querry="Select * from medicines where productname like'%"+tf+"%';";
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery(querry);
            while(rs.next()){
               String pid= rs.getString("productid");
                String pname= rs.getString("productname");
                String cname= rs.getString("companyname");
                String pcategory= rs.getString("productcategory");
                String ct=rs.getString("narcotic");
                String qty= rs.getString("quantity");
                String price= rs.getString("priceperunit");
                model.addRow(new Object[]{pid,pname,cname,pcategory,ct,qty,price});

            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
         String  text=jTextField1.getText();
         DefaultComboBoxModel cm= (DefaultComboBoxModel) jComboBox1.getModel();
         String query="Select (productname) from medicines where productname like'%"+text+"%'";
          String add="";

         try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){

                    add=rs.getString(1);

               if(cm.getIndexOf(add)== -1){
                   cm.addElement(add);
               }
                jComboBox1.setModel(cm);
         jComboBox1.setSelectedItem(add);}}
          catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
                   DefaultComboBoxModel cm=(DefaultComboBoxModel)jComboBox1.getModel();

               String tf=(String) jComboBox1.getSelectedItem();
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            String query="select productname from medicines"+";";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
               String add=rs.getString(1);

               if(cm.getIndexOf(add)== -1){
                   cm.addElement(add);
               }
                jComboBox1.setModel(cm);
          }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
          DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        int rows = model.getRowCount();
        if(rows>0)
          for(int i=0; i<rows;i++)
          {model.removeRow(0);
          }
        String querry="Select * from medicines where productname like'%"+tf+"%';";
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery(querry);
            while(rs.next()){
               String pid= rs.getString("productid");
                String pname= rs.getString("productname");
                String cname= rs.getString("companyname");
                String pcategory= rs.getString("productcategory");
                String ct=rs.getString("narcotic");
                String qty= rs.getString("quantity");
                String price= rs.getString("priceperunit");
                model.addRow(new Object[]{pid,pname,cname,pcategory,ct,qty,price});

            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          DefaultComboBoxModel ct=(DefaultComboBoxModel)jComboBox1.getModel();
               String tf=(String) jComboBox1.getSelectedItem();
                 String query="Update medicines set quantity='"+jTextField2.getText()+"'where productname like'"+tf+"';";
                  try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();

                      int effect=stmt.executeUpdate(query);

}
                   catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
                 DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        int rows = model.getRowCount();
        if(rows>0)
          for(int i=0; i<rows;i++)
          {model.removeRow(0);
          }
        String querry="Select * from medicines where productname like'%"+tf+"%';";
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery(querry);
            while(rs.next()){
               String pid= rs.getString("productid");
                String pname= rs.getString("productname");
                String cname= rs.getString("companyname");
                String pcategory= rs.getString("productcategory");
                String cl=rs.getString("narcotic");
                String qty= rs.getString("quantity");
                String price= rs.getString("priceperunit");
                model.addRow(new Object[]{pid,pname,cname,pcategory,cl,qty,price});

            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new medicines().setVisible(true);
            this.dispose();
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
            this.dispose();
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                 DefaultComboBoxModel ct=(DefaultComboBoxModel)jComboBox1.getModel();
               String tf=(String) jComboBox1.getSelectedItem();
                 String query="Update medicines set priceperunit='"+jTextField3.getText()+"'where productname like'"+tf+"';";
                  try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();

                      int effect=stmt.executeUpdate(query);

}
                   catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
                 DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        int rows = model.getRowCount();
        if(rows>0)
          for(int i=0; i<rows;i++)
          {model.removeRow(0);
          }
        String querry="Select * from medicines where productname like'%"+tf+"%';";
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery(querry);
            while(rs.next()){
               String pid= rs.getString("productid");
                String pname= rs.getString("productname");
                String cname= rs.getString("companyname");
                String pcategory= rs.getString("productcategory");
                String cl=rs.getString("narcotic");
                String qty= rs.getString("quantity");
                String price= rs.getString("priceperunit");
                model.addRow(new Object[]{pid,pname,cname,pcategory,cl,qty,price});

            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jButton2KeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatemedicines().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
