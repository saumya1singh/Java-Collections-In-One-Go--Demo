import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args){
        HashMap<Integer, String> hashMap= new HashMap<>();

        hashMap.put(1, "Saumya Singh");
        hashMap.put(2, "Alexander");
        hashMap.put(3, "Max Kevin");

        System.out.println(hashMap.containsKey(2));
        System.out.println(hashMap.containsKey(5));

        System.out.println(hashMap.containsValue("Saumya"));
        System.out.println(hashMap.containsValue("Saumya Singh"));

        //Print all values (key set and values set)
        System.out.println(hashMap.values());
        System.out.println(hashMap.keySet());

        System.out.println(hashMap);

        //Update a value at particular key
        System.out.println(hashMap.compute(1,(key, value)->"Saumya Madam"));

        System.out.println(hashMap);
    }
}
