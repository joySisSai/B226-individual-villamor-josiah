package day21.activity;

public class UserAccount {
    // Encapsulation: all fields are private and only accessible
    // through getters and setters
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // No-argument constructor
    public UserAccount() {
    }

    // Constructor that sets all fields (email and password go through
    // the setters so validation rules are applied)
    public UserAccount(String firstName, String middleName, String lastName,
                       String address, String email, String password) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        setEmail(email);
        setPassword(password);
    }

    // ===== Getters =====
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // ===== Setters =====
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException(
                    "Invalid email format. Example: juan.delacruz@gmail.com");
        }
        this.email = email;
    }

    public void setPassword(String password) {
        if (!isValidPassword(password)) {
            throw new IllegalArgumentException(
                    "Password must be at least 8 characters and contain an "
                            + "\nuppercase letter, a lowercase letter, a digit, and a "
                            + "special character.");
        }
        this.password = password;
    }

    // ===== Validation rules =====
    // Email must follow the standard format: name@domain.tld
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }

    // Password rules:
    // - at least 8 characters
    // - at least one uppercase letter
    // - at least one lowercase letter
    // - at least one digit
    // - at least one special character
    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    // Convenience method for displaying the user's full name
    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }
}
