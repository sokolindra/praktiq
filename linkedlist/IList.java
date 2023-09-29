package n.mtx;

import java.util.function.Predicate;

public interface IList {

    void add(int value);

    void add(int key, int value);

    void remove(int key);

    void remove(Predicate<Integer> predicate);

    int get(int key);
    int size ();
}
