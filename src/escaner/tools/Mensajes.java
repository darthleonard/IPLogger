/*
 * Copyright (C) 2018 Darth
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package escaner.tools;

import javax.swing.JOptionPane;

/**
 *
 * @author Darth
 */
public class Mensajes {
    public static void MensajeInformacion(String msj) {
        MensajeInformacion("INFORMACION", msj);
    }
    
    public static void MensajeInformacion(String title, String msj) {
        JOptionPane.showMessageDialog(null, msj, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void MensajeAlerta(String msj) {
        MensajeAlerta("ALERTA", msj);
    }
    
    public static void MensajeAlerta(String title, String msj) {
        JOptionPane.showMessageDialog(null, msj, title, JOptionPane.WARNING_MESSAGE);
    }
    
    public static void MensajeError(String msj) {
        MensajeError("ERROR", msj);
    }
    public static void MensajeError(String title, String msj) {
        JOptionPane.showMessageDialog(null, msj, title, JOptionPane.ERROR_MESSAGE);
    }
}