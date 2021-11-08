import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameEx3 extends JFrame {
    
    public JFrameEx3(){
        super();
        this.setTitle("CS2113 GUI Example #3");
        this.setSize(600,600);
        this.setLocation(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Take a pill");
        JButton redPill = new JButton("Red Pill");
        JButton bluePill = new JButton("Blue Pill");        
        redPill.addActionListener((e) -> {label.setText("Follow the white rabbit");});
        bluePill.addActionListener((e) -> {label.setText("Go home to your boring life");});
        
       /*
        redPill.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Follow the white rabbit");
                
            }
        });
        

        bluePill.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Go home to your boring life");
                
            }

        });
        */

        this.add(label, BorderLayout.CENTER);
        this.add(redPill, BorderLayout.EAST);
        this.add(bluePill, BorderLayout.WEST);
    }

    public static void main(String args[]) {
        (new JFrameEx3()).setVisible(true);
    }
}
