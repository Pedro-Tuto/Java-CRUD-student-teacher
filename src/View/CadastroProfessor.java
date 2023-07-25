
package View;

import Model.Professor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CadastroProfessor extends javax.swing.JFrame {


    private Professor objprofessor;
    
    public CadastroProfessor() {
        initComponents();
        this.objprofessor = new Professor();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        b_cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_idade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        c_formacao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c_capacitacao = new javax.swing.JTextField();
        b_cadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        c_salario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        c_numero_turmas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        c_turno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        c_meses_servico = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        c_email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        c_telefone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        c_aulas_leciondas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Professor");
        setBackground(new java.awt.Color(0, 0, 0));

        b_cancelar.setBackground(new java.awt.Color(255, 255, 102));
        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Idade: ");

        jLabel3.setText("Formação:");

        c_formacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_formacaoActionPerformed(evt);
            }
        });

        jLabel4.setText("Capacitação:");

        c_capacitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_capacitacaoActionPerformed(evt);
            }
        });

        b_cadastrar.setBackground(new java.awt.Color(102, 255, 102));
        b_cadastrar.setText("Cadastrar");
        b_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Salário:");

        c_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_salarioActionPerformed(evt);
            }
        });

        jLabel6.setText("Número de turmas:");

        jLabel7.setText("Turno:");

        jLabel9.setText("Meses de serviço:");

        jLabel10.setText("E-mail:");

        jLabel11.setText("Telefone:");

        jLabel12.setText("Aulas lecionadas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(b_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_cadastrar)
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(c_nome)
                    .addComponent(c_idade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_formacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(c_capacitacao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_salario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c_numero_turmas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c_meses_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_telefone))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_email)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_aulas_leciondas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(c_numero_turmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(c_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(c_meses_servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(c_formacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(c_capacitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(c_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(c_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(c_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_aulas_leciondas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cadastrar)
                    .addComponent(b_cancelar))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        
    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeActionPerformed

    private void c_formacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_formacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_formacaoActionPerformed

    private void c_capacitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_capacitacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_capacitacaoActionPerformed

    private void b_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarActionPerformed

        try {
            // recebendo e validando dados da interface gr�fica.
            String nome = "";
            int idade = 0;
            String formacao = "";
            String capacitacao = "";
            double salario = 0;
            int numero_turmas = 0;
            String turno = "";
//            boolean ativo = true;
            int meses_servico = 0;
            String email = "";
            String telefone = "";
            int aulas_lecionadas = 0;
            

            if (this.c_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.c_nome.getText();
            }

            if (this.c_idade.getText().length() <= 0) {
                throw new Mensagens("Idade deve ser n�mero e maior que zero.");
            } else {
                idade = Integer.parseInt(this.c_idade.getText());
            }

            if (this.c_formacao.getText().length() < 2) {
                throw new Mensagens("Formação deve conter ao menos 2 caracteres.");
            } else {
                formacao = this.c_formacao.getText();
            }

            if (this.c_capacitacao.getText().length() < 2) {
                throw new Mensagens("Capacitação deve conter ao menos 2 caracteres.");
            } else {
                capacitacao = this.c_capacitacao.getText();
            }
            
            if (this.c_salario.getText().length() <= 0 ){
                throw new Mensagens("Salário deve ser um número maior que zero.");
            } else{
                salario = Double.parseDouble(this.c_salario.getText());
            }
            
            if (this.c_numero_turmas.getText().length() <= 0){
                throw new Mensagens("Número de turmas deve ser um número maior que zero.");
            } else{
                numero_turmas = Integer.parseInt(this.c_numero_turmas.getText());
            }
            
            if (this.c_turno.getText().length() < 2){
                throw new Mensagens("Turno deve conter ao menos 2 caracteres.");
            } else {
                turno = this.c_turno.getText();
            }
            
//            ativo = Boolean.parseBoolean(this.c_ativo.isSelected());
            
            
            if (this.c_meses_servico.getText().length() <= 0){
                throw new Mensagens("Meses de serviço deve ser um número maior que zero.");
            } else {
                meses_servico = Integer.parseInt(this.c_meses_servico.getText());
            }
            
            if (this.c_email.getText().length() < 5 ){
                throw new Mensagens("Email deve conter ao menos 5 caracteres.");
            } else {
                email = this.c_email.getText();
            }
            
            if (this.c_telefone.getText().length() < 8){
                throw new Mensagens("Telefone deve conter ao menos 8 caracteres.");
            } else {
                telefone = this.c_telefone.getText();
            }
            
            if (this.c_aulas_leciondas.getText().length() <= 0){
                throw new Mensagens("Aulas lecionadas deve ser um número maior que zero.");
            } else {
                aulas_lecionadas = Integer.parseInt(this.c_aulas_leciondas.getText());
            }
            
            
            if (this.objprofessor.InsertProfessorBD(formacao, capacitacao, salario, numero_turmas, turno, meses_servico, email, telefone, aulas_lecionadas, nome, idade)) {
                JOptionPane.showMessageDialog(rootPane, "Professor Cadastrado com Sucesso!");

                this.c_nome.setText("");
                this.c_idade.setText("");
                this.c_formacao.setText("");
                this.c_capacitacao.setText("");
                this.c_salario.setText("");
                this.c_numero_turmas.setText("");
                this.c_turno.setText("");
//                this.c_ativo.setSelected(true);
                this.c_meses_servico.setText("");
                this.c_email.setText("");
                this.c_telefone.setText("");
                this.c_aulas_leciondas.setText("");
                
                

            }
            
            System.out.println(this.objprofessor.getMinhaLista1().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroAluno.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_b_cadastrarActionPerformed

    private void c_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_salarioActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cadastrar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField c_aulas_leciondas;
    private javax.swing.JTextField c_capacitacao;
    private javax.swing.JTextField c_email;
    private javax.swing.JTextField c_formacao;
    private javax.swing.JTextField c_idade;
    private javax.swing.JTextField c_meses_servico;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_numero_turmas;
    private javax.swing.JTextField c_salario;
    private javax.swing.JTextField c_telefone;
    private javax.swing.JTextField c_turno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
