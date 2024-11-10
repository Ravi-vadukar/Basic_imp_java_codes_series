
public class _20linearsercheleinarr {
    
    public static void main(String[] args) {
        
        int a[] = {10,20,30,50,60,90};

        int sel_e = 60;
        
        boolean flag = false;

        for(int i = 0 ; i <a.length; i++){
            if(sel_e==a[i]){
                System.out.println("Element found at "+i);
                flag = true;
                break;
            }
        }
        if(flag==false){
            System.out.println("numbar is not found ");
        }


    }
}
