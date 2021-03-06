package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;

import modelo.*;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private PanelBotones panelBotones;
    private PanelImagen panelImagen;
    private PanelSuperior panelSuperior;

    public VentanaPrincipal() {
        this.inicializarComponente();
    }

    private void inicializarComponente() {
        this.panelSuperior = new PanelSuperior();
        this.panelBotones = new PanelBotones();
        Imagen img = new Imagen("data/imagen.bmp");
        this.panelImagen = new PanelImagen(img);

        this.add(this.panelSuperior, BorderLayout.NORTH);
        this.add(this.panelImagen, BorderLayout.WEST);
        this.add(this.panelBotones, BorderLayout.EAST);
        
        this.panelBotones.btnBinarizacion.addActionListener(this);
        this.panelBotones.btnEscalaGrises.addActionListener(this);
        this.panelBotones.btnFlipVertical.addActionListener(this);
        this.panelBotones.btnNegativo.addActionListener(this);
        this.panelBotones.btnReset.addActionListener(this);
        
        this.setTitle("Editor Imagenes V1");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.panelBotones.btnReset) {
            this.panelImagen.resetImagen();
        }else if(e.getSource() == this.panelBotones.btnBinarizacion){
            ControladorFiltro.ejecutarFiltro(new Binarizacion(),this.panelImagen.getImg());
        }else if (e.getSource() == this.panelBotones.btnEscalaGrises){
            ControladorFiltro.ejecutarFiltro(new EscalaGrises(),this.panelImagen.getImg());
        }else if (e.getSource() == this.panelBotones.btnFlipVertical){
            ControladorFiltro.ejecutarFiltro(new FlipVertical(),this.panelImagen.getImg());
        }else if (e.getSource() == this.panelBotones.btnNegativo){
            ControladorFiltro.ejecutarFiltro(new Negativo(),this.panelImagen.getImg());
        }
        this.panelImagen.actualizar();
    }
}
