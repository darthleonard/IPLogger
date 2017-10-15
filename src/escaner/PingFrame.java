/*
 * Copyright (C) 2017 Leonardo Gonzalez Caracosa
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package escaner;

import escaner.tools.Ping;
import javax.swing.JOptionPane;

/**
 *
 * @author leoren
 */
public class PingFrame extends javax.swing.JFrame {
    private Ping pw;
    private boolean Ejecutando = false;
    
    /**
     * Creates new form Ping
     */
    public PingFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDirRed = new javax.swing.JTextField();
        txtMaskRed = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLatencia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDirecciones = new javax.swing.JTextArea();
        lblConteoHosts = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ping");
        setName("pingFrame"); // NOI18N
        setResizable(false);

        jButton1.setText("Comenzar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Direccion de red");

        jLabel2.setText("Mascara de red");

        txtDirRed.setText("192.168.1.0");

        txtMaskRed.setText("24");

        jLabel3.setText("Tiempo de espera");

        txtLatencia.setText("100");

        txtDirecciones.setEditable(false);
        txtDirecciones.setBackground(new java.awt.Color(0, 0, 0));
        txtDirecciones.setColumns(20);
        txtDirecciones.setForeground(new java.awt.Color(0, 255, 0));
        txtDirecciones.setRows(5);
        jScrollPane1.setViewportView(txtDirecciones);

        lblConteoHosts.setText("Conteo de hosts");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 91, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaskRed, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLatencia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDirRed, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblConteoHosts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaskRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLatencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(lblConteoHosts))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validaDireccion(final String dir) {
        String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
        return dir.matches(PATTERN);
    }
    
    private boolean validaDatos(String ip, String mask, String lat) {
        if(!validaDireccion(ip)) {
            JOptionPane.showMessageDialog(null, "Direccion de red invalida");
            return false;
        }
        
        try {
            int m = Integer.parseInt(mask);
            if(m < 1 || m > 30) {
                JOptionPane.showMessageDialog(null, "Mascara no valida, solo se adminten valores entre 1 y 32");
                return false;
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La mascara debe ser expresada en numero decimal entero");
            return false;
        }
        
        try {
            int l = Integer.parseInt(lat);
            if(l < 10 || l > 5000) {
                JOptionPane.showMessageDialog(null, "El tiempo de espera debe ser entre 10 y 5000");
                return false;
            }
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor de latencia invalido");
            return false;
        }
        
        return true;
    }
    
    public void switchControles() {
        if(!Ejecutando) {
            jButton1.setText("Cancelar");
            txtDirRed.setEditable(false);
            txtMaskRed.setEditable(false);
            txtLatencia.setEditable(false);
            Ejecutando = true;
        } else {
            jButton1.setText("Comenzar");
            txtDirRed.setEditable(true);
            txtMaskRed.setEditable(true);
            txtLatencia.setEditable(true);
            Ejecutando = false;
        }
    }
    
    private void trabajar() {
        if(!validaDatos(txtDirRed.getText(), txtMaskRed.getText(), txtLatencia.getText()))
            return;
            
        switchControles();
        pw = new Ping(this, jProgressBar1, txtDirecciones, lblConteoHosts, jButton1, getContentPane());
        pw.setRed(txtDirRed.getText());
        pw.setMask(Integer.parseInt(txtMaskRed.getText()));
        pw.setTiempo(Integer.parseInt(txtLatencia.getText()));
        pw.execute();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(Ejecutando);
        if(!Ejecutando) {
            trabajar();
        } else {
            pw.cancel(true);
            pw = null;
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConteoHosts;
    private javax.swing.JTextField txtDirRed;
    private javax.swing.JTextArea txtDirecciones;
    private javax.swing.JTextField txtLatencia;
    private javax.swing.JTextField txtMaskRed;
    // End of variables declaration//GEN-END:variables
}
