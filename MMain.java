public class MMain {
    public static void main(String[] args) {
        System.out.println("Main method 1");
        int [] arr={1,2,3,4,5,6,7};
        MMain.main(arr);

        Sub s=new Sub();
        s.main(23);

    }

    public static void main(int[] arr){
        System.out.println("OverLoad a method");


    }
}

class Sub extends MMain{
    public static void main(int a){
        System.out.println("sub main"+a);
    }
}
