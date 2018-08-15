import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

class Ex06 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setVisible(true);

        BorderLayout bl = new BorderLayout();

        JPanel panel = new JPanel();
        panel.setLayout(bl);

        frame.add(panel);

        JButton btnStart = new JButton("Start");

        panel.add(btnStart, BorderLayout.NORTH);
        
        JButton btnEnd = new JButton("End");

        panel.add(btnEnd, BorderLayout.SOUTH);

        // LEFT PANEL

        JPanel lpanel = new JPanel();

        panel.add(lpanel, BorderLayout.WEST);

        JLabel lblLang = new JLabel("Select Language");

        lpanel.add(lblLang);

        JRadioButton rbtnJava = new JRadioButton("Java");
        
        lpanel.add(rbtnJava);

        // END LEFT PANEL

        // RIGHT PANEL

        JPanel rpanel = new JPanel();

        panel.add(rpanel, BorderLayout.EAST);

        JLabel lblCountry = new JLabel("Select Country");

        rpanel.add(lblCountry);

        // END RIGHT PANEL

        // CENTER PANEL

        JLabel lblWelcome = new JLabel("Welcome");
        lblWelcome.setBackground(Color.yellow);
        lblWelcome.setForeground(Color.blue);
        lblWelcome.setPreferredSize(new Dimension(400, 400));

        panel.add(lblWelcome, BorderLayout.CENTER);

    }
}