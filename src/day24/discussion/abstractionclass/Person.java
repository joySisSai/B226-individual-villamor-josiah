package day24.discussion.abstractionclass;

public abstract class Person {
    // non-abstract method / concrete method
    public void walk() {
        System.out.println("Walking ... ") ;

    }

    // non-access modifier: abstract method
    public abstract void role();
}
