public class TestIntList {
    public static void main(String[] args) {
        SLList list1 = new SLList();
        list1.addLast(999);
        list1.addLast(1000);
        list1.addFirst(111);
        list1.addFirst(123);

        list1.printList();

        System.out.println("Size of this is SLList is " + list1.size);

    }
}
