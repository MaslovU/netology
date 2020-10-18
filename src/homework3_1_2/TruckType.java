package homework3_1_2;

public class TruckType extends VehicleTypeByPurpose {

    private final String attribute = String.valueOf(VehicleTypeEnum.TRUCK);

    public String getAttribute() {
        return attribute;
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
