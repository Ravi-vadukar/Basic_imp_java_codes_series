public class _18maxminarry {
    
    public static void main(String[] args) {
        
        int a[] = {10,20,70,80,90,20,30,77};

        int max = a[0];

        for(int i = 1 ; i <a.length ; i++ ){
            if(a[i]>max){
                max = a[i];
            }
            }
    System.out.println("The maximum numbar of array is "+max);
        
}
}
