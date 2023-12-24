import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;
public class HelpFrame {
    HelpFrame(){
        JFrame frame = new JFrame("Khaqan Institute of Technology");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon image = new ImageIcon("src/Frame_Logo.png");
        frame.setIconImage(image.getImage());
        frame.setLayout(new BorderLayout(10,10));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.CYAN);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.red);
        panel4.setBackground(Color.orange);
        panel5.setBackground(Color.pink);

        panel1.setPreferredSize(new Dimension(200, 200));
        panel2.setPreferredSize(new Dimension(200, 200));
        panel3.setPreferredSize(new Dimension(200, 200));
        panel4.setPreferredSize(new Dimension(200, 200));
        panel5.setPreferredSize(new Dimension(200, 200));

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.EAST);
        frame.add(panel3,BorderLayout.WEST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();

        panel6.setBackground(Color.gray);
        panel7.setBackground(Color.black);
        panel8.setBackground(Color.DARK_GRAY);
        panel9.setBackground(Color.lightGray);

       panel5.setLayout(new BorderLayout());

        panel6.setPreferredSize(new Dimension(150, 150));
        panel7.setPreferredSize(new Dimension(150, 150));
        panel8.setPreferredSize(new Dimension(150, 150));
        panel9.setPreferredSize(new Dimension(150, 150));

        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.EAST);
         panel5.add(panel8,BorderLayout.WEST);
        panel5.add(panel9,BorderLayout.SOUTH);

       
       
        frame.setVisible(true);


    }
    
}
