public class WordOccurance {

    public static void main(String[] args)
    {
        String s1="Hello Ra12115212554ju";//5
        int count=0;
       // String[] str=input.split(" ");
        for(int i=0;i<s1.length();i++)
        {
             //if(Character.isLetter(s1.charAt(i)))//it will count only String value
            if(s1.charAt(i)!=' ')//it will count all the value
                count++;
        }
        System.out.println(count);
    }
}
