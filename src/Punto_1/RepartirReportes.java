package src.Punto_1;

public class RepartirReportes {

    private ReporteFactory reporteFactory;

    public RepartirReportes(ReporteFactory reporteFactory) {
        this.reporteFactory = reporteFactory;
    }

    public Reporte enviarReporte(String tipoReporte, String contenido) {
        Reporte reporte = reporteFactory.crearReporte(tipoReporte);
        reporte.generarContenido(contenido);
        return reporte;
    }
}