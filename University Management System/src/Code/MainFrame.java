
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame implements ActionListener {
     ImageIcon image;
     ImageIcon image1;
     JButton button1;
     JButton button2;
      JFrame frame;

    MainFrame(){
        frame = new JFrame("Khaqan Institue of Technology");
        button1 = new JButton("Student Portal");
        button1.setBounds(250, 440, 180, 40);
        button1.setFocusable(false);
        button1.setFont(new Font("Tahoma", Font.BOLD,15));
        button1.setBackground(new Color(0,51,102));
        button1.setForeground(Color.white);
        button1.addActionListener(this);
        frame.add(button1);
        
        button2 = new JButton("Admin Portal");
        button2.setBounds(560,440, 180, 40);
        button2.setFocusable(false);
        button2.setFont(new Font("Tahoma", Font.BOLD,15));
        button2.setBackground(new Color(0,51,102));
        button2.setForeground(Color.white);
        button2.addActionListener(this);
        frame.add(button2);
    
        image1 = new ImageIcon("src/Frame_Logo.png");
        Image i4 = image1.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        ImageIcon i5 = new ImageIcon(i4);
        JLabel label1 = new JLabel(i5);
        label1.setBounds(375,150,250,250);

        JLabel label2 = new JLabel("Khaqan Institue of Technology");
        label2.setFont(new Font("Times New Roman",Font.BOLD,60));
        label2.setBounds(90, 0, 1000, 160);
        label2.setForeground(new Color(0,51,102));

        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("src/Frame_Logo.png");
        frame.setIconImage(image.getImage());
        frame.setSize(1000, 600);
         frame.setLocationRelativeTo(null);
        image = new ImageIcon("src/MainFrame.jpg");
        Image i1 = image.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel label = new JLabel(i2);
         label.add(label1);
         label.add(label2);
         frame.add(label);
         frame.setResizable(false);
         frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            new Studentlogin();
            frame.setVisible(false);
        }
        if(e.getSource()==button2){
            new adminlogin();
            frame.setVisible(false);
        }
    }
    
    
}
