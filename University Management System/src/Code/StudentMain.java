import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class StudentMain implements ActionListener {
     JButton button30,button31,button1,button4,button5,button3,button2;
    JFrame frame;
    StudentMain(){
        JPanel panel1 = new JPanel();
        panel1.setBounds(480, 440, 400, 250);
        panel1.setBackground(Color.WHITE);
        ImageIcon image30 = new ImageIcon("src/library1.jpg");
        Image i30 = image30.getImage().getScaledInstance(400, 250, Image.SCALE_SMOOTH);
        ImageIcon i31 = new ImageIcon(i30);
        JLabel label30 = new JLabel(i31);
        panel1.add(label30);

       button30 = new JButton("View Library");
        button30.setBounds(590, 700, 180, 40);
        button30.setBackground(new Color(40,54,60));
        button30.setForeground(Color.white);
        button30.setOpaque(true);
        button30.setFocusable(false);
        button30.setFont(new Font("Tahoma", Font.ITALIC, 20));
        button30.addActionListener(this);

                
       JPanel panel2 = new JPanel();
        panel2.setBounds(1000, 440, 400, 250);
        panel2.setBackground(Color.WHITE);
        ImageIcon image31 = new ImageIcon("src/uni1.jpg");
        Image i35 = image31.getImage().getScaledInstance(400, 250, Image.SCALE_SMOOTH);
        ImageIcon i36 = new ImageIcon(i35);
        JLabel label32 = new JLabel(i36);
        panel2.add(label32);

       button31 = new JButton("View University");
        button31.setBounds(1110, 700, 180, 40);
        button31.setBackground(new Color(40,54,60));
        button31.setForeground(Color.white);
        button31.setOpaque(true);
        button31.setFocusable(false);
        button31.setFont(new Font("Tahoma", Font.ITALIC, 20));
        button31.addActionListener(this);

        ImageIcon image10 = new ImageIcon("src/studentlogo.png");
        Image i15 = image10.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        ImageIcon i16 = new ImageIcon(i15);
        JLabel label20 = new JLabel(i16);
        label20.setBounds(90, 20, 250, 250);

        ImageIcon image1 = new ImageIcon("src/StudentBackground.jpg");
        Image i1 = image1.getImage().getScaledInstance(1920, 1220,Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel label1 = new JLabel(i2); 
        label1.setBounds(0, 0, 1920,1220);
    
        JPanel panel = new JPanel();
        panel.setBounds(350, 250, 1200, 550);
        panel.setBackground(Color.lightGray);


       JLabel label = new JLabel("Student Portal");
       label.setBounds(350, 100, 500, 100);
       label.setFont(new Font("Times New Roman", Font.BOLD, 76));
       label.setForeground(Color.WHITE);
       label.setFocusable(false);


        button1 = new JButton("Profile");
        ImageIcon image3 = new ImageIcon("src/Profile-Avatar-PNG.png");
        Image i4 = image3.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon i5 = new ImageIcon(i4);
        button1.setBounds(390, 290, 200, 100);
        button1.setFocusable(false);
        button1.setBackground(new Color(48,54,60));
        button1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        button1.setForeground(Color.WHITE);
        button1.setIcon(i5);
        button1.addActionListener(this);

        button2 = new JButton("Dashboard");
        ImageIcon image4 = new ImageIcon("src/dashboard.png");
        Image i6 = image4.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon i7 = new ImageIcon(i6);
        button2.setIcon(i7);
        button2.setBounds(620, 290, 200, 100);
        button2.setFocusable(false);
        button2.setBackground(new Color(48,54,60));
        button2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        button2.setForeground(Color.WHITE);
        button2.addActionListener(this);

         button3 = new JButton("Attendance");
         ImageIcon image5 = new ImageIcon("src/Attendance.png");
         Image i8 = image5.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
         ImageIcon i9 = new ImageIcon(i8);
         button3.setIcon(i9);
        button3.setBounds(850, 290, 200, 100);
        button3.setFocusable(false);
        button3.setBackground(new Color(48,54,60));
        button3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        button3.setForeground(Color.WHITE);
        button3.addActionListener(this);

          button4 = new JButton("View Marks");
         ImageIcon image6 = new ImageIcon("src/marks.png");
         Image i10 = image6.getImage().getScaledInstance(80, 90, Image.SCALE_SMOOTH);
         ImageIcon i11 =new ImageIcon(i10);
         button4.setIcon(i11);
        button4.setBounds(1080, 290, 200, 100);
        button4.setFocusable(false);
        button4.setBackground(new Color(48,54,60));
        button4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        button4.setForeground(Color.WHITE);
        button4.addActionListener(this);

         button5 = new JButton("Log Out");
         ImageIcon image7 = new ImageIcon("src/logout.png");
         Image i12 = image7.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
         ImageIcon i13 = new ImageIcon(i12);
         button5.setIcon(i13);
        button5.setBounds(1310, 290, 200, 100);
        button5.setFocusable(false);
        button5.setBackground(new Color(48,54,60));
        button5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        button5.setForeground(Color.WHITE);
        button5.addActionListener(this);

    

    frame = new JFrame("Khaqan Institiue of Technology");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon image = new ImageIcon("src/Frame_Logo.png");
        frame.setIconImage(image.getImage());
        frame.add(button1);
       frame.add(button2);
       frame.add(button3);
       frame.add(button4);
       frame.add(button5);
       frame.add(button30);
       frame.add(button31);
       frame.add(panel2);
        frame.add(panel1);
        frame.add(panel);
        frame.add(label20);
        frame.add(label);
        
        frame.add(label1);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button30){
            new Library();
        }
        if(e.getSource()==button31){
            new university();
        }
        if(e.getSource()==button4){
            new ViewMarks();
        }
        if(e.getSource()==button5){
            new MainFrame();
            frame.setVisible(false);
        }
        if(e.getSource()==button1){
            new ProfileFrame();
        }
        if(e.getSource()==button3){
            new AttendanceFrame();
        }
        if(e.getSource()==button2){
            new DashboardFrame();
        }
    }
    
}
