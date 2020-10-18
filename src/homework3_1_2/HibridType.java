package homework3_1_2;

public class HibridType extends VehicleTypeByFuelTypes {

    private final String attribute = String.valueOf(VehicleTypeEnum.HYBRID);

    public String getAttribute() {
        return attribute;
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}
