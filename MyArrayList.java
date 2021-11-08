import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
    
    Object dataArray[];

    public T get(int index){ return (T) dataArray[index];}
    public int size(){return 0;}
    @Override

    public MyArrayListIterator iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements Iterator<T>{
        int index;
        public MyArrayListIterator(){
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < size();
        }

        @Override
        public T next() {
            return get(index++);
        }

    }



}
