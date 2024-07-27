public abstract class Electrodomestico extends DispositivoElectronico {
    private int consumoEnergetico; // en kWh

    public Electrodomestico(String marca, String modelo, double precio, int consumoEnergetico) {
        super(marca, modelo, precio);
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }
}
