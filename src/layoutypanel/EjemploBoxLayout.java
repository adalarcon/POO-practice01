
package layoutypanel;

import java.awt.Button;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class EjemploBoxLayout extends JFrame {
 public JFrame f4=new JFrame();
 JPanel panel=new JPanel();
 Button buttons[];  
  
 public EjemploBoxLayout () {  
   buttons = new Button [5];  
    
   for (int i = 0;i<5;i++) {  
      buttons[i] = new Button ("Button " + (i + 1));  
      panel.add (buttons[i]);  
    }  
  f4.setSize(100, 200);
setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));  
setSize(500,400);  
 f4.add(panel);
 f4.setDefaultCloseOperation(EXIT_ON_CLOSE);
 //https://www.javatpoint.com/BoxLayout
}  
}
