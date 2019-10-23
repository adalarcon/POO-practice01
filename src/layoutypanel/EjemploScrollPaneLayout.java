
package layoutypanel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class EjemploScrollPaneLayout extends JFrame {
    public EjemploScrollPaneLayout() {  
    super("ScrollPane Demo");  
    ImageIcon img = new ImageIcon("child.png");  
  
JScrollPane png = new JScrollPane(new JLabel(img));  
  
getContentPane().add(png);  
setSize(300,250);  
//setVisible(true);  
//https://www.javatpoint.com/java-scrollpanelayout
}  
}
