public class revershString {
    
    public static void main(String[] args) {
        String str = "abcd";
        String rev = " ";

        // int len = str.length();

        // for(int i = len-1 ; i >=0 ; i--){
        //     rev = rev + str.charAt(i);
        // }
        // System.out.println(rev);


        // second method using array using 

        char a[] = str.toCharArray();
        int len = a.length;

        for(int i = len-1; i >=0 ;i--){
            rev = rev+a[i];
        }
        System.out.println(rev);
    }
}
