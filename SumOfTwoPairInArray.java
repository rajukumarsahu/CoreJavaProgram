import java.util.HashSet;
import java.util.Set;

class SumOfTwoPairInArray {
  public static void main(String[] args) {
    Integer[] arr = new Integer[]{2, 4, 7, 4, 5, 10, 0};
    sum(arr, 9);
  }
  public static void sum(Integer [] arr,int sum){
    Set<Integer> set =new HashSet<>();
    for(int i=0;i<arr.length;i++){
      int diff=sum-arr[i];
      if(set.contains(diff)){
        System.out.println(arr[i]);
        System.out.println(diff);
      }
      set.add(arr[i]);
    }
    //return false;
  }
}
 
