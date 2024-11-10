public class fibonachiseris {
    

    // logic 0 1 1 2 3 5      3varible lveavana 
    public static void main(String[] args) {
        
        int num1 = 0,num2 = 1 ,sum = 0;

        // System.out.println(num1 +" "+num2);

        for(int i = 2 ; i < 10 ;i++){
            sum = num1+num2;
            System.out.println(" "+sum);
            num1 = num2;
            num2 = sum;
        }
    }
}
