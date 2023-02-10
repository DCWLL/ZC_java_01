import java.util.Scanner;

public class StdIn_StdOut {


    public static void main(String[] args) {

        // input scanner
        Scanner input = new Scanner(System.in);
        // read a string
        String line = input.nextLine();

        // String scanner
        Scanner inputString = new Scanner(line);

        while (inputString.hasNext()) {

            System.out.println(inputString.next());

        }





    }


}
