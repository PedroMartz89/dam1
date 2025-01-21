import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class SesionTest {

    public static void main(String[] args) throws FileNotFoundException {

        Sesion sesion1 = new Sesion();

        assertTrue(sesion1.login("dmunuera", "123456"));
        assertTrue(sesion1.login("pepe", "654321"));
        assertTrue(sesion1.login("maria", "987654321"));

        assertFalse(sesion1.login("pepe", "65421321"));
        assertFalse(sesion1.login("maria", "123456"));
        assertFalse(sesion1.login("pedro", "3818212"));



    }


}