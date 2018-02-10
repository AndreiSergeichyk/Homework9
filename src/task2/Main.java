package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Вася", "Пупкин", 17, 6.5));
        studentList.add(new Student("Иван", "Сидоров", 15, 7.0));
        studentList.add(new Student("Андрей", "Синицин", 18, 5.7));
        studentList.add(new Student("Андрей", "Петров", 14, 9.2));

        System.out.println("Cтудент с самым высоким средним баллом: " + heighestAverageScore(studentList));

        Collections.sort(studentList, new NameComparator());
        System.out.println("сортировка по имени/фамилии: \n" + studentList);

        Collections.sort(studentList, new OldComparator());
        System.out.println("Сортировка по возрасту: \n" + studentList);

        Collections.sort(studentList, new AverageScoreComporator());
        System.out.println("Сортировка по среднему баллу: \n" + studentList);
    }

    private static Student heighestAverageScore(List<Student> studentList) {
        Student heightScoreStudent = studentList.get(0);

        for (Iterator<Student> iterator = studentList.iterator(); iterator.hasNext(); ) {
            Student student = iterator.next();
            if (heightScoreStudent.getAverageScore() < student.getAverageScore()) {
                heightScoreStudent = student;
            }
        }

        return heightScoreStudent;
    }
}
