package Builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {
    private Builder builder;

    public void parseFile(String fileName){
        if(builder == null){
            System.out.println("Can't parse, builder not set");
        }else{
            String file = fileName + ".csv";
            try {
                Scanner read = new Scanner(new File(file));
                while(read.hasNext()){
                    String in = read.nextLine();
                    String [] data = in.split(":");
                    builder.addColor(new Tile(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]),
                            Integer.parseInt(data[3])));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            builder.createOutput();
        }
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
