package documentos.RRHH;

import documentos.Documento;

public class Contrato extends Documento {

    private String tipoContrato;
    private double salario;
    private String puesto;

    public Contrato(int numPaginas, String fechaCreacion, String tipoContrato, double salario, String puesto) {
        super(numPaginas, fechaCreacion);
        this.tipoContrato = tipoContrato;
        this.salario = salario;
        this.puesto = puesto;
    }

    @Override
    public void mostrarDocumento() {

    }
}
