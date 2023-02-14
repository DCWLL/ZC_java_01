import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO_FileReader {

    public static void main(String[] args) throws IOException {

        FileReader frd = new FileReader("./files/streets.txt");
        int temp;
        while ( (temp = frd.read() ) != -1){
            System.out.print( (char) temp);
        }
        frd.close();

        FileWriter fwd = new FileWriter("./files/streets.txt");
        fwd.write("9581 Falls Ave W\n");
        fwd.append("6891 Minoru Blvd\n");
        fwd.flush();
        fwd.close();

    }
}
