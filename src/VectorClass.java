import java.util.ListIterator;
import java.util.Vector;

public class VectorClass {

    public static void main(String[] args){
        Vector<Integer> vector= new Vector<>();

        //set capacity of vector
        vector.ensureCapacity(20);

        //adding elements
        vector.add(4);
        vector.add(8);
        vector.add(45);

        //print size
        System.out.println(vector.size());

        //vector clone
        Vector<Integer> vectorClone= (Vector<Integer>) vector.clone();

        //check if element present in vector
        System.out.println(vector.contains(4));

        //List Iterator
        ListIterator<Integer> iteratorList= vector.listIterator();

        //Print in forward manner
        while(iteratorList.hasNext()){
            System.out.print("  " + iteratorList.next());
        }

        //Print in reverse manner
        while (iteratorList.hasPrevious()){
            System.out.println("  " + iteratorList.previous());
        }

        //print values in vector
        System.out.println(vector);
        System.out.println(vectorClone);


    }
}
