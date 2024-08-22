package family_tree.family_tree_Angelina;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<T extends TreeNode<T>> implements Serializable, Iterable<T> {
    private List<T> familyMembers;

    public FamilyTree(List<T> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public String displayFamilyTree() {
        StringBuilder sb = new StringBuilder();
        for (T member : familyMembers) {
            sb.append(member.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return familyMembers.iterator();
    }
}
