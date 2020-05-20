package exercises.ch4.student;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("Miley");
        System.out.println(stu1.getName() + " : " + stu1.getStudentId());

        Student stu2 = new Student("Miley");
        System.out.println(stu2.getName() + " : " + stu2.getStudentId());

        Student stu3 = new Student("Miley", 1, 100, 5);
        System.out.println(stu3.getName() + " : " + stu3.getStudentId());
        System.out.println(stu3.studentInfo(10));

        System.out.println(stu3.toString());
//        for (int i = 0; i < stu3.toString().length(); i++) {
//            System.out.println(stu3.toString().charAt(i));
//        }

        Teacher teacher = new Teacher("Ethan");
        Teacher teacher1 = null;
        System.out.println(stu1.getClass());
        System.out.println(stu2.getClass() == stu1.getClass());

        System.out.println(stu1 instanceof Student);

        Student stu4 = stu1;

        System.out.println(stu1.equals(stu4));

        System.out.println(stu1.hashCode()==stu4.hashCode());

    }
}
