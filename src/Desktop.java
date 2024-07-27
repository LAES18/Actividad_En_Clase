public class Desktop extends Computadora {
    private String tipoTorre; // mini, mid, full

    public Desktop(String marca, String modelo, double precio, int memoriaRAM, int almacenamiento, String tipoTorre) {
        super(marca, modelo, precio, memoriaRAM, almacenamiento);
        this.tipoTorre = tipoTorre;
    }

    public String getTipoTorre() {
        return tipoTorre;
    }

    @Override
    public void realizarOperacion(String tarea) {
        System.out.println("Realizando la tarea " + tarea + " en la desktop.");
    }

    @Override
    public String obtenerInformacion(int rendimiento) {
        return "La desktop tiene un rendimiento de " + rendimiento + "%.";
    }
}

