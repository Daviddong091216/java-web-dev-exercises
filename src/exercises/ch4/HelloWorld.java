package exercises.ch4;

public class HelloWorld {

    private String message;

    public HelloWorld() {
    }

//    public HelloWorld(String message) {
//        this.message = message;
//    }
    public HelloWorld(String message, String name) {
        this.message = message;
        System.out.print(name);
    }


    public  String getMessage() {
        return message;
    }

    public  void setMessage(String message) {
        this.message = message;
    }
}

