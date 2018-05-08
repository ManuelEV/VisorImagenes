package modelo;

import java.awt.Color;

public class EscalaGrises implements Filtro {

    @Override
    public Imagen aplicarFiltro(Imagen imagen) {
        imagen.getBitMap();
        for (int i = 0; i < imagen.getBitMap().length ; i++) {
            for (int j = 0; j < imagen.getBitMap()[i].length; j++) {
                Color pixelColor = new Color(imagen.getBitMap()[i][j].getRGB());
                
                int red = pixelColor.getRed();
                int blue = pixelColor.getBlue();
                int green= pixelColor.getGreen();
                
                int mediaRGB = (red + blue + green)/3;
                
                int mediaRGBInteger = (mediaRGB << 16) | (mediaRGB << 8) | mediaRGB;
                
                //imagen.getBitMap()[i][j].setBitMap()[]
            }
        }
    }
}