import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Sesion {

    public boolean login(String user, String passwd) throws FileNotFoundException {

        try {
            File text = new File("assets/usuarios.txt");
            Scanner myReader = new Scanner(text);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] array1 = data.split("#");

                if (Objects.equals(user, array1[0]) && Objects.equals(passwd, array1[1])) {
                    return true;
                }
            }
            return false;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return false;
    }
}