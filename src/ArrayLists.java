import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args){
        ArrayList<Float> arrayList= new ArrayList<>();

        //add values to list
        arrayList.add(4F);
        arrayList.add(Float.valueOf(7));
        arrayList.add((float) 0.9);
        arrayList.add(98.5F);
        arrayList.add(7F);

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

        //get Index No from list
        System.out.println(arrayList.indexOf(98.5F));

        //get last index of a num from list
        System.out.println(arrayList.lastIndexOf(7F));

        //Create one more list and merge into previous list
        ArrayList<Float> arrayList1= new ArrayList<>();
        arrayList1.add(9F);
        arrayList1.add(75F);
        arrayList1.add(31F);

        arrayList.addAll(arrayList1);

        //print list
        System.out.println(arrayList.toString());

        //Search for value at particular Index in list
        System.out.println(arrayList.get(4));

        //Print sublist within list
        System.out.println(arrayList.subList(2, 5));
        //2 - Inclusive and 5 - Exclusive


    }

}
