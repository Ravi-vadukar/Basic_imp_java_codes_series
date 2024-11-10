
// lec 16 compare two array using array implematiaoon using array 

import java.util.*;

public class _16twoarr {

    public static void main(String[] args) {
       
        
        int a1[] = {1,2,3,4,5,7};
        int a2[] = {1,2,3,4,5};
        
        
        boolean status = Arrays.equals(a1, a2);

        if(status == true){
            System.out.println("array is equal ");
        }
        else{
            System.out.println("Array is not equal ");
        }
    }
}