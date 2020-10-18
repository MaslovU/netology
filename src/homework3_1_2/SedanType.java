package homework3_1_2;

public class SedanType extends VehicleTypeByBodyTypes {

    private final String attribute = String.valueOf(VehicleTypeEnum.SEDAN);

    public String getAttribute() {
        return attribute;
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
