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

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class FormatoTabla  extends DefaultTableCellRenderer {
    private Escaner escaner;
    
    public FormatoTabla(Escaner escaner) {
        this.escaner = escaner;
    }
    
    @Override
    public Component getTableCellRendererComponent ( JTable table, Object value, boolean selected, boolean focused, int row, int column ) {
        setBackground(Color.white);//color de fondo
        table.setForeground(Color.black);//color de texto
        switch(Integer.parseInt(table.getValueAt(row,4).toString())) {
            case Escaner.EXISTE: setForeground(Color.black); break;
            case Escaner.EXISTE2: setForeground(Color.gray); break;
            case Escaner.CAMBIO:
                setForeground(Color.blue);
                JLabel c = (JLabel) super.getTableCellRendererComponent(table, value, selected, focused, row, column);
                c.setToolTipText(escaner.BuscaAnterior(value.toString()));
                break;
            case Escaner.NUEVO: setForeground(Color.red); break;
            case Escaner.NOIDENTIFICADO: setForeground(Color.orange); break;
        }

        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
    }        
}