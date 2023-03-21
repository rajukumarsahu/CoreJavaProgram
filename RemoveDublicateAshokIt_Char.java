public class RemoveDublicateAshokIt_Char {
    public static void main(String[] args) {
        String s="RRAAJJUU";
        //First
        StringBuilder sb=new StringBuilder();
        s.chars().distinct().forEach(c -> sb.append((char)c));
        System.out.println(sb);


        //second
        StringBuilder sb2=new StringBuilder();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=s.indexOf(ch,i+1);
            if(idx==-1){
                sb2.append(ch);
            }
        }
        System.out.println(sb2);
    }

}
