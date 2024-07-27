public abstract class DispositivoMovil extends DispositivoElectronico {
    private String sistemaOperativo;

    public DispositivoMovil(String marca, String modelo, double precio, String sistemaOperativo) {
        super(marca, modelo, precio);
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
}

