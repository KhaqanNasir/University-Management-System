import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AttendanceFrame {
    AttendanceFrame(){

         JLabel label = new JLabel("Coming Soon...!");
        label.setBounds(640, 450, 600, 70);
        label.setFont(new Font("MV BOLI", Font.BOLD, 72));
        label.setForeground(Color.white);

        
         JFrame frame = new JFrame("Khaqan Insititue of Technology");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon image = new ImageIcon("src/Frame_Logo.png");
        frame.setIconImage(image.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(105,150,195));
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    
}
