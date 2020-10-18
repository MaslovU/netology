package homework3_1_2;

public class Main {
    public static void main(String[] args) {

        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());
        VehicleAd matiz = new VehicleAd("Dew Matiz", "66", new CarType(),
                new SedanType(), new PetrolType());


        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd, matiz});

//        adsService.filterByVehicleTypeByPurpose(new PassengerType());
//        adsService.filterByVehicleTypeByPurpose(new TruckType());

        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
    }
}
