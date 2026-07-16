package day22.discussion;

public class StandardUser extends User{
    String companyName;

    public StandardUser(String name, String email, String password, String userRole) {
        super(name, email, password, userRole);
        companyName = "JoySis";
    }

    public String getCompanyName() {
        return companyName;
    }
}
