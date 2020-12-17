import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args){
        HashSet<Integer> hashSet= new HashSet<>();

        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(9);

        System.out.println(hashSet.size());

        System.out.println(hashSet.isEmpty());

        System.out.println(hashSet.contains(2));

        Iterator<Integer> iterator= hashSet.iterator();

        while (iterator.hasNext()){
            System.out.print( "  " + iterator.next());
        }

        System.out.println();

        System.out.println(hashSet);
    }
}
