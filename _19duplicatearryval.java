
 // find duplicate value form array 


public class _19duplicatearryval {
    
   public static void main(String[] args) {
    

    String arr[] = {"java","c","c++","python","java"};

    for(int i = 0 ; i < arr.length; i++){
            for(int j = i+1; j < arr.length ; i++){
                if(arr[i]==arr[j]){
                    System.out.println("The duplicate value is "+arr[i]);
                }
            }
    }
   }
}
