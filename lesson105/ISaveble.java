package lesson105;

import java.util.List;

/**
 * Created by Kuba on 10/03/2019.
 */
public interface ISaveble {
    List<String> write();

    void read(List<String> savedValues);

}
