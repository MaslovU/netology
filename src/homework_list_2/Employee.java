package homework_list_2;

public class Employee {
    private String familyName;
    private String name;
    private String age;
    private String sex;
    private String education;
    private String position;
    private String section;

    public Employee(String familyName, String name, String age, String sex,
                    String education, String position, String section) {
        this.familyName = familyName;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.education = education;
        this.position = position;
        this.section = section;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return familyName +
                " " + name +
                " " + age +
                " " + sex +
                " " + education +
                " " + position +
                " " + section;
    }
}