package vista;

import java.awt.GridLayout;
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

    private void initComps() {
        this.btnBinarizacion = new JButton("Binarizacion");
        this.btnEscalaGrises = new JButton("Escala de Grises");
        this.btnFlipVertical = new JButton("Flip Vertical");
        this.btnNegativo = new JButton("Negativo");
        this.btnReset = new JButton("Reset");
        
        this.setLayout(new GridLayout(3, 2));
        
        /*
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 2;

        this.add(btnNegativo, c);
        c.gridx=2;
        this.add(btnEscalaGrises, c);
        c.gridx=0;
        c.gridy=1;
        this.add(btnBinarizacion, c);
        c.gridx=2;
        this.add(btnFlipVertical, c);
        c.gridx=0;
        c.gridy=2;
        this.add(btnReset, c);
        c.gridx=2;
        */
        
        this.add(btnNegativo);
        this.add(btnEscalaGrises);
        this.add(btnBinarizacion);
        this.add(btnFlipVertical);
        this.add(btnReset);
    }
}
