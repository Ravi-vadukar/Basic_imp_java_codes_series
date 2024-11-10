public class _26countcharaccurenc {
    
    public static void main(String[] args) {
        
        String s = "java is best programming language";
        int totalcont = s.length();

        int totalcount_afterremove = s.replace("a", "").length();
        int count = totalcont - totalcount_afterremove;
        // first find total count then subtrace form removel ciunt 
        System.out.println("numbear occurne of count is :"+count);
    }
}
