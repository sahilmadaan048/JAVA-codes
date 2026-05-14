import javax.swing.*;
import java.awt.event.*;

public class SwingTermsApp {

    JFrame frame;
    JComboBox<String> combo;

    SwingTermsApp() {

        frame = new JFrame("Swing Terms Application");

        String options[] = {"Select", "Accept", "Decline"};

        combo = new JComboBox<>(options);

        combo.setBounds(100, 60, 150, 30);

        combo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if(combo.getSelectedItem().equals("Accept")) {

                    JOptionPane.showConfirmDialog(
                            frame,
                            "Do you accept Terms and Conditions?",
                            "Terms",
                            JOptionPane.YES_NO_OPTION
                    );
                }
            }
        });

        frame.add(combo);

        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingTermsApp();
    }
}