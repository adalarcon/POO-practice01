
package PaqueteExposicion;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;


public class VentanasComboBox extends JFrame{
    JPanel panel2;
    public VentanasComboBox(){
        setSize(500,500);
        setTitle("EL titulo perron que le vas a poner a tu ventana");
        setLocationRelativeTo(null);
        iniciarComponentes2();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes2(){
        colocarPaneles1();
        colocarComboBox();
    }
    private void colocarPaneles1(){
        this.panel2=new JPanel();
        this.panel2.setLayout(null);
        this.getContentPane().add(this.panel2);
    }
    private void colocarComboBox(){
       String [] equiposDeFut={"Bokita el mas grande","El America","Bokita otra vez papá"};
       JComboBox listaDesplegable=new JComboBox(equiposDeFut);//Aqui en el constructor le estamos mandando objetos, en este caso de tipo String
       listaDesplegable.setBounds(20, 20, 200, 100);
       panel2.add(listaDesplegable);
    }
}
