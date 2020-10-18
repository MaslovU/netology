package homework3_1_2;

public class PassengerType extends VehicleTypeByPurpose {

    private final String attribute = String.valueOf(VehicleTypeEnum.PASSENGER);

    public String getAttribute() {
        return attribute;
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }
}
