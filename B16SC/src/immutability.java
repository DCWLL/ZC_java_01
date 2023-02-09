public class immutability {

    //final keyword prevent any changes
    public final int STREET_NUMBER = 8888;

    //
    private String street = "Minoru Blvd";

    public String city = "Quebec";

    public static void main(String[] args) {

        immutability IM_1 = new immutability();

        System.out.println(IM_1.street.charAt(1));


    }




}
