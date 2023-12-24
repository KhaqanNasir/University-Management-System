import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class ProfileFrame {
    ProfileFrame(){
        ImageIcon image2 = new ImageIcon("src/profile_pic.JPG");
        Image i1 = image2.getImage().getScaledInstance(250, 300, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i1);
        JLabel pic = new JLabel(i3);
        pic.setBounds(1200, 160, 250, 300);
        pic.setBackground(Color.white);
        pic.setFocusable(false);
        pic.setOpaque(true);

         JLabel label = new JLabel("Student Profile");
        label.setBounds(700, 50, 500, 50);
        label.setFont(new Font("MV BOLI", Font.BOLD, 60));
        label.setForeground(Color.BLACK);

        JLabel label1 = new JLabel("Name");
        label1.setBounds(300, 180, 150, 30);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 28));

        JLabel name = new JLabel("Muhammad Khaqan Nasir");
        name.setBounds(600, 180, 300, 30);
        name.setFont(new Font("Times New Roman",Font.PLAIN,28));

         JLabel label2 = new JLabel("Reg no.");
        label2.setBounds(300, 230, 150, 30);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 28));
        
        JLabel reg = new JLabel("FA22-BCS-039");
        reg.setBounds(600, 230, 300, 30);
        reg.setFont(new Font("Times New Roman", Font.PLAIN, 28));

         JLabel label3 = new JLabel("Department");
        label3.setBounds(300, 280, 150, 30);
        label3.setFont(new Font("Times New Roman", Font.BOLD, 28));

        JLabel dep = new JLabel("Computer Science");
        dep.setBounds(600, 280, 300, 30);
        dep.setFont(new Font("Times New Roman", Font.PLAIN, 28));

         JLabel label4 = new JLabel("CGPA");
        label4.setBounds(300, 330, 150, 30);
        label4.setFont(new Font("Times New Roman", Font.BOLD, 28));

        JLabel gpa = new JLabel("3.85");
        gpa.setBounds(600, 330, 150, 30);
        gpa.setFont(new Font("Times New Roman", Font.PLAIN, 28));

        JLabel label5 = new JLabel("Contact no.");
        label5.setBounds(300, 380, 200, 30);
        label5.setFont(new Font("Times New Roman", Font.BOLD, 28));

        JLabel no = new JLabel("+92309-1111222");
        no.setBounds(600, 380, 300, 30);
        no.setFont(new Font("Times New Roman", Font.PLAIN, 28));

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(735, 550, 500, 3);


         JFrame frame = new JFrame("Khaqan Insititue of Technology");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon image = new ImageIcon("src/Frame_Logo.png");
        frame.setIconImage(image.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(105,150,195));
        frame.setLayout(null);
        frame.add(label);
        frame.add(pic);
        frame.add(label1);
        frame.add(name);
        frame.add(label2);
        frame.add(reg);
        frame.add(label3);
        frame.add(dep);
        frame.add(label4);
        frame.add(gpa);
        frame.add(label5);
        frame.add(no);
        frame.add(panel);
        frame.setVisible(true);
    }
    
    
}
