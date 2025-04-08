/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaces.ITabla;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mmax2
 */
public class Tabla implements ITabla{
    
    

    /**
     * Método que llena una tabla con un arreglo de objetos con los datos de una compra.
     * @return 
     */
    @Override
    public Object[][] llenarTabla() {
        
        JButton btnComprar = new JButton();
        btnComprar.setText("COMPRAR");
        Object datos[][] = new Object[6][6];
        for (int i = 0; i <= 5; i++) {
            datos[i][0] = "Numero" + (i+1); 
            datos[i][1] = "Origen" + (i+1);
            datos[i][2] = "Destino" + (i+1);
            datos[i][3] = "Duracion" + (i+1);
            datos[i][4] = "Precio" + (i+1);
            datos[i][5] = btnComprar;
         }
        return datos;
    }
    
    @Override
    public void verTabla(JTable tbl){
        tbl.setDefaultRenderer(Object.class, new Render());
        
        
        Object datos[][] = llenarTabla();
        DefaultTableModel d = new DefaultTableModel(
                datos,
                new Object []{"Numero","Origen","Destino","Duracion", "Precio", ""}
        )
        {
            public boolean isCellEditable (int row, int column){
                return false;
            }
        };
        
        tbl.setModel(d);
        tbl.setRowHeight(30);
    }
    
    
}
