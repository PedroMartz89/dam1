package Classes;

public class User {

    private String username;
    private String name;
    private String nif;
    private String email;
    private String address;
    private String birthday;
    private String role;


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
