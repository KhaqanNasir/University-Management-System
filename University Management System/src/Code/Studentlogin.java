import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Studentlogin extends studentlogincode implements ActionListener {
    JFrame loginframe; 
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JTextField textfield1;
    JPasswordField passfield1;
    JButton button1;
    JButton button2;
    ImageIcon image1 = new ImageIcon("src/Frame_Logo.png");

    Studentlogin(){
        label1 = new JLabel("Student Login Portal");
        label1.setBounds(175, 10, 350, 70);
        label1.setFont(new Font("Tahoma",Font.BOLD,30));
        label1.setForeground(Color.white);
        
        label2 = new JLabel("Reg no.");
        label2.setBounds(40, 110, 80, 40);
        label2.setFont(new Font("Tahoma", Font.BOLD,15  ));
        label2.setForeground(Color.white);

        label3 = new JLabel("Password");
        label3.setBounds(40, 160, 80, 40);
        label3.setFont(new Font("Tahoma", Font.BOLD,15  ));
        label3.setForeground(Color.white);

        textfield1 = new JTextField();
        textfield1.setBounds(150, 120, 200, 25);

        passfield1 = new JPasswordField();
        passfield1.setBounds(150,170,200,25);

        button1 = new JButton("Reset");
        button1.setBounds(150, 250, 80, 35);
        button1.setFocusable(false);
        button1.setFont(new Font("Tahoma", Font.BOLD, 15));
        button1.setBackground(new Color(48,54,60));
        button1.setForeground(Color.white);
        button1.addActionListener(this);

        button2 = new JButton("Login");
        button2.setBounds(265, 250, 85, 35);
        button2.setFont(new Font("Tahoma", Font.BOLD, 15));     
        button2.setFocusable(false);
        button2.setBackground(new Color(48,54,60));
        button2.setForeground(Color.white);
        button2.addActionListener(this);

        ImageIcon image2 = new ImageIcon("src/login.png");
        Image i1 = image2.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        label4 = new JLabel(i2);
        label4.setBounds(420, 100, 150, 150);

        loginframe = new JFrame("Khaqan Institue of Technology");
        loginframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginframe.setResizable(false);
        loginframe.getContentPane().setBackground(new Color(105,150,195));
        loginframe.setSize(650, 360);
        loginframe.setLayout(null);
        loginframe.setIconImage(image1.getImage());
        loginframe.add(label1);
        loginframe.add(label2);
        loginframe.add(label3);
        loginframe.add(label4);
        loginframe.add(textfield1);
        loginframe.add(passfield1);
        loginframe.add(button1);
        loginframe.add(button2);
        loginframe.setLocationRelativeTo(null);
        loginframe.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            textfield1.setText("");
            passfield1.setText("");

        }
        if (e.getSource() == button2) {
            String username = textfield1.getText();
            char[] passwordChars = passfield1.getPassword();
            String password = new String(passwordChars);
                if ("FA22-BCS-039".equals(username) && "1234".equals(password)) {
                    int x = JOptionPane.showConfirmDialog(null, "Successfully Login :) ", "Confirmation", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    if (x == 0) {
                        new StudentMain();
                        loginframe.setVisible(false);
                    } else if (x == -1) {
                        new Studentlogin();
                    } else {
                        System.out.println("Invalid Password");
                    }
                    return; 
                }
            }
            System.out.println("Not Found");
        }
    }
        
    
