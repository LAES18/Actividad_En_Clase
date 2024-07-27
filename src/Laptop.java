public class Laptop extends Computadora {
    private double peso; // en kg

    public Laptop(String marca, String modelo, double precio, int memoriaRAM, int almacenamiento, double peso) {
        super(marca, modelo, precio, memoriaRAM, almacenamiento);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public void realizarOperacion(String programa) {
        System.out.println("Ejecutando el programa " + programa + " en la laptop.");
    }

    @Override
    public String obtenerInformacion(int horasUso) {
        return "La laptop ha sido usada durante " + horasUso + " horas.";
    }
}

