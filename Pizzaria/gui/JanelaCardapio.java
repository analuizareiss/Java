/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizzaria.gui;

import javax.swing.JRadioButton;
import pizzaria.dominio.Pizza;
import javax.swing.ButtonGroup;
import pizzaria.dominio.Carrinho;

/**
 *Janela responsável por mostrar o cardápio da pizzaria e salvar o pedido
 * @author Ana Luiza, Bianca Pacífico, Letícia Pires, Gabriel Pontes
 */
public class JanelaCardapio extends javax.swing.JFrame {

    /**
     * Creates new form JanelaCardapio
     */
    public JanelaCardapio() {
        initComponents();
        buttonGroup = new ButtonGroup();
        grupoBotao = new ButtonGroup();
        saborSelecionadoPizza = "";
        tamSelecionadoPizza = "";
        pedidos = new Pizza[4];
        exception1 = new JanelaExceptionTamanho();
        exception2 = new JanelaExceptionSabor();
    }
    
    private ButtonGroup buttonGroup;
    private ButtonGroup grupoBotao;
    private JanelaCarrinho carrinho;
    private String saborSelecionadoPizza;
    private String tamSelecionadoPizza;
    protected Carrinho carrinhoPedido;
    private JanelaCadastro cadastro;
    private Pizza pizzaAdd;
    private Pizza[] pedidos;
    private int inseridos = 0;
    private  JanelaExceptionTamanho exception1;
    private  JanelaExceptionSabor exception2;
    private boolean selecaoSabor;
    private boolean selecaoTamanho;
    private boolean exceptionLancada = false;
    
        /**
 *
 * @param novo é uma pizza 
 * método que adiciona a pizza selecionada em um vetor de pizzas
 */
    public void addPedidos(Pizza novo){
         if (inseridos < 4){
            pedidos[inseridos] = novo;
            inseridos++;
        }
    }
    
    public void lancaExceptionTamanho(){
        if(selecaoTamanho == false){
            exception1.setVisible(true);
            exceptionLancada = true;
        }
    }
    
    public void lancaExceptionSabor(){
        if(selecaoSabor == false){
            exception2.setVisible(true);
             exceptionLancada = true;
        }
    }

     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        calabresa2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        buttonGroup4 = new javax.swing.ButtonGroup();
        tamPortuguesa1 = new javax.swing.JComboBox<>();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        calabresa = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        marguerita = new javax.swing.JRadioButton();
        frango = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bacon = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        vegetariana = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        portuguesa = new javax.swing.JRadioButton();
        alho = new javax.swing.JRadioButton();
        abobrinha = new javax.swing.JRadioButton();
        moda = new javax.swing.JRadioButton();
        ricota = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        verCarrinho = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        pequena = new javax.swing.JRadioButton();
        media = new javax.swing.JRadioButton();
        grande = new javax.swing.JRadioButton();

        popupMenu1.setLabel("popupMenu1");

        calabresa2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        calabresa2.setForeground(new java.awt.Color(0, 0, 0));
        calabresa2.setText("Calabresa");
        calabresa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calabresa2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pizzas:");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        tamPortuguesa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequena", "Média", "Grande" }));
        tamPortuguesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamPortuguesa1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        calabresa.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        calabresa.setForeground(new java.awt.Color(0, 0, 0));
        calabresa.setText("Calabresa");
        calabresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaSabor(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Calabresa,cebola,molho de tomate,queijo.");

        jPanel18.setBackground(new java.awt.Color(255, 0, 0));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Pizzas");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        marguerita.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        marguerita.setForeground(new java.awt.Color(0, 0, 0));
        marguerita.setText("Marguerita");
        marguerita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaSabor(evt);
            }
        });

        frango.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        frango.setForeground(new java.awt.Color(0, 0, 0));
        frango.setText("Frango c/ catupiry");
        frango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaSabor(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("molho de tomate,queijo,tomate,manjericão");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));

        bacon.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        bacon.setForeground(new java.awt.Color(0, 0, 0));
        bacon.setText("Bacon");
        bacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaSabor(evt);
            }
        });

        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("molho de tomate,queijo,palmito,champignon,brocolis");

        vegetariana.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        vegetariana.setForeground(new java.awt.Color(0, 0, 0));
        vegetariana.setText("Vegetariana");
        vegetariana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaSabor(evt);
            }
        });

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("molho de tomate,queijo,presunto,ovo,cebola");

        portuguesa.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        portuguesa.setForeground(new java.awt.Color(0, 0, 0));
        portuguesa.setText("Portuguesa");
        portuguesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaSabor(evt);
            }
        });

        alho.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        alho.setForeground(new java.awt.Color(0, 0, 0));
        alho.setText("Alho");
        alho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaSabor(evt);
            }
        });

        abobrinha.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        abobrinha.setForeground(new java.awt.Color(0, 0, 0));
        abobrinha.setText("Abobrinha");
        abobrinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaSabor(evt);
            }
        });

        moda.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        moda.setForeground(new java.awt.Color(0, 0, 0));
        moda.setText("Moda da casa");
        moda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaSabor(evt);
            }
        });

        ricota.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ricota.setForeground(new java.awt.Color(0, 0, 0));
        ricota.setText("Ricota");
        ricota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaSabor(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("molho de tomate,queijo,frango,catupiry,milho");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("molho de tomate,queijo,abobrinha,parmesão");

        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("molho de tomate,queijo,alhoazeitona");

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("molho de tomate,queijo, ricota");

        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Selecione o tamanho da sua pizza:");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("molho de tomate,queijo,bacon,milho,azeitona");

        verCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        verCarrinho.setText("Ver Carrinho");
        verCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCarrinhoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Adicionar ao Carrinho");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPizzaCarrinho(evt);
            }
        });

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("molho de tomate,queijo,ovo,milho,bacon,tomate");

        pequena.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        pequena.setForeground(new java.awt.Color(0, 0, 0));
        pequena.setText("P");
        pequena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaTamanho(evt);
            }
        });

        media.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        media.setForeground(new java.awt.Color(0, 0, 0));
        media.setText("M");
        media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaTamanho(evt);
            }
        });

        grande.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        grande.setForeground(new java.awt.Color(0, 0, 0));
        grande.setText("G");
        grande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaTamanho(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moda)
                            .addComponent(jLabel1)
                            .addComponent(calabresa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ricota, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alho, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel10)
                            .addComponent(abobrinha)
                            .addComponent(frango)
                            .addComponent(jLabel11)
                            .addComponent(portuguesa)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vegetariana)
                            .addComponent(bacon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(marguerita)
                            .addComponent(jLabel5)
                            .addComponent(jLabel26))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(59, 161, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(verCarrinho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pequena, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(media, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grande, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(calabresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marguerita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bacon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vegetariana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(portuguesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frango)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abobrinha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ricota)
                .addGap(4, 4, 4)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(pequena)
                    .addComponent(media)
                    .addComponent(grande))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verCarrinho)
                    .addComponent(jButton1))
                .addGap(21, 21, 21))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calabresa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calabresa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calabresa2ActionPerformed

    private void tamPortuguesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamPortuguesa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamPortuguesa1ActionPerformed

        /**
 *
 * @param evt
 * método que adiciona a pizza selecionada
 */
    private void addPizzaCarrinho(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPizzaCarrinho
        pizzaAdd = new Pizza();
        double valor = valorDaPizza(tamSelecionadoPizza);
        pizzaAdd.setSabor(saborSelecionadoPizza);
        pizzaAdd.setTamanho (tamSelecionadoPizza);
        pizzaAdd.setValor(valor);      
        lancaExceptionTamanho();
        lancaExceptionSabor();
        selecaoTamanho = false;
        selecaoSabor = false;
       if(exceptionLancada == false){
        addPedidos(pizzaAdd);
       }
        limpar();
        exceptionLancada = false;
        grupoBotao.clearSelection();
    }//GEN-LAST:event_addPizzaCarrinho

    /**
 *
 * @param evt
 * método que mostra o carrinho com o pedido do cliente
 */
    private void verCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCarrinhoActionPerformed
        carrinho = new JanelaCarrinho(pedidos);
         jDesktopPane1.add(carrinho);
        carrinho.setVisible(true);
    }//GEN-LAST:event_verCarrinhoActionPerformed

    /**
 *
 * @param evt
 * método que salva o sabor da pizza que foi selecionado
 */
    private void selecionaSabor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionaSabor
        JRadioButton botao = (JRadioButton)evt.getSource();
        buttonGroup.add(botao);
        saborSelecionadoPizza = botao.getText();
         selecaoSabor = true;
    }//GEN-LAST:event_selecionaSabor

    /**
 *
 * @param evt
 * método que salva o tamanho da pizza que foi selecionado
 */
    private void selecionaTamanho(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionaTamanho
         JRadioButton botao = (JRadioButton)evt.getSource();
         grupoBotao.add(botao);
         tamSelecionadoPizza = botao.getText();
         selecaoTamanho = true;       
    }//GEN-LAST:event_selecionaTamanho
    
    /**
     * método que calcula o valor da pizza de acordo com o tamanho selecionado
     * @param tamanho
     * @return valor
     */
    public double valorDaPizza (String tamanho){
        double valor;
        if (tamSelecionadoPizza.equals("P")){
            valor = 35.00;
        }
        else if (tamSelecionadoPizza.equals("M")){
            valor = 50.00;
        }
        else {
            valor = 65.00;
        }
        return valor;
    }
    
    public Carrinho getCarrinho (){
        return carrinhoPedido;
    }
    
        /**
     * método que limpa os botões
     */
        public void limpar(){
        buttonGroup.add(calabresa);
        buttonGroup.add(marguerita);
        buttonGroup.add(bacon);
        buttonGroup.add(vegetariana);
        buttonGroup.add(abobrinha);
        buttonGroup.add(moda);
        buttonGroup.add(portuguesa);
        buttonGroup.add(alho);
        buttonGroup.add(ricota);
        buttonGroup.add(frango);
        buttonGroup.clearSelection();
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
            java.util.logging.Logger.getLogger(JanelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCardapio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton abobrinha;
    private javax.swing.JRadioButton alho;
    private javax.swing.JRadioButton bacon;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JRadioButton calabresa;
    private javax.swing.JRadioButton calabresa2;
    private javax.swing.JRadioButton frango;
    private javax.swing.JRadioButton grande;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JRadioButton marguerita;
    private javax.swing.JRadioButton media;
    private javax.swing.JRadioButton moda;
    private javax.swing.JRadioButton pequena;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JRadioButton portuguesa;
    private javax.swing.JRadioButton ricota;
    private javax.swing.JComboBox<String> tamPortuguesa1;
    private javax.swing.JRadioButton vegetariana;
    private javax.swing.JButton verCarrinho;
    // End of variables declaration//GEN-END:variables
}
