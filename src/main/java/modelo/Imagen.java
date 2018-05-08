package modelo;

import java.awt.Color;

public class Imagen {
    
    private Color[][] bitMap;
    private int alto;
    private int ancho;
    private String ruta;

    public Imagen(String ruta) {
        this.ruta = ruta;
    }
    
    public Imagen(Color[][] matriz){
        this.bitMap = matriz;
    }
    
    private void cargarImagen(){
    
    }

    public Color[][] getBitMap() {
        return bitMap;
    }
    
    
    
}