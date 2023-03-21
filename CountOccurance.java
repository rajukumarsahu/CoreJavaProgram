public class CountOccurance {

        public static void main(String[] args) {
            String str = "www.scaler.com/topics";
            char ch = 'o';
            int cnt = 0;

            for ( int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch)
                    cnt++;
            }
            System.out.println("Occurrences of "+ch+" are " +cnt);
        }
}
