
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * login.java
 *
 * Created on 24 Nov, 2014, 9:05:31 AM
 */

/**
 *
 * @author Samrat
 */
public class login extends javax.swing.JFrame {

    /** Creates new form login */
    public login() {
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
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(2560, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(2550, 1080));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 350, 90);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18c7saub4nw9ggif.gif"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(180, 140, 640, 370);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacist_pharmacy_store_room_view_of_a_pharmacist_studying_a_bottle_of_drugs_in_a_pharmacy_sto_P6359.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 200, 530, 420);

        jLabel4.setFont(new java.awt.Font("Microsoft Himalaya", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("User ID");
        jLabel4.setToolTipText("Please enter your User name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(750, 210, 180, 80);

        jTextField1.setToolTipText("CLICK TO Enter your alloted UID");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(950, 230, 270, 30);

        jLabel5.setFont(new java.awt.Font("Microsoft Himalaya", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("Password");
        jLabel5.setToolTipText("please enter your respective password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(730, 310, 230, 60);

        jPasswordField1.setToolTipText(" CLICK TO enter your password here\n");
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(950, 320, 270, 30);

        jButton1.setFont(new java.awt.Font("Papyrus", 3, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("LOG IN ");
        jButton1.setToolTipText("CLICK TO LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(760, 420, 250, 50);

        jButton2.setFont(new java.awt.Font("Papyrus", 3, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("CLEAR\n");
        jButton2.setToolTipText("CLICK TO CLEAR BOTH THE FIELDS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1090, 420, 220, 50);

        jButton3.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 0));
        jButton3.setText("EXIT\n");
        jButton3.setToolTipText("CLOSE THE APPLICATION");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(950, 520, 220, 60);

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/installer.png"))); // NOI18N
        jLabel6.setText("please run setup before using for first time ,avoid if already done...");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(370, 10, 930, 130);

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton4.setText("ABOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(590, 570, 140, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("???Forgot Password");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1150, 350, 190, 20);

        jLabel9.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel9ComponentShown(evt);
            }
        });
        jLabel9.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel9ComponentAdded(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(880, 390, 100, 20);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(870, 380, 390, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strng medicine HD.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1600, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
jLabel10.setVisible(true);

          String s=jTextField1.getText();
        Object a=jPasswordField1.getPassword();
       String z=new String(jPasswordField1.getPassword());
       int j=s.length();
       int p=z.length();
       if(j>0&&p>0){
       String query="Select uid,pwd from login where uid like'"+s+"' && pwd like'"+z+"'";
          String add="";
String nt="";
         try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/med","root","");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
nt=rs.getString(1);
add=rs.getString(2);
jLabel10.setVisible(true);
                    }}
          catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

if(z.equals(add)&&s.equals(nt))
        {    jLabel10.setVisible(true);
            JOptionPane.showMessageDialog(rootPane, "welcome to Samrat Pharmaceuticals");
         
        new selection().setVisible(true);
   this.dispose();
        }
 

        else
        { 
            JOptionPane.showMessageDialog(rootPane,"something went wrong, try again"+"\n"+"Check whether software is installed or not"+"\n"+" OR CapsLock is ON");
            jLabel10.setVisible(false);
         }} else
           
        { 
            JOptionPane.showMessageDialog(rootPane,"Please enter User ID and Password and then Click"+"\n"+"And Check whether software is installed or not");
        jLabel10.setVisible(false); 
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jTextField1.setText(null);
        jPasswordField1.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        new iNSTALL().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new About().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"KINDLY CONTACT YOUR ADMINISTRATOR FOR RESETTING YOUR PASSWORD");
    }//GEN-LAST:event_jLabel7MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jLabel8.setVisible(false);
          jLabel9.setVisible(false);
          jLabel10.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jLabel9ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel9ComponentAdded
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jLabel9ComponentAdded

    private void jLabel9ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel9ComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel9ComponentShown

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
                new login().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
