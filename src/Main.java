public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car();
        car2.setModelName("car2");
        car2.setWheelsCount(4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
        station.service(car);
        station.service(car2);
        station.service(bicycle);
        station.service(bicycle2);
        station.service(truck);
        station.service(truck2);
    }
}