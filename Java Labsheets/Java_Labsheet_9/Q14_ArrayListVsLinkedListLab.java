import java.util.ArrayList;
import java.util.LinkedList;

public class Q14_ArrayListVsLinkedListLab {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        arrayList.add("A"); arrayList.add("B"); arrayList.add("C");
        linkedList.add("A"); linkedList.add("B"); linkedList.add("C");
        arrayList.add(1, "X");
        linkedList.add(1, "X");
        arrayList.remove("B");
        linkedList.remove("B");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("ArrayList get(1): " + arrayList.get(1));
        System.out.println("LinkedList get(1): " + linkedList.get(1));
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());
        System.out.println("Both support insertion, deletion, get, size and iteration operations.");
    }
}

/*
Output:
ArrayList: [A, X, C]
LinkedList: [A, X, C]
ArrayList get(1): X
LinkedList get(1): X
ArrayList size: 3
LinkedList size: 3
Both support insertion, deletion, get, size and iteration operations.
*/
