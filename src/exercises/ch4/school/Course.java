package exercises.ch4.school;

import java.util.HashMap;

public class Course {

    private int year;
    private String subject;
    private HashMap<Student, Double> credits;

    public Course(int year, String subject, HashMap<Student, Double> credits) {
        this.year = year;
        this.subject = subject;
        this.credits = credits;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public HashMap<Student, Double> getCredits() {
        return credits;
    }

    public void setCredits(HashMap<Student, Double> credits) {
        this.credits = credits;
    }
}
