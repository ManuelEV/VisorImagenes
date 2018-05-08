package vista;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class PanelSuperior extends JMenuBar {
    private JMenu menuArchivo;
    private JMenu menuEditar;
    private JMenu menuVista;
    private JMenu menuHerramientas;
    private JMenu menuAyuda;
    
    public PanelSuperior() {
        this.inicializarComponenetes();
    }

    private void inicializarComponenetes() {
        this.menuArchivo = new JMenu("Archivo");
        this.menuAyuda = new JMenu("Ayuda");
        this.menuEditar = new JMenu("Editar");
        this.menuHerramientas = new JMenu("Herramientas");
        this.menuVista = new JMenu("Vista");
        
        this.add(this.menuArchivo);
        this.add(this.menuEditar);
        this.add(this.menuVista);
        this.add(this.menuHerramientas);
        this.add(this.menuAyuda);
    }
}