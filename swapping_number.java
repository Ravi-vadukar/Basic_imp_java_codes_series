/**
 * swapping_number swaping two number using tempary varibale 
 */
public class swapping_number {

    public static void main(String[] args) {
        
        int a = 20;
        int b = 30;

        System.out.println("Before swaping "+a   +b);

        // after logic use tempariri variable 

        // int t = a;
        //  a = b;
        //  b = t;

         System.out.println("After swapping "+a  +b);

         // logic 2 we use + - logical operator 

         int s = a + b;
         a = s - a;
         b = s - b;

         // without useing temporyry veriable 
        //  a = a+b;
        //  b = a-b;
        //  a = a-b;

         System.out.println("after swaping logic 2 use answer is "+a  +b);
    }
}