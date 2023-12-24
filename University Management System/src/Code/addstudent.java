import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class addstudent {
    addstudent(){

        JFrame frame = new JFrame("Khaqan Istitute of Technology");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon image = new ImageIcon("src/Frame_Logo.png");
        frame.setIconImage(image.getImage());
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(111,222,121));
        frame.setFocusable(false);
        frame.setResizable(false);

        JLabel label = new JLabel("Add New Student");
        label.setBounds(120, 20, 300, 50);
        label.setFont(new Font("Tahoma", Font.BOLD, 24));
        frame.add(label);
        
        JLabel label1 = new JLabel("First Name");
        label1.setBounds(50,120,100,40);
        label1.setFont(new Font("Tahoma", Font.BOLD, 18));
        frame.add(label1);

        JLabel label2 = new JLabel("Last Name");
        label2.setBounds(50,180,100,40);
        label2.setFont(new Font("Tahoma", Font.BOLD, 18));
        frame.add(label2);

        JTextField text1 = new JTextField();
        text1.setBounds(200, 120, 200, 40);
        frame.add(text1);

         JTextField text2 = new JTextField();
        text2.setBounds(200, 180, 200, 40);
        frame.add(text2);

        JLabel label3 = new JLabel("Std. ID");
        label3.setBounds(50,240,100,40);
        label3.setFont(new Font("Tahoma", Font.BOLD, 18));
        frame.add(label3);

        JTextField text3 = new JTextField();
        text3.setBounds(200,240,200,40);
        frame.add(text3);

        JLabel label4 = new JLabel("Email");
        label4.setBounds(50,300,100,40);
        label4.setFont(new Font("Tahoma", Font.BOLD, 18));
        frame.add(label4);

        JTextField text4 = new JTextField();
        text4.setBounds(200,300,200,40);
        frame.add(text4);

        JLabel label5 = new JLabel("Phone no.");
        label5.setBounds(50,360,100,40);
        label5.setFont(new Font("Tahoma", Font.BOLD, 18));
        frame.add(label5);

        JTextField text5 = new JTextField();
        text5.setBounds(200,360,200,40);
        frame.add(text5);

        JLabel label6 = new JLabel("Department");
        label6.setBounds(50,420,120,40);
        label6.setFont(new Font("Tahoma", Font.BOLD, 18));
        frame.add(label6);

       /* 
        String[] dep = {"Computer Science","Electrical Engineering","Management Sciences","Bio Science"};
        JComboBox comboBox = new JComboBox<>(dep);
        comboBox.setBounds(200,420,200,40);
        comboBox.setFocusable(false);
        frame.add(comboBox);
        */ 

        JButton button = new JButton("Submit");
        button.setBounds(140, 520, 200, 40);
        button.setFocusable(false);
        button.setFont(new Font("Tahoma", Font.ITALIC, 20));
        frame.add(button);

       




        frame.setVisible(true);
        
    }
    
}
