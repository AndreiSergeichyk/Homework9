package task2;

import java.util.Comparator;

public class OldComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        Integer old1 = new Integer(o1.getOld());
        Integer old2 = new Integer(o2.getOld());

        return old1.compareTo(old2);
    }
}
