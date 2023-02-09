public class Autobox_cast {

    public static void print_Integer(Integer x){
        System.out.println(x);
    }

    public static void print_Int(int x){
        System.out.println(x);
    }


    public static void main(String[] args) {

        int age_1 = 18;

        Integer age_2 = age_1; // (auto) box int to Integer
        int age_3 = age_2;     // (auto) unbox Integer to int

        // type cast, these two are the same
        double age_4 = age_1;               // auto
        double age_5 = (double) age_1;      // manually
        System.out.println(age_4);

    }

}

