public class LamdaDemo {

    @FunctionalInterface
    interface myLamda{
        int method(int a, int b);
    }

    public static void main(String[] args) {

        // statement lamda
        //myLamda myfunc =  (a, b) -> {return a + b;};

        //expression lamda, simpler
        //myLamda myfunc =  (a, b) -> a + b;

        // Lamda replaced with method reference, even simpler
        myLamda myfunc = Integer::sum;

        int sum1 = myfunc.method(3, 5);


        myLamda printInt = (a, b) -> {
            System.out.println(a + "===" + b);
            return 0;
        } ;

        printInt.method(3, 6);

    }


}
