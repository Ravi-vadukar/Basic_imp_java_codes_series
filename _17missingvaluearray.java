public class _17missingvaluearray {
    
    public static void main(String[] args) {
        
        int a[] = {1,2,4,5};

        int sum1 = 0;
       for(int i = 0; i<a.length;i++){
        sum1 = sum1+a[i];
       }
       System.out.println("a1 array sum is "+sum1);
    
       int sum2 = 0;
     for(int i = 0; i <= 5;i++){
        sum2 = sum2+i;
     }
     System.out.println("The sum of order of array is "+sum2);

     System.out.println("The missing value is " +(sum2-sum1));
}
}