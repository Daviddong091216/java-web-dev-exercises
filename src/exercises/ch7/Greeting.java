package exercises.ch7;

public class Greeting extends Message {
    private boolean friendly = true;
    private String language;
    private String text;


//    public Greeting(String aLanguage, String aText){
//        super(aLanguage, aText);
//    }
    public Greeting(String aLanguage, String aText, boolean isFriendly){
        super(aLanguage, aText);
        friendly = isFriendly;
    }
}
