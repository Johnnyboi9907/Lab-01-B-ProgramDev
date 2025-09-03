/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01_B;

/**
 *
 * @author John
 */
public class PassFailActivity extends GradedActivity {

    double minPassingScore;

    public PassFailActivity(double minPassingScore) {
        this.minPassingScore = minPassingScore;
    }

    @Override
    public char getGrade(double score) {
        char passGrade = 'F';

        if (super.getScore() >= minPassingScore) {
            passGrade = 'P';
        }
        return passGrade;
    }
}
