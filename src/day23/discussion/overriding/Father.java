package day23.discussion.overriding;

public class Father extends Person {
    /*
        @Override annotation tells the compiler that this
        method is overriding the method from parent.
    */
    @Override
    public void role() {
        System.out.println("I am a Father");
    }

    public void provide(){
        System.out.println("I am a Provider");
    }
}
