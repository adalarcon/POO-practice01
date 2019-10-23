
package layoutypanel;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EjemploFlowLayout extends JFrame{
    public JFrame f3;  
    public EjemploFlowLayout(){  
    f3=new JFrame();  
      
    JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  
              
    f3.add(b1);f3.add(b2);f3.add(b3);f3.add(b4);f3.add(b5);  
      
    f3.setLayout(new FlowLayout(FlowLayout.RIGHT));  
    //setting flow layout of right alignment  
  
    f3.setSize(300,300);  
    f3.setDefaultCloseOperation(EXIT_ON_CLOSE);
    //https://www.javatpoint.com/FlowLayout
    
}  
}
