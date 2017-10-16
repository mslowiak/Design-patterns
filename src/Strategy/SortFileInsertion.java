package Strategy;

import java.util.List;

/**
 * Created by mq on 2017-10-16.
 */
public class SortFileInsertion implements SortFile {
    @Override
    public List<Integer> sortFile(List<Integer> out) {
        int i, key, j;
        for (i = 1; i < out.size(); i++) {
            key = out.get(i);
            j = i-1;
            while (j >= 0 && out.get(j) > key) {
                out.set(j+1, out.get(j));
                j = j-1;
            }
            out.set(j+1, key);
        }
        return out;
    }
}
