package day21.discussion;

public class Ballpen {
    // this -> refers to the current class object
    // data hiding -> making all the data members private
    // data validation -> data use setter and getter methods
    private  int id;
    private String brand;
    private String color;
    private double price;
    private double pointSize;


    //default constructor
//    public Ballpen(){
//        System.out.println("ballpen created");
//    }

    public Ballpen(String brand, String color, double price, double pointSize) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.pointSize = pointSize;
    }

    //getter method / accessor method
    public String getBrand() {
        return brand;
    }
    //setter method / mutator method
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPointSize() {
        return pointSize;
    }

    public void setPointSize(double pointSize) {
        this.pointSize = pointSize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
