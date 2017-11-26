package IteratorObservator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Decorator<E> extends ArrayList<E> {
    @Override
    public Iterator<E> iterator() {
        return new OwnIterator<>();
    }

    @Override
    public boolean add(E e){
        System.out.println("I added element to collection => " + e);
        return super.add(e);
    }

    @Override
    public E remove(int index){
        System.out.println("I deleted elem from position: " + index + " => " + get(index));
        return super.remove(index);
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
            Object[] elementData = Decorator.this.toArray();
            current++;

            return (E) elementData[i];
        }
    }
}
