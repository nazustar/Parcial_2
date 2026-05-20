package src.Punto_2;

import src.Punto_1.Reporte;

public abstract class ReporteDecorador extends Reporte {

    protected Reporte reporte;

    public ReporteDecorador(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public String generarContenido(String contenido) {
        return reporte.generarContenido(contenido);
    }

    @Override
    public String mostrarContenido() {
        return reporte.mostrarContenido();
    }
}