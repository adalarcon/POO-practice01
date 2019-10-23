
package PaqueteExposicion;

//Buenos días muchachos

import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaLabel extends JFrame{
    public VentanaLabel() {
        setSize(600,600);
        setTitle("EL titulo perron que le vas a poner a tu ventana");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes(){
        JPanel panel=new JPanel();//Creamos un panel, es donde iran TODOS nuestros agregados
        //panel.setLayout(null);//Ya que el panel y la ventana son contenedores, para poner la etiqueta tenemos que desactivar sus layout que vienen por defecto
        this.getContentPane().add(panel);//Aqui agregamos el panel a la ventana, con el "this." nos referimos a la ventana creada en esta clase
        //panel.setBackground(Color.yellow);//Cambiamos el color de nuestro panel
        JLabel etiqueta=new JLabel("HOLA");
        //etiqueta.setText("Ju3ju3");
        //etiqueta.setBounds(10, 10, 200, 200);//Este metodo setter nos ayuda a colocar la etiqueta donde quieras
        panel.add(etiqueta);
    }

}
