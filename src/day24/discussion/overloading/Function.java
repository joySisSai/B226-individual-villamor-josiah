package day24.discussion.overloading;

public class Function {
    public void jump () { }

    public void jump (int noOfJump) { }

    public void jump (double height) { }

    public void jump (String animation) { }

    public void jump (int noOfJump, double height) { }

    public void jump (int noOfJump, double height, String animation) { }

    public void jump (double height, String animation, int noOfJump) { }

    static void main(String[] args) {
        //Compile time polymorphism
        Function f = new Function () ;



    }

}
