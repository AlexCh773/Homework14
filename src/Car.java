public class Car extends WheeledVehicle implements RidesOnWheels{
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Car() {
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }
}
