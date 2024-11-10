import java .util.Scanner;

public class larjestnum {
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a NUmber 1");
    int num1 = sc.nextInt();
    System.out.println("Enter num 2");
    int num2 = sc.nextInt();
    System.out.println("enter a num 3");
    int num3 = sc.nextInt();

    if(num1>num2 && num1>num3){
        System.out.println("print num1 is hights"+num1);
    }
    else if (num2 >num3 && num2 > num1) {
        System.out.println("print num2 is hightst"+num2);
    }
    else{
        System.out.println("numbar 3 is highst "+num3);
    }
        
    }
   } 


