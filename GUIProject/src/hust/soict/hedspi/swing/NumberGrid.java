package hust.soict.hedspi.swing;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberGrid extends JFrame {
    private JButton[] btnNumbers = new JButton[10];
    private JButton btnDelete, btnReset;
    private JTextField tfDisplay;

    public NumberGrid() {
        tfDisplay = new JTextField();
        tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JPanel panelButtons = new JPanel(new GridLayout(4, 3));
        addButtons(panelButtons);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(tfDisplay, BorderLayout.NORTH);
        cp.add(panelButtons, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Grid");
        setSize(200, 200);
        setVisible(true);
    }

    private void addButtons(JPanel panelButtons) {
        for (int i = 0; i < 10; i++) {
            btnNumbers[i] = new JButton(String.valueOf(i));
            btnNumbers[i].addActionListener(new ButtonListener());
            panelButtons.add(btnNumbers[i]);
        }

        btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ButtonListener());
        panelButtons.add(btnDelete);

        btnReset = new JButton("Reset");
        btnReset.addActionListener(new ButtonListener());
        panelButtons.add(btnReset);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() instanceof JButton) {
                JButton button = (JButton) e.getSource();
                String buttonText = button.getText();

                if (buttonText.matches("[0-9]")) {
                    tfDisplay.setText(tfDisplay.getText() + buttonText);
                } else if (buttonText.equals("Delete")) {
                    String currentText = tfDisplay.getText();
                    if (!currentText.isEmpty()) {
                        tfDisplay.setText(currentText.substring(0, currentText.length() - 1));
                    }
                } else if (buttonText.equals("Reset")) {
                    tfDisplay.setText("");
                }
            }
        }
    }

    public static void main(String[] args) {
        new NumberGrid();
    }
}