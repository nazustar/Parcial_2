package src.Punto_1;

public class ReporteHTML extends Reporte {

    @Override
    public String generarContenido(String contenido) {
        this.contenido = contenido;
        return this.contenido;
    }

    @Override
    public String mostrarContenido() {
        return "Reporte HTML: " + contenido;
    }
}