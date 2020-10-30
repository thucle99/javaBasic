
package n9_10;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
public class Form3 extends JFrame{
    JRadioButton gay,less,nam,nu;//
    ButtonGroup sex;
    public Form3(){
        setSize(400, 400);
        init();
        setLayout(null);
        gay.setBounds(0,100,100,50);
        less.setBounds(150,100,100,50);
        nam.setBounds(0,150,100,50);
        nu.setBounds(150,150,100,50);
        
        add(gay);
        add(less);
        add(nam);
        add(nu);
        sex.add(nu);
        sex.add(nam);
        sex.add(less);
        sex.add(gay);
       // add(sex);'
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public void init(){
        gay = new JRadioButton("gay");
        less = new JRadioButton("less");
        nam = new JRadioButton("nam");
        nu = new JRadioButton("nu");
        sex = new ButtonGroup();
        
    }

    private void add(ButtonGroup sex) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        new Form3();
    }
}
