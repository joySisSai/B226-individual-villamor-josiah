package day22.discussion;

public class User {
    int id;
    String name;
    String email;
    String password;
    String userRole;

    public User(String name, String email, String password, String userRole) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userRole = userRole;
    }

    public String getUserRole(){
        return "User " + name + ", User Role: " + userRole;
    }

}
