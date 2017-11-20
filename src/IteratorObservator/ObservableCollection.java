package IteratorObservator;

import java.util.ArrayList;
import java.util.Collection;

public class ObservableCollection<E> extends ArrayList<E> {
    public ObservableCollection() {
    }

    public ObservableCollection(Collection<? extends E> c) {
        super(c);
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
}
