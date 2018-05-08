package modelo;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Binarizacion implements Filtro {

       @Override
    public Imagen aplicarFiltro(Imagen imagen) {
        Color[][] img=imagen.getBitMap();
        int alto=imagen.getAlto();
        int ancho=imagen.getAncho();
        
        String umbral=JOptionPane.showInputDialog("Ingrese umbral entre 0-255");
        double umbralD=Double.parseDouble(umbral);
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                Color pix= img[i][j];
                int promedio =((pix.getBlue()*(11/100))+(pix.getRed()*(3/10))+(pix.getGreen()*(59/100)));
                if (promedio<umbralD) 
                    img[i][j]=Color.BLACK;
                else
                    img[i][j] = Color.WHITE;
            }
        }
        imagen.setBitMap(img);
        return imagen;
    }
    
}