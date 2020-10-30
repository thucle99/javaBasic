
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Bai2code extends JFrame{
    private JMenuBar mn1;
    private JMenuItem mi1;
    public Bai2code(){
        setTitle("Bang Menu");
        setSize(400,400);
       // setVisible(true);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mn1);
    }
    public static void main(String[] args) {
        Bai2code b=new Bai2code();
        b.setVisible(true);
    }
}
