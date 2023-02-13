
import java.io.*;

public class IO_FileInputStream {

    /*
    A FileInputStream obtains input bytes from a file in a file system. What files are available depends on the host environment.

    FileInputStream is meant for reading streams of raw bytes such as image data ().
    For reading streams of characters, consider using FileReader.
     */

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("./files/dinosaur.jpg");

        // output file
        FileOutputStream fos = new FileOutputStream("./files/dinosaur_copy.jpg");

        int temp;
        while ( (temp = fis.read()) != -1)
        {
            // make a copy
            fos.write(temp);
        }

        fis.close();
        fos.close();


    }

}
