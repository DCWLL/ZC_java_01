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


    }


}
