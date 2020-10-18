package homework3_1_2;

public class CarType extends VehicleTypeByPurpose{

    private final String attribute = String.valueOf(VehicleTypeEnum.CAR);

    public String getAttribute() {
        return attribute;
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
