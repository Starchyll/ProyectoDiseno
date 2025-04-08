package Frames;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Control.CordinadorPresentacion;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mmax2
 */
public class MainMenu extends javax.swing.JFrame {
    
    private ImageIcon imagen;
    private Icon icono;

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        this.pintarImg(this.fotoPerfil, "src\\main\\java\\img\\FotoPerfil.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        eName = new javax.swing.JLabel();
        Footer = new javax.swing.JPanel();
        btnCompraViaje = new javax.swing.JButton();
        btnMisBoletos = new javax.swing.JButton();
        btnMisViajes = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        brnActualizarPerfil = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnQR = new javax.swing.JButton();
        Saldo = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        fotoPerfil = new javax.swing.JLabel();
        Bienvenida = new javax.swing.JLabel();
        Saldo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackGround.setBackground(new java.awt.Color(255, 255, 255));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(255, 201, 98));

        eName.setFont(new java.awt.Font("Roboto Condensed Medium", 1, 48)); // NOI18N
        eName.setForeground(new java.awt.Color(0, 0, 0));
        eName.setText("RUTAPP");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(eName)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(eName)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        BackGround.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 60));

        Footer.setBackground(new java.awt.Color(255, 201, 98));

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        BackGround.add(Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 520, 70));

        btnCompraViaje.setBackground(new java.awt.Color(47, 40, 34));
        btnCompraViaje.setFont(new java.awt.Font("Roboto Condensed Black", 1, 13)); // NOI18N
        btnCompraViaje.setForeground(new java.awt.Color(255, 255, 255));
        btnCompraViaje.setText("COMPRAR VIAJE");
        btnCompraViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraViajeActionPerformed(evt);
            }
        });
        BackGround.add(btnCompraViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 130, 50));

        btnMisBoletos.setBackground(new java.awt.Color(47, 40, 34));
        btnMisBoletos.setFont(new java.awt.Font("Roboto Condensed Black", 1, 13)); // NOI18N
        btnMisBoletos.setForeground(new java.awt.Color(255, 255, 255));
        btnMisBoletos.setText("MIS BOLETOS");
        btnMisBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMisBoletosActionPerformed(evt);
            }
        });
        BackGround.add(btnMisBoletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 130, 50));

        btnMisViajes.setBackground(new java.awt.Color(47, 40, 34));
        btnMisViajes.setFont(new java.awt.Font("Roboto Condensed Black", 1, 13)); // NOI18N
        btnMisViajes.setForeground(new java.awt.Color(255, 255, 255));
        btnMisViajes.setText("MIS VIAJES");
        btnMisViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMisViajesActionPerformed(evt);
            }
        });
        BackGround.add(btnMisViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 130, 50));

        btnFactura.setBackground(new java.awt.Color(47, 40, 34));
        btnFactura.setFont(new java.awt.Font("Roboto Condensed Black", 1, 13)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnFactura.setText("FACTURA");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        BackGround.add(btnFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 130, 50));

        brnActualizarPerfil.setBackground(new java.awt.Color(47, 40, 34));
        brnActualizarPerfil.setFont(new java.awt.Font("Roboto Condensed Black", 1, 10)); // NOI18N
        brnActualizarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        brnActualizarPerfil.setText("ACTUALIZAR PERFIL");
        brnActualizarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnActualizarPerfilActionPerformed(evt);
            }
        });
        BackGround.add(brnActualizarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 130, 50));

        btnCerrarSesion.setBackground(new java.awt.Color(47, 40, 34));
        btnCerrarSesion.setFont(new java.awt.Font("Roboto Condensed Black", 1, 13)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("CERRAR SESION");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        BackGround.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 130, 50));

        btnQR.setBackground(new java.awt.Color(240, 152, 39));
        btnQR.setFont(new java.awt.Font("Roboto Condensed Black", 1, 14)); // NOI18N
        btnQR.setForeground(new java.awt.Color(255, 255, 255));
        btnQR.setText("QR");
        btnQR.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 1, 1, 1));
        btnQR.setHideActionText(true);
        btnQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQRActionPerformed(evt);
            }
        });
        BackGround.add(btnQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 70, 30));

        Saldo.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 30)); // NOI18N
        Saldo.setForeground(new java.awt.Color(0, 0, 0));
        Saldo.setText("SALDO:");
        BackGround.add(Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 110, 30));

        userName.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 30)); // NOI18N
        userName.setForeground(new java.awt.Color(0, 0, 0));
        userName.setText("USUARIO");
        userName.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                userNameInputMethodTextChanged(evt);
            }
        });
        BackGround.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 130, 40));

        fotoPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackGround.add(fotoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, 130));

        Bienvenida.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 30)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(0, 0, 0));
        Bienvenida.setText("BIENBENID@");
        BackGround.add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 160, 40));

        Saldo1.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 30)); // NOI18N
        Saldo1.setForeground(new java.awt.Color(0, 0, 0));
        Saldo1.setText("$...");
        BackGround.add(Saldo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 110, 30));

        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 553));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_userNameInputMethodTextChanged

    }//GEN-LAST:event_userNameInputMethodTextChanged

    private void btnQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQRActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void brnActualizarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnActualizarPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brnActualizarPerfilActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnMisViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMisViajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMisViajesActionPerformed

    private void btnMisBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMisBoletosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMisBoletosActionPerformed

    private void btnCompraViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraViajeActionPerformed
        CordinadorPresentacion.getInstancia().abrirBusquedaViaje();
        this.dispose();
    }//GEN-LAST:event_btnCompraViajeActionPerformed

    
    private void pintarImg (JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                    lbl.getWidth(), 
                    lbl.getHeight(), 
                    Image.SCALE_DEFAULT
                )
        );
        lbl.setIcon(this.icono);
        this.repaint();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Saldo;
    private javax.swing.JLabel Saldo1;
    private javax.swing.JButton brnActualizarPerfil;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCompraViaje;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnMisBoletos;
    private javax.swing.JButton btnMisViajes;
    private javax.swing.JButton btnQR;
    private javax.swing.JLabel eName;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
