package vista;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel {

    public JButton btnNegativo;
    public JButton btnEscalaGrises;
    public JButton btnBinarizacion;
    public JButton btnFlipVertical;
    public JButton btnReset;

    public PanelBotones() {
        this.initComps();
    }
    
    private void initComps(){
        this.btnBinarizacion = new JButton("Binarizacion");
        this.btnEscalaGrises = new JButton("Escala de Grises");
        this.btnFlipVertical = new JButton("Flip Vertical");
        this.btnNegativo = new JButton("Negativo");
        this.btnReset = new JButton("Reset");
        
        this.setLayout(new GridLayout(3, 2));
        
        this.add(btnNegativo);
        this.add(btnEscalaGrises);
        this.add(btnBinarizacion);
        this.add(btnFlipVertical);        
        this.add(btnReset);
    }
}
