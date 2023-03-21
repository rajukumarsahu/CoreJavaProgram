import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CharCount {
    public static void main(String[] args) {
        String s="Hello";
        Map <Character,Integer> map=new TreeMap<>();
            char[] chaars=s.toCharArray();
            for (char ch:chaars){
                if(!map.containsKey(ch)){
                    map.put(ch,1);
                }
                else{
                    int value=map.get(ch);
                    map.put(ch,value+1);
                }
            }
        System.out.println(map);
    }
}
