package modelo;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Binarizacion implements Filtro {

    public Binarizacion(){}
    
       @Override
    public Imagen aplicarFiltro(Imagen imagen) {
        Color[][] img=imagen.getBitMap();
        int alto=imagen.getAlto();
        int ancho=imagen.getAncho();
       
    //Solicitar Umbral mediante JOptionPane
        String umbral=JOptionPane.showInputDialog("Ingrese umbral entre 0-255"); 
        double umbralD=Double.parseDouble(umbral);
        
        
    //Modificar matriz de Color local    
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
    //Modificar matriz de Color de imagen
        imagen.setBitMap(img);
    //Retorna imagen modificada
        return imagen;
    }
    
}