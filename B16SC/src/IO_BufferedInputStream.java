import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO_BufferedInputStream {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("./files/streets.txt");
        BufferedInputStream bf_fis = new BufferedInputStream(fis);

        int b;

        while ( (b = bf_fis.read()) != -1 ) {
            // do nothing, testing.
        }

        fis.close();
        bf_fis.close();

    }

}
