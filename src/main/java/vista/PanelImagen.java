package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Imagen;
//dev

public class PanelImagen extends JPanel {

    private Imagen img;
    private ImageIcon imgIcon;

    public PanelImagen(Imagen imagen) {
        this.img = imagen;
        this.inicializarComponentes();
    }

    public Imagen getImg() {
        return img;
    }

    private void inicializarComponentes() {
        imgIcon = new ImageIcon(img.obtenerImagen());
        JLabel etiqueta = new JLabel(imgIcon);
        this.add(etiqueta);
    }
}
