public abstract class Computadora extends DispositivoElectronico {
    private int memoriaRAM; // en GB
    private int almacenamiento; // en GB

    public Computadora(String marca, String modelo, double precio, int memoriaRAM, int almacenamiento) {
        super(marca, modelo, precio);
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }
}


