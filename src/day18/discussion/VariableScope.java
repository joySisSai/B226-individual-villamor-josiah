package day18.discussion;

public class VariableScope {
    static int num = 10; // instance variable
    static int num2 = 20; // static variable

     static void main(String[] args) {
        VariableScope scope = new VariableScope ();
        System. out.println (scope.num);
        System.out.println (num2) ;
    }

    public void sum() {
        System.out.println(num2) ;
    }

    public void product () {
        System.out.println(num2);
    }
}
