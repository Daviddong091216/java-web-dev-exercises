package exercises.ch5;

import java.util.Objects;

public class Course {
    private String title;
    private int credits;
    private String instructor;

    public Course(String title, int credits, String instructor) {
        this.title = title;
        this.credits = credits;
        this.instructor = instructor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return title.equals(course.title) &&
                instructor.equals(course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, instructor);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", credits=" + credits +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}
