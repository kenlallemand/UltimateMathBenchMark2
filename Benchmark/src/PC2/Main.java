/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PC2;

import javax.swing.SwingUtilities;

/**
 *
 * @author Kirino-Chan
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UI ui = new UI();
        });
    }
}
