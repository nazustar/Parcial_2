package src.Punto_1;

public class ReportePDF extends Reporte {

    @Override
    public String generarContenido(String contenido) {
        this.contenido = contenido;
        return this.contenido;
    }

    @Override
    public String mostrarContenido() {
        return "Reporte PDF: " + contenido;
    }
}