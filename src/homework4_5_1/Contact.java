package homework4_5_1;

public class Contact {

    private String Name;
    private String Surname;
    private String Phone;
    private Enum<Group> Group;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public Enum<homework4_5_1.Group> getGroup() {
        return Group;
    }

    public void setGroup(Enum<homework4_5_1.Group> group) {
        Group = group;
    }

    @Override
    public String toString() {
        return "Contact name is: " + getName() +
                " surname " + getSurname() +
                " phone is " + getPhone() +
                " group is " + getGroup();
    }
}
