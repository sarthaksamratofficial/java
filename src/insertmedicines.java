import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * insertmedicines.java
 *
 * Created on 9 Dec, 2014, 11:17:47 PM
 */

/**
 *
 * @author Samrat
 */
public class insertmedicines extends javax.swing.JFrame {

    /** Creates new form insertmedicines */
    public insertmedicines() {
        Statement stmt=null;
        ResultSet rs=null;
        String SQL="Select * from medicines";

      

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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2550, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(2550, 1080));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 350, 100);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Product Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 120, 370, 60);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(690, 130, 530, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Company Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 210, 300, 60);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Product Category");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(310, 300, 320, 60);

        jComboBox1.setModel(new DefaultComboBoxModel());
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox1MouseEntered(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(690, 230, 430, 40);

        jComboBox2.setModel(new DefaultComboBoxModel());
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeVisible(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(700, 320, 430, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Product Quantity");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 400, 290, 50);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("Product Price");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 460, 260, 80);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(700, 400, 500, 50);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(700, 490, 510, 50);

        jButton1.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 650, 210, 50);

        jLabel8.setFont(new java.awt.Font("Segoe Print", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Narcotic\n");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(310, 570, 180, 40);

        jButton2.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 0));
        jButton2.setText("Insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1020, 650, 200, 50);

        jComboBox3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(204, 0, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YES", "NO" }));
        jComboBox3.setToolTipText("<html>choose and <font color=red>be careful</font>");
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(700, 590, 290, 40);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(700, 300, 330, 20);

        jLabel9.setText("ADD NEW CATEGORY");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(980, 360, 140, 14);

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jButton3.setText("ADD NEW");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1130, 320, 160, 40);

        jLabel10.setText("Enter Category Name");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(700, 280, 120, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medicine.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1500, 1010);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 Statement stmt=null;
        ResultSet rs=null;
        String SQL="Select * from medicines";
    private void jComboBox1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseEntered
        // TODO add your handling code here:
       

    }//GEN-LAST:event_jComboBox1MouseEntered

    private void jComboBox1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeVisible
        // TODO add your handling code here:
         DefaultComboBoxModel cm=(DefaultComboBoxModel)jComboBox1.getModel();
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


    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeVisible

    private void jComboBox2PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeVisible
        // TODO add your handling code here:
               DefaultComboBoxModel cm=(DefaultComboBoxModel)jComboBox2.getModel();
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            String query="select * from category"+";";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
               String add=rs.getString(1);

               if(cm.getIndexOf(add)== -1){
                   cm.addElement(add);
               }
                jComboBox2.setModel(cm);
          }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        jTextField4.setVisible(false);
        jLabel10.setVisible(false);
    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeVisible

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       int add=0;
       int qs=0;
        String name= jTextField1.getText().toLowerCase();
        int u=name.length();
        if(u>0){
       try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            String query="select productid from medicines"+";";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                add=rs.getInt(1);
                qs= add+1;


               
          }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

        DefaultComboBoxModel cm=(DefaultComboBoxModel)jComboBox2.getModel();
        DefaultComboBoxModel cn=(DefaultComboBoxModel)jComboBox1.getModel();
         DefaultComboBoxModel co=(DefaultComboBoxModel)jComboBox3.getModel();
        try{
           
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
             stmt= con.createStatement();
             rs= stmt.executeQuery(SQL);
   

          
 String cname=(String)jComboBox1.getSelectedItem();
           String pcategory=(String)jComboBox2.getSelectedItem();
           String ct=(String)jComboBox3.getSelectedItem();
           int quantity=Integer.parseInt(jTextField2.getText());
           int price=Integer.parseInt(jTextField3.getText());
String q= "Insert into medicines values ('"+qs+"','"+name+"','"+cname+"','"+pcategory+"','"+ct+"','"+quantity+"','"+price+"')";
           int effect=stmt.executeUpdate(q);
JOptionPane.showMessageDialog(null,"successfully added");

        }  catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        jTextField1.setText(null);
jTextField2.setText(null);
jTextField3.setText(null);}
        else{
            JOptionPane.showMessageDialog(null,"failed");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new medicines().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
         jTextField4.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         String c=jTextField4.getText().toLowerCase();
int m=c.length();
if(m>0)
{
          try{

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
          Statement stmt= con.createStatement();


             String q= "Insert into category values ('"+c+"')";

             int effect=stmt.executeUpdate(q);
JOptionPane.showMessageDialog(null,"successful");

        }  catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }}
else{JOptionPane.showMessageDialog(rootPane, "please enter product category");}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextField4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insertmedicines().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
