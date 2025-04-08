/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Control.CordinadorPresentacion;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mmax2
 */
public class BuscarViaje extends javax.swing.JFrame {

    /**
     * Creates new form ComprarViaje
     */
    public BuscarViaje() {
        initComponents();
        cargarOrigenes();

    }

    private void cargarOrigenes() {
        List<String> origenes = CordinadorPresentacion.getInstancia().buscarOrigenesDisponibles();

        BoxOrigen.removeAllItems();
        for (String origen : origenes) {
            BoxOrigen.addItem(origen);
        }

        // Desactivar destino hasta que se seleccione un origen
        BoxDestino.setEnabled(false);
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
        btnVolver = new javax.swing.JButton();
        BoxDestino = new javax.swing.JComboBox<>();
        BoxOrigen = new javax.swing.JComboBox<>();
        Calendario = new com.toedter.calendar.JCalendar();
        btnBuscar = new javax.swing.JButton();
        Origen = new javax.swing.JLabel();
        Destino = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(520, 553));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackGround.setBackground(new java.awt.Color(255, 255, 255));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(255, 201, 98));
        Header.setPreferredSize(new java.awt.Dimension(520, 60));

        eName.setFont(new java.awt.Font("Roboto Condensed Medium", 1, 48)); // NOI18N
        eName.setForeground(new java.awt.Color(0, 0, 0));
        eName.setText("RUTAPP");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(eName)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(eName)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        BackGround.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Footer.setBackground(new java.awt.Color(255, 201, 98));
        Footer.setPreferredSize(new java.awt.Dimension(520, 60));

        btnVolver.setBackground(new java.awt.Color(255, 201, 98));
        btnVolver.setFont(new java.awt.Font("Roboto Condensed Black", 1, 13)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setIcon(new javax.swing.ImageIcon("C:\\Users\\mmax2\\Documents\\GitHub\\ProyectoDiseno\\PresentacionRutApp\\src\\main\\java\\img\\FlechaVolver.png")); // NOI18N
        btnVolver.setText("Volver\n");
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVolver.setPreferredSize(new java.awt.Dimension(128, 28));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 376, Short.MAX_VALUE))
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FooterLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BackGround.add(Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 520, 60));

        BoxDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BoxDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxDestinoActionPerformed(evt);
            }
        });
        BackGround.add(BoxDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 190, 40));

        BoxOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BoxOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxOrigenActionPerformed(evt);
            }
        });
        BackGround.add(BoxOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 190, 40));
        BackGround.add(Calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 320, 190));

        btnBuscar.setBackground(new java.awt.Color(47, 40, 34));
        btnBuscar.setFont(new java.awt.Font("Roboto Condensed Black", 1, 13)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setPreferredSize(new java.awt.Dimension(128, 28));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        BackGround.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 130, 50));

        Origen.setFont(new java.awt.Font("Roboto Condensed Black", 1, 24)); // NOI18N
        Origen.setForeground(new java.awt.Color(0, 0, 0));
        Origen.setText("ORIGEN");
        BackGround.add(Origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        Destino.setFont(new java.awt.Font("Roboto Condensed Black", 1, 24)); // NOI18N
        Destino.setForeground(new java.awt.Color(0, 0, 0));
        Destino.setText("DESTINO");
        BackGround.add(Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoxDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxDestinoActionPerformed


    }//GEN-LAST:event_BoxDestinoActionPerformed

    private void BoxOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxOrigenActionPerformed
        // TODO add your handling code here:
        String origenSeleccionado = (String) BoxOrigen.getSelectedItem();

        if (origenSeleccionado != null && !origenSeleccionado.isEmpty()) {
            List<String> destinos = CordinadorPresentacion.getInstancia().buscarDestinosDisponibles(origenSeleccionado);

            BoxDestino.removeAllItems();
            for (String destino : destinos) {
                BoxDestino.addItem(destino);
            }

            BoxDestino.setEnabled(true);
        } else {
            BoxDestino.removeAllItems();
            BoxDestino.setEnabled(false);
        }

    }//GEN-LAST:event_BoxOrigenActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (BoxOrigen.getSelectedIndex() == 0 && BoxDestino.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Favor de seleccionar origen y destino para continuar");
        } else {
            java.util.Calendar calendar = Calendario.getCalendar();
            if (calendar == null) {
                JOptionPane.showMessageDialog(this, "Por favor seleccione una fecha.");
                return;
            }

            java.util.Date fecha = calendar.getTime(); // Obtener la fecha como Date

            // Si necesitas convertir la fecha a LocalDate
            LocalDate localDate = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            String origen = BoxOrigen.getSelectedItem().toString();
            String destino = BoxDestino.getSelectedItem().toString();

            CordinadorPresentacion.getInstancia().mostrarViajesDisponibles(origen, destino, localDate);
            dispose(); // Cerrar la ventana actual
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JComboBox<String> BoxDestino;
    private javax.swing.JComboBox<String> BoxOrigen;
    private com.toedter.calendar.JCalendar Calendario;
    private javax.swing.JLabel Destino;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Origen;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel eName;
    // End of variables declaration//GEN-END:variables
}
