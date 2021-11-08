import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
    private Node head;

    private class Node{
        T data=null;
        Node next=null;
        public Node(T d){data=d;}
    }

    public void addToFront(T d){
        Node newHead = new Node(d);
        newHead.next = head;
        head=newHead;
    }

    @Override
    public MyLinkedListIterator iterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements Iterator<T>{
        Node cur;
        public MyLinkedListIterator(){
            cur = head;
        }
        @Override
        public boolean hasNext() {
            return cur != null;
        }
        @Override
        public T next() {
            T d = cur.data;
            cur = cur.next;
            return d;
        }

        

    }

     public static void main(String args[]) {
        MyLinkedList<Integer> l = new MyLinkedList<Integer>();
        for(int i=0;i<1000;i++){ l.addToFront(i);}

        for(int i : l){
            System.out.println(i);
            //l.delete(i); <-- bad for iteration
        }
        // |
        // |
        // V
        /*
        Iterator<Integer> iter = l.iterator();
        while(iter.hasNext()){
            int i = iter.next();
            System.out.println(i);
        }
        */

    }

}
