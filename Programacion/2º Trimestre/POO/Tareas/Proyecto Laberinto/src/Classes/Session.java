package Classes;

import java.io.*;
import java.util.Scanner;

public class Session {

    private User user;
    private boolean logged;

    Config config = new Config();

    public Session() {
        this.user = new User();
        this.logged = false;
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

                   this.user = new User(array1[0],array1[2],array1[3],array1[4],array1[5],array1[6],"user");
                   logged = true;
                   break;
               }
            }


        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado.");
        }

        this.logged = logged;
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


    public void showUser() {

        if (this.logged && this.user != null) {

            System.out.println("------- Información del usuario -------");
            System.out.println("Nombre de usuario: " + this.user.getUsername());
            System.out.println("Nombre completo: " + this.user.getName());
            System.out.println("NIF: " + this.user.getNif());
            System.out.println("Email: " + this.user.getEmail());
            System.out.println("Dirección: " + this.user.getAddress());
            System.out.println("Fecha de nacimiento: " + this.user.getBirthday());
            System.out.println("Rol: " + this.user.getRole());
            System.out.println("---------------------------------------");
        }
    }

    @Override
    public String toString() {
        return "Session{" +
                "user=" + user +
                ", logged=" + logged +
                '}';
    }

    public void logout() {

        this.logged = false;
        this.user = null;
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
