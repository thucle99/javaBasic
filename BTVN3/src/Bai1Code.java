
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javafx.scene.control.Slider;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.MouseInputListener;


public class Bai1Code extends JFrame{
    private JSlider sl;
    private JLabel lb;
    public Bai1Code(){
        setTitle("Phong To");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());//chus ys
        
        lb=new JLabel("Java is cool");
        lb.setForeground(Color.blue);
        lb.setPreferredSize(new Dimension(400,150));
     //   lb.setBounds(0, 100, 0, 400);
        add(lb,BorderLayout.NORTH);
        
        sl=new JSlider();
        sl.setMajorTickSpacing(10);
        sl.setMaximum(100);
        sl.setMinimum(10);
        sl.setMinorTickSpacing(5);
        sl.setPreferredSize(new Dimension(400,200));
        sl.setPaintLabels(true);
        sl.setPaintTicks(true);
        sl.setPaintTrack(true);
        add(sl,BorderLayout.SOUTH);
        sl.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int vl=sl.getValue();
                Font f=lb.getFont();
                lb.setFont(new Font(f.getFontName(), f.getStyle(), vl));
            }

            @Override
            public void mousePressed(MouseEvent e) {
           
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
            
        });
           sl.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int vl=sl.getValue();
                Font f=sl.getFont();
                lb.setFont(new Font(f.getFontName(),f.getStyle(), vl));
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                
            }
        });
    }
    public static void main(String[] args) {
        Bai1Code t=new Bai1Code();
        t.setVisible(true);
    }
}
