public abstract class WheeledVehicle implements RidesOnWheels {
    private String modelName;
    private int wheelsCount;

    public WheeledVehicle() {
        modelName = "не задано";
        wheelsCount = 0;
    }

    public WheeledVehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void check() {
        updateTyres();
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void updateTyres() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
