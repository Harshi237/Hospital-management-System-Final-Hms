package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class reception extends javax.swing.JFrame {
    reception(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,160,1525,670);
        panel.setBackground(new Color(109,164,170));
        add(panel);
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(new Color(109,164,170));
        panel_1.setBounds(5,5,1525,150);
        add(panel_1);
        JButton btn1 = new JButton("add new patient");
        btn1.setBackground(new Color(109,164,170));
        btn1.setBounds(30,15,200,30);
        panel_1.add(btn1);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new new_patient();

            }


        });
        JButton btn2 = new JButton("Room");
        btn2.setBackground(new Color(109,164,170));
        btn2.setBounds(30,58,200,30);
        panel_1.add(btn2);


        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Room();

            }


        });
        JButton btn3 = new JButton("Department");
        btn3.setBackground(new Color(109,164,170));
        btn3.setBounds(30,100,200,30);
        panel_1.add(btn3);


        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            new Department();
            }


        });
        JButton btn4 = new JButton("All Employees info");
        btn4.setBackground(new Color(109,164,170));
        btn4.setBounds(250,15,200,30);
        panel_1.add(btn4);


        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }


        });
        JButton btn5 = new JButton("Patient details");
        btn5.setBackground(new Color(109,164,170));
        btn5.setBounds(250,58,200,30);
        panel_1.add(btn5);


        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new patient_details();

            }


        });
        JButton btn6 = new JButton("patient discharge");
        btn6.setBackground(new Color(109,164,170));
        btn6.setBounds(250,100,200,30);
        panel_1.add(btn6);


        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }


        });
        JButton btn7 = new JButton("update patient details");
        btn7.setBackground(new Color(109,164,170));
        btn7.setBounds(455,15,200,30);
        panel_1.add(btn7);


        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }


        });
        JButton btn8 = new JButton("hospital ambulance");
        btn8.setBackground(new Color(109,164,170));
        btn8.setBounds(455,58,200,30);
        panel_1.add(btn8);


        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }


        });
        JButton btn9 = new JButton("search room");
        btn9.setBackground(new Color(109,164,170));
        btn9.setBounds(455,100,200,30);
        panel_1.add(btn9);


        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }


        });
        JButton btn10 = new JButton("Log out");
        btn10.setBackground(new Color(109,164,170));
        btn10.setBounds(670,15,200,30);
        panel_1.add(btn10);


        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(10);

            }


        });

        setSize(1950,1090);
        setLayout(null);





        setVisible(true);
    }


    public static void main (String[] args){
        new reception();
    }
}
