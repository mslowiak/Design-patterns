package IteratorObservator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cos = new ObservableCollection<>(new ArrayList<>());
        cos.add("Heja");
        cos.add("Hop");
        cos.add("bum sialalala");
        cos.remove(1);

        Iterator<String> iterator = cos.iterator();
        while(iterator.hasNext()){
            String y = iterator.next();
            System.out.println(y);
        }
    }
}
