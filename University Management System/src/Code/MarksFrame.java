import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
public class MarksFrame {
    MarksFrame() {

        JPanel panel1 = new JPanel();
        panel1.setBounds(50, 50, 600, 600);
        panel1.setOpaque(true);
        panel1.setBackground(Color.red);

         JPanel panel2 = new JPanel();
        panel2.setBounds(100, 100, 600, 600);
        panel2.setOpaque(true);
        panel2.setBackground(Color.green);

         JPanel panel3 = new JPanel();
        panel3.setBounds(150, 150, 600, 600);
        panel3.setOpaque(true);
        panel3.setBackground(Color.blue);

        JPanel panel4 = new JPanel();
        panel4.setBounds(200, 200, 600, 600);
        panel4.setOpaque(true);
        panel4.setBackground(Color.ORANGE);

        JPanel panel5 = new JPanel();
        panel5.setBounds(250, 250, 600, 600);
        panel5.setOpaque(true);
        panel5.setBackground(Color.magenta);

        JPanel panel6 = new JPanel();
        panel6.setBounds(300, 300, 600, 600);
        panel6.setOpaque(true);
        panel6.setBackground(Color.YELLOW);

        JPanel panel7 = new JPanel();
        panel7.setBounds(350, 350, 600, 600);
        panel7.setOpaque(true);
        panel7.setBackground(Color.CYAN);

        JPanel panel8 = new JPanel();
        panel8.setBounds(400, 400, 600, 600);
        panel8.setOpaque(true);
        panel8.setBackground(new Color(111,222,121));

        JLayeredPane J1 = new JLayeredPane();
        J1.setBounds(0, 0, 500, 500);
        J1.add(panel1,Integer.valueOf(0));
        J1.add(panel2,Integer.valueOf(1));
        J1.add(panel3,Integer.valueOf(2));
        J1.add(panel4,Integer.valueOf(3));
        J1.add(panel5,Integer.valueOf(4));
        J1.add(panel6,Integer.valueOf(5));
        J1.add(panel7,Integer.valueOf(6));
        J1.add(panel8,Integer.valueOf(7));

        JPanel panel9 = new JPanel();
        panel9.setBounds(1100, 50, 600, 600);
        panel9.setOpaque(true);
        panel9.setBackground(Color.red);

         JPanel panel10 = new JPanel();
        panel10.setBounds(1150, 100, 600, 600);
        panel10.setOpaque(true);
        panel10.setBackground(Color.green);

         JPanel panel11 = new JPanel();
        panel11.setBounds(1200, 150, 600, 600);
        panel11.setOpaque(true);
        panel11.setBackground(Color.blue);

        JPanel panel12 = new JPanel();
        panel12.setBounds(1250, 200, 600, 600);
        panel12.setOpaque(true);
        panel12.setBackground(Color.ORANGE);

        JPanel panel13 = new JPanel();
        panel13.setBounds(1300, 250, 600, 600);
        panel13.setOpaque(true);
        panel13.setBackground(Color.magenta);

        JPanel panel14 = new JPanel();
        panel14.setBounds(1350, 300, 600, 600);
        panel14.setOpaque(true);
        panel14.setBackground(Color.YELLOW);

        JPanel panel15 = new JPanel();
        panel15.setBounds(1400, 350, 600, 600);
        panel15.setOpaque(true);
        panel15.setBackground(Color.CYAN);

        JPanel panel16 = new JPanel();
        panel16.setBounds(1450, 400, 600, 600);
        panel16.setOpaque(true);
        panel16.setBackground(new Color(111,222,121));

        JLayeredPane J2 = new JLayeredPane();
        J2.setBounds(1000, 50, 500, 500);
        J2.add(panel9,Integer.valueOf(0));
        J2.add(panel10,Integer.valueOf(1));
        J2.add(panel11,Integer.valueOf(2));
        J2.add(panel12,Integer.valueOf(3));
        J2.add(panel13,Integer.valueOf(4));
        J2.add(panel14,Integer.valueOf(5));
        J2.add(panel15,Integer.valueOf(6));
        J2.add(panel16,Integer.valueOf(7));
        
        

        JFrame frame = new JFrame("Khaqan Institute of Technology");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon image = new ImageIcon("src/Frame_Logo.png");
        frame.setIconImage(image.getImage());

        JLabel label1 = new JLabel("Name");
        label1.setBounds(600,120,100,40);
        label1.setFont(new Font("Tahoma", Font.BOLD, 18));
        frame.add(label1);

        JLabel label2 = new JLabel("Reg no.");
        label2.setBounds(600,180,100,40);
        label2.setFont(new Font("Tahoma", Font.BOLD, 18));
        frame.add(label2);

        JTextField text1 = new JTextField();
        text1.setBounds(800, 120, 200, 30);
        frame.add(text1);

         JTextField text2 = new JTextField();
        text2.setBounds(800, 180, 200, 30);
        frame.add(text2);

        JLabel label3 = new JLabel("Dept.");
        label3.setBounds(600,240,100,40);
        label3.setFont(new Font("Tahoma", Font.BOLD, 18));
        frame.add(label3);

        JTextField text3 = new JTextField();
        text3.setBounds(800,240,200,30);
        frame.add(text3);

        JLabel label4 = new JLabel("Subject");
        label4.setBounds(600,300,100,40);
        label4.setFont(new Font("Tahoma", Font.BOLD, 18));
        frame.add(label4);

        JTextField text4 = new JTextField();
        text4.setBounds(800,300,200,30);
        frame.add(text4);

        JLabel label5 = new JLabel("Marks");
        label5.setBounds(600,360,100,40);
        label5.setFont(new Font("Tahoma", Font.BOLD, 18));
        frame.add(label5);

        JTextField text5 = new JTextField();
        text5.setBounds(800,360,200,30);
        frame.add(text5);


        JButton button = new JButton("Submit");
        button.setBounds(800, 470, 200, 40);
        button.setFocusable(false);
        button.setFont(new Font("Tahoma", Font.ITALIC, 20));
        frame.add(button);
         frame.getContentPane().setBackground(Color.PINK);

        frame.getContentPane().add(J1);
        frame.getContentPane().add(J2);
        frame.setVisible(true);
        
    }
    
}
