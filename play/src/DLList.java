public class DLList {

    intNode sentinel;
    int size;

    /* constructor */
    public DLList(){
        sentinel = new intNode(999, null, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    public DLList(int i){
        sentinel = new intNode(999, null, null);
        sentinel.next = new intNode(i, sentinel, sentinel);
        sentinel.prev = sentinel.next;
        sentinel.next.prev = sentinel;
        sentinel.next.next = sentinel;
        size = 1;
    }

    public void addFirst(int i){
        intNode current = new intNode(i, sentinel, sentinel.next);
        sentinel.next.prev = current;
        sentinel.next = current;
        size += 1;
    }

    public void addLast(int i){
        intNode current = new intNode(i, sentinel.prev, sentinel);
        sentinel.prev.next = current;
        sentinel.prev = current;
        size += 1;
    }


    public void printList(){
        intNode current = sentinel.next;
        while (current != sentinel){
            System.out.println(current.val);
            current = current.next;
        }

    }





}
