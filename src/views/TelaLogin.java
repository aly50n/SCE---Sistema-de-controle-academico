/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;
import java.sql.ResultSet;
import models.Usuario;
import javax.swing.JOptionPane;
import sql.Sql;
/**
 *
 * @author alyso
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CPFUsuario = new javax.swing.JTextField();
        SenhaUsuario = new javax.swing.JPasswordField();
        BotaoEntrar = new javax.swing.JButton();
        tituloSCE2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("CPF:");

        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("SENHA:");

        CPFUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        CPFUsuario.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        CPFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFUsuarioActionPerformed(evt);
            }
        });

        SenhaUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        SenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaUsuarioActionPerformed(evt);
            }
        });

        BotaoEntrar.setForeground(new java.awt.Color(0, 102, 0));
        BotaoEntrar.setText("Login");
        BotaoEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        BotaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarActionPerformed(evt);
            }
        });

        tituloSCE2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tituloSCE2.setForeground(new java.awt.Color(0, 102, 0));
        tituloSCE2.setText("LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SenhaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(CPFUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloSCE2)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(tituloSCE2)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CPFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/imagens/logo.jpg"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CPFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFUsuarioActionPerformed
    
    private void fecharTela(){
      this.dispose();  
    }
    
    private void BotaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarActionPerformed
        BotaoEntrar.setEnabled(false);
        BotaoEntrar.setText("Aguarde...");
        Usuario usuario = new Usuario();
        Usuario usuarioLogado = null; 
        /*try{
            String cpf = CPFUsuario.getText().trim().replaceAll("[.,-]", "");
            if(cpf.length() < 11 || cpf.length() > 11){
                throw new Exception("CPF inválido!\nDigite todos os dígitos!");
            }
            usuario.setCpf(cpf);
            usuario.setSenha(SenhaUsuario.getText());
            usuarioLogado = usuario.logar();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        if (usuarioLogado != null) {
            if (usuarioLogado.getTipo().equals("Administrativo")) {
                JOptionPane.showMessageDialog(null, "Bem vindo Administrativo!");
                new TelaAdmin().setVisible(true);
            } else if (usuarioLogado.getTipo().equals("Aluno")) {
                JOptionPane.showMessageDialog(null, "Bem vindo Aluno!");
                new TelaAluno().setVisible(true);
            } else if (usuarioLogado.getTipo().equals("Professor")) {
                JOptionPane.showMessageDialog(null, "Bem vindo Professor!");
                new TelaProfessor().setVisible(true);
            }

            this.dispose();
        }
        */
        CPFUsuario.setText(CPFUsuario.getText().trim().replaceAll("[.,-]", ""));
        if(CPFUsuario.getText().length() == 11 && CPFUsuario.getText().matches("[0-9]+") && SenhaUsuario.getText().length() > 0){
            new Sql("SELECT senha,tipo FROM dadosCadastrais WHERE cpf = '"+CPFUsuario.getText()+"'"){
                @Override
                public void onQueryConcluida(ResultSet rs) {
                    try{
                        if(rs.next()){
                            String senha = rs.getString("senha");
                            String tipo = rs.getString("tipo");
                            if(senha.equals(SenhaUsuario.getText())){
                                if(tipo.equals("Administrativo")) new TelaAdmin().setVisible(true);
                                else if(tipo.equals("Professor")) new TelaProfessor().setVisible(true);
                                else if(tipo.equals("Aluno")) new TelaAluno().setVisible(true);
                                fecharTela();
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Senha Incorreta!");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Usuário Não Cadastrado.");
                        }
                    }
                    catch(Exception _Ex){
                    }
                    finally{
                        BotaoEntrar.setEnabled(true);
                        BotaoEntrar.setText("Entrar");
                    }
                }
                @Override
                public void onQueryErro(String feedback) {
                    JOptionPane.showMessageDialog(null,"Erro, cheque sua conexão com a internet");
                }
            }.start();
        }
        else {
            BotaoEntrar.setEnabled(true);
            BotaoEntrar.setText("Entrar");
            JOptionPane.showMessageDialog(null,"Verifique os dados inseridos!");
        }
    }//GEN-LAST:event_BotaoEntrarActionPerformed

    private void SenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEntrar;
    private javax.swing.JTextField CPFUsuario;
    private javax.swing.JPasswordField SenhaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tituloSCE2;
    // End of variables declaration//GEN-END:variables
}
