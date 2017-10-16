package Strategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mq on 2017-10-16.
 */
public class ReadFileXML implements ReadFile {
    @Override
    public List<Integer> readFile(String fileName) {
        List<Integer> list = new ArrayList<>();
        String file = fileName + ".csv";
        try {
            Scanner read = new Scanner(new File(file));
            while(read.hasNext()){
                String in = read.nextLine();
                in = in.replace("<value>", "");
                in = in.replace("</value>", "");
                list.add(Integer.parseInt(in));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
