public abstract class DispositivoElectronico {
    private String marca;
    private String modelo;
    private double precio;

    public DispositivoElectronico(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract void realizarOperacion(String parametro);

    public abstract String obtenerInformacion(int parametro);
}
