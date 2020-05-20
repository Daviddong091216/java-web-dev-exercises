package exercises.ch8.Interfaceandabstractclass;

public class Main {
    public static void main(String[] args) {
        FlightAirplane flightAirplane= new FlightAirplane();
        flightAirplane.setName("Aaron");
        System.out.println(flightAirplane.getName());
        flightAirplane.fly();
        flightAirplane.fullFill();

        BeautifulBird beautifulBird=new BeautifulBird();
        beautifulBird.setName("Miley");
        System.out.println(beautifulBird.getName());
        beautifulBird.fly();
        beautifulBird.eat();
    }
}
