/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplothreads;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author israel-icm
 */
public class Proceso extends Thread {
    private JLabel loading;
    public Proceso(JLabel loading) {
        this.loading = loading;
    }
    @Override
    public void run() {
        loading.setVisible(true);
        proceso();
        JOptionPane.showMessageDialog(null, "El proceso finalizo con é");
        loading.setVisible(false);
    }
    public void proceso() {
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException ex) { }
    }
}
