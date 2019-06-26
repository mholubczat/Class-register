package Utilities;

import Models.Grade;
import Models.Student;
import Models.Subject;

import java.time.LocalDate;

import static Models.Grade.gradeList;

public class Average {

    public static double averageGrade(Student student, Subject subject) {
        double sum = 0;
        int quantity = 0;
        for (Grade g : gradeList) {
            if (g.getStudent().equals(student) && g.getSubject().equals(subject)) {
                sum += g.getGrade();
                quantity += 1;
            }
        }
        if (quantity == 0) {
            return 0;
        } else {
            return sum / quantity;
        }
    }


    public static double totalAverage(Student student) {
        double sum = 0.0;
        int quantity = 0;
        for (Grade g : gradeList) {
            if (g.getStudent().equals(student)) {
                sum += g.getGrade();
                quantity += 1;
            }
        }
        if (quantity == 0) {
            return 0.0;
        } else {
            return sum / quantity;
        }
    }
}

