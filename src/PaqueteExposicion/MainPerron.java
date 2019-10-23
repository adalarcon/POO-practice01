
package PaqueteExposicion;

import java.util.Scanner;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class MainPerron {
    public static void main(String[] args) {
        Ventana v1=new Ventana();
        VentanaLabel v2=new VentanaLabel();
        VentanaListas v3=new VentanaListas();
        Tablas tabla=new Tablas();
        ElBotonaso boton =new ElBotonaso();
        VentanasComboBox ejerComboBox=new VentanasComboBox();

        //ey que pedo cachorros como estan

        Scanner entrada=new Scanner(System.in);
        int opc;
        System.out.println("1) iniciar un Frame");
        System.out.println("2) mostrar un Dialog");
        System.out.println("3) Mostrar Applet(o no :0)");
        System.out.println("4) Mostrar un Label");
        System.out.println("5) lista");
        System.out.println("6) tabla");
        System.out.println("7) ComboBox");
        System.out.println("8) slider");
        System.out.println("9) Buton");
        System.out.println("Que quieres hacer?: ");
        opc=entrada.nextInt();
        switch(opc){
            case 1:
                v1.setVisible(true);
                break;
            case 2:
                JOptionPane.showConfirmDialog(v1, "El problema o lo que le querramos decir al usuario","el titulo ps que mas",JOptionPane.YES_NO_CANCEL_OPTION);
                break;
            case 3:
                System.out.println("HTML");
               break;
            case 4:
                v2.setVisible(true);
                break;
            case 5:
                v3.setVisible(true);
                break;
            case 6:
                tabla.setVisible(true);
                break;
            case 7:
                ejerComboBox.setVisible(true);
                break;
            case 8:
                JPanel panel3;
                JFrame f;
                JSlider b;
                f = new JFrame("frame");
                JPanel p = new JPanel();
                b = new JSlider();
                p.add(b);
                f.add(p);
                f.setSize(300, 300);
                f.setVisible(true);
                break;
            case 9:
                boton.setVisible(true);
                break;
        }
    }
    //minecra es vida, chiquitas
}


//WOOOW
