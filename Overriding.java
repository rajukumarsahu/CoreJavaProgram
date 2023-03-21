
 class Child{
    void m1(int a){
        System.out.println("child");
    }
 }

public class Overriding extends Child {
    void m1(int a){
        System.out.println("Parent");
    }
    public static void main(String[] args) {
        Child o=new Overriding();
        o.m1(10);
        o.m1(10);
    }
}

