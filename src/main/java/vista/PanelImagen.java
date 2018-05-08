package vista;

import java.awt.Color;
import java.awt.Image;
import javax.swing.JPanel;
import modelo.Imagen;
//dev
public class PanelImagen extends JPanel {

    private Imagen img;
    
    public PanelImagen(Imagen im) {
        this.img = im;
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        this.setBackground(Color.BLUE);
    }
}