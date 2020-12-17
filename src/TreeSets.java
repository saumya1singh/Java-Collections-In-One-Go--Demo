import javax.xml.transform.Templates;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSets {

    public static void main(String[] args){
        TreeSet<Integer> treeSet= new TreeSet<>();

        treeSet.add(7);
        treeSet.add(9);
        treeSet.add(11);
        treeSet.add(98);


        //print values from head up to given number in set
        SortedSet sortedSet= treeSet.headSet(11, true);
        System.out.println(sortedSet);

        SortedSet sortedSet1= treeSet.tailSet(9, true);
        System.out.println(sortedSet1);

        System.out.println(treeSet.pollFirst());

        System.out.println(treeSet);
    }
}
