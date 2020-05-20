package exercises.ch8.Interfaceandabstractclass;

public class FlightAirplane extends Airplane {
    @Override
    void fullFill() {
        System.out.println("Flight airplane fullfill....");
    }

    @Override
    public void fly() {
        System.out.println("Fly in the height sky");

    }
}
