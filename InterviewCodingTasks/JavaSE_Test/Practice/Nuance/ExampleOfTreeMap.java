package JavaSE_Test.Practice.Nuance;

import java.util.TreeMap;

public class ExampleOfTreeMap {

    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap=new TreeMap<>();
        treeMap.put("user", 12);
        treeMap.put("admin", 45);

        System.out.println("treeMap.get(\"user\") = " + treeMap.get("user")); // 12
        System.out.println("treeMap.keySet() = " + treeMap.keySet());// [admin, user]
        System.out.println("treeMap.entrySet() = " + treeMap.entrySet()); //[admin=45, user=12]
        treeMap.replace("user", 12, 1);
        System.out.println("treeMap.entrySet() = " + treeMap.entrySet()); //[admin=45, user=1]

    }

}
