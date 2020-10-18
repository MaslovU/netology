package homework3_1_2;

import java.lang.ref.SoftReference;

public class AdsService {

    private VehicleAd[] adList;

    public void setAdList(VehicleAd[] adList) {
        this.adList = adList;
    }

    public VehicleAd[] getAdList() {
        return adList;
    }

    public void filterByVehicleTypeByPurpose(VehicleTypeByPurpose vehicleType) {
        String type = vehicleType.getTypeName();
        for (VehicleAd ad : adList) {
            VehicleType el = ad.getVehicleTypeByPurpose();
            if (ad.getVehicleTypeByPurpose().getTypeName().equals(vehicleType.getTypeName())) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " + vehicleType.getTypeName() + ", критерий- " +
                        vehicleType.getAttributeOfType() + ", так как имеет тип авто " +
                        ad.getVehicleTypeByPurpose().getTypeName());
            }
        }
    }

    public void filterByVehicleTypeByBodyTypes(VehicleTypeByBodyTypes vehicleType) {
        String type = vehicleType.getTypeName();
        for (VehicleAd ad : adList) {
            VehicleType el = ad.getVehicleTypeByBodyTypes();
            if (ad.getVehicleTypeByBodyTypes().getTypeName().equals(vehicleType.getTypeName())) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " + vehicleType.getTypeName() + ", критерий- " +
                        vehicleType.getAttributeOfType() + ", так как имеет тип авто " +
                        ad.getVehicleTypeByBodyTypes().getTypeName());
            }
        }
    }

    public void filterByVehicleTypeByFuelTypes(VehicleTypeByFuelTypes vehicleType) {
        String type = vehicleType.getTypeName();
        for (VehicleAd ad : adList) {
            VehicleType el = ad.getVehicleTypeByFuelTypes();
            if (ad.getVehicleTypeByFuelTypes().getTypeName().equals(vehicleType.getTypeName())) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " + vehicleType.getTypeName() + ", критерий- " +
                        vehicleType.getAttributeOfType() + ", так как имеет тип авто " +
                        ad.getVehicleTypeByFuelTypes().getTypeName());
            }
        }
    }
}
