import java.util.List;

public interface Manager<T> {
    void add(T obj);
    List<T> getAll();
    T findById(String id);
    void sortById();
    T findByName(String name);
    void sortByName();
}
