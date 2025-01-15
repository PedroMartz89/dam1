import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class EstudianteTest {
    Estudiante estudiante1;
    Estudiante estudiante2;
    Estudiante estudiante3;

    @BeforeEach
    void crearEstudiantes() {

        estudiante1 = new Estudiante("Pablito",18,8.5);
        estudiante2 = new Estudiante("Jorge",18,9);
        estudiante3 = new Estudiante("Roberto",19,5);
    }


    @Test
    void getNombre() {

    }

    @Test
    void getEdad() {
    }

    @Test
    void getNota() {
    }

    @Test
    void obtenerEstadoAcademico() {

        assertEquals("Notable", estudiante1.obtenerEstadoAcademico());
        assertEquals("Sobresaliente", estudiante2.obtenerEstadoAcademico());
        assertEquals("Aprobado", estudiante3.obtenerEstadoAcademico());
        assertNotEquals("Sobresaliente", estudiante3.obtenerEstadoAcademico());
    }
}