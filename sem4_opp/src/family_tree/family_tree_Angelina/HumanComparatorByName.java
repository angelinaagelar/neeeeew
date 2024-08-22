package family_tree.family_tree_Angelina;



import family_tree.family_tree_Angelina.TreeNode;
import family_tree.human.Human;
import java.util.Comparator;

public class HumanComparatorByName<T extends TreeNode<T>> implements Comparator<T> {
    @Override
    public int compare(T h1, T h2) {
        return h1.getName().compareTo(h2.getName());
    }
}