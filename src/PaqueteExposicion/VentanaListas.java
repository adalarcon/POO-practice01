
package PaqueteExposicion;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class VentanaListas extends JFrame{
    JPanel panel1;
    public VentanaListas(){
        setSize(500,500);
        setTitle("EL titulo perron que le vas a poner a tu ventana");
        setLocationRelativeTo(null);//Esto hace que nuestra ventana aparezca en medio de nuestra pantalla
        iniciarComponentes1();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes1(){
        colocarPaneles1();
        colocarListas();
    }
    
    private void colocarPaneles1(){
        
        this.panel1=new JPanel();
        this.panel1.setLayout(null);
        this.getContentPane().add(this.panel1);
    }
    private void colocarListas(){
        //Para crear una lista, pirmero tienes que poner el tipo de lista que es y luego al crear la lista, meter el modelo al constructor
        DefaultListModel modelo=new DefaultListModel();//Ya que ListModel es una interfaz, utilizamos su clase DefaultListModel para poder instanciar
        modelo.addElement("Hola 1");
        modelo.addElement("Hola 2");
        modelo.addElement("Hola 3");
        JList lista=new JList(modelo);
        
        lista.setBounds(20, 20, 200, 200);//posicion en x,y,largo en pixeles y ancho en pixeles
        this.panel1.add(lista);//Agregamos la lista al panel
    }
    
}
