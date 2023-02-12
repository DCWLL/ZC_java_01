import java.io.File;
import java.io.IOException;

public class FileDemo {


    public static void main(String[] args) throws IOException {

        File file1 = new File("./files/aa.txt");

        file1.createNewFile();
        //file1.delete();

        System.out.println("File exist: " + file1.exists());
        System.out.println("Absolute Path: " + file1.getAbsolutePath());
        System.out.println("Relative Path: " + file1.getPath());
        System.out.println("Is a File: " + file1.isFile());


        File file2 = new File("./files");

        System.out.println("Is a File: " + file2.isFile());
        System.out.println("Is a Directory: " + file2.isDirectory());

    }


}
