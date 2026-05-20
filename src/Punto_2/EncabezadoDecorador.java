package src.Punto_2;

import src.Punto_1.Reporte;

public class EncabezadoDecorador extends ReporteDecorador {

    public EncabezadoDecorador(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String mostrarContenido() {
        return reporte.mostrarContenido() + " encabezado";
    }
}