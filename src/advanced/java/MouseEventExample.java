package advanced.java;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class MouseEventExample extends MouseAdapter{
    JFrame frame;
    public MouseEventExample(){
        frame = new JFrame("Click your mouse...");
        frame.addMouseListener(this);
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        JOptionPane.showMessageDialog(null,"Mouse Clicked...");
    }
    public void mousePressed(MouseEvent e){
        Graphics g = frame.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),30,30);
    }
    public void mouseReleased(MouseEvent e){
        JOptionPane.showMessageDialog(null, "Mouse Released...");
    }
    public static void main(String [] args){
        MouseEventExample me = new MouseEventExample();
    }
}
