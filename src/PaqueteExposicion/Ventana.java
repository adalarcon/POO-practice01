
package PaqueteExposicion;
import javax.swing.JFrame;

public class Ventana extends JFrame {

    public Ventana() {//Al introducir el constructor, nuestra ventana ya a sido creada gracias a que se heredo de la clase JFrame
        
        setSize(300,500);//Seteamos el tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Hacemos que el boton de cerrar ventana termine el programa, ya que es la ventana principal
    }
    
}
