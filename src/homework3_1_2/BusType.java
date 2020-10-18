package homework3_1_2;

public class BusType extends VehicleTypeByBodyTypes {

    private final String attribute = String.valueOf(VehicleTypeEnum.BUS);

    public String getAttribute() {
        return attribute;
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}
