import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class EditFrame implements ActionListener {
    JButton button;
    JLabel label;
    EditFrame(){
        button = new JButton("Enter");
        button.addActionListener(this);
        button.setFocusable(false);

        label = new JLabel();
        label.setText("Hi i am Khaqan.... :) ");
        label.setFont(new Font("MV BOLI", Font.BOLD, 28));
        label.setForeground(Color.black);
        label.setBackground(Color.white);
        label.setOpaque(true);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Select Color", Color.black);
            label.setForeground(color);
        }
    }
    
    
}
