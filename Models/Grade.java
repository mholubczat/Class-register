package Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    private Student student;
    private Teacher teacher;
    private Subject subject;
    private LocalDate date;
    private double grade;

    public static List<Grade> gradeList = new ArrayList<>();

    public Grade(Student student, Teacher teacher, Subject subject, double grade) {
        this.student = student;
        this.teacher = teacher;
        this.subject = subject;
        this.date = LocalDate.now();
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String toString() {
        return student.getFirstName() + " " + student.getLastName() + " " + grade + " " + subject + " " + date;
    }
}
