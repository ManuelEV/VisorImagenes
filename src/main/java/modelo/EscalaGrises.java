package modelo;

import java.awt.Color;

public class EscalaGrises implements Filtro {

    @Override
    public Imagen aplicarFiltro(Imagen imagen) {
        Color colores [][] = new Color [imagen.getAncho()][imagen.getAlto()];
        imagen.getBitMap();
        for (int i = 0; i < imagen.getAncho() ; i++) {
            for (int j = 0; j < imagen.getAlto(); j++) {
                Color pixelColor = new Color(imagen.getBitMap()[i][j].getRGB());
                
                int red = pixelColor.getRed();
                int blue = pixelColor.getBlue();
                int green= pixelColor.getGreen();
                
                int mediaRGB = (red + blue + green)/3;
                
                int mediaRGBInteger = (mediaRGB << 16) | (mediaRGB << 8) | mediaRGB;
                
                Color color = new Color(mediaRGBInteger);
                colores[i][j]=color;
            }
        }
        imagen.setBitMap(colores);
        return imagen;
    }
}