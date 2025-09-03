/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01_B;

/**
 *
 * @author John
 */

public class CourseGrades implements Analyzable {

    GradedActivity[] grades;
    final static int NUM_GRADES = 4;

    public CourseGrades() {
        this.grades = new GradedActivity[NUM_GRADES];
    }

    @Override
    public double getAverage() {
        return (grades[0].score + grades[1].score + grades[2].score + grades[3].score) / 4;
    }

    @Override
    public double getHighest() {
        double max = grades[0].score;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i].score > max) {
                max = grades[i].score;
            }
        }
        return max;
    }

    @Override
    public double getLowest() {
        double min = grades[0].score;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i].score < min) {
                min = grades[i].score;
            }
        }
        return min;
    }

    public void setLab(GradedActivity lab) {
        grades[0] = lab;
    }

    public void setPassFailExam(PassFailExam exam) {
        grades[1] = exam;
    }

    public void setEssay(Essay essay) {
        grades[2] = essay;
    }

    public void setFinalExam(FinalExam finalExam) {
        grades[3] = finalExam;
    }

    @Override
    public String toString() {
        return "Lab score: " + grades[0].score + "\tGrade: " + grades[0].getGrade(grades[0].score)
                + "\nPass/fail exam score: " + grades[1].score + "\tGrade: " + grades[1].getGrade(grades[1].score)
                + "\nEssay score: " + grades[2].score + "\tGrade: " + grades[2].getGrade(grades[2].score)
                + "\nFinal Exam score: " + grades[3].score + "\tGrade: " + grades[3].getGrade(grades[3].score);
    }
}
