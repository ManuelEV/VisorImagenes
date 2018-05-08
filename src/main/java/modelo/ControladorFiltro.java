package modelo;

public class ControladorFiltro {

    public void ejecutarFiltro(Filtro f, Imagen im) {
        f.aplicarFiltro(im);
    }
}
