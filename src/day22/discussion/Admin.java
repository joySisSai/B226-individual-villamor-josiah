package day22.discussion;

public class Admin extends User{
    String deptName;

    public Admin(String name, String email, String password, String userRole, String deptName) {
        super(name, email, password, userRole);
        this.deptName = deptName;
    }



}
