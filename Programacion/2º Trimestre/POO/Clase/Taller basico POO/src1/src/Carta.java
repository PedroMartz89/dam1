public class Carta {

    private String emisor;
    private String remitente;
    private String dirEmisor;
    private String dirRemitente;
    private int cpEmisor;
    private int cpRemitente ;
    private double peso;
    private boolean fragil;

    public Carta() {
    }

    public Carta(String emisor, String remitente, String dirEmisor, String dirRemitente, int cpEmisor, int cpRemitente, double peso, boolean fragil) {
        this.emisor = emisor;
        this.remitente = remitente;
        this.dirEmisor = dirEmisor;
        this.dirRemitente = dirRemitente;
        this.cpEmisor = cpEmisor;
        this.cpRemitente = cpRemitente;
        this.peso = peso;
        this.fragil = fragil;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "emisor='" + emisor + '\'' +
                ", remitente='" + remitente + '\'' +
                ", dirEmisor='" + dirEmisor + '\'' +
                ", dirRemitente='" + dirRemitente + '\'' +
                ", cpEmisor=" + cpEmisor +
                ", cpRemitente=" + cpRemitente +
                ", peso=" + peso +
                ", fragil=" + fragil +
                '}';
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDirEmisor() {
        return dirEmisor;
    }

    public void setDirEmisor(String dirEmisor) {
        this.dirEmisor = dirEmisor;
    }

    public String getDirRemitente() {
        return dirRemitente;
    }

    public void setDirRemitente(String dirRemitente) {
        this.dirRemitente = dirRemitente;
    }

    public int getCpEmisor() {
        return cpEmisor;
    }

    public void setCpEmisor(int cpEmisor) {
        this.cpEmisor = cpEmisor;
    }

    public int getCpRemitente() {
        return cpRemitente;
    }

    public void setCpRemitente(int cpRemitente) {
        this.cpRemitente = cpRemitente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }
}
