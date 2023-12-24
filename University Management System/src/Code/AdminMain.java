import java.awt.Color;
import java.awt.Font;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class AdminMain implements ActionListener {
    JMenuItem item2,item3,item1,item4,item5,item6;
     AdminMain(){

        JMenuBar menu = new JMenuBar();
        menu.setBackground(new Color(48,54,60));
        menu.setFocusable(false);

        JMenu file = new JMenu("File  ");
        file.setForeground(Color.WHITE);
        file.setFont(new Font("Tahoma", Font.PLAIN, 20));
        item3 = new JMenuItem("Browse");
        item3.setForeground(Color.WHITE);
        item3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        item3.setBackground(new Color(48,54,60));
        item3.addActionListener(this);
        file.add(item3);
        menu.add(file);
        file.addActionListener(this);

        JMenu attendance = new JMenu("Attendance  ");
        attendance.setForeground(Color.WHITE);
        attendance.setFont(new Font("Tahoma", Font.PLAIN, 20));

          item1 = new JMenuItem("Upload Attendance");
         item1.setForeground(Color.WHITE);
        item1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        item1.setBackground(new Color(48,54,60));
        item1.addActionListener(this);
         attendance.add(item1);
          menu.add(attendance);
        
         JMenu marks = new JMenu("Marks  ");
        marks.setForeground(Color.WHITE);
        marks.setFont(new Font("Tahoma", Font.PLAIN, 20));
        item6 = new JMenuItem("Upload");
        item6.setForeground(Color.WHITE);
        item6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        item6.setBackground(new Color(48,54,60));
        item6.addActionListener(this);
        marks.add(item6);
         menu.add(marks);
        
         JMenu edit = new JMenu("Edit  ");
        edit.setForeground(Color.WHITE);
        edit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        item5 = new JMenuItem("Choose");
        item5.setForeground(Color.WHITE);
        item5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        item5.setBackground(new Color(48,54,60));
        item5.addActionListener(this);
        edit.add(item5);
         menu.add(edit);



         JMenu help = new JMenu("Help  ");
        help.setForeground(Color.WHITE);
        help.setFont(new Font("Tahoma", Font.PLAIN, 20));
        item4 = new JMenuItem("View");
         item4.setForeground(Color.WHITE);
         item4.setBackground(new Color(48,54,60));
        item4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        item4.addActionListener(this);
        help.add(item4);
         menu.add(help);

        JMenu add = new JMenu("Student  ");
        add.setForeground(Color.WHITE);
        add.setFont(new Font("Tahoma", Font.PLAIN, 20));
         item2 = new JMenuItem("Add Students");
         item2.setFont(new Font("Tahoma", Font.PLAIN, 20));
         item2.setBackground(new Color(48,54,60));
         item2.setForeground(Color.WHITE);
         item2.addActionListener(this);
        add.add(item2);
         menu.add(add);
         
         JPanel panel = new JPanel();
         panel.setBackground(Color.WHITE);
         panel.setBounds(0, 150, 1920, 100);
         panel.setFocusable(false);
         
          JPanel panel1 = new JPanel();
         panel1.setBackground(new Color(48,54,60));
        panel1.setBounds(0, 400, 1920, 100);
         panel1.setFocusable(false);

         JPanel panel3 = new JPanel();
         panel3.setBackground(Color.WHITE);
         panel3.setBounds(0, 650, 1920, 100);
         panel3.setFocusable(false);
     

        JFrame frame = new JFrame("Khaqan Insititue of Technology");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon image = new ImageIcon("src/Frame_Logo.png");
        frame.setIconImage(image.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(105,150,195));
        frame.setLayout(null);
        frame.setJMenuBar(menu);
        frame.add(panel);
        frame.add(panel1);
        frame.add(panel3);
        frame.setVisible(true);
      
    
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==item3){
        JFileChooser fileChooser = new JFileChooser();
       int x= fileChooser.showOpenDialog(null);
        if(x==0){
          File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
            System.out.println(file);
        }
      }
      if(e.getSource()==item2){
        new addstudent();
      }
      if(e.getSource()==item1){
        new UploadAttendance();
      }
      if(e.getSource()==item4){
        new HelpFrame();
      }
      if(e.getSource()==item5){
        new EditFrame();
      }
      if(e.getSource()==item6){
        new MarksFrame();
      }
    }
    public static void main(String[] args) {
      new AdminMain();
    }
    
}
