import java.util.Scanner;
    // count numbar
public class countnumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 System.out.println("enter numbar :");
    int num = sc.nextInt();

    int cou = 0;

    while (num >0) {
        num = num/10;
        cou++;
    }
    System.out.println("The count number is "+cou);
    }
}
