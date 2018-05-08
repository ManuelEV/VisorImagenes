package modelo;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class FlipVertical implements Filtro {

    @Override
    public Imagen aplicarFiltro(Imagen imagen) {
       Color[][] c=imagen.getBitMap();    
        int rows = c.length;
        int cols = c[0].length;
        Color[][] c1= new Color[rows][cols];
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                c1[rows - 1 - i][cols - 1 - j] = c[i][j];
            }
        }
        imagen.setBitMap(c1);
        return imagen;
    }
}
