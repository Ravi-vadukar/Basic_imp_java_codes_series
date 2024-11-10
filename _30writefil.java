import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _30writefil {
    public static void main(String[] args) throws IOException {
        
        FileWriter fw = new FileWriter("F:\\Test123.txt");
        BufferedWriter bw  = new BufferedWriter(fw);

        bw.write("HELOO JAVA IS BEST PROGRAMING LANGUGAJE");
        bw.write("java is smooth and fast ");
        bw.write("java is oop based lang ");

        System.out.println("finished ");

        bw.close();
    }
}
