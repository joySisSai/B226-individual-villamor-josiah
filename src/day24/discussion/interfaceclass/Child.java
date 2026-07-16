package day24.discussion.interfaceclass;

public class Child implements Person{
    @Override
    public void role() {
        System.out.println("I am a child");
    }

    @Override
    public void walk() {
        System.out.println("Child walking");
    }

    @Override
    public void jump() {
        System.out.println("Child jumping");
    }
}
