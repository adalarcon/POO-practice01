
package PaqueteExposicion;


import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class Tablas extends JFrame{
    JPanel panel1;
    public Tablas(){
        setSize(500,500);
        //Cambie el titulo 
        setTitle("EL titulo mas perron del mundo para una tabla");
        setLocationRelativeTo(null);
        iniciarComponentes1();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes1(){
        colocarPaneles1();
        colocarTablas();
    }
    private void colocarPaneles1(){
        
        this.panel1=new JPanel();
        this.panel1.setLayout(null);
        this.getContentPane().add(this.panel1);
    }
    private void colocarTablas(){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NOMBRE");
        modelo.addColumn("EDAD");
        modelo.addColumn("NACIONALIDAD");
        String [] persona1={"Alejandro","21","Peruano"};
        String [] persona2={"Alejandro","21","Peruano"};
        String [] persona3={"Alejandro","21","Peruano"};
        String [] persona4={"Alejandro","21","Peruano"};
        String [] persona5={"Alejandro","21","Peruano"};
        String [] persona6={"Alejandro","21","Peruano"};
        String [] persona7={"Alejandro","21","Peruano"};
        String [] persona8={"Alejandro","21","Peruano"};
        String [] persona9={"Alejandro","21","Peruano"};
        String [] persona10={"Alejandro","21","Peruano"};
        String [] persona11={"Alejandro","21","Peruano"};
        String [] persona12={"Alejandro","21","Peruano"};
        modelo.addRow(persona1);
        modelo.addRow(persona2);
        modelo.addRow(persona3);
        modelo.addRow(persona4);
        modelo.addRow(persona5);
        modelo.addRow(persona6);
        modelo.addRow(persona7);
        modelo.addRow(persona8);
        modelo.addRow(persona9);
        modelo.addRow(persona10);
        modelo.addRow(persona11);
        modelo.addRow(persona12);
        
        
        JTable tabla=new JTable(modelo);
        tabla.setBounds(20, 20, 200, 200);
        panel1.add(tabla);
        //NEcesitamos agregar un scroll ya que sin el, no nos muestra completa la tabla
        JScrollPane scroll=new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 400, 200);
        panel1.add(scroll);
    }
}
