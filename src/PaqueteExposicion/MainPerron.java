
package PaqueteExposicion;

import java.util.Scanner;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import layoutypanel.*;

public class MainPerron {
    public static void main(String[] args) {
        Ventana v1=new Ventana();
        VentanaLabel v2=new VentanaLabel();
        VentanaListas v3=new VentanaListas();
        Tablas tabla=new Tablas();
        ElBotonaso boton =new ElBotonaso();
        VentanasComboBox ejerComboBox=new VentanasComboBox();
        Panel ejemploPanel=new Panel();
        EjemploBorderLayout eje1=new EjemploBorderLayout();
        EjemploGridLayout eje2=new EjemploGridLayout();
        EjemploFlowLayout eje3=new EjemploFlowLayout();
        EjemploBoxLayout eje4=new EjemploBoxLayout();
        EjemploCardLayout eje5=new EjemploCardLayout();
        EjemploGridBagLayout eje6=new EjemploGridBagLayout();
        EjemploGroupLayout eje7=new EjemploGroupLayout();
        EjemploSpringLayout eje8=new EjemploSpringLayout();
        EjemploScrollPaneLayout eje9=new EjemploScrollPaneLayout();
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
        System.out.println("10) Panel");
        System.out.println("11) BorderLayout");
        System.out.println("12) GridLayout");
        System.out.println("13) FlowLayout");
        System.out.println("14) BoxLayout");
        System.out.println("15) CardLayout");
        System.out.println("16) GridBag Layout");
        System.out.println("17) GroupLayout");
        System.out.println("18) SpringLayout");
        System.out.println("20) ScrollPaneLayout");
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
            case 10:
                ejemploPanel.setVisible(true);
                break;
            case 11:
               eje1.f.setVisible(true);
                break;
            case 12:
                eje2.f1.setVisible(true);
                break;
            case 13:
                eje3.f3.setVisible(true);
                break;
            case 14:
                eje4.f4.setVisible(true);
                break;
            case 15:
                eje5.setSize(400,400);  
                eje5.setVisible(true);  
                eje5.setDefaultCloseOperation(EXIT_ON_CLOSE);  
                break;
            case 16:
                eje6.setVisible(true);
                break;
            case 17:
                //eje7.show();
                break;
            case 18:
                eje8.run();
                break;
            case 19:
                eje9.setVisible(true);
                break;
            default:
                System.out.println("Numero no reconocido");
        }
    }
    //minecra es vida, chiquitas
}


//WOOOW