public class StringReverse {
    public static void main(String[] args) {
        String s1="Raju kumar sahu";
        String rev="";
        System.out.println(s1);
        for (int i=0;i<s1.length();i++){
        rev=s1.charAt(i)+rev;
        }
        System.out.println(rev);

        StringBuffer sb=new StringBuffer(s1);
        sb.reverse();
        System.out.println("reverse:"+sb);


    StringReverse s=new StringReverse();
    s.Stringrev(s1);
        System.out.println("Main Method");
       //StringReverse.Stringrev(s1);
    }
       void Stringrev(String s1){
        String rev="";
        for (int i=0;i<s1.length();i++){
           rev= s1.charAt(i)+rev;

        }
         System.out.println("Method body");
        System.out.println(rev);
    }
}
