package IteratorObservator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyCollectionWithOwnIterator<E> extends ArrayList<E> {
    public MyCollectionWithOwnIterator() {
    }

    public MyCollectionWithOwnIterator(Collection<? extends E> c) {
        super(c);
    }

    @Override
    public Iterator<E> iterator() {
        return new OwnIterator();
    }

    private class OwnIterator<E> implements Iterator<E> {
        int current = 0;

        public boolean hasNext() {
            return current != 2*size();
        }

        public E next() {
            int i = 0;
            if(current >= size()){
                i = current - size();
            }
            else{
                i = current;
            }
            if(i >= size())
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] elementData = MyCollectionWithOwnIterator.this.toArray();
            current++;

            return (E) elementData[i];
        }
    }
}
