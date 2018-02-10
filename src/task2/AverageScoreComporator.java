package task2;

import java.util.Comparator;

public class AverageScoreComporator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        Double score1 = new Double(o1.getAverageScore());
        Double score2 = new Double(o2.getAverageScore());

        return score1.compareTo(score2);
    }
}
