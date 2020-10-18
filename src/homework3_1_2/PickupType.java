package homework3_1_2;

public class PickupType extends VehicleTypeByBodyTypes {

    private final String attribute = String.valueOf(VehicleTypeEnum.PICKUP);

    public String getAttribute() {
        return attribute;
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PICKUP.name();
    }
}
