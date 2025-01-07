package hospital.management.system;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.sql.ResultSet;

public class Room extends javax.swing.JFrame {
    JTable table;
    Room(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5 ,890 ,590);
        panel.setLayout(null);
        add(panel);
        table = new JTable();
        table.setBounds(18,40,500,400);
        panel.add(table);
        try{
            conn c = new conn();
            String query = "select * from room";
            ResultSet resultSet = c.statement.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }


        JLabel lblRoom = new JLabel("Room no.");
        JLabel lblName = new JLabel("Availability");
        JLabel lblRoomNo = new JLabel("Price");
        JLabel lblRoomType = new JLabel("Room Type");
        lblName.setBounds(175,0,200,20);
        lblRoomNo.setBounds(300,0,200,20);
        lblRoomType.setBounds(400,0,200,20);
        lblRoom.setBounds(50,0,200,20);
        panel.add(lblRoom);
        panel.add(lblRoomNo);
        panel.add(lblRoomType);
        panel.add(lblName);

        setSize(900,600);
        setLayout(null);
        setLocation(300,230);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Room();
    }
}
