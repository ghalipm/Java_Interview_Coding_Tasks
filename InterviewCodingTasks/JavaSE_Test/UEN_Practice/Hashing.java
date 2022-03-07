package JavaSE_Test.UEN_Practice;

// Java doesn't include hashing by default, you have to import it from java.util library
// Importing hashmaps : intelliJ does it automatically
import java.util.HashMap;
import java.util.stream.Stream;

public class Hashing {

    // Declaration
    HashMap<Integer, String> myHashTable = new HashMap<Integer, String>(); // declares an empty map.

    // Insertion
    //myHashTable.put(key, value);

    // Deletion
   // myHashtable.remove(key);

    // Look up
    //myHashTable.get(key); // returns null if the key K is not present
    //myHashTable.containsKey(key); // returns a boolean value, indicating the presence of a key

    // Number of key, value pairs in the hash table
    //myHashTable.size();

    public static void main(String[] args) {
        // insert some values into
        Hashing hashing=new Hashing();
        hashing.myHashTable.put(1, "Albania");
        hashing.myHashTable.put(2, "Barbados");
        hashing.myHashTable.put(3, "Canada");
        // get the value at index i:
        for (int i = 0; i < hashing.myHashTable.size(); i++) {
            System.out.println("hashing.myHashTable.get("+(i+1)+") = " + hashing.myHashTable.get(i+1));
        }

        // at index 3, chile is added:
        hashing.myHashTable.put(3, "Chile");
        System.out.println("======at index 3, chile is added=======");
        // get the value at index i:
        for (int i = 0; i < hashing.myHashTable.size(); i++) {
            System.out.println("hashing.myHashTable.get("+(i+1)+") = " + hashing.myHashTable.get(i+1));
        }
        System.out.println("hashing.myHashTable.size() = " + hashing.myHashTable.size());
        System.out.println("hashing.myHashTable.containsValue(\"Canada\") = " + hashing.myHashTable.containsValue("Canada"));

        // get the value at index i:
        for (int i = 0; i < hashing.myHashTable.size(); i++) {
            System.out.println("hashing.myHashTable.get("+(i+1)+") = " + hashing.myHashTable.get(i+1));
        }


        // delete/remove a value at key=1:
        hashing.myHashTable.remove(1);
        System.out.println("===========after value at index 1 is removed=======");

        System.out.println("hashing.myHashTable.get(1) = " + hashing.myHashTable.get(1));
        System.out.println("keys:");
        //hashing.myHashTable.keySet().stream().forEach(System.out::println);
        hashing.myHashTable.keySet().forEach(System.out::println);
        System.out.println("values:");
        hashing.myHashTable.values().forEach(System.out::println);

    }

}
