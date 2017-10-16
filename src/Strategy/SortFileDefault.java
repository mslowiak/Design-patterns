package Strategy;

import java.util.Collections;
import java.util.List;

/**
 * Created by mq on 2017-10-16.
 */
public class SortFileDefault implements SortFile {
    @Override
    public List<Integer> sortFile(List<Integer> out) {
        Collections.sort(out);
        return out;
    }
}
