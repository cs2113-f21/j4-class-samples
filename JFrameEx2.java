import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameEx2 extends JFrame{

    public JFrameEx2(){
        super();
        this.setTitle("CS2113 GUI Example #2");
        this.setSize(600,600);
        this.setLocation(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton cButton = new JButton("center");
        JButton nwButton = new JButton("nwest");
        JButton neButton = new JButton("neast");
        JButton sButton = new JButton("south");
        JButton eButton = new JButton("east");
        JButton wButton = new JButton("west");
        this.add(cButton, BorderLayout.CENTER);

        JPanel nPanel = new JPanel();
        nPanel.setLayout(new BorderLayout());

        nPanel.add(nwButton, BorderLayout.WEST);
        nPanel.add(neButton, BorderLayout.EAST);

        this.add(nPanel, BorderLayout.NORTH);
        this.add(sButton, BorderLayout.SOUTH);
        this.add(eButton, BorderLayout.EAST);
        this.add(wButton, BorderLayout.WEST);
        this.pack();
    }

    public static void main(String args[]){
        (new JFrameEx2()).setVisible(true);
    }
    
}
