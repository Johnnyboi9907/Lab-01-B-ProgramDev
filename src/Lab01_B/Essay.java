/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01_B;

/**
 *
 * @author John
 */
public class Essay extends GradedActivity {

    double grammar;
    double spelling;
    double correctLength;
    double content;

    public void setScore(double gr, double sp, double len, double cnt) {
        double totalScore = gr + sp + len + cnt;
        super.setScore(totalScore);

    }

    public double getGrammar() {
        return grammar;
    }

    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }

    public double getSpelling() {
        return spelling;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "\nTotal points: " + score
                + "\nGrade: " + getGrade(score);
    }
}
