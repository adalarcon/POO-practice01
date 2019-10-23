
package PaqueteExposicion;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//hola
//Como estas?
//esto parece una org*a de codigo :(

public class ElBotonaso extends JFrame {
    JPanel panel;
    public ElBotonaso(){
        setSize(500,500);
        setTitle("EL titulo perron que le vas a poner a tu ventana, Esteban hizo esto y yo lo modifique");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes(){
        colocarPaneles1();
        colocarBoton();
    }
    private void colocarPaneles1(){
        this.panel=new JPanel();
        this.panel.setLayout(null);
        this.getContentPane().add(this.panel);
    }
    private void colocarBoton(){

       JButton botonazo=new JButton("Entrar");
       botonazo.setText("Cambio"); //metodo setter del texto del boton
       //botonazo.setEnabled(false); //Habilitar y/o deshabilitar las funciones del boton
       botonazo.setBounds(100, 100, 100, 40);//Los primeros 2 parametros son la posicion en "x" y "y" y los otros dos son el largo y ancho del boton



       panel.add(botonazo);
    }
}
