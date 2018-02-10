package task2;

public class Student {

    private String name;
    private String surName;
    private int old;
    private double averageScore;

    public Student(String name, String surName, int old, double averageScore) {
        this.name = name;
        this.surName = surName;
        this.old = old;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", old=" + old +
                ", averageScore=" + averageScore +
                '}';
    }
}
