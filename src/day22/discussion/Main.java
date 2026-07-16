package day22.discussion;

public class Main {
    static void main(String[] args) {
        Admin admin = new Admin("Test", "test@gmail.com", "test123", "Admin", "IT");
        System.out.println(admin.getUserRole());

        StandardUser user = new StandardUser("Test2", "test2@gmail.com", "test2123", "Standard User");
        System.out.println(user.getUserRole());

        System.out.print("Company name: " + user.getCompanyName());


    }
}
