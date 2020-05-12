package exercises.ch5;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student student1 = new Student("Miley");
        Student student2 = new Student("Miley");
        Student student3 = student2;
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student2.equals(student1));
        System.out.println(student2 == student1);
        System.out.println(student2.getName() == student1.getName());
        System.out.println(student2.equals(student3));
        System.out.println(student2 == student3);



    }
}
