public abstract class SerVivo {

    private String nombreCientifico;
    private String nombreComun;
    private String especie;

    public SerVivo(String nombreCientifico, String nombreComun, String especie) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.especie = especie;
    }

    public abstract void alimentarse();

    @Override
    public String toString() {
        return "SerVivo{" +
                "nombreCientifico='" + nombreCientifico + '\'' +
                ", nombreComun='" + nombreComun + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }

    public String getNombreComun() {
        return nombreComun;
    }
}
