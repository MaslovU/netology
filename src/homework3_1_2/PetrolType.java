package homework3_1_2;

public class PetrolType extends VehicleTypeByFuelTypes {

    private final String attribute = String.valueOf(VehicleTypeEnum.PETROL);

    public String getAttribute() {
        return attribute;
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
