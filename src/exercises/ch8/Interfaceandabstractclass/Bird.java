package exercises.ch8.Interfaceandabstractclass;

public abstract class Bird implements Fly{
    private String name;

    public Bird() {
    }

    public Bird(String name) {
        this.name = name;
    }

    abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
