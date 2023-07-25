package View;

import Model.Professor;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciaProfessor extends javax.swing.JFrame {

    private Professor objprofessor;
    
    public GerenciaProfessor() {
        initComponents();
        this.objprofessor = new Professor();
        this.carregaTabela();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProfessores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        b_cancelar = new javax.swing.JButton();
        b_alterar = new javax.swing.JButton();
        b_apagar = new javax.swing.JButton();
        c_nome = new javax.swing.JTextField();
        c_idade = new javax.swing.JTextField();
        c_formacao = new javax.swing.JTextField();
        c_capacitacao = new javax.swing.JTextField();
        c_salario = new javax.swing.JTextField();
        c_numero_turmas = new javax.swing.JTextField();
        c_turno = new javax.swing.JTextField();
        c_meses_servico = new javax.swing.JTextField();
        c_email = new javax.swing.JTextField();
        c_telefone = new javax.swing.JTextField();
        c_aulas_lecionadas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Professores");

        jTableProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Idade", "Formação", "Capacitação", "Salário", "Nº Turmas", "Turno", "Meses Serviço", "E-mail", "Telefone", "Aulas Lecionadas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProfessores.getTableHeader().setReorderingAllowed(false);
        jTableProfessores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProfessoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProfessores);

        jLabel1.setText("Nome:");

        jLabel2.setText("Idade:");

        jLabel3.setText("Formação:");

        jLabel4.setText("Capacitação:");

        jLabel5.setText("Salário:");

        jLabel6.setText("Número de Turmas:");

        jLabel7.setText("Turno:");

        jLabel8.setText("Meses de serviço:");

        jLabel9.setText("E-mail:");

        jLabel10.setText("Telefone:");

        jLabel11.setText("Aulas Lecionadas:");

        b_cancelar.setBackground(new java.awt.Color(255, 255, 102));
        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        b_alterar.setBackground(new java.awt.Color(153, 255, 153));
        b_alterar.setText("Alterar");
        b_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarActionPerformed(evt);
            }
        });

        b_apagar.setBackground(new java.awt.Color(255, 51, 51));
        b_apagar.setText("Apagar");
        b_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarActionPerformed(evt);
            }
        });

        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });

        c_formacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_formacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(b_cancelar)
                .addGap(100, 100, 100)
                .addComponent(b_alterar)
                .addGap(120, 120, 120)
                .addComponent(b_apagar)
                .addContainerGap(432, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_capacitacao))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(c_formacao))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_meses_servico))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_aulas_lecionadas))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_numero_turmas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_idade))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(c_email))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(c_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(c_formacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(c_capacitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(c_meses_servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(c_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(c_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(c_numero_turmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(c_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(c_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(c_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(c_aulas_lecionadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cancelar)
                    .addComponent(b_alterar)
                    .addComponent(b_apagar))
                .addGap(64, 64, 64))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        
    }//GEN-LAST:event_c_nomeActionPerformed

    private void c_formacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_formacaoActionPerformed
    }//GEN-LAST:event_c_formacaoActionPerformed

    private void b_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alterarActionPerformed
        
        try {
            int id = 0;
            String nome = "";
            int idade = 0;
            String formacao = "";
            String capacitacao = "";
            double salario = 0;
            int numero_turmas = 0;
            String turno = "";
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

            if (this.c_salario.getText().length() <= 0) {
                throw new Mensagens("Salário deve ser um número maior do que zero.");
            } else {
                salario = Double.parseDouble(this.c_salario.getText());
            }

            if (this.c_numero_turmas.getText().length() <= 0) {
                throw new Mensagens("Número de turmas deve ser um número maior do que zero.");
            } else {
                numero_turmas = Integer.parseInt(this.c_numero_turmas.getText());
            }

            if (this.c_turno.getText().length() < 0) {
                throw new Mensagens("Turno deve conter ao menos 2 caracteres.");
            } else {
                turno = this.c_turno.getText();
            }

            if (this.c_meses_servico.getText().length() <= 0) {
                throw new Mensagens("Meses de serviço deve ser um número maior que zero.");
            } else {
                meses_servico = Integer.parseInt(this.c_meses_servico.getText());
            }

            if (this.c_email.getText().length() < 5) {
                throw new Mensagens("Email deve conter ao menos 5 caracteres");
            } else {
                email = c_email.getText();
            }

            if (this.c_telefone.getText().length() < 8) {
                throw new Mensagens("Telefone deve conter ao menos 8 caracteres.");
            } else {
                telefone = this.c_telefone.getText();
            }

            if (this.c_aulas_lecionadas.getText().length() <= 0) {
                throw new Mensagens("Aulas lecionadas deve ser um número maior que zero.");
            } else {
                aulas_lecionadas = Integer.parseInt(this.c_aulas_lecionadas.getText());
            }

            if (this.jTableProfessores.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Professor para Alterar");
            } else {
                id = Integer.parseInt(this.jTableProfessores.getValueAt(this.jTableProfessores.getSelectedRow(), 0).toString());
            }

            if (this.objprofessor.UpdateProfessorBD(formacao, capacitacao, salario, numero_turmas, turno, meses_servico, email, telefone, aulas_lecionadas, id, nome, idade)) {

                this.c_nome.setText("");
                this.c_idade.setText("");
                this.c_formacao.setText("");
                this.c_capacitacao.setText("");
                this.c_salario.setText("");
                this.c_numero_turmas.setText("");
                this.c_turno.setText("");
                this.c_meses_servico.setText("");
                this.c_email.setText("");
                this.c_telefone.setText("");
                this.c_aulas_lecionadas.setText("");

                JOptionPane.showMessageDialog(rootPane, "Professor Alterado com Sucesso!");

            }
            System.out.println(this.objprofessor.getMinhaLista1().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um n�mero.");
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
    }//GEN-LAST:event_b_alterarActionPerformed

    private void b_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apagarActionPerformed
        
        try {
            int id = 0;
            if (this.jTableProfessores.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Professor para APAGAR");
            } else {
                id = Integer.parseInt(this.jTableProfessores.getValueAt(this.jTableProfessores.getSelectedRow(), 0).toString());
            }

            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este Professor ?");

            if (resposta_usuario == 0) {

                if (this.objprofessor.DeleteProfessorBD(id)) {

                    this.c_nome.setText("");
                    this.c_idade.setText("");
                    this.c_formacao.setText("");
                    this.c_capacitacao.setText("");
                    this.c_salario.setText("");
                    this.c_numero_turmas.setText("");
                    this.c_turno.setText("");
                    this.c_meses_servico.setText("");
                    this.c_email.setText("");
                    this.c_telefone.setText("");
                    this.c_aulas_lecionadas.setText("");
                    
                    JOptionPane.showMessageDialog(rootPane, "Professor Apagado com Sucesso!");

                }

            }

            System.out.println(this.objprofessor.getMinhaLista1().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_b_apagarActionPerformed

    private void jTableProfessoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProfessoresMouseClicked
        
        if (this.jTableProfessores.getSelectedRow() != -1) {

            String nome = this.jTableProfessores.getValueAt(this.jTableProfessores.getSelectedRow(), 1).toString();
            String idade = this.jTableProfessores.getValueAt(this.jTableProfessores.getSelectedRow(), 2).toString();
            String formacao = this.jTableProfessores.getValueAt(this.jTableProfessores.getSelectedRow(), 3).toString();
            String capacitacao = this.jTableProfessores.getValueAt(this.jTableProfessores.getSelectedRow(), 4).toString();
            String salario = this.jTableProfessores.getValueAt(this.jTableProfessores.getSelectedRow(), 5).toString();
            String numero_turmas = this.jTableProfessores.getValueAt(this.jTableProfessores.getSelectedRow(), 6).toString();
            String turno = this.jTableProfessores.getValueAt(this.jTableProfessores.getSelectedRow(), 7).toString();
            String meses_servico = this.jTableProfessores.getValueAt(this.jTableProfessores.getSelectedRow(), 8).toString();
            String email = this.jTableProfessores.getValueAt(this.jTableProfessores.getSelectedRow(), 9).toString();
            String telefone = this.jTableProfessores.getValueAt(this.jTableProfessores.getSelectedRow(), 10).toString();
            String aulas_lecionadas = this.jTableProfessores.getValueAt(this.jTableProfessores.getSelectedRow(), 11).toString();
            

            this.c_nome.setText(nome);
            this.c_idade.setText(idade);
            this.c_formacao.setText(formacao);
            this.c_capacitacao.setText(capacitacao);
            this.c_salario.setText(salario);
            this.c_numero_turmas.setText(numero_turmas);
            this.c_turno.setText(turno);
            this.c_meses_servico.setText(meses_servico);
            this.c_email.setText(email);
            this.c_telefone.setText(telefone);
            this.c_aulas_lecionadas.setText(aulas_lecionadas);

        }    }//GEN-LAST:event_jTableProfessoresMouseClicked

    @SuppressWarnings("unchecked")
    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.jTableProfessores.getModel();
        modelo.setNumRows(0);

        ArrayList<Professor> minhalista = new ArrayList<>();
        minhalista = objprofessor.getMinhaLista1();

        for (Professor a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getIdade(),
                a.getFormacao(),
                a.getCapacitacao(),
                a.getSalario(),
                a.getNumero_turmas(),
                a.getTurno(),
                a.getMeses_servico(),
                a.getEmail(),
                a.getTelefone(),
                a.getAulas_lecionadas()
                
            });
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_alterar;
    private javax.swing.JButton b_apagar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JTextField c_aulas_lecionadas;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProfessores;
    // End of variables declaration//GEN-END:variables
}
