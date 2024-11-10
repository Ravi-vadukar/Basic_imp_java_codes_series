
public class _14sumofarray {
    public static void main(String[] args) {
        
        int a[] = {2,8,9,10,6};

        int sum = 0;

        for(int i = 0;i<=a.length-1;i++){
            sum = sum+a[i];
        }

        System.out.println("The sum of This array is "+sum);
    }
}
