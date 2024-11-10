
import java.util.Scanner;

public class reveshnumbar {
    

    // revarsh a number using string buffer 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input number :");
        int a = sc.nextInt();

        StringBuffer sb = new StringBuffer(String.valueOf(a));
        StringBuffer rev = sb.reverse();

        System.out.println(rev);
    }
}
