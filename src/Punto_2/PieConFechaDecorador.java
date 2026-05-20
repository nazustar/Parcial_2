package src.Punto_2;

import src.Punto_1.Reporte;

public class PieConFechaDecorador extends ReporteDecorador {

    public PieConFechaDecorador(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String mostrarContenido() {
        return reporte.mostrarContenido() + " pie de pagina con fecha";
    }
}