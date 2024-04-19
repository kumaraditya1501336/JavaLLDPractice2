package collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list = new LinkedList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        List<Integer> linkedList = new LinkedList<>();

//        Vector

        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        hashSet.add("Adi");
        hashSet.add("ADitya");
        hashSet.add("satish");
        hashSet.add ("visjal");
        hashSet.add("Jay");

//        System.out.println(hashSet);

        linkedHashSet.add("Adi");
        linkedHashSet.add("ADitya");
        linkedHashSet.add("satish");
        linkedHashSet.add ("visjal");
        linkedHashSet.add("Jay");

//        System.out.println(linkedHashSet);

        treeSet.add("Adi");
        treeSet.add("ADitya");
        treeSet.add("satish");
        treeSet.add ("visjal");
        treeSet.add("Jay");

//        System.out.println(treeSet);

        for (String s : hashSet) {

        }

//        EnumSet

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(5);
        pq.add(2);
        pq.add(1);
        pq.add(7);
        pq.add(8);
        pq.add(10);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);
        numbers.add(7);

        Collections.sort(numbers);

        System.out.println(numbers);
    }
}
