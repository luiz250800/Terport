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
public class Jf_Porto extends javax.swing.JFrame {

    /**
     * Creates new form Porto
     */
    public Jf_Porto() {
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
        lbl_cadastro_porto = new javax.swing.JLabel();
        lbl_nm_porto = new javax.swing.JLabel();
        txt_nm_porto = new javax.swing.JTextField();
        lbl_sg_estado_porto = new javax.swing.JLabel();
        cmb_sg_estado_porto = new javax.swing.JComboBox();
        lbl_nm_cidade_porto = new javax.swing.JLabel();
        txt_nm_cidade_porto = new javax.swing.JTextField();
        lbl_nm_endereco_porto = new javax.swing.JLabel();
        txt_nm_endereco_porto = new javax.swing.JTextField();
        lbl_cd_numero_porto = new javax.swing.JLabel();
        txt_cd_numero_porto = new javax.swing.JTextField();
        btn_cadastrar_porto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_voltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        lbl_cadastro_porto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_cadastro_porto.setText("CADASTRO DE PORTO");

        lbl_nm_porto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_nm_porto.setText("Nome do porto:");

        txt_nm_porto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_sg_estado_porto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_sg_estado_porto.setText("Estado do porto:");

        cmb_sg_estado_porto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmb_sg_estado_porto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        lbl_nm_cidade_porto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_nm_cidade_porto.setText("Cidade do porto:");

        txt_nm_cidade_porto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_nm_endereco_porto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_nm_endereco_porto.setText("Endereço do porto:");

        txt_nm_endereco_porto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_cd_numero_porto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_cd_numero_porto.setText("Numero:");

        txt_cd_numero_porto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_cadastrar_porto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_cadastrar_porto.setText("Cadastrar");
        btn_cadastrar_porto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrar_portoActionPerformed(evt);
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
                        .addComponent(lbl_nm_endereco_porto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nm_endereco_porto))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_nm_porto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_nm_porto))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_cd_numero_porto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_cd_numero_porto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_sg_estado_porto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmb_sg_estado_porto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl_nm_cidade_porto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_nm_cidade_porto, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_voltar)
                                .addGap(89, 89, 89)
                                .addComponent(lbl_cadastro_porto)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cadastrar_porto)
                .addGap(211, 211, 211))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltar)
                    .addComponent(lbl_cadastro_porto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nm_porto)
                    .addComponent(txt_nm_porto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sg_estado_porto)
                    .addComponent(cmb_sg_estado_porto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nm_cidade_porto)
                    .addComponent(txt_nm_cidade_porto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nm_endereco_porto)
                    .addComponent(txt_nm_endereco_porto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cd_numero_porto)
                    .addComponent(txt_cd_numero_porto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_cadastrar_porto)
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        Jf_IndexInterna cadastro = new Jf_IndexInterna();
        hide();
        cadastro.show();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_cadastrar_portoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrar_portoActionPerformed

    }//GEN-LAST:event_btn_cadastrar_portoActionPerformed

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
            java.util.logging.Logger.getLogger(Jf_Porto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jf_Porto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jf_Porto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jf_Porto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jf_Porto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar_porto;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JComboBox cmb_sg_estado_porto;
    private javax.swing.JLabel lbl_cadastro_porto;
    private javax.swing.JLabel lbl_cd_numero_porto;
    private javax.swing.JLabel lbl_nm_cidade_porto;
    private javax.swing.JLabel lbl_nm_endereco_porto;
    private javax.swing.JLabel lbl_nm_porto;
    private javax.swing.JLabel lbl_sg_estado_porto;
    private javax.swing.JTextField txt_cd_numero_porto;
    private javax.swing.JTextField txt_nm_cidade_porto;
    private javax.swing.JTextField txt_nm_endereco_porto;
    private javax.swing.JTextField txt_nm_porto;
    // End of variables declaration//GEN-END:variables
}
