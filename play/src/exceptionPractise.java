public class exceptionPractise {

    public static void main(String[] args) {

        try{
            int a = 2 / 2;
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Done");
        }





    }
}
