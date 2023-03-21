public class FindDublicate_in_arrray {
    public static void main(String[] args) {
        int [] arr={2,4,6,7,3,2,1,4,6};
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && (i!=j)){
                   // System.out.println("Dublicate:-"+arr[j]);
                    System.out.println("Dublicate element are:-"+arr[i]);
                }
            }
        }
    }
}
