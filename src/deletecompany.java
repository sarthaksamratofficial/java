
import javax.swing.DefaultComboBoxModel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * deletecompany.java
 *
 * Created on Jan 2, 2015, 4:28:02 PM
 */

/**
 *
 * @author Sarthak Samrat
 */
public class deletecompany extends javax.swing.JFrame {

    /** Creates new form deletecompany */
    public deletecompany() {
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
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2550, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(2550, 1080));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 350, 100);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Search");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 100, 110, 60);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(500, 110, 360, 30);

        jComboBox1.setModel(new DefaultComboBoxModel());
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(500, 150, 240, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CompanyId", "Company Name", "Country", "email", "phone", "Address"
            }
        ));
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(350, 210, 570, 402);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(750, 150, 170, 50);

        jButton5.setFont(new java.awt.Font("Vodafone ExB", 1, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 0, 0));
        jButton5.setText("Log Out\n\n");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(820, 630, 210, 70);

        jButton4.setFont(new java.awt.Font("Pristina", 1, 48)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 153));
        jButton4.setText("Go Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(80, 630, 240, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apple-mac-hd-wallpaper-11.jpg"))); // NOI18N
        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel1FocusGained(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1660, 1320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
         String  text=jTextField1.getText();
         DefaultComboBoxModel cm= (DefaultComboBoxModel) jComboBox1.getModel();
         String query="Select (companyname) from company where companyname like'%"+text+"%'";
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

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable1ComponentShown

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel1FocusGained
        // TODO add your handling code here:

    
    }//GEN-LAST:event_jLabel1FocusGained

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
                   DefaultComboBoxModel cm=(DefaultComboBoxModel)jComboBox1.getModel();

               String tf=(String) jComboBox1.getSelectedItem();
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            String query="select companyname from company"+";";
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
        String querry="Select * from company where companyname like'%"+tf+"%'";
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery(querry);
            while(rs.next()){
                String pid= rs.getString("companyid");
                String pname= rs.getString("companyname");
                String cname= rs.getString("companycountry");
                String pcategory= rs.getString("companyemail");
                String qty= rs.getString("companycontactnumber");
                String price= rs.getString("address");
                model.addRow(new Object[]{pid,pname,cname,pcategory,qty,price});

            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
          DefaultComboBoxModel cm=(DefaultComboBoxModel)jComboBox1.getModel();

               String tf=(String) jComboBox1.getSelectedItem();
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            String query="select companyname from company"+";";
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
        String querry="Select * from company where companyname like'%"+tf+"%'";
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery(querry);
            while(rs.next()){
                String pid= rs.getString("companyid");
                String pname= rs.getString("companyname");
                String cname= rs.getString("companycountry");
                String pcategory= rs.getString("companyemail");
                String qty= rs.getString("companycontactnumber");
                String price= rs.getString("address");
                model.addRow(new Object[]{pid,pname,cname,pcategory,qty,price});

            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeVisible
        // TODO add your handling code here:
          DefaultComboBoxModel cm=(DefaultComboBoxModel)jComboBox1.getModel();

               String tf=(String) jComboBox1.getSelectedItem();
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            String query="select companyname from company"+";";
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
        String querry="Select * from company where companyname like'%"+tf+"%'";
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery(querry);
            while(rs.next()){
                String pid= rs.getString("companyid");
                String pname= rs.getString("companyname");
                String cname= rs.getString("companycountry");
                String pcategory= rs.getString("companyemail");
                String qty= rs.getString("companycontactnumber");
                String price= rs.getString("address");
                model.addRow(new Object[]{pid,pname,cname,pcategory,qty,price});

            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeVisible

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                  DefaultComboBoxModel ct=(DefaultComboBoxModel)jComboBox1.getModel();
               String tf=(String) jComboBox1.getSelectedItem();

               String query="Delete from company where companyname like'"+tf+"'";
                  try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();

                      int effect=stmt.executeUpdate(query);
JOptionPane.showMessageDialog(null,"successful");
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
        String querry="Select * from company ;";
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery(querry);
            while(rs.next()){
                String pid= rs.getString("companyid");
                String pname= rs.getString("companyname");
                String cname= rs.getString("companycountry");
                String pcategory= rs.getString("companyemail");
                String qty= rs.getString("companycontactnumber");
                String price= rs.getString("address");
                model.addRow(new Object[]{pid,pname,cname,pcategory,qty,price});

            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new company().setVisible(true);
        this.dispose();
}//GEN-LAST:event_jButton4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deletecompany().setVisible(true);
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
