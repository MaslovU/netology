package homework3_1_2;

public class DieselType extends VehicleTypeByFuelTypes {

    private final String attribute = String.valueOf(VehicleTypeEnum.DIESEL);

    public String getAttribute() {
        return attribute;
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
