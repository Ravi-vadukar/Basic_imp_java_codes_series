public class _11checkprimeornot {
    
    public static void main(String[] args) {
        
        int num = 7;
        int count = 0 ;

        if(num > 1 ){
            for(int i = 1; i<=num ; i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Prime Numbar");
            }
            else{
                System.out.println("Not Prime Numabar");
            }

        }
        else{
            System.out.println("Not prime numbar");
        }
    }
}
