public class Tablet extends DispositivoMovil {
    private double tamanoPantalla; // en pulgadas

    public Tablet(String marca, String modelo, double precio, String sistemaOperativo, double tamanoPantalla) {
        super(marca, modelo, precio, sistemaOperativo);
        this.tamanoPantalla = tamanoPantalla;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    @Override
    public void realizarOperacion(String video) {
        System.out.println("Reproduciendo el video " + video + " en la tablet.");
    }

    @Override
    public String obtenerInformacion(int horasVisualizacion) {
        return "La tablet ha sido utilizada para ver videos durante " + horasVisualizacion + " horas.";
    }
}

