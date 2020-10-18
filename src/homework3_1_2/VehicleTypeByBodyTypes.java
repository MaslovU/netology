package homework3_1_2;

public class VehicleTypeByBodyTypes extends VehicleType {

    protected String attribute;

    public VehicleTypeByBodyTypes() {
        super("Vehicle type by body types");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByPurpose that = (VehicleTypeByPurpose) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}
