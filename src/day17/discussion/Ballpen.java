package day17.discussion;

//act as a blueprint of an object that you want to implement
public class Ballpen {
    //attributes/ fields
    String brand;
    String color;
    float pointSize;
    double weightInGrams;

    //purpose
    public void write (){
        System.out.println("Writing...");
    }

    public void  draw (){
        System.out.println("Drawing....");
    }

    public void  sketch() {
        System.out.println("Sketching...");
    }

}
