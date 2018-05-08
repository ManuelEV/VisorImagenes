package modelo;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Imagen {

    private Color[][] bitMap;
    private int alto;
    private int ancho;
    private String ruta;

    public Imagen(String ruta) {
        this.ruta = ruta;
        this.cargarImagen();
    }

    public Imagen(Color[][] matriz) {
        this.bitMap = matriz;
    }

    private void cargarImagen() {
        try {
            BufferedImage img = ImageIO.read(new File(this.ruta));

            this.alto = img.getHeight();
            this.ancho = img.getWidth();

            this.bitMap = new Color[ancho][alto];

            for (int i = 0; i < ancho; i++) {
                for (int j = 0; j < alto; j++) {
                    this.bitMap[i][j] = new Color(img.getRGB(i, j));
                    
                    //probando
                    System.out.println("");
                    System.out.println("Red:"+bitMap[i][j].getRed());
                    System.out.println("Green:"+bitMap[i][j].getGreen());
                    System.out.println("Blue:"+bitMap[i][j].getBlue());
                    System.out.println("");
                    //////////
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public Color[][] getBitMap() {
        return this.bitMap;
    }

    
    
}
