import java.awt.*;
import java.awt.event.*;

public class AWTTermsApp extends Frame implements ItemListener {

    Choice choice;

    AWTTermsApp() {

        setTitle("AWT Terms Application");
        setSize(400, 200);
        setLayout(new FlowLayout());

        Label lbl = new Label("Select Option:");

        choice = new Choice();
        choice.add("Select");
        choice.add("Accept");
        choice.add("Decline");

        choice.addItemListener(this);

        add(lbl);
        add(choice);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {

        if (choice.getSelectedItem().equals("Accept")) {

            Dialog d = new Dialog(this, "Terms", true);
            d.setLayout(new FlowLayout());

            Label l = new Label("Do you accept Terms and Conditions?");
            Button b = new Button("OK");

            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    d.dispose();
                }
            });

            d.add(l);
            d.add(b);

            d.setSize(300, 150);
            d.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new AWTTermsApp();
    }
}