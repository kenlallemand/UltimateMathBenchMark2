/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PC2;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Kirino-Chan
 */
public class UI {

    private final JFrame f = new JFrame();
    private final JPanel p = new JPanel();
    private static final Dimension DMN = new Dimension(500, 200);

    public UI() {
        /*
        Frame
            ContentPane
                Panel (topPanel)
                    Glue
                    Benchmark Label
                    Glue
                RigidArea
                Panel (bottomPanel)
                    Calculation box
                    Panel (buttonPanel)
                        PI
                        Fibonacci
         */
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(p);
        f.setResizable(false);
        f.setSize(DMN);
        f.setLocationRelativeTo(null);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        JPanel topPanel = new JPanel();
        p.add(topPanel);
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        topPanel.add(Box.createHorizontalGlue());
        JLabel benchmark = new JLabel("Choose desired benchmark :");
        benchmark.setFont(benchmark.getFont().deriveFont(20f));
        topPanel.add(benchmark);
        topPanel.add(Box.createHorizontalGlue());
        JPanel bottomPanel = new JPanel();
        p.add(Box.createRigidArea(new Dimension(0, 8)));
        p.add(bottomPanel);
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
        JPanel calcPanel = new JPanel();
        calcPanel.setLayout(new BoxLayout(calcPanel, BoxLayout.X_AXIS));
        calcPanel.add(Box.createHorizontalGlue());
        JLabel calcBox = new JLabel("Sample tecst");
        calcPanel.add(calcBox);
        calcPanel.add(Box.createHorizontalGlue());
        bottomPanel.add(calcPanel);
        JPanel buttonPanel = new JPanel();
        bottomPanel.add(Box.createRigidArea(new Dimension(0, 8)));
        bottomPanel.add(buttonPanel);
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        JButton piButton = new JButton("Pi");
        piButton.setMaximumSize(new Dimension(DMN.width / 5, DMN.height / 3));
        piButton.setPreferredSize(new Dimension(DMN.width / 5, DMN.height / 3));
        JButton fibButton = new JButton("Fibonacci");
        fibButton.setMaximumSize(new Dimension(DMN.width / 5, DMN.height / 3));
        fibButton.setPreferredSize(new Dimension(DMN.width / 5, DMN.height / 3));
        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(piButton);
        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(fibButton);
        buttonPanel.add(Box.createHorizontalGlue());
        f.setVisible(true);
        piButton.addActionListener((ActionEvent ae) -> {
            long start = System.currentTimeMillis();
            Tools.Pi();
            long Score = 1000000 / (System.currentTimeMillis()-start);
            calcBox.setText(Long.toString(Score) + " pts");
        });
        fibButton.addActionListener((ActionEvent ae) -> {
            long start = System.currentTimeMillis();
            Tools.Fibonacci();
            long Score = 1000000 / (System.currentTimeMillis()-start);
            calcBox.setText(Long.toString(Score) + " pts");
        });
    }
}
