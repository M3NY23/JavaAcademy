package com.iterator.school;

public class Score {
    private double practices, behavior, exam;

    public Score(double practices, double behavior, double exam) {
        this.practices = practices;
        this.behavior = behavior;
        this.exam = exam;
    }

    public double getPractices() {
        return practices;
    }

    public void setPractices(double practices) {
        this.practices = practices;
    }

    public double getBehavior() {
        return behavior;
    }

    public void setBehavior(double behavior) {
        this.behavior = behavior;
    }

    public double getExam() {
        return exam;
    }

    public void setExam(double exam) {
        this.exam = exam;
    }
}
