/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01_B;

/**
 *
 * @author John
 */
public class PassFailExam extends PassFailActivity {

    int numQuestions;
    double pointsEach;
    int numMissed;

    public PassFailExam(int numQuestions, int numMissed, double minPassingScore) {
        super(minPassingScore);
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        this.pointsEach = (double) 100 / numQuestions;
        super.score = 100 - (numMissed * pointsEach);

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
                + "\nExam grade is " + getGrade(score);
    }
}
