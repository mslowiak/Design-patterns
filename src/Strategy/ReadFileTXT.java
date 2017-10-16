package Strategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mq on 2017-10-16.
 */
public class ReadFileTXT implements ReadFile{

    @Override
    public List<Integer> readFile(String fileName) {
        List<Integer> list = new ArrayList<>();
        String file = fileName + ".txt";
        try {
            Scanner read = new Scanner(new File(file));
            while(read.hasNext()){
                String in = read.nextLine();
                String [] singleNumbers = in.split(" ");
                for (int i = 0; i < singleNumbers.length; i++){
                    list.add(Integer.parseInt(singleNumbers[i]));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
