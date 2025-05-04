package Classes;

public class Coordinate {

    public int coorI;
    public int coorJ;
    public int dir; // 1 - Arriba, 2 - Derecha, 3 -Abajo, 4 - Izquierda, 5 - Volver atrás

    public Coordinate(int coorI, int coorJ, int dir) {
        this.coorI = coorI;
        this.coorJ = coorJ;
        this.dir = dir;
    }

    public int getCoorI() {
        return coorI;
    }

    public void setCoorI(int coorI) {
        this.coorI = coorI;
    }

    public int getCoorJ() {
        return coorJ;
    }

    public void setCoorJ(int coorJ) {
        this.coorJ = coorJ;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }


}
