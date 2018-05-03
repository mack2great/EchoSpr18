/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import core.Carrier;
import dao.CarrierDAO;
import dao.DBConnection;
import java.util.List;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;

/**
 *
 * @author Vasudev Vijayaraman
 */
public class CarrierFrame extends javax.swing.JFrame {
    private DBConnection conn;
    private CarrierDAO carrierDAO;
    private List<Carrier> carrierList;
    CarrierTableModel model;
    /**
     * Creates new form CarrierFrame
     */
    public CarrierFrame(DBConnection myConn) {
        initComponents();
        this.conn = myConn;
        carrierDAO = new CarrierDAO(this.conn);
        CarrierTable.setAutoCreateRowSorter(true);
        try{
            carrierList = carrierDAO.getAllCarriers();
            model = new CarrierTableModel(carrierList);
            CarrierTable.setModel(model);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Message: " + e,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CIDLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        RedShipLabel = new javax.swing.JLabel();
        BlueShipLabel = new javax.swing.JLabel();
        GroundShipLabel = new javax.swing.JLabel();
        WalkinLabel = new javax.swing.JLabel();
        CIDTextField = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        RedShipComboBox = new javax.swing.JComboBox<>();
        BlueShipComboBox = new javax.swing.JComboBox<>();
        GroundComboBox = new javax.swing.JComboBox<>();
        WalkinComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        CarrierTable = new javax.swing.JTable();
        NameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CIDLabel.setText("Carrier ID:");

        NameLabel.setText("Name:");

        RedShipLabel.setText("Red Shipment:");

        BlueShipLabel.setText("Blue Shipment:");

        GroundShipLabel.setText("Ground Shipment:");

        WalkinLabel.setText("Walk-in:");

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        RedShipComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "yes", "no" }));

        BlueShipComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "yes", "no" }));

        GroundComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "yes", "no" }));

        WalkinComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "yes", "no" }));

        CarrierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Carrier ID", "Name", "Red Shipment Available", "Blue Shipment Available", "Ground Shipment Available", "Walk-in Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(CarrierTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(WalkinLabel)
                                    .addComponent(RedShipLabel)
                                    .addComponent(BlueShipLabel)
                                    .addComponent(GroundShipLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RedShipComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BlueShipComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GroundComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WalkinComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NameLabel)
                                    .addComponent(CIDLabel))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(UpdateButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ResetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CIDLabel)
                            .addComponent(CIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameLabel)
                            .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RedShipLabel)
                            .addComponent(RedShipComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BlueShipLabel)
                            .addComponent(BlueShipComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GroundShipLabel)
                            .addComponent(GroundComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WalkinLabel)
                            .addComponent(WalkinComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddButton)
                        .addGap(1, 1, 1)
                        .addComponent(DeleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UpdateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResetButton)
                        .addGap(37, 37, 37)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  //Searches a combo box for the index of a string value and returns it
    private int getIndexInComboBox(String toFind, JComboBox jBox)
    {
        String item;
        boolean found = false;
        int index = -1;
       for(int i = 0; i < jBox.getItemCount() && !found; i++)
       {
           item = jBox.getItemAt(i).toString();
           if(item.equals(toFind))
           {
               index = i;
               found = true;
           }
       }
       
       return index;
    }
    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        Carrier addCarrier = new Carrier(Integer.parseInt(CIDTextField.getText()),NameTextField.getText(),RedShipComboBox.getSelectedItem().toString(),BlueShipComboBox.getSelectedItem().toString(),GroundComboBox.getSelectedItem().toString(),WalkinComboBox.getSelectedItem().toString());
          
        try {
        if (Integer.parseInt(CIDTextField.getText())<0){
              JOptionPane.showMessageDialog(this,"Invalid Carrier Entry","Error Adding Carrier",JOptionPane.ERROR_MESSAGE);
          }
        else{
          //Adds order to the database
          carrierDAO.addCarrier(addCarrier);
          //Refreshes the table
          CarrierTableModel model = new CarrierTableModel(carrierDAO.getAllCarriers());
          CarrierTable.setModel(model);
          //Notifies the user that their order has been added
          JOptionPane.showMessageDialog(this,"Your carrier has been added!");
        }
        }

        catch(Exception ex) {
             String error;
             //Prints error message if OID is already used
             if (ex.getMessage().contains("for key 'PRIMARY'")){
                error = "CID is already being used.";
                JOptionPane.showMessageDialog(this, error, "Error Adding Carrier", JOptionPane.ERROR_MESSAGE);
                int p = JOptionPane.showConfirmDialog(null,"Do you wish to update this Carrier instead?","Update",JOptionPane.YES_NO_OPTION);
                if (p==0){
                   try{
                    carrierDAO.updateCarrier(addCarrier);
                   CarrierTableModel model = new CarrierTableModel(carrierDAO.getAllCarriers());
                   CarrierTable.setModel(model);
                    JOptionPane.showMessageDialog(this,"Your carrier has been updated!");
                    }
                   catch(Exception e){
                       JOptionPane.showMessageDialog(null, "Error updating carrier! Error Message:" + e, "Error Updating", JOptionPane.ERROR_MESSAGE);
                    }
                }
             }
             else{
                JOptionPane.showMessageDialog(null, "Error adding order! Error Message: " + ex, "Error Adding Order", JOptionPane.ERROR_MESSAGE);
        }     
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        
//TODO add your handling code here:
              int p = JOptionPane.showConfirmDialog(null,"Are you sure you wish to delete this order?","Delete",JOptionPane.YES_NO_OPTION);
       if (p==0)
       {
         
           try {
          Carrier deleteCarrier = new Carrier(Integer.parseInt(CIDTextField.getText()),NameTextField.getText(),RedShipComboBox.getSelectedItem().toString(),BlueShipComboBox.getSelectedItem().toString(),GroundComboBox.getSelectedItem().toString(),WalkinComboBox.getSelectedItem().toString());
           carrierDAO.deleteCarrier(deleteCarrier);
          JOptionPane.showMessageDialog(this,"Your carrier has been deleted!");
            carrierList = carrierDAO.getAllCarriers();
            model = new CarrierTableModel(carrierList);
            CarrierTable.setModel(model);

        //CarrierTableModel model = new CarrierTableModel(carrierDAO.getAllCarriers());
        //CarrierTable.setModel(model);
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Database Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
         
           finally{
           //Fields reset         
      CIDTextField.setText("");
      NameTextField.setText("");
      RedShipComboBox.setSelectedIndex(0);
      BlueShipComboBox.setSelectedIndex(0);
      GroundComboBox.setSelectedIndex(0);
      WalkinComboBox.setSelectedIndex(0);
      AddButton.setEnabled(true);
           
           }
       }
       else {
           JOptionPane.showMessageDialog(this, "Delete Cancelled");
       }
       
       
       
       
       
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        try {
          Carrier updateCarrier = new Carrier(Integer.parseInt(CIDTextField.getText()),NameTextField.getText(),RedShipComboBox.getSelectedItem().toString(),BlueShipComboBox.getSelectedItem().toString(),GroundComboBox.getSelectedItem().toString(),WalkinComboBox.getSelectedItem().toString());
          carrierDAO.updateCarrier(updateCarrier);
          JOptionPane.showMessageDialog(this,"Your carrier has been updated!");
          CarrierTableModel model = new CarrierTableModel(carrierDAO.getAllCarriers());
          CarrierTable.setModel(model);
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "One or more fields are blank. Error Message: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        finally{
           //Fields reset         
      CIDTextField.setText("");
      NameTextField.setText("");
      RedShipComboBox.setSelectedIndex(0);
      BlueShipComboBox.setSelectedIndex(0);
      GroundComboBox.setSelectedIndex(0);
      WalkinComboBox.setSelectedIndex(0);
      AddButton.setEnabled(true);
        }
        
        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // TODO add your handling code here:
      CIDTextField.setText("");
      NameTextField.setText("");
      RedShipComboBox.setSelectedIndex(0);
      BlueShipComboBox.setSelectedIndex(0);
      GroundComboBox.setSelectedIndex(0);
      WalkinComboBox.setSelectedIndex(0);
      AddButton.setEnabled(true);
    }//GEN-LAST:event_ResetButtonActionPerformed
/*
    /*
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
            java.util.logging.Logger.getLogger(CarrierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarrierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarrierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarrierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarrierFrame(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JComboBox<String> BlueShipComboBox;
    private javax.swing.JLabel BlueShipLabel;
    private javax.swing.JLabel CIDLabel;
    private javax.swing.JTextField CIDTextField;
    private javax.swing.JTable CarrierTable;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JComboBox<String> GroundComboBox;
    private javax.swing.JLabel GroundShipLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JComboBox<String> RedShipComboBox;
    private javax.swing.JLabel RedShipLabel;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JComboBox<String> WalkinComboBox;
    private javax.swing.JLabel WalkinLabel;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
