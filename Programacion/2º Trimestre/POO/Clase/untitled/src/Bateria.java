public class Bateria {

    private String modelo;
    private int tiempoInactivo;
    private int horasCapacidad;

    public Bateria() {
    }

    public Bateria(String modelo, int tiempoInactivo, int horasCapacidad) {
        this.modelo = modelo;
        this.tiempoInactivo = tiempoInactivo;
        this.horasCapacidad = horasCapacidad;
    }

    public Bateria(String modelo, int horasCapacidad) {
        this.modelo = modelo;
        this.horasCapacidad = horasCapacidad;
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTiempoInactivo() {
        return tiempoInactivo;
    }

    public void setTiempoInactivo(int tiempoInactivo) {
        this.tiempoInactivo = tiempoInactivo;
    }

    public int getHorasCapacidad() {
        return horasCapacidad;
    }

    public void setHorasCapacidad(int horasCapacidad) {
        this.horasCapacidad = horasCapacidad;
    }
}
