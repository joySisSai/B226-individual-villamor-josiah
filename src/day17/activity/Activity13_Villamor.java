package day17.activity;

public class Activity13_Villamor {
    static void main(String[] args) {
        // Syntax of Instantiation
        // ClassName objectName = new Constructor ();

        Keyboard keyboard1 = new Keyboard();
        keyboard1.brand = "Royal Kludge";
        keyboard1.color = "White";
        keyboard1.size = "60%";
        keyboard1.type = "Mechanical";
        keyboard1.layout = "QWERTY";

        System.out.println("========== Keyboard 1 ==========");
        keyboard1.displayInfo();
        keyboard1.typing();
        keyboard1.gaming();

        Keyboard keyboard2 = new Keyboard();
        keyboard2.brand = "Logitech";
        keyboard2.color = "Black";
        keyboard2.size = "Full-size";
        keyboard2.type = "Membrane";
        keyboard2.layout = "QWERTY";

        System.out.println("\n========== Keyboard 2 ==========");
        keyboard2.displayInfo();
        keyboard2.typing();
        keyboard2.dataEntry();

        Keyboard keyboard3 = new Keyboard();
        keyboard3.brand = "Razer";
        keyboard3.color = "Green";
        keyboard3.size = "Tenkeyless";
        keyboard3.type = "Optical";
        keyboard3.layout = "DVORAK";

        System.out.println("\n========== Keyboard 3 ==========");
        keyboard3.displayInfo();
        keyboard3.gaming();
        keyboard3.dataEntry();
    }
}
