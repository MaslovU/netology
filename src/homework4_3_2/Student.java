package homework4_3_2;

import java.util.Set;

public class Student {

    private String name;
    private String group;
    private String studentId;

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getStudentId() {
        return studentId;
    }

    public boolean checkStudentId(Set<Student> listOfStudent, Student student) {
        return listOfStudent.contains(student);
    }

    @Override
    public String toString() {
        return getName() + " " + getGroup() + " " + getStudentId();
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return this.getStudentId().equals(student.getStudentId());
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(getStudentId());
    }
}
