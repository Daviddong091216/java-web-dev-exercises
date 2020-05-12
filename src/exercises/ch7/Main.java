package exercises.ch7;

public class Main {
    public static void main(String[] args) {
        Greeting one = new Greeting("English","I love you!",true);
        System.out.println(one);
        System.out.println(one.getLanguage());
        System.out.println(one.getText());
        System.out.println(one.getFriendly());

//        Cat cat = new Cat();
    }
}
