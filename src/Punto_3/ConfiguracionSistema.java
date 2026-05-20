package src.Punto_3;

public class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;

    private String directorioSalida;
    private String formatoPorDefecto;
    private boolean mostrarMarcaAgua;

    private ConfiguracionSistema(String directorioSalida, String formatoPorDefecto, boolean mostrarMarcaAgua) {
        this.directorioSalida   = directorioSalida;
        this.formatoPorDefecto  = formatoPorDefecto;
        this.mostrarMarcaAgua   = mostrarMarcaAgua;
    }

    public static ConfiguracionSistema getInstancia(String directorioSalida, String formatoPorDefecto, boolean mostrarMarcaAgua) {
        if (instancia == null) {
            instancia = new ConfiguracionSistema(
                directorioSalida,
                formatoPorDefecto,
                mostrarMarcaAgua
            );
        }
        return instancia;
    }

    public String getDirectorioSalida(){ 
        return directorioSalida; 
    }
    public String getFormatoPorDefecto(){ 
        return formatoPorDefecto;
    }
    public boolean isMostrarMarcaAgua(){
        return mostrarMarcaAgua;
    }

    public void mostrarConfiguracion() {
        System.out.println("Directorio: "         + directorioSalida);
        System.out.println("Formato por defecto: " + formatoPorDefecto);
        System.out.println("Mostrar marca de agua: " + mostrarMarcaAgua);
    }
}