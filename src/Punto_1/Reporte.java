package src.Punto_1;

public abstract class Reporte {

    protected String contenido;

    public abstract String generarContenido(String contenido);

    public abstract String mostrarContenido();

    public String getContenido() {
        return contenido;
    }
}