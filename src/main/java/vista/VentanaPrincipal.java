package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;

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
        this.panelImagen = new PanelImagen();

        this.add(this.panelSuperior, BorderLayout.NORTH);
        this.add(this.panelImagen, BorderLayout.WEST);
        this.add(this.panelBotones, BorderLayout.EAST);

        this.setTitle("Editor Imagenes V1");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.panelBotones.btnBinarizacion) {

        }
    }
}
