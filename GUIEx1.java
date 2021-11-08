import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIEx1{
    
    static class MyJFrame extends JFrame{
        private int id;
        public MyJFrame(int id){
            super();
            this.id=id;            
            this.setTitle("CS2113 GUI Example #"+id);
            this.setSize(300,400);
            this.setLocation(100 + 10 * id,100 + 10 * id);
        }

        public int getId(){return id;}
    }

    static class MyWindowListener extends WindowAdapter{
        //implements WindowListener{

        int num_windows;
        public MyWindowListener(int num_windows){
            this.num_windows = num_windows;}

        @Override
        public void windowClosing(WindowEvent e) {
            MyJFrame f = (MyJFrame) e.getWindow();

            System.out.println("Window Closing: "+ f.getId());
            num_windows--;
            if(num_windows == 0) System.exit(0);
        }
    }
    public static void main(String args[]){
        JFrame f[] = new JFrame[3];
        MyWindowListener wl = new MyWindowListener(3);
        for(int i =0;i<3;i++){
            f[i] = new MyJFrame(i);
            f[i].addWindowListener(wl);
            f[i].setVisible(true);
        }
     }
}
