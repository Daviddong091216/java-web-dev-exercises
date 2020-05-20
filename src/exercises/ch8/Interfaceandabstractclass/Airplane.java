package exercises.ch8.Interfaceandabstractclass;

public abstract class Airplane implements Fly{
    private String name;

    public Airplane() {
    }

    public Airplane(String name) {
        this.name = name;
    }

    abstract void fullFill();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
