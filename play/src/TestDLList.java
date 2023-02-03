public class TestDLList {


    public static void main(String[] args) {

        DLList my_DLList = new DLList();
        //DLList my_DLList = new DLList(9);

        int j = 0;
        while (j < 5){
            my_DLList.addLast(j);
            j++;
        }

        my_DLList.printList();

        System.out.println("Size of this list is " + my_DLList.size);

    }

}
