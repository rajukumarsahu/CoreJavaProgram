public class FindSecondHighest {
    public static void main(String[] args) {
        int [] arr={5,4,8,7,6,3,3,2,9,6};
         int temp,fact=1;
         int temp1=0;
       // System.out.println(arr);
         for (int n=0; n<=arr.length-1;n++){

             System.out.print(arr[n]);
         }

//        for(int k=0;k<=arr.length-1;k++){
//
//            for(int r=k+1;r<=arr.length-1;r++){
//                if(arr[k]==arr[r]){
//                    arr[r]=arr[k];
//                    arr[k]=temp1;
//                	 
//                }
//                
//            }
//             //Integer s=arr[k];
//            System.out.println();
//            System.out.print(arr[k]);
//            
//             
//        }
//        System.out.println();
        System.out.println();

        for (int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                 if(arr[i]>arr[j]){
                     temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }
            }
System.out.print(arr[i]);
        }
        int h=arr[arr.length-2];
        System.out.println();
        System.out.println("Second Highest No is:::="+h);
        //System.out.println("Second Highest No is:::="+arr[arr.length-2]);
       // int p=5;
       // int  p=arr[arr.length-2];
        for(int l=1;l<=h;l++){
            fact=fact*l;
        }
        System.out.println("factorial is"+fact);
    }

}
