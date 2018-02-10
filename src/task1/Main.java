package task1;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        addList(list);
        markLenght4(list);
        System.out.println(list);
    }

    private static void markLenght4(List<String> list) {
        for (ListIterator<String> iterator = list.listIterator(list.size() - 1); iterator.hasPrevious(); ) {
            if (iterator.previous().length() == 4) {
                iterator.add("****");
                iterator.previous();
            }
        }
    }

    private static void addList(List<String> list) {
        list.add("this");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("programmer");
    }
}
