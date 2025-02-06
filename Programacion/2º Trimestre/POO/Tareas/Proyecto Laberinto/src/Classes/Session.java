package Classes;

import java.io.*;
import java.util.Scanner;

public class Session {

    private User user;
    private boolean logged;
    Config config = new Config();
    public Session(User user, boolean logged) {
        this.user = user;
        this.logged = false;
    }

    public Session() {

    }

    public boolean login() {

        Scanner input = new Scanner(System.in);
        Config config = new Config();
        boolean logged = false;

        System.out.print("Introduce el nombre de usuario: ");
        String user = input.nextLine();

        System.out.print("Introduce la contraseña: ");
        String passwd = input.nextLine();

        try {
            File text = new File(config.getFILE_PATH());
            Scanner read = new Scanner(text);

            while (read.hasNextLine()) {

                String info = read.nextLine();
                String[] array1 = info.split("#");

               if (array1[0].equals(user) && array1[1].equals(passwd)) {

                   logged = true;
                   break;
               }
            }


        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado.");
        }

        return logged;
    }

    public String signup(String user, String passwd, String name, String nif, String email, String address, String birthday) {

        try {


            FileWriter writer = new FileWriter(config.getFILE_PATH(), true);
            writer.write(user + "#" + passwd + "#" + name + "#" + nif + "#" + email + "#" + address + "#" + birthday + "\n" );
            writer.close();

        } catch (IOException e) {
            return "Fichero no encontrado.";
        }

        return "Usuario registrado correctamente.";
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }
}
