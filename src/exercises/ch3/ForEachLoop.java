package exercises.ch3;

public class ForEachLoop {
    public static void main(String[] args) {
        String msg = "Hello Miley, I love you!";
        /*for (char c : msg.toCharArray()) {
            System.out.println(c);
        }*/
        for (int i=0; i < msg.length(); i ++) {
            System.out.println(msg.toCharArray()[i]);
        }


    }
}
