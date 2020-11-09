package homework4_5_2;

public class Candidate {

    private String surnameNamePatronymic;
    private String sex;
    private String age;
    private Integer relevance;
    private Integer rating;

    public String getSurnameNamePatronymic() {
        return surnameNamePatronymic;
    }

    public void setSurnameNamePatronymic(String surnameNamePatronymic) {
        this.surnameNamePatronymic = surnameNamePatronymic;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getRelevance() {
        return relevance;
    }

    public void setRelevance(Integer relevance) {
        this.relevance = relevance;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return surnameNamePatronymic + ", " + relevance + ", " + rating;
    }
}
