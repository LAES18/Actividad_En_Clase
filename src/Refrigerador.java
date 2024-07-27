public class Refrigerador extends Electrodomestico {
    private int capacidad; // en litros

    public Refrigerador(String marca, String modelo, double precio, int consumoEnergetico, int capacidad) {
        super(marca, modelo, precio, consumoEnergetico);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public void realizarOperacion(String alimento) {
        System.out.println("Enfriando " + alimento + " en el refrigerador.");
    }

    @Override
    public String obtenerInformacion(int diasUso) {
        return "El refrigerador ha estado en uso durante " + diasUso + " días.";
    }
}
