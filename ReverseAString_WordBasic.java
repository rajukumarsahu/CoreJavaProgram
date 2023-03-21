 public class ReverseAString_WordBasic {
   public static void main(String[] args) {
      String str = "hello world";
      String[] words = str.split(" ");
      String reversedStr = "";
      
      for(int i = words.length - 1; i >= 0; i--) {
         reversedStr += words[i] + " ";
      }
      
      System.out.println(reversedStr.trim());
   }
}
