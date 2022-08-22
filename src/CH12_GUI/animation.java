package CH12_GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class animation {
    JFrame frame;
    int x=70,y=70;

    public static void main(String[] args){

        animation ani = new animation();
        ani.go();

    }
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel panel = new MyDrawPanel();

        frame.getContentPane().add(panel);
        frame.setSize(400,300);
        frame.setVisible(true);
        for (int i=0;i<130;i++){

            x++;y++;
            panel.repaint();
            try{
                Thread.sleep(50);
            }catch(Exception ex){

            }
        }

    }

    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());
            g.setColor(Color.orange);
            g.fillOval(x,y,40,40);

        }
    }
}
