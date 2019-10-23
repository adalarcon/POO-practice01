
package layoutypanel;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class EjemploGridLayout extends JFrame{
    public JFrame f1;  
public EjemploGridLayout(){  
    f1=new JFrame();  
    JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  
    JButton b6=new JButton("6");  
    JButton b7=new JButton("7");  
    JButton b8=new JButton("8");  
    JButton b9=new JButton("9");  
          
    f1.add(b7);f1.add(b2);f1.add(b3);f1.add(b4);f1.add(b5);  
    f1.add(b6);f1.add(b1);f1.add(b8);//f1.add(b9);  
  
    f1.setLayout(new GridLayout(4,5));  
    //f1.setLayout(new GridLayout(2,6));  
    //setting grid layout of 3 rows and 3 columns  
  
    f1.setSize(300,300);  
     f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
     //https://www.javatpoint.com/GridLayout
}
}
