package hospital.management.system;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.sql.ResultSet;

public class Department extends javax.swing.JFrame {
    Department(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        add(panel);
        JTable table = new JTable();
        table.setBounds(0,5,690,490);
        panel.add(table);
        try{
            conn c = new conn();
            String query = "select * from department";
            ResultSet resultSet = c.statement.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch(Exception e){
            e.printStackTrace();
        }


        setSize(700,500);
        setLayout(null);
        setLocation(350,250);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Department();
    }
}
