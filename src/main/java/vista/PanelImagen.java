package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Imagen;
//dev

public class PanelImagen extends JPanel {

    private Imagen img;
    private JLabel etiqueta;

    public PanelImagen(Imagen imagen) {
        this.img = imagen;
        this.inicializarComponentes();
    }

    public Imagen getImg() {
        return img;
    }

    private void inicializarComponentes() {
        ImageIcon imgIcon = new ImageIcon(img.obtenerImagen());
        etiqueta = new JLabel(imgIcon);
        this.add(etiqueta);
    }
    
    public void actualizar(){
        this.repaint();
        this.etiqueta.setIcon(new ImageIcon(img.obtenerImagen()));
    }
    
    public void resetImagen(){
        this.img= new Imagen(this.img.getRuta());
    }
}
