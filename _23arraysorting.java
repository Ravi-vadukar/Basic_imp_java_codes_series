import java.util.*;

// array sorting using bulid in method 


public class _23arraysorting {
    
    public static void main(String[] args) {
        
        int a[] = {70,50,40,35,28,31,88};

        System.out.println("Arrays before sorting "+Arrays.toString(a));

        Arrays.parallelSort(a);

        System.out.println("Arrrys aftr sortig using of built in method "+Arrays.toString(a));

        // another method of arrays sorting is using sort keyword 

        int b[] = {30,10,20,50,90,7};

        System.out.println("Arrya before sorting "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Arrys afeter sorting usign sort method "+Arrays.toString(a));
    }
}
