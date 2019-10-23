
package layoutypanel;
import layoutypanel.*;
import java.util.Scanner;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MaindeMain {
    public static void main(String[] args) {
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
        
        Scanner entrada=new Scanner(System.in);
        int opc;
        System.out.println("1) Panel");
        System.out.println("2) BorderLayout");
        System.out.println("3) GridLayout");
        System.out.println("4) FlowLayout");
        System.out.println("5) BoxLayout");
        System.out.println("6) CardLayout");
        System.out.println("7) GridBag Layout");
        System.out.println("8) GroupLayout");
        System.out.println("9) SpringLayout");
        System.out.println("10) ScrollPaneLayout");
        System.out.println("Que quieres hacer?: ");
        opc=entrada.nextInt();
        switch(opc){
            case 1:
                ejemploPanel.setVisible(true);
                break;
            case 2:
               eje1.f.setVisible(true);
                break;
            case 3:
                eje2.f1.setVisible(true);
                break;
            case 4:
                eje3.f3.setVisible(true);
                break;
            case 5:
                eje4.f4.setVisible(true);
                break;
            case 6:
                eje5.setSize(400,400);  
                eje5.setVisible(true);  
                eje5.setDefaultCloseOperation(EXIT_ON_CLOSE);  
                break;
            case 7:
                eje6.setVisible(true);
                break;
            case 8:
                //eje7.show();
                break;
            case 9:
                eje8.run();
                break;
            case 10:
                eje9.setVisible(true);
                break;
        }
        
    }
}
