package exercises.ch8.Interfaceandabstractclass;

public class BeautifulBird extends Bird {
    @Override
    void eat() {
        System.out.println("Eating feed...");
    }

    @Override
    public void fly() {
        System.out.println("Flying in the lower sky");
    }
}
