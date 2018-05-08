package modelo;

import java.awt.Color;

public class Negativo implements Filtro {
    
    @Override
    public Imagen aplicarFiltro(Imagen imagen) {
        
        Color[][]img = imagen.getBitMap();
        
        for(int i=0;i<imagen.getAncho();i++){
            
          for(int j=0;j<imagen.getAlto();j++){

                Color colorAntiguo = img[i][j];

                int r = Math.abs(colorAntiguo.getRed() - 255);
                int g = Math.abs(colorAntiguo.getGreen() - 255);
                int b = Math.abs( colorAntiguo.getBlue() - 255);
                
                img[i][j]= new Color(r,g,b);              
                imagen.setBitMap(img);
                
            }
        }      
        
        return imagen;
    }
}
