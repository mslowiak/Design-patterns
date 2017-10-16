package Strategy;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by mq on 2017-10-16.
 */
public class SaveFileTXT implements SaveFile {
    @Override
    public void saveFile(String saveFileName, List<Integer> list) {
        saveFileName = saveFileName + ".txt";
        try {
            PrintWriter pw = new PrintWriter(saveFileName);
            for (int i = 0; i<list.size(); i++){
                pw.print(list.get(i) + " ");
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
