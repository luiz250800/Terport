/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exportacao;

/**
 *
 * @author luizr
 */
public class Jf_Navio extends javax.swing.JFrame {

    /**
     * Creates new form Jf_Navio
     */
    public Jf_Navio() {
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

        btn_voltar = new javax.swing.JButton();
        lbl_cadastro_navio = new javax.swing.JLabel();
        lbl_nm_navio = new javax.swing.JLabel();
        txt_nm_navio = new javax.swing.JTextField();
        lbl_ds_navio = new javax.swing.JLabel();
        js_ds_descricao_navio = new javax.swing.JScrollPane();
        txta_ds_descricao_navio = new javax.swing.JTextArea();
        btn_cadastrar_transportadora = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_voltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        lbl_cadastro_navio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_cadastro_navio.setText("CADASTRO DE NAVIO");

        lbl_nm_navio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_nm_navio.setText("Nome do navio:");

        txt_nm_navio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_nm_navio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nm_navioActionPerformed(evt);
            }
        });

        lbl_ds_navio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_ds_navio.setText("Descrição do navio:");

        txta_ds_descricao_navio.setColumns(20);
        txta_ds_descricao_navio.setRows(5);
        js_ds_descricao_navio.setViewportView(txta_ds_descricao_navio);

        btn_cadastrar_transportadora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_cadastrar_transportadora.setText("Cadastrar");
        btn_cadastrar_transportadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrar_transportadoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_nm_navio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nm_navio))
                    .addComponent(js_ds_descricao_navio)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ds_navio)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_voltar)
                                .addGap(101, 101, 101)
                                .addComponent(lbl_cadastro_navio)))
                        .addGap(0, 168, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cadastrar_transportadora)
                .addGap(245, 245, 245))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltar)
                    .addComponent(lbl_cadastro_navio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nm_navio)
                    .addComponent(txt_nm_navio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_ds_navio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(js_ds_descricao_navio, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_cadastrar_transportadora)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        Jf_IndexInterna cadastro = new Jf_IndexInterna();
        hide();
        cadastro.show();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void txt_nm_navioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nm_navioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nm_navioActionPerformed

    private void btn_cadastrar_transportadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrar_transportadoraActionPerformed

    }//GEN-LAST:event_btn_cadastrar_transportadoraActionPerformed

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
            java.util.logging.Logger.getLogger(Jf_Navio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jf_Navio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jf_Navio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jf_Navio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jf_Navio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar_transportadora;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JScrollPane js_ds_descricao_navio;
    private javax.swing.JLabel lbl_cadastro_navio;
    private javax.swing.JLabel lbl_ds_navio;
    private javax.swing.JLabel lbl_nm_navio;
    private javax.swing.JTextField txt_nm_navio;
    private javax.swing.JTextArea txta_ds_descricao_navio;
    // End of variables declaration//GEN-END:variables
}
