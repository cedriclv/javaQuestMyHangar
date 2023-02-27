import java.util.ArrayList;
import java.util.List;

public class Hangar {
    public static void main(String[] args) {

        Car audi = new Car("Audi", 125000);
        Car bmw = new Car("BMW", 38000);
        Car zodiac = new Car("Zodiac", 1000);
        Car yacht = new Car("Beneteau", 125000);

        List<Vehicle> myHangar = new ArrayList<>();
        myHangar.add(audi);
        myHangar.add(bmw);
        myHangar.add(zodiac);
        myHangar.add(yacht);

        for (Vehicle vehicle : myHangar) {
            System.out.println(vehicle.doStuff());
        }
    }
}
