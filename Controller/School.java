package Controller;

import Models.*;
import jdk.nashorn.internal.AssertsEnabled;

import java.time.LocalDate;

import static Models.Grade.gradeList;
import static Utilities.Average.averageGrade;
import static Utilities.Average.totalAverage;
import static Utilities.Reports.getGrades;
import static Utilities.Reports.studentsByAverage;
import static Utilities.Reports.studentsByName;

public class School {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Anna", "Nowak");
        Student student1 = new Student("Jan", "Kowalski", LocalDate.of(2010, 6, 15));
        Student student2 = new Student("Jan", "Nowak", LocalDate.of(2010, 2, 11));
        Student student3 = new Student("Jan", "Kowal", LocalDate.of(2010, 3, 15));
        Student student4 = new Student("Janina", "Bąk", LocalDate.of(2010, 4, 23));
        Student student5 = new Student("Anna", "Kowalska", LocalDate.of(2010, 6, 15));
        Student student6 = new Student("Jan", "Kowalski", LocalDate.of(2010, 5, 2));

        student1.setGroup(Group.A);
        student2.setGroup(Group.A);
        student3.setGroup(Group.A);
        student4.setGroup(Group.B);
        student5.setGroup(Group.B);
        student6.setGroup(Group.B);

        Grade grade1 = new Grade(student1, teacher1, Subject.MATEMATYKA, 5);
        Grade grade2 = new Grade(student2, teacher1, Subject.MATEMATYKA, 1);
        Grade grade3 = new Grade(student3, teacher1, Subject.MATEMATYKA, 1);
        Grade grade4 = new Grade(student4, teacher1, Subject.MATEMATYKA, 2);
        Grade grade5 = new Grade(student5, teacher1, Subject.MATEMATYKA, 5);
        Grade grade6 = new Grade(student6, teacher1, Subject.MATEMATYKA, 6);
        Grade grade7 = new Grade(student1, teacher1, Subject.JEZYK_POLSKI, 5);
        Grade grade8 = new Grade(student2, teacher1, Subject.JEZYK_POLSKI, 4);
        Grade grade9 = new Grade(student3, teacher1, Subject.JEZYK_POLSKI, 4);
        Grade grade10 = new Grade(student4, teacher1, Subject.JEZYK_POLSKI, 5);
        Grade grade11 = new Grade(student5, teacher1, Subject.JEZYK_POLSKI, 2);
        Grade grade12 = new Grade(student6, teacher1, Subject.JEZYK_POLSKI, 3);
        Grade grade13 = new Grade(student1, teacher1, Subject.JEZYK_POLSKI, 2);
        Grade grade14 = new Grade(student2, teacher1, Subject.JEZYK_POLSKI, 3);
        Grade grade15 = new Grade(student3, teacher1, Subject.JEZYK_POLSKI, 6);
        Grade grade16 = new Grade(student4, teacher1, Subject.JEZYK_POLSKI, 6);
        Grade grade17 = new Grade(student5, teacher1, Subject.JEZYK_POLSKI, 5);
        Grade grade18 = new Grade(student6, teacher1, Subject.JEZYK_POLSKI, 5);

        gradeList.add(grade1);
        gradeList.add(grade2);
        gradeList.add(grade3);
        gradeList.add(grade4);
        gradeList.add(grade5);
        gradeList.add(grade6);
        gradeList.add(grade7);
        gradeList.add(grade8);
        gradeList.add(grade9);
        gradeList.add(grade10);
        gradeList.add(grade11);
        gradeList.add(grade12);
        gradeList.add(grade13);
        gradeList.add(grade14);
        gradeList.add(grade15);
        gradeList.add(grade16);
        gradeList.add(grade17);
        gradeList.add(grade18);

        System.out.println("total average, student1");
        System.out.println((grade1.getGrade()+grade7.getGrade()+grade13.getGrade())/3);
        System.out.println(totalAverage(student1));

        System.out.println("average grade, student3, polski");
        System.out.println((grade9.getGrade()+grade15.getGrade())/2);
        System.out.println(averageGrade(student3, Subject.JEZYK_POLSKI));

        System.out.println("Test get grades from... to...");
        getGrades(student1, LocalDate.of(2019, 6, 21), LocalDate.now());
        grade1.setDate(LocalDate.of(2018, 1, 1));
        getGrades(student1, LocalDate.of(2019, 6, 21), LocalDate.now());
        System.out.println(totalAverage(student6));

        System.out.println("Test unikalny hashcode");
        System.out.println(student1.HashCode());
        System.out.println(student2.HashCode());
        System.out.println(student3.HashCode());
        System.out.println(student4.HashCode());
        System.out.println(student5.HashCode());
        System.out.println(student6.HashCode());

        System.out.println("Students by average");
        for (Student s : studentsByAverage()){
            System.out.println(s.toString()+" " + totalAverage(s));
        }
        System.out.println("Students by name");
        for (Student s : studentsByName()){
            System.out.println(s.toString()+" " + totalAverage(s));
        }
    }




}