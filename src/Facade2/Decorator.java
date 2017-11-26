package Facade2;

import java.util.ArrayList;
import java.util.Iterator;

public class Decorator<E> extends ArrayList<E> {
    @Override
    public Iterator iterator() {
        return super.iterator();
    }

    @Override
    public boolean add(E e){
        return super.add(e);
    }

    @Override
    public E remove(int index){
        return super.remove(index);
    }
}
