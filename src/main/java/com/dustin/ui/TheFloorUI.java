package com.dustin.ui;

import com.dustin.data.Player;
import com.dustin.data.TheFloor;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class TheFloorUI extends JFrame{
    private JPanel mainPanel;

    public TheFloorUI(TheFloor theFloor) {
        mainPanel = new JPanel(new GridLayout(9,9));

        // Add panels for each square
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                Player player = theFloor.getTheFloor()[row][col].getPlayer();

                JPanel square = new JPanel();
                square.setPreferredSize(new Dimension(50,50));
                square.setBackground(player.getColor());

                // Add a black border around each square
                square.setBorder(new LineBorder(Color.BLACK));

                mainPanel.add(square);
            }
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
