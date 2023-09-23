/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Jogos;
import bean.Patrocinadores;
import bean.Plataforma;
import dao.Jogos_DAO;
import dao.Patrocinadores_DAO;
import dao.Plataforma_DAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author u09464273135
 */
public class JDlgJogos extends javax.swing.JDialog {

    private boolean incluindo;
    MaskFormatter mascaraDataLanc;

    /**
     * Creates new form JDlgusuarios
     */
    public JDlgJogos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Jogos");
        setLocationRelativeTo(null);

        Patrocinadores_DAO patrocinadores_DAO = new Patrocinadores_DAO();
        List lista = patrocinadores_DAO.listAll();
        for (int i = 0; i < lista.size(); i++)
        {
            jCboPatrocinadores.addItem((Patrocinadores) lista.get(i));
        }

        Plataforma_DAO plataforma_DAO = new Plataforma_DAO();
        List listab = plataforma_DAO.listAll();
        for (int b = 0; b < listab.size(); b++)
        {
            jCboPlat.addItem((Plataforma) listab.get(b));
        }

        try
        {
            mascaraDataLanc = new MaskFormatter("##/##/####");
             jFmtDataLancamento.setFormatterFactory(new DefaultFormatterFactory(mascaraDataLanc));
        } catch (ParseException ex)
        {
           
        }

        desabilitar();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTxtTituloJogo = new javax.swing.JTextField();
        jFmtPreco = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jCboPlat = new javax.swing.JComboBox<Plataforma>();
        jLabel7 = new javax.swing.JLabel();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jFmtDataLancamento = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtVersaoFisica = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jFmtIdJogos = new javax.swing.JFormattedTextField();
        jCboPatrocinadores = new javax.swing.JComboBox<Patrocinadores>();

        jButton6.setText("jButton1");

        jButton4.setText("jButton1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("jButton1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Título do Jogo");

        jTxtTituloJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTituloJogoActionPerformed(evt);
            }
        });

        jLabel4.setText("Preço");

        jCboPlat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboPlatActionPerformed(evt);
            }
        });

        jLabel7.setText("Plataforma");

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EditIcon.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DeleteIcon.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add-button-inside-black-circle.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CancelIcon.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SearchIcon.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ConfirmIcon.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jLabel8.setText("Patrocinadores");

        jLabel5.setText("Data de Lançamento");

        jLabel3.setText("versão física");

        jTxtVersaoFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtVersaoFisicaActionPerformed(evt);
            }
        });

        jLabel1.setText("IdJogos");

        jFmtIdJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtIdJogosActionPerformed(evt);
            }
        });

        jCboPatrocinadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboPatrocinadoresActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jCboPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFmtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel5)
                                        .addComponent(jFmtDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCboPatrocinadores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxtTituloJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jFmtIdJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(67, 67, 67)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTxtVersaoFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtTituloJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtVersaoFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFmtIdJogos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCboPlat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCboPatrocinadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnConfirmar)
                        .addComponent(jBtnPesquisar)
                        .addComponent(jBtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnIncluir)
                        .addComponent(jBtnExcluir)
                        .addComponent(jBtnAlterar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void habilitar() {

        jTxtTituloJogo.setEnabled(true);
        jFmtDataLancamento.setEnabled(false);
        jFmtPreco.setEnabled(true);
        jCboPlat.setEnabled(true);
        jCboPatrocinadores.setEnabled(true);
        jFmtIdJogos.setEnabled(true);
        jFmtDataLancamento.setEnabled(true);
        jCboPlat.setEnabled(true);
        jBtnConfirmar.setEnabled(true);
        jBtnCancelar.setEnabled(true);
        jBtnAlterar.setEnabled(false);
        jBtnExcluir.setEnabled(false);
        jBtnPesquisar.setEnabled(false);
        jBtnAlterar.setEnabled(false);
        jBtnIncluir.setEnabled(false);
        jTxtVersaoFisica.setEnabled(true);

    }

    public void desabilitar() {

        jTxtTituloJogo.setEnabled(false);
        jFmtDataLancamento.setEnabled(false);
        jFmtPreco.setEnabled(false);
        jCboPlat.setEnabled(false);
        jFmtDataLancamento.setEnabled(false);
        jCboPatrocinadores.setEnabled(false);
        jCboPlat.setEnabled(false);
        jBtnConfirmar.setEnabled(false);
        jBtnCancelar.setEnabled(false);
        jBtnIncluir.setEnabled(true);
        jBtnExcluir.setEnabled(true);
        jBtnPesquisar.setEnabled(true);
        jTxtVersaoFisica.setEnabled(false);
        jFmtIdJogos.setEnabled(false);
    }

    public void limparCampos() {

        jTxtTituloJogo.setText("");
        jTxtVersaoFisica.setText("");
        jFmtPreco.setText("");
        jFmtDataLancamento.setText("");
        jFmtDataLancamento.setText("");
        jCboPatrocinadores.setSelectedIndex(-1);
        jCboPlat.setSelectedIndex(-1);
        jFmtIdJogos.setText("");

    }

    ;
    
  public Jogos viewBean() {
        Jogos jogos = new Jogos();

        jogos.setNome(jTxtTituloJogo.getText());
        jogos.setVersaoFisica(jTxtVersaoFisica.getText());
        jogos.setPreco(jFmtPreco.getText());
        int id = Integer.valueOf(jFmtIdJogos.getText());
        jogos.setIdJogos(id);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            jogos.setDataLancamento(formato.parse(jFmtDataLancamento.getText()));
        } catch (ParseException ex)
        {
            System.out.println("Erro" + ex.getMessage());
        }
        Patrocinadores patrocinadores1 = (Patrocinadores) jCboPatrocinadores.getSelectedItem();
        jogos.setFk_Patrocinadores(patrocinadores1.getIdPatrocinadores());

        Plataforma plataforma1 = (Plataforma) jCboPlat.getSelectedItem();
        jogos.setFk_Plataforma(plataforma1.getIdPlataforma());

        return jogos;
    }

    public void beanView(Jogos jogos) {

        String id = String.valueOf(jogos.getIdJogos());
        jFmtIdJogos.setText(id);
        jTxtTituloJogo.setText(jogos.getNome());
        jTxtVersaoFisica.setText(jogos.getVersaoFisica());
        jFmtPreco.setText(jogos.getPreco());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jFmtDataLancamento.setText(formato.format(jogos.getDataLancamento()));

        int idPlataforma = jogos.getFk_Plataforma();
        Plataforma_DAO plataforma_DAO = new Plataforma_DAO();
        jCboPlat.setSelectedItem((Plataforma) plataforma_DAO.list(idPlataforma));

        int idPatrocinadores = jogos.getFk_Patrocinadores();
        Patrocinadores_DAO patrocinadores_DAO = new Patrocinadores_DAO();
        jCboPatrocinadores.setSelectedItem((Patrocinadores) patrocinadores_DAO.list(idPatrocinadores));

    }


    private void jTxtTituloJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTituloJogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTituloJogoActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro?", "confirmar", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION)
        {
            Jogos jogos = viewBean();
            Jogos_DAO jogos_DAO = new Jogos_DAO();
            jogos_DAO.delete(jogos);
        } else
        {
            JOptionPane.showMessageDialog(null, "Exclusao cancelada", "Alerta", 2);

        }
        limparCampos();
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        habilitar();
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        limparCampos();
        habilitar();
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        desabilitar();
        jBtnAlterar.setEnabled(true);
        limparCampos();

    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // habilitar();
//String resp = JOptionPane.showInputDialog(null, "Entre com o codigo(chave primaria)");
//Jogos_DAO jogos_DAO = new Jogos_DAO();
//int id = Integer.valueOf(resp);
//Jogos jogos = (Jogos) jogos_DAO.list(id);//o list retorna o bean, o list pega o bean e transforma em  objeto
//beanView(jogos);

        JDlgJogosPesquisa jDlgJogosPesquisa = new JDlgJogosPesquisa(null, true);
        jDlgJogosPesquisa.setTelaAnterior(this);
        jDlgJogosPesquisa.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        Jogos jogos = viewBean();
        Jogos_DAO jogos_DAO = new Jogos_DAO();
        if (incluindo == true)
        {
            jogos_DAO.insert(jogos);
        } else
        {
            jogos_DAO.update(jogos);
        }
        desabilitar();
        limparCampos();

        jBtnAlterar.setEnabled(true);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jTxtVersaoFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtVersaoFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtVersaoFisicaActionPerformed

    private void jCboPlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboPlatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboPlatActionPerformed

    private void jFmtIdJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtIdJogosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtIdJogosActionPerformed

    private void jCboPatrocinadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboPatrocinadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboPatrocinadoresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(JDlgJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(JDlgJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(JDlgJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(JDlgJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgJogos dialog = new JDlgJogos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<Patrocinadores> jCboPatrocinadores;
    private javax.swing.JComboBox<Plataforma> jCboPlat;
    private javax.swing.JFormattedTextField jFmtDataLancamento;
    private javax.swing.JFormattedTextField jFmtIdJogos;
    private javax.swing.JFormattedTextField jFmtPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTxtTituloJogo;
    private javax.swing.JTextField jTxtVersaoFisica;
    // End of variables declaration//GEN-END:variables
}
