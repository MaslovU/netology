package homework3_1_2;

public class WagonType extends VehicleTypeByBodyTypes {

    private final String attribute = String.valueOf(VehicleTypeEnum.WAGON);

    public String getAttribute() {
        return attribute;
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
