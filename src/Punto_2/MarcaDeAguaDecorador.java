package src.Punto_2;

import src.Punto_1.Reporte;

public class MarcaDeAguaDecorador extends ReporteDecorador {

    public MarcaDeAguaDecorador(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String mostrarContenido() {
        return reporte.mostrarContenido() + " marca de agua";
    }
}