public class ScannerDemo {


    public static void main(String[] args) {

        // input scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        // read a string
        String line = input.nextLine();

        // String scanner
        java.util.Scanner inputString = new java.util.Scanner(line);

        while (inputString.hasNext()) {

            System.out.println(inputString.next());

        }





    }


}
