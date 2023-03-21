public class PrintingStar
{
   static void StarP()
   {
        int Line=6;
        for(int i=0;i<=Line;i++)
        {
            for(int j=1;j<=Line-i;j++)
            {
                System.out.print(" ");
            }
            //System.out.println(" ");
            for( int k=0;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }

    }
    public static void main(String[] args)
    {
        PrintingStar.StarP();
    }
}
/*/op
            *
           *  *
          *  *  *
          * */