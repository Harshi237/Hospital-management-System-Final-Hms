package hospital.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends javax.swing.JFrame implements ActionListener {
    JTextField textField;
    JPasswordField passwordField;
    JButton B1,B2;
    login(){
        JLabel nameLabel = new JLabel("Username");
        nameLabel.setBounds(10, 10, 100, 20);
        nameLabel.setFont(new Font ("Tahoma", Font.BOLD,15));
        add(nameLabel);
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 80, 100, 20);
        passwordLabel.setFont(new Font ("Tahoma", Font.BOLD,15));
        add(passwordLabel);
        textField = new JTextField();
        textField.setBounds(150, 10, 150, 20);
        add(textField);
        passwordField = new JPasswordField();
        passwordField.setBounds(150, 80, 150, 20);
        add(passwordField);

        B1 = new JButton("Login");

        B1.setBounds(140, 120, 80, 20);
        B1.addActionListener(this);
        add(B1);
        B2 = new JButton("Cancel");
        B2.setBounds(225, 120, 80, 20);
        B2.addActionListener(this);
        add(B2);

        setSize(400,200);
        setLocation(500,250);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == B1) {
            try {
                conn c = new conn();
                String user = textField.getText();
                String pass = passwordField.getText();

                String q= "select * from login where ID = '" + user + "' and PW = '" + pass + "'";
                ResultSet resultSet= c.statement.executeQuery(q);
                if(resultSet.next()){
                    new reception();
                    setVisible(false);

                }else{
                    JOptionPane.showMessageDialog(null, "Invalid");
                }




            }catch (Exception e1) {
                e1.printStackTrace();
            }

        }else{
            System.exit(0);
        }

    }

}
