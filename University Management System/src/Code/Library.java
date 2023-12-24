import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Library {
    Library(){
     JFrame frame = new JFrame("Khaqan Institiue of Technology");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(48,54,60));
        frame.setFocusable(false);
        ImageIcon image = new ImageIcon("src/Frame_Logo.png");
        frame.setIconImage(image.getImage());
        frame.setLayout(null);
        
        ImageIcon image1 = new ImageIcon("src/library7.jpg");
        Image i1 = image1.getImage().getScaledInstance(500, 350, Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel label1 = new JLabel(i2);
        label1.setBackground(Color.white);
        label1.setFocusable(false);
        label1.setOpaque(true);
        label1.setBounds(150, 100, 500, 350);
        Border border = BorderFactory.createLineBorder(Color.black, 10);
        label1.setBorder(border);
        
         ImageIcon image2 = new ImageIcon("src/library2.png");
        Image i3 = image2.getImage().getScaledInstance(480, 330, Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel label2 = new JLabel(i4);
        label2.setBackground(Color.white);
        label2.setFocusable(false);
        label2.setOpaque(true);
        label2.setBounds(700, 100, 500, 350);
          Border border1 = BorderFactory.createLineBorder(Color.black, 10);
        label2.setBorder(border1);

         ImageIcon image3 = new ImageIcon("src/library3.jpg");
        Image i5 = image3.getImage().getScaledInstance(500, 350, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel label3 = new JLabel(i6);
        label3.setBackground(Color.white);
        label3.setFocusable(false);
        label3.setOpaque(true);
        label3.setBounds(1250, 100, 500, 350);
          Border border3 = BorderFactory.createLineBorder(Color.black, 10);
        label3.setBorder(border3);

         ImageIcon image4 = new ImageIcon("src/library4.jpg");
        Image i7 = image4.getImage().getScaledInstance(500, 350, Image.SCALE_SMOOTH);
        ImageIcon i8 = new ImageIcon(i7);
        JLabel label4 = new JLabel(i8);
        label4.setBackground(Color.white);
        label4.setFocusable(false);
        label4.setOpaque(true);
        label4.setBounds(150, 550, 500,350);
          Border border4 = BorderFactory.createLineBorder(Color.black, 10);
        label4.setBorder(border4);

         ImageIcon image5 = new ImageIcon("src/library5.jpg");
        Image i9 = image5.getImage().getScaledInstance(500, 350, Image.SCALE_SMOOTH);
        ImageIcon i10 = new ImageIcon(i9);
        JLabel label5 = new JLabel(i10);
        label5.setBackground(Color.white);
        label5.setFocusable(false);
        label5.setOpaque(true);
        label5.setBounds(700, 550, 500, 350);
          Border border5 = BorderFactory.createLineBorder(Color.black, 10);
        label5.setBorder(border5);

         ImageIcon image6 = new ImageIcon("src/library6.jpg");
        Image i11 = image6.getImage().getScaledInstance(500, 350, Image.SCALE_SMOOTH);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel label6 = new JLabel(i12);
        label6.setBackground(Color.white);
        label6.setFocusable(false);
        label6.setOpaque(true);
        label6.setBounds(1250, 550, 500, 350);
          Border border6 = BorderFactory.createLineBorder(Color.black, 10);
        label6.setBorder(border6);


        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.setVisible(true);
    }
    
}
