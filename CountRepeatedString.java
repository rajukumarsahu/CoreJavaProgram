public class CountRepeatedString
{
    public static void main(String[] args)
    {
        String s="java is a mavilis is easy";
        int word=1; 
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++)
        {
            for(int j=i+1;j<str.length;j++)
            {
                // //if(Character.isLetter(s.charAt(i)))
                if(str[i].equals(str[j]))
                {
                    word=word+1;
                    str[j]="0";
                }
            }
            if(str[i]!="0")
            {
                System.out.println(str[i]+"--"+word);
                word=1;
            }
        }
    }
}
