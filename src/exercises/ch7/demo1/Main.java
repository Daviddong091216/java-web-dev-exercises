package exercises.ch7.demo1;

public class Main {
    public static void main(String[] args) {
        Message hello1 = new Greeting("English","Hello Miley!");
        ((Greeting)hello1).wave();
//        Message hello2 = new Greeting("English","Hello Miley!");
//        hello2.wave();
//        Greeting hello3 = new Message("English","Hello Miley!");
//        hello3.wave();
        Greeting hello4 = new Greeting("English","Hello Miley!");
        hello4.wave();
        System.out.println((Message)hello4);
    }
}
