
package layoutypanel;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JFrame{

    public Panel() {
        setSize(600,600);
        setTitle("EL titulo perron que le vas a poner a tu ventana");
        setLocationRelativeTo(null);//centrar la ventana al medio de la pantalla
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes(){
        JPanel panel=new JPanel();//Creamos un panel, es donde iran TODOS nuestros agregados
        panel.setLayout(null);//Ya que el panel y la ventana son contenedores, para poner la etiqueta donde quieras tenemos que desactivar sus layout que vienen por defecto
        
        panel.setBounds(100,100,200,200);
        this.getContentPane().add(panel);//Aqui agregamos el panel a la ventana, con el "this." nos referimos a la ventana creada en esta clase
        panel.setBackground(Color.blue);//Cambiamos el color de nuestro panel
        JButton b1=new JButton("Button 1");     
        b1.setBounds(50,100,80,30);    
        b1.setBackground(Color.yellow);   
        JButton b2=new JButton("Button 2");
        b2.setBounds(150, 100, 80, 30);
       // b2.setBounds(100,100,80,30);  
        b2.setBackground(Color.green); 
        JButton b3=new JButton("Button 1");     
        //b3.setBounds(150,100,80,30);  
        b3.setBounds(200,100,80,30);
        b3.setBackground(Color.gray);
        panel.add(b1); panel.add(b2);   panel.add(b3);  
    }
}
