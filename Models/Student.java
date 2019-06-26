package Models;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Random;

public class Student<schoolYear> {
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private Group group;
    private int schoolYear = 1;


    public Student(String firstName, String lastName, LocalDate birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }


    public boolean equals(Student student) {
        return student.getFirstName().equals(this.firstName)
                &&
                student.getLastName().equals(this.lastName)
                &&
                student.getBirthDay().equals(this.birthDay);
    }

    public String toString() {
        return firstName + " " + lastName + " klasa " + schoolYear + " " + group;
    }

    public int HashCode() {
        int code = birthDay.getDayOfYear() * birthDay.getMonthValue() + birthDay.getDayOfMonth();
        char[] dst = new char[6];

        firstName.getChars(0, 3, dst, 0);
        lastName.getChars(0, 3, dst, 3);
        for (char c : dst) {

            code *= c;
        }
        return code;
    }


}





