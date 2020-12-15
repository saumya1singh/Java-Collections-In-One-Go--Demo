import java.util.LinkedList;

public class LinkedLists {

    public static void main(String args[]){
        LinkedList<Integer> linkedList= new LinkedList<>();

        linkedList.add(8);
        linkedList.add(23);
        linkedList.add(49);
        linkedList.add(59);
        linkedList.add(4, 98);
        linkedList.add(49);

        //Create same copy of this linkedList
        LinkedList<Integer> linkedList1= (LinkedList<Integer>) linkedList.clone();

        //check if particular value is present in LL
        System.out.println(linkedList.contains(23));

        //Size of list
        System.out.println(linkedList.size());

        //Add values at First and Last Index in List
        linkedList.addFirst(1);
        linkedList.addLast(100);

        //Print First and Last value from LinkedList
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());


        //Remove first or last occurrence of an element from list
        linkedList.removeFirstOccurrence(49);
        linkedList.removeLastOccurrence(49);

        //Print first element of list
        System.out.println(linkedList.peek());
        System.out.println(linkedList.poll());

        System.out.println(linkedList);
        System.out.println(linkedList1);

    }

}
