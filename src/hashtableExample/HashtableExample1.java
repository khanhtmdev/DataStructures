package hashtableExample;

import java.util.Hashtable;
import java.util.Set;

public class HashtableExample1 {
    public static void main(String args[]) {
        // init hashMap
        Hashtable<String, Student1> hashMap = new Hashtable<String, Student1>();
        // add elements to hashMap
        hashMap.put("1", new Student1("A", 12, "Hanoi"));
        hashMap.put("3", new Student1("C", 13, "Hanoi"));
        hashMap.put("2", new Student1("E", 15, "Hanoi"));
        hashMap.put("4", new Student1("D", 14, "Hanoi"));
        // show hashMap
        show(hashMap);
    }

    public static void show(Hashtable<String, Student1> hashtable) {
        Set<String> keySet = hashtable.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + hashtable.get(key));
        }
    }
}
