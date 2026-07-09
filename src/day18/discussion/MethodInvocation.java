package day18.discussion;

public class MethodInvocation {
    static void main(String[] args) {

        //thru obj
        MethodInvocation newObj = new MethodInvocation();
        newObj.b();

        //thru class when accessing same outside class
        MethodInvocation.a();

        //thru class when accessing same class
        a();
    }

    //static
    public  static void a() {
        System.out.println("Access static method");
    }

    //instance
    public void b(){
        System.out.println("Access instance method");
    }
}
