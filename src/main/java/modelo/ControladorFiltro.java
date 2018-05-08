package modelo;

public class ControladorFiltro {

    public static void ejecutarFiltro(Filtro f, Imagen im) {
        f.aplicarFiltro(im);
    }
}
