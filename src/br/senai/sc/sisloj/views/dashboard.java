/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.sisloj.views;

/**
 *
 * @author Aluno
 */
public class dashboard extends javax.swing.JPanel {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
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

        labelTitulo = new javax.swing.JLabel();
        labelSubtitulo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(250, 250));

        labelTitulo.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 14)); // NOI18N
        labelTitulo.setText("SOFTWARE SISTEMA DE LOJA ");

        labelSubtitulo.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 11)); // NOI18N
        labelSubtitulo.setForeground(new java.awt.Color(153, 153, 153));
        labelSubtitulo.setText("Deivid Bononomi - TINF 2018");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(labelTitulo)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSubtitulo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(labelSubtitulo)
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelSubtitulo;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
