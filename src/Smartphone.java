public class Smartphone extends DispositivoMovil {
    private int camaraResolucion; // en MP

    public Smartphone(String marca, String modelo, double precio, String sistemaOperativo, int camaraResolucion) {
        super(marca, modelo, precio, sistemaOperativo);
        this.camaraResolucion = camaraResolucion;
    }

    public int getCamaraResolucion() {
        return camaraResolucion;
    }

    @Override
    public void realizarOperacion(String aplicacion) {
        System.out.println("Instalando la aplicación " + aplicacion + " en el smartphone.");
    }

    @Override
    public String obtenerInformacion(int fotosTomadas) {
        return "El smartphone ha tomado " + fotosTomadas + " fotos.";
    }
}

