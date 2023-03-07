public class ServiceStation {

    public void service(WheeledVehicle wheeledVehicle) {
        if (wheeledVehicle != null) {
            System.out.println("\nОбслуживаем " + wheeledVehicle.getModelName() + ":");
            check(wheeledVehicle);
        }
    }

    public void check(RidesOnWheels wheeledVehicle) {
        wheeledVehicle.check();
    }
}