package task2;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    SurnameComparator surnameComporator = new SurnameComparator();

    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getName().compareTo(o2.getName());

        if (result == 0) {
            result = surnameComporator.compare(o1, o2);
        }
        return result;
    }
}
