/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author laizer corp
 */
public class NewRouteForm extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    ResultSetMetaData resInfo = null;
    
    JOptionPane pane = new JOptionPane();
    
    /**
     * Creates new form NewRouteForm
     */
    public NewRouteForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_new_route = new javax.swing.JButton();
        et_new_route_start = new javax.swing.JTextField();
        et_new_route_destination = new javax.swing.JTextField();
        et_new_route_fare = new javax.swing.JTextField();
        cb_new_route_class = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Route");
        setLocation(new java.awt.Point(450, 250));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("New Route");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Start");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Destination");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Fare");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Class");

        btn_new_route.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_new_route.setText("Add Route");
        btn_new_route.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_routeActionPerformed(evt);
            }
        });

        et_new_route_start.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        et_new_route_destination.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        et_new_route_fare.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cb_new_route_class.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cb_new_route_class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Class", "Second Class", "Third Class" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_new_route)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(et_new_route_fare, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                        .addComponent(et_new_route_destination, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                        .addComponent(et_new_route_start)
                        .addComponent(cb_new_route_class, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(et_new_route_start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(et_new_route_destination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(et_new_route_fare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_new_route_class, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btn_new_route)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_new_routeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_routeActionPerformed
        // TODO add your handling code here:
        if(validated()){
            if(!isRedundant()){
                try{
                    String url = "INSERT INTO routes (start, destination, fare, class) VALUES (?,?,?,?)";
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db?","root","");
                    ps = conn.prepareStatement(url);
                    ps.setString(1, et_new_route_start.getText());
                    ps.setString(2, et_new_route_destination.getText());
                    ps.setString(3, et_new_route_fare.getText());
                    ps.setString(4, Integer.toString(cb_new_route_class.getSelectedIndex()+1));
                    int res = ps.executeUpdate();

                    pane.showMessageDialog(null, res+" Route Added", "Done!" ,pane.INFORMATION_MESSAGE);
                    dispose();
                }
                catch(Exception ex){
                    pane.showMessageDialog(null, ex.getMessage(), "Error" ,pane.ERROR_MESSAGE);
                }
            }
        }
        else{
            pane.showMessageDialog(null, "Enter Valid Details", "Input Error" ,pane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_new_routeActionPerformed

    private boolean isRedundant(){
        try{
            String url = "SELECT * FROM routes WHERE start=? AND destination=? AND class=?";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db?","root","");
            ps = conn.prepareStatement(url);
            ps.setString(1, et_new_route_start.getText());
            ps.setString(2, et_new_route_destination.getText());
            ps.setString(3, Integer.toString(cb_new_route_class.getSelectedIndex()+1));
            rs = ps.executeQuery();

            if(rs.next()){
                pane.showMessageDialog(null, "The Created Route already Exists!", "Route Redundancy" ,pane.ERROR_MESSAGE);
                return true;
            }
            else{
                return false;
            }
        }
        catch(Exception ex){
            pane.showMessageDialog(null, ex.getMessage(), "Error" ,pane.ERROR_MESSAGE);
            return true;
        }
    }
    
    private boolean validated(){
        if(et_new_route_start.getText().isEmpty() || et_new_route_destination.getText().isEmpty() || et_new_route_fare.getText().isEmpty()){
            return false;
        }
        else if(Integer.parseInt(et_new_route_fare.getText()) <= 0){
            return false;
        }
        else{
            return true;
        }
    }
    
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
            java.util.logging.Logger.getLogger(NewRouteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewRouteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewRouteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewRouteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewRouteForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_new_route;
    private javax.swing.JComboBox<String> cb_new_route_class;
    private javax.swing.JTextField et_new_route_destination;
    private javax.swing.JTextField et_new_route_fare;
    private javax.swing.JTextField et_new_route_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
