/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01_B;

/**
 *
 * @author John
 */
public class FinalExam extends GradedActivity {

    int numQuestions;
    double pointsEach;
    int numMissed;

    public FinalExam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;
        this.pointsEach = (double) 100 / questions;
        super.score = 100 - (missed * pointsEach);
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }

    @Override
    public String toString() {
        return "Each question counts for " + pointsEach + " points."
                + "\nThe exam score is " + score
                + "\nThe exam grade is " + getGrade(score);
    }
}
