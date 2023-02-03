public class SLList {
    intList sentinel = new intList(999,null);

    public int size;

    public SLList(){
        sentinel = new intList(999,null);
        size = 0;
    }
    public SLList(int i){
       sentinel.next = new intList(i, null);
        size += 1;
    }

    public void addFirst(int i){
        intList tmp = new intList(i, null);
        if (sentinel.next == null){
            sentinel.next = tmp;
        } else {
            tmp.next = sentinel.next;
            sentinel.next = tmp;
        }
        size += 1;
    }

    public void addLast(int i){
        intList current = sentinel;
        while (current.next != null ){
            current = current.next;
        }
        current.next = new intList(i, null);


        size += 1;

    }

    public void printList(){
        intList current = sentinel.next;
        while (current != null){
            System.out.println(current.val);
            current = current.next;
        }

    }

    public void size(){

    }



}
