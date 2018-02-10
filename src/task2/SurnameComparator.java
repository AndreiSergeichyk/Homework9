package task2;

import java.util.Comparator;

public class SurnameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSurName().compareTo(o2.getSurName());
    }
}
