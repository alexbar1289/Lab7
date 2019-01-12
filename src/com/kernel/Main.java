package com.kernel;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo laf : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(laf.getName())) {
                    UIManager.setLookAndFeel(laf.getClassName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Application app = new Application();
        app.pack();
        app.setSize(new Dimension(400, 160));
        app.setResizable(false);
        app.setVisible(true);
    }
}
