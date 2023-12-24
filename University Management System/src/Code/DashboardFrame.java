import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class DashboardFrame {
     JProgressBar bar1,bar2,bar3,bar4,bar5,bar6;
    DashboardFrame(){
        
          JLabel label = new JLabel("Student Subject Details");
        label.setBounds(550, 50, 800, 50);
        label.setFont(new Font("MV BOLI", Font.BOLD, 60));
        label.setForeground(Color.BLACK);

        JLabel label1 = new JLabel("OOP");
        label1.setBounds(300, 180, 150, 30);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 28));

        JLabel name = new JLabel("Dr. Javed Ferzund");
        name.setBounds(600, 180, 300, 30);
        name.setFont(new Font("Times New Roman",Font.PLAIN,28));

        bar1 = new JProgressBar();
        bar1.setValue(0);
        bar1.setStringPainted(true);
        bar1.setBounds(1200, 180, 400, 30);
        bar1.setBackground(Color.black);
        bar1.setForeground(Color.red);
        bar1.setFocusable(false);
        pull();

         JLabel label2 = new JLabel("DSA");
        label2.setBounds(300, 230, 150, 30);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 28));
        
        JLabel reg = new JLabel("Tahreem Saeed");
        reg.setBounds(600, 230, 300, 30);
        reg.setFont(new Font("Times New Roman", Font.PLAIN, 28));

        bar2 = new JProgressBar();
        bar2.setValue(0);
        bar2.setStringPainted(true);
        bar2.setBounds(1200, 230, 400, 30);
        bar2.setBackground(Color.black);
        bar2.setForeground(new Color(25,161,25));
        bar2.setFocusable(false);
        pull1();

         JLabel label3 = new JLabel("SEC");
        label3.setBounds(300, 280, 150, 30);
        label3.setFont(new Font("Times New Roman", Font.BOLD, 28));

        JLabel dep = new JLabel("Tariq Rafiq");
        dep.setBounds(600, 280, 300, 30);
        dep.setFont(new Font("Times New Roman", Font.PLAIN, 28));

         bar3 = new JProgressBar();
        bar3.setValue(0);
        bar3.setStringPainted(true);
        bar3.setBounds(1200, 280, 400, 30);
        bar3.setBackground(Color.black);
        bar3.setForeground(Color.red);
        bar3.setFocusable(false);
        pull2();

         JLabel label4 = new JLabel("CAG");
        label4.setBounds(300, 330, 150, 30);
        label4.setFont(new Font("Times New Roman", Font.BOLD, 28));

        JLabel gpa = new JLabel("Dr. Shahid Qaisar");
        gpa.setBounds(600, 330, 300, 30);
        gpa.setFont(new Font("Times New Roman", Font.PLAIN, 28));

         bar4 = new JProgressBar();
        bar4.setValue(0);
        bar4.setStringPainted(true);
        bar4.setBounds(1200, 330, 400, 30);
        bar4.setBackground(Color.black);
        bar4.setForeground(Color.red);
        bar4.setFocusable(false);
        pull3();

        JLabel label5 = new JLabel("Linear Algebra");
        label5.setBounds(300, 380, 200, 30);
        label5.setFont(new Font("Times New Roman", Font.BOLD, 28));

        JLabel no = new JLabel("Sana Nasir");
        no.setBounds(600, 380, 300, 30);
        no.setFont(new Font("Times New Roman", Font.PLAIN, 28));

         bar5 = new JProgressBar();
        bar5.setValue(0);
        bar5.setStringPainted(true);
        bar5.setBounds(1200, 380, 400, 30);
        bar5.setBackground(Color.black);
        bar5.setForeground(new Color(25,161,25));
        bar5.setFocusable(false);
        pull4();
        
        JLabel label6 = new JLabel("Comm. Skills");
        label6.setBounds(300, 430, 200, 30);
        label6.setFont(new Font("Times New Roman", Font.BOLD, 28));

        JLabel tea = new JLabel("Sabeen Amin");
        tea.setBounds(600, 430, 300, 30);
        tea.setFont(new Font("Times New Roman", Font.PLAIN, 28));

          bar6 = new JProgressBar();
        bar6.setValue(0);
        bar6.setStringPainted(true);
        bar6.setBounds(1200, 430, 400, 30);
        bar6.setBackground(Color.black);
        bar6.setForeground(new Color(25,161,25));
        bar6.setFocusable(false);
        pull5();


        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(735, 600, 500, 3);


         JFrame frame = new JFrame("Khaqan Insititue of Technology");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon image = new ImageIcon("src/Frame_Logo.png");
        frame.setIconImage(image.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(173,173,173));
        frame.setLayout(null);
        frame.add(label);
        frame.add(label1);
        frame.add(name);
        frame.add(label2);
        frame.add(bar1);
        frame.add(reg);
        frame.add(label3);
        frame.add(bar2);
        frame.add(dep);
        frame.add(label4);
        frame.add(bar3);
        frame.add(gpa);
        frame.add(label5);
        frame.add(bar4);
        frame.add(no);
        frame.add(label6);
          frame.add(bar5);
        frame.add(tea);
          frame.add(bar6);
        frame.add(panel);

        frame.setVisible(true);
    }
    public void pull(){
        int count=0;
        while(count<=60){
            bar1.setValue(count);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count+=1;
        }
        bar1.setString(" 60 % ");
    }
    public void pull1(){
        int count=0;
        while(count<=100){
            bar2.setValue(count);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count+=1;
        }
        bar2.setString(" 100 % ");
    }
    public void pull2(){
        int count=0;
        while(count<=66){
            bar3.setValue(count);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count+=1;
        }
        bar3.setString(" 66 % ");
    }
     public void pull3(){
        int count=0;
        while(count<=55){
            bar4.setValue(count);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count+=1;
        }
        bar4.setString(" 55 % ");
    }
    public void pull4(){
        int count=0;
        while(count<=83){
            bar5.setValue(count);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count+=1;
        }
        bar5.setString(" 83 % ");
    }
    public void pull5(){
        int count=0;
        while(count<=90){
            bar6.setValue(count);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count+=1;
        }
        bar6.setString(" 90 % ");
    }
   
}
