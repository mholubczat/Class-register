package Utilities;

import Models.Grade;
import Models.Student;

import java.time.LocalDate;
import java.util.*;

import static Models.Grade.gradeList;
import static Utilities.Average.totalAverage;
import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;

public class Reports {
    public static void getGrades(Student student, LocalDate from, LocalDate to) {
        for (Grade g : gradeList) {
            if (g.getStudent().equals(student) && g.getDate().compareTo(from) >= 0 && g.getDate().compareTo(to) <= 0) {
                System.out.println(g);
            }
        }
    }


    public static List<Student> studentsByAverage() {
        List<Student> result = getStudents();

        Comparator comparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (totalAverage(s1) < totalAverage(s2)) {
                    return 1;
                }
                if (totalAverage(s2) < totalAverage(s1)) {
                    return -1;
                } else return 0;
            }
        };
        result.sort(comparator);
        return result;
    }

    public static List<Student> studentsByName() {
        List<Student> result = getStudents();
        result.sort(comparing(Student::getLastName));
        return result;
    }


    private static List<Student> getStudents() {
        Set<Student> students = new HashSet<>();
        for (Grade g : gradeList) {
            students.add(g.getStudent());
        }
        return new ArrayList<>(students);
    }
}












