import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IO_BufferedReader {

    public static void main(String[] args) throws IOException {
        //           --------Buffer---------
        //---frd----                        ------------------
        //-----------                       ------------------
        //           -----------------------

        FileReader frd = new FileReader("./files/streets.txt");
        BufferedReader bfrd = new BufferedReader(frd);

        String ln;

        while ( (ln = bfrd.readLine()) != null ){
            System.out.println(ln);
        }

        frd.close();
        bfrd.close();

    }
}
