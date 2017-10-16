package Strategy;

import java.util.List;

/**
 * Created by mq on 2017-10-16.
 */
public class Strategy {
    String saveFileName;
    String readFileName;

    ReadFile readFile;
    SaveFile saveFile;
    SortFile sortFile;

    public Strategy(String readFileName, String saveFileName) {
        this.saveFileName = saveFileName;
        this.readFileName = readFileName;
    }

    public void setReadFile(ReadFile readFile) {
        this.readFile = readFile;
    }

    public void setSaveFile(SaveFile saveFile) {
        this.saveFile = saveFile;
    }

    public void setSortFile(SortFile sortFile) {
        this.sortFile = sortFile;
    }

    public void doTheJob(){
        List<Integer> list = readFile.readFile(readFileName);
        list = sortFile.sortFile(list);
        saveFile.saveFile(saveFileName, list);
    }
}
