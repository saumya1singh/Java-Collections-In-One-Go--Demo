import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args){
        ArrayList<Float> arrayList= new ArrayList<>();

        //add values to list
        arrayList.add(4F);
        arrayList.add(Float.valueOf(7));
        arrayList.add((float) 0.9);

        //size of list
        System.out.println("Size : " + arrayList.size());

        //check
        System.out.println(arrayList.contains(7));

        //print list
        System.out.println(arrayList);

        //update list
        System.out.println(arrayList.set(1, (float) 8.9));


        //remove from list
        System.out.println(arrayList.remove(2));


        //print list
        System.out.println(arrayList);
    }

}
