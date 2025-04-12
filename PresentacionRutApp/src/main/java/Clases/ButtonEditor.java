/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author mmax2
 */

public class ButtonEditor extends DefaultCellEditor {

    private JButton button;
    private String label;
    private int row;
    private java.util.function.Consumer<Integer> onClick;

    public ButtonEditor(JCheckBox checkBox, String label, java.util.function.Consumer<Integer> onClick) {
        super(checkBox);
        this.label = label;
        this.onClick = onClick;
        button = new JButton(label);
        button.addActionListener(e -> {
            onClick.accept(row);
            fireEditingStopped();
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
        this.row = row;
        button.setText(label);
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        return label;
    }
}
