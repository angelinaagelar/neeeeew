package family_tree.family_tree_Angelina;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface TreeNode<T> extends Serializable, Iterable<T> {
    void setId(long id);
    long getId();
    T getFather();
    T getMother();
    boolean addChild(T child);
    boolean addParent(T parent);
    String getName();
    LocalDate getDeathDate();
    LocalDate getBirthDate();
    List<T> getParents();
    List<T> getChildren();
    T getSpouse();
    void setSpouse(T spouse);
}