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
package escaner.tools;

import escaner.PingFrame;
import java.awt.Container;
import java.awt.Cursor;
import java.io.IOException;
import java.net.InetAddress;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

public class Ping extends SwingWorker<Void, Void>{
    private PingFrame pf;
    private JProgressBar jpb;
    private JTextArea txt;
    private JLabel lbl;
    private JButton btn;
    private Container c;
    
    private NetworkInfo netinfo;
    
    private int tiempo = 100;
    
    public Ping(PingFrame pf, JProgressBar jpb, JTextArea txt, JLabel lbl, JButton btn, Container c) {
        this.pf = pf;
        this.jpb = jpb;
        this.txt = txt;
        this.lbl = lbl;
        this.btn = btn;
        this.c = c;
    }
    
    @Override
    protected Void doInBackground() throws Exception {
        InetAddress ping;
        String ip;
        String status;
        int cont = 0;
        jpb.setMaximum(255);
        txt.setText("");
        try {
            c.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            int i = 1;
            
            while(i <= netinfo.getCantidadHosts() && !isCancelled()) {
                ip = netinfo.sigIp().toString();
                status = "probando ".concat(ip);
                ping = InetAddress.getByName(ip);
                if(ping.isReachable(tiempo)) {
                    cont++;
                    status = status.concat("\t responde!");
                } else
                    status = status.concat("\t offline");
                
                jpb.setValue(i);
                txt.append(status.concat("\n"));
                txt.setCaretPosition(txt.getDocument().getLength());
                lbl.setText(cont + " hosts activos de " + i);
                i++;
            }
            
            txt.append("El proceso ha finalizado.");
            txt.setCaretPosition(txt.getDocument().getLength());
        } catch (IOException ex) { System.out.println(ex); }
        c.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        
        return null;
    }

    @Override
    protected void done() {
        pf.switchControles();
    }
    
    public JProgressBar getJpb() {
        return jpb;
    }

    public void setJpb(JProgressBar jpb) {
        this.jpb = jpb;
    }

    public JTextArea getTxt() {
        return txt;
    }

    public void setTxt(JTextArea txt) {
        this.txt = txt;
    }

    public JLabel getLbl() {
        return lbl;
    }

    public void setLbl(JLabel lbl) {
        this.lbl = lbl;
    }

    public Container getC() {
        return c;
    }

    public void setC(Container c) {
        this.c = c;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public JButton getBtn() {
        return btn;
    }

    public void setBtn(JButton btn) {
        this.btn = btn;
    }

    public NetworkInfo getNetinfo() {
        return netinfo;
    }

    public void setNetinfo(NetworkInfo netinfo) {
        this.netinfo = netinfo;
    }
    
}
