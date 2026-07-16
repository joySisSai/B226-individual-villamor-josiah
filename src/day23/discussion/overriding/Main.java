package day23.discussion.overriding;

public class Main {
    static void main(String[] args) {
//        Person person = new Person();
        Father father = new Father();
        Child child = new Child();
        Husband husband = new Husband();


        Person p1 = new Husband();
        Person p2 = new Father();
        Person p3 = new Child();

        father.role();
        father.provide();

        child.role();
        husband.role();

        p1.role();
        p2.role();
        p3.role();





    }
}
