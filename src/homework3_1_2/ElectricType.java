package homework3_1_2;

public class ElectricType extends VehicleTypeByFuelTypes{

    private final String attribute = String.valueOf(VehicleTypeEnum.ELECTRIC);

    public String getAttribute() {
        return attribute;
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}
