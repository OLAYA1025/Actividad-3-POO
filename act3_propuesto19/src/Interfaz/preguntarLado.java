/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import ejecutable.TrianguloEquilatero;
import javax.swing.JOptionPane;

/**
 *
 * @author jeron
 */
public class preguntarLado extends javax.swing.JFrame {

    /**
     * Creates new form preguntarLado
     */
    public preguntarLado() {
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
        jLabel3 = new javax.swing.JLabel();
        spnLado = new javax.swing.JSpinner();
        btnArea = new javax.swing.JButton();
        btnPerimetro = new javax.swing.JButton();
        btnAltura = new javax.swing.JButton();
        txtLado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/triangulo-equilatero.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 110));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Lado del triangulo equilatero");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, 20));

        spnLado.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        spnLado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnLadoStateChanged(evt);
            }
        });
        jPanel1.add(spnLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 140, -1));

        btnArea.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnArea.setText("Area");
        btnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaActionPerformed(evt);
            }
        });
        jPanel1.add(btnArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 90, -1));

        btnPerimetro.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnPerimetro.setText("Perimetro");
        btnPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerimetroActionPerformed(evt);
            }
        });
        jPanel1.add(btnPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        btnAltura.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnAltura.setText("Altura");
        btnAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 90, -1));

        txtLado.setBackground(new java.awt.Color(255, 255, 204));
        txtLado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtLado.setText("?");
        txtLado.setBorder(null);
        txtLado.setEnabled(false);
        txtLado.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtLado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLadoActionPerformed(evt);
            }
        });
        jPanel1.add(txtLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 30, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
        double lado=(double)this.spnLado.getValue();
        TrianguloEquilatero triangulo=new TrianguloEquilatero(lado);
        double area=triangulo.calcularArea();
        //aca se calcula el area
        JOptionPane.showMessageDialog(this, "El area del triangulo es: "+area, "Area",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAreaActionPerformed

    private void btnPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimetroActionPerformed
        double lado=(double)this.spnLado.getValue();
        TrianguloEquilatero triangulo=new TrianguloEquilatero(lado);
        double perimetro=triangulo.calcurarPerimetro();
        //aca se calcula el perimetro del triangulo
        JOptionPane.showMessageDialog(this, "El perimetro del triangulo es: "+perimetro, "Perimetro",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnPerimetroActionPerformed

    private void btnAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlturaActionPerformed
        double lado=(double)this.spnLado.getValue();
        TrianguloEquilatero triangulo=new TrianguloEquilatero(lado);
        double altura=triangulo.calcularAltura();
        JOptionPane.showMessageDialog(this, "La altura del triangulo es: "+altura, "Altura",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAlturaActionPerformed

    private void txtLadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLadoActionPerformed

    private void spnLadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnLadoStateChanged
        double lado=(double)this.spnLado.getValue();
        this.txtLado.setText(lado+"");
    }//GEN-LAST:event_spnLadoStateChanged

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltura;
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnPerimetro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spnLado;
    private javax.swing.JTextField txtLado;
    // End of variables declaration//GEN-END:variables
}
