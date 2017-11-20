package IteratorObservator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("My list with observable");
        List<String> list1 = new ObservableCollection<>(new ArrayList<>());
        list1.add("jeden");
        list1.add("dwa");
        list1.add("trzy");

        Iterator<String> iterator1 = list1.iterator();
        while(iterator1.hasNext()){
            String y = iterator1.next();
            System.out.println(y);
        }

        list1.remove(1);


        System.out.println("\n\nMy list with own iterator");
        List<String> list2 = new MyCollectionWithOwnIterator<>(new ArrayList<>());
        list2.add("jeden");
        list2.add("dwa");
        list2.add("trzy");

        Iterator<String> iterator2 = list2.iterator();
        while(iterator2.hasNext()){
            String y = iterator2.next();
            System.out.println(y);
        }
    }
}
