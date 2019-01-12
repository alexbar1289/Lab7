package com.kernel;

import javax.swing.*;

public class Application extends JFrame{
    private Tasks tasks = new Tasks();
    private JPanel rootPanel;
    private JComboBox taskBox;
    private JButton saveButton;
    private JTextArea taskText;
    private JScrollPane textAreaScroll;

    public Application() {
        textAreaScroll.setViewportView(taskText);
        getContentPane().add(rootPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        saveButton.addActionListener(event -> tasks.setTask((String)taskBox.getSelectedItem(), taskText.getText()));
        taskBox.addActionListener(event -> taskText.setText(tasks.takeTask((String)taskBox.getSelectedItem())));
    }
}
