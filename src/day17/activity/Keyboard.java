package day17.activity;

//blueprint of a keyboard object based on the mini-activity diagram
public class Keyboard {
    //attributes/ fields
    String brand;
    String color;
    String size;
    String type;
    String layout;

    //purpose/ behaviors
    public void typing() {
        System.out.println(brand + " keyboard is typing...");
    }

    public void gaming() {
        System.out.println(brand + " keyboard is used for gaming...");
    }

    public void dataEntry() {
        System.out.println(brand + " keyboard is used for data entry...");
    }

    //prints the attributes of this keyboard
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Type: " + type);
        System.out.println("Layout: " + layout);
    }
}
