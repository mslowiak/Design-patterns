package IteratorObservator;

public abstract class Observer<E> {
    protected E element;
    public abstract void update();
}
