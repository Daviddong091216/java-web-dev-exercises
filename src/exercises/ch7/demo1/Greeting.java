package exercises.ch7.demo1;

public class Greeting extends Message{
    private boolean waving;

    public Greeting(String aLanguage, String aText) {
        super(aLanguage, aText);
    }

    public void wave() {
        waving = true;
    }
}
