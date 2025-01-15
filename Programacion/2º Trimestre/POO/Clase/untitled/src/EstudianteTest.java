class EstudianteTest {
    public static void main(String[] args) {
//        Estudiante alumno = new Estudiante();
//        alumno.setNombre("Pedro");
//        alumno.setApellido1("Martínez");
//        alumno.setApellido2("Sánchez");
//
//        System.out.println("Alumno 1");
//
//        System.out.println("Número de estudiantes: " + alumno.obtenerNumEstudiantes());
//        System.out.println(alumno.infoEstudiante());
//
//        System.out.println();
//        Estudiante alumno2 = new Estudiante("Jorge", "Hernández", "Aparicio");
//
//        System.out.println("Alumno 2");
//
//        System.out.println("Número de estudiantes: " + alumno2.obtenerNumEstudiantes());
//        System.out.println(alumno2.infoEstudiante());

        Estudiante[] arrayAlumnos = new Estudiante[3];

        arrayAlumnos[0] = new Estudiante("Pedro", "Martínez", "Sánchez");
        arrayAlumnos[1] = new Estudiante("Jorge", "Hernández", "Aparicio");
        arrayAlumnos[2] = new Estudiante("Roberto", "Company", "Zomeño");


        for (int i = 0; i < arrayAlumnos.length; i++) {

            System.out.println("Total de estudiantes: " + arrayAlumnos[i].obtenerNumEstudiantes());
            System.out.println(arrayAlumnos[i].infoEstudiante());
            System.out.println();

        }

        TelefonoMovil telf = new TelefonoMovil();

        System.out.println("Modelo de Nokia: ");
        System.out.println(telf.mostrarNokia());
    }






    @org.junit.jupiter.api.Test
    void obtenerNumEstudiantes() {
    }

    @org.junit.jupiter.api.Test
    void getNombre() {
    }

    @org.junit.jupiter.api.Test
    void setNombre() {
    }

    @org.junit.jupiter.api.Test
    void getApellido1() {
    }

    @org.junit.jupiter.api.Test
    void setApellido1() {
    }

    @org.junit.jupiter.api.Test
    void getApellido2() {
    }

    @org.junit.jupiter.api.Test
    void setApellido2() {
    }

    @org.junit.jupiter.api.Test
    void getCurso() {
    }

    @org.junit.jupiter.api.Test
    void setCurso() {
    }

    @org.junit.jupiter.api.Test
    void getGrado() {
    }

    @org.junit.jupiter.api.Test
    void setGrado() {
    }

    @org.junit.jupiter.api.Test
    void getCorreo() {
    }

    @org.junit.jupiter.api.Test
    void setCorreo() {
    }

    @org.junit.jupiter.api.Test
    void getUniversidad() {
    }

    @org.junit.jupiter.api.Test
    void setUniversidad() {
    }

    @org.junit.jupiter.api.Test
    void getTelefono() {
    }

    @org.junit.jupiter.api.Test
    void setTelefono() {
    }

    @org.junit.jupiter.api.Test
    void infoEstudiante() {
    }
}