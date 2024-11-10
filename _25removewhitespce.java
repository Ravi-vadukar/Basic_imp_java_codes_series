

public class _25removewhitespce {
    
    public static void main(String[] args) {
        
        String str = "Java is best object orinted Progaraming language ";

        System.out.println("Before relpacing string "+str);

        str = str.replaceAll("\\s", "");

        System.out.println("Afeter removing white shpes "+str);
    }
}
