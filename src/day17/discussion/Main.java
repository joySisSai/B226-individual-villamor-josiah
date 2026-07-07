package day17.discussion;

public class Main {
    static void main(String[] args) {
        // Syntax of Instantiation
        // ClassName objectName = new Constructor ();

        Ballpen ballpen = new Ballpen();
        ballpen.brand = "HBW";
        ballpen.color = "Black";
        ballpen.pointSize = 0.5f;
        ballpen.weightInGrams = 9;
        System.out.println("Brand: "+ ballpen.brand);
        System.out.println("Color: "+ ballpen.color);
        System.out.println("Point Size: "+ ballpen.pointSize);
        System.out.println("Weight (g): "+ ballpen.weightInGrams);

//        ballpen.draw();
//        ballpen.sketch();
//        ballpen.write();

        Ballpen ballpen2 = new Ballpen();
        ballpen2.brand = "Panda";
        ballpen2.color = "Blue";
        ballpen2.pointSize = 1f;
        ballpen2.weightInGrams = 5;

//        ballpen2.draw();
//        ballpen2.sketch();

        Ballpen ballpen3 = new Ballpen();
        ballpen3.brand = "Pilot";
        ballpen3.color = "Red";
        ballpen3.pointSize = 12f;
        ballpen3.weightInGrams = 0.5;

//        ballpen3.sketch();

    }
}
