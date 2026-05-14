import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LoginRegistrationSystem extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5;

    JTextField tfName, tfUsername;
    JPasswordField pfPassword;

    JRadioButton rbMale, rbFemale;
    ButtonGroup bg;

    JCheckBox cbReading, cbGaming;

    JButton btnRegister, btnLogin, btnClear;

    Connection con;

    LoginRegistrationSystem() {

        setTitle("Login and Registration System");
        setSize(500, 500);
        setLayout(null);

        // Labels
        l1 = new JLabel("Name:");
        l1.setBounds(50, 50, 100, 30);

        l2 = new JLabel("Username:");
        l2.setBounds(50, 100, 100, 30);

        l3 = new JLabel("Password:");
        l3.setBounds(50, 150, 100, 30);

        l4 = new JLabel("Gender:");
        l4.setBounds(50, 200, 100, 30);

        l5 = new JLabel("Hobbies:");
        l5.setBounds(50, 250, 100, 30);

        // Text Fields
        tfName = new JTextField();
        tfName.setBounds(150, 50, 200, 30);

        tfUsername = new JTextField();
        tfUsername.setBounds(150, 100, 200, 30);

        pfPassword = new JPasswordField();
        pfPassword.setBounds(150, 150, 200, 30);

        // Radio Buttons
        rbMale = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");

        rbMale.setBounds(150, 200, 80, 30);
        rbFemale.setBounds(240, 200, 100, 30);

        bg = new ButtonGroup();
        bg.add(rbMale);
        bg.add(rbFemale);

        // Checkboxes
        cbReading = new JCheckBox("Reading");
        cbGaming = new JCheckBox("Gaming");

        cbReading.setBounds(150, 250, 100, 30);
        cbGaming.setBounds(260, 250, 100, 30);

        // Buttons
        btnRegister = new JButton("Register");
        btnLogin = new JButton("Login");
        btnClear = new JButton("Clear");

        btnRegister.setBounds(50, 330, 100, 40);
        btnLogin.setBounds(180, 330, 100, 40);
        btnClear.setBounds(310, 330, 100, 40);

        // Add Action Listener
        btnRegister.addActionListener(this);
        btnLogin.addActionListener(this);
        btnClear.addActionListener(this);

        // Add Components
        add(l1); add(l2); add(l3); add(l4); add(l5);

        add(tfName);
        add(tfUsername);
        add(pfPassword);

        add(rbMale);
        add(rbFemale);

        add(cbReading);
        add(cbGaming);

        add(btnRegister);
        add(btnLogin);
        add(btnClear);

        // Database Connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password"
            );

        } catch(Exception e) {
            System.out.println(e);
        }

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String name = tfName.getText();
        String username = tfUsername.getText();
        String password = new String(pfPassword.getPassword());

        String gender = "";

        if(rbMale.isSelected())
            gender = "Male";

        if(rbFemale.isSelected())
            gender = "Female";

        String hobbies = "";

        if(cbReading.isSelected())
            hobbies += "Reading ";

        if(cbGaming.isSelected())
            hobbies += "Gaming";

        // REGISTER
        if(e.getSource() == btnRegister) {

            try {

                String query = "INSERT INTO users(name, username, password, gender, hobbies) VALUES(?,?,?,?,?)";

                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, name);
                pst.setString(2, username);
                pst.setString(3, password);
                pst.setString(4, gender);
                pst.setString(5, hobbies);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this,
                        "User Registered");

            } catch(Exception ex) {
                System.out.println(ex);
            }
        }

        // LOGIN
        if(e.getSource() == btnLogin) {

            try {

                String query = "SELECT * FROM users WHERE username=? AND password=?";

                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, username);
                pst.setString(2, password);

                ResultSet rs = pst.executeQuery();

                if(rs.next()) {

                    JOptionPane.showMessageDialog(this,
                            "Login Successful");

                } else {

                    JOptionPane.showMessageDialog(this,
                            "Invalid User");
                }

            } catch(Exception ex) {
                System.out.println(ex);
            }
        }

        // CLEAR
        if(e.getSource() == btnClear) {

            tfName.setText("");
            tfUsername.setText("");
            pfPassword.setText("");

            bg.clearSelection();

            cbReading.setSelected(false);
            cbGaming.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new LoginRegistrationSystem();
    }
}