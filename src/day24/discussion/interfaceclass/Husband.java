package day24.discussion.interfaceclass;

public class Husband implements Person{
    @Override
    public void role(){
        System.out.println("I am a Husband");
    }

    @Override
    public void walk() {
        System.out.println("husband walking");
    }

    @Override
    public void jump() {
        System.out.println("Husband jumping");

    }
}
