package homework4_5_3;

public class User {

    String id;
    String fIO;
    String homeAddress;

    public User(String id, String fIO, String homeAddress) {
        this.id = id;
        this.fIO = fIO;
        this.homeAddress = homeAddress;
    }

    public String getId() {
        return id;
    }

    public String getfIO() {
        return fIO;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    @Override
    public String toString() {
        return "Id is: " + getId() +
                " FIO is: " + getfIO() +
                " home address is: " + getHomeAddress();
    }
}
