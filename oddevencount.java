
import java.util.Scanner;

public class oddevencount {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a numbar ");
        int num = sc.nextInt();

        int even_count = 0;
        int odd_count = 0;
    

        while(num > 0 ){


            int rem = num%10;
            if(rem%2 == 0){
                even_count++;
            }
            else{
                odd_count++;
            }
            num = num/10;
        }
          
       
        System.out.println("even numbar is "+even_count);
        System.out.println("Odd count is "+odd_count);

    }
}
