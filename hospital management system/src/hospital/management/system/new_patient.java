package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class new_patient extends javax.swing.JFrame implements ActionListener {
    JComboBox  comboBox;
    JTextField textFieldNumber, textName, textFieldDisease, textDeposite;
    JRadioButton r1,r2;
    Choice c1;
    JLabel date;
    JButton b1;
    JButton b2;


    new_patient(){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setLayout(null);
        add(panel);
        JLabel labelName = new JLabel("New patient form");
        labelName.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelName.setBounds(350, 11, 260, 53);
        panel.add(labelName);

        JLabel labelID = new JLabel("IDENTITY NUMBER");
        labelID.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelID.setBounds(45, 75, 200, 20);
        panel.add(labelID);

        JLabel labelNUM = new JLabel("NUMBER");
        labelNUM.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelNUM.setBounds(45, 125, 200, 20);
        panel.add(labelNUM);

        JLabel labelNAME1 = new JLabel("NAME");
        labelNAME1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelNAME1.setBounds(45, 175, 200, 20);
        panel.add(labelNAME1);
        JLabel labelGEN = new JLabel("GENDER");
        labelGEN.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelGEN.setBounds(45, 225, 200, 20);
        panel.add(labelGEN);
        JLabel labelID2 = new JLabel("DISEASE");
        labelID2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelID2.setBounds(45, 275, 200, 20);
        panel.add(labelID2);
        JLabel labelID3 = new JLabel("ROOM");
        labelID3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelID3.setBounds(45, 325, 200, 20);
        panel.add(labelID3);

        comboBox = new JComboBox(new String[]{"Adhaar card","Voter ID","Driving Licence"});
        comboBox.setBounds(270, 73, 150, 20);
        panel.add(comboBox);
        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(271,125,150,20 );
        panel.add(textFieldNumber);
        textName = new JTextField();
        textName.setBounds(271,175,150,20 );
        panel.add(textName);
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        r1.setBounds(271,225,75,20);
        panel.add(r1);
        r2.setBounds(350,225,75,20);
        panel.add(r2);
        textFieldDisease = new JTextField();
        textFieldDisease.setBounds(271,275,150,20 );
        panel.add(textFieldDisease);

        c1=new Choice();
        try{
            conn c= new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from Room");
            while(resultSet.next()){
                c1.add(resultSet.getString("room_no"));

            }




        }catch(Exception e){
            e.printStackTrace();
        }
        c1.setBounds(271,325, 150,20);
        panel.add(c1);



        JLabel labelDate = new JLabel("Time:");
        labelDate.setBounds(45,375,150,20);
        labelDate.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panel.add(labelDate);
        Date date1 = new Date();
        date = new JLabel(""+date1);
        date.setBounds(271,375,400,20);
        panel.add(date);

        JLabel labelDeposite = new JLabel("Deposite:");
        labelDeposite.setBounds(45,425,150,20);
        labelDeposite.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panel.add(labelDeposite);
        textDeposite = new JTextField();
        textDeposite.setBounds(271,425,150,20 );
        panel.add(textDeposite);
        b1 = new JButton("Submit");
        b1.setBounds(100,475,100,20);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(250,475,100,20);
        b2.addActionListener(this);
        panel.add(b2);



        setSize(850, 550);
        setLayout(null);
        setLocation(300,150);
        setVisible(true);


    }
    public static void main (String[] args){
        new new_patient();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            conn c = new conn();
            String radioBTN=null;
            if (r1.isSelected()){
                radioBTN="Male";
            }else if (r2.isSelected()){
                radioBTN="Female";
            }
            String s1 = (String)comboBox.getSelectedItem();
            String s2 = textFieldNumber.getText();
            String s3 = textName.getText();
            String s4 = radioBTN;
            String s5 = textFieldDisease.getText();
            String s6 = c1.getSelectedItem();
            String s7 = date.getText();
            String s8 = textDeposite.getText();
            System.out.println("done");

            try{
                String q = "insert into patient_info values ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                String q1="update Room set Availability='Occupied' where room_no="+s6;
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Patient has been submitted");

                c.statement.executeQuery(q1);
                setVisible(false);

            }catch(Exception E){
                E.printStackTrace();
            }


        }else{
            setVisible(false);
        }

    }
}
