package src.Punto_1;

public class ReporteFactory {
    public Reporte crearReporte(String tipo) {
        switch (tipo.toLowerCase()) {
            case "pdf":
                return new ReportePDF();
            case "excel":
                return new ReporteExcel();
            case "html":
                return new ReporteHTML();
            default:
                throw new IllegalArgumentException("Tipo de reporte invalido"+ tipo);
        }
    }
}