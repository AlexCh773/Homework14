public class ServiceStation {
    public void check(Car car) {
        updateTyres(car);
        car.checkEngine();
    }

    public void check(Bicycle bicycle) {
        updateTyres(bicycle);
    }

    public void check(Truck truck) {
        updateTyres(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

    public void updateTyres(WheeledVehicle wheeledVehicle) {
        if (wheeledVehicle != null) {
            System.out.println("\nОбслуживаем " + wheeledVehicle.getModelName() + ":");
            for (int i = 0; i < wheeledVehicle.getWheelsCount(); i++) {
                wheeledVehicle.updateTyre();
            }
        }
    }
}