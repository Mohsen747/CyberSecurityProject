package collectionExamples;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestLinkedListCollection {
    public static void main(String[] args) {
        List<String> nameList = new LinkedList<>();
        String[] names = {"Ann", "Bob", "Carol"};

        // Reading from array names and filling up LinkedList nameList
        for (String name : names) {
            nameList.add(name);
        }

        // Printing elements of linked list using get()
        System.out.println("Printing elements of linked list using get()");
        for (String name : nameList) {
            System.out.println(name);
        }
        System.out.println();

        // Traverse and built-in class LinkedList
        System.out.println("Printing elements of linked list using Iterator");
        ListIterator<String> it = nameList.listIterator();
        while (it.hasNext()) {
            String strEle = it.next();
            System.out.println(strEle);
            if (strEle.equals("Bob")) {
                it.set("Lee");
            }
        }
        System.out.println();

        System.out.println("Printing elements of linked list after updating in forward");
        it = nameList.listIterator();
        while (it.hasNext()) {
            String strEle = it.next();
            System.out.println(strEle);
        }
        System.out.println();

        System.out.println("Printing elements of linked list after updating in backward");
        while (it.hasPrevious()) {
            String strEle = it.previous();
            System.out.println(strEle);
        }
        System.out.println();
    }
}
