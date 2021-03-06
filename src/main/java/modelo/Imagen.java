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
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public BufferedImage obtenerImagen() {
        
        BufferedImage imagen = new BufferedImage(bitMap.length, bitMap[0].length,
                BufferedImage.TYPE_INT_RGB);
        
        for (int i = 0; i < bitMap.length; i++) {
            for (int j = 0; j < bitMap[i].length; j++) {
                imagen.setRGB(i, j, bitMap[i][j].getRGB());
            }
        }
        
        return imagen;
    }

    public Color[][] getBitMap() {
        return this.bitMap;
    }

    public void setBitMap(Color[][] c) {
        this.bitMap = c;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

}
