package Classes;
/**
 * Clase que contiene la información del un usuario.
 * @version 0.1.0
 * @author Pedro
 */

public class User {
    /**  
     *Nombre de usuario.
     */
    private String username;
    /**
     * Nombre completo del usuario.
     */
    private String name;
    /**
     * NIF del usuario.
     */
    private String nif;
    /**
     * Email del usuario.
     */
    private String email;
    /**
     * Dirección del usuario.
     */
    private String address;
    /**
     * Fecha de nacimiento del usuario.
     */
    private String birthday;
    /**
     * Rol del usuario.
     */
    private String role;

    /**
     * Constructor principa de la clase.
     * @param username Nombre de usuario.
     * @param name Nombre completo del usuario.
     * @param nif NIF del usuario.
     * @param email Email del usuario.
     * @param address Dirección del usuario.
     * @param birthday Fecha de nacimiento del usuario.
     * @param role Rol del usuario.
     */
    public User(String username, String name, String nif, String email, String address, String birthday, String role) {
        this.username = username;
        this.name = name;
        this.nif = nif;
        this.email = email;
        this.address = address;
        this.birthday = birthday;
        this.role = role;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
