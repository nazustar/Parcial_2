package src;

import src.Punto_1.RepartirReportes;
import src.Punto_1.Reporte;
import src.Punto_1.ReporteFactory;
import src.Punto_2.EncabezadoDecorador;
import src.Punto_2.MarcaDeAguaDecorador;
import src.Punto_2.PieConFechaDecorador;
import src.Punto_3.ConfiguracionSistema;

public class Main {

    public static void main(String[] args) {

        // Punto 3
        ConfiguracionSistema config =
                ConfiguracionSistema.getInstancia("Carpeta de reportes","PDF",true
                );
        config.mostrarConfiguracion();

        // Punto 1
        ReporteFactory factory = new ReporteFactory();
        RepartirReportes repartidor = new RepartirReportes(factory);

        Reporte reportePDF   = repartidor.enviarReporte("pdf",   "Reporte financiero PDF");
        Reporte reporteExcel = repartidor.enviarReporte("excel", "Reporte financiero Excel");
        Reporte reporteHTML  = repartidor.enviarReporte("html",  "Reporte financiero HTML");

        System.out.println(reportePDF.mostrarContenido());
        System.out.println(reporteExcel.mostrarContenido());
        System.out.println(reporteHTML.mostrarContenido());

        // Punto 2
        Reporte pdfDecorado = new MarcaDeAguaDecorador(new EncabezadoDecorador(reportePDF));

        Reporte excelDecorado = new PieConFechaDecorador(new MarcaDeAguaDecorador(reporteExcel));

        Reporte htmlDecorado = new EncabezadoDecorador(new PieConFechaDecorador(reporteHTML));

        System.out.println(pdfDecorado.mostrarContenido());
        System.out.println(excelDecorado.mostrarContenido());
        System.out.println(htmlDecorado.mostrarContenido());

        // Punto 3
        ConfiguracionSistema otraConfig = ConfiguracionSistema.getInstancia("Otro", "HTML", false);

        System.out.println();
        System.out.println("Formato desde otra referencia: " + otraConfig.getFormatoPorDefecto());
    }
}