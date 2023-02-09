public class Pet {
    String name = "xyz";
    static String school = "ddd";

    public void setName(String n){
        if ( n.length() > 5){
            // throw an exception if name is too long
            throw new IllegalArgumentException("This name is too long! make it shorter！");
        } else {
            this.name = n;
        }

    }


    public static void main(String[] args) {

        Pet x = new Pet();
        Pet y = new Pet();

        System.out.println(x.name.equals(y.name));
        System.out.println(x.name);

        x.setName("warr");

    }

}
