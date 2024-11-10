
import java.io.File;
import java.util.*;
import java.io.FileReader;
import java.io.IOException;

public class _29readtext {

    public static void main(String[] args) {
        
        
    File file = new File("F:\\placement-priparation\\java_basic_imp_programs\\aaa.txt");
    Scanner sc = new Scanner(file);
  
      sc.useDelimiter("\\Z");
    System.out.println(sc.next());
    
    }
}
