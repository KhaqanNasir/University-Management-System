import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;

public class ViewMarks {
    ViewMarks(){
            String data[][]={{"Ahsan Abdullah","FA22-BCS-015","Computer Science","2.98"}, {"Faizan Mustafa","FA22-BCS-027","Computer Science","3.33"},
            {"M.Khaqan Nasir","FA22-BCS-039","Computer Science","3.85"}, {"Malik Ali Raza","FA22-BCS-045","Computer Science","3.33"}};
            String column[]={"Name","Reg. no","Department","CGPA"};
        JTable table = new JTable(data,column);
        table.setBounds(350, 270, 1400, 500);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        table.setRowHeight(40);
        Border border = BorderFactory.createLineBorder(Color.black, 2);
        table.setBorder(border);

        JLabel label = new JLabel("Student Details");
        label.setBounds(700, 50, 500, 50);
        label.setFont(new Font("MV BOLI", Font.BOLD, 60));
        label.setForeground(Color.white);

        JLabel label1 = new JLabel("Name");
        label1.setBounds(400, 180, 150, 30);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 28));

         JLabel label2 = new JLabel("Reg no.");
        label2.setBounds(750, 180, 150, 30);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 28));

         JLabel label3 = new JLabel("Department");
        label3.setBounds(1100, 180, 150, 30);
        label3.setFont(new Font("Times New Roman", Font.BOLD, 28));

         JLabel label4 = new JLabel("CGPA");
        label4.setBounds(1500, 180, 150, 30);
        label4.setFont(new Font("Times New Roman", Font.BOLD, 28));



         JFrame frame = new JFrame("Khaqan Insititue of Technology");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon image = new ImageIcon("src/Frame_Logo.png");
        frame.setIconImage(image.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(105,150,195));
        frame.setLayout(null);
        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(table);
        frame.setVisible(true);

    }
    
}
