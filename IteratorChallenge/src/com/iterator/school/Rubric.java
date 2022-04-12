package com.iterator.school;

public class Rubric {
    private double practicesValue, behaviorValue, examValue;

    public Rubric(double practicesValue, double behaviorValue, double examValue) {
        this.practicesValue = practicesValue;
        this.behaviorValue = behaviorValue;
        this.examValue = examValue;
    }

    public double getPracticesValue() {
        return practicesValue;
    }

    public void setPracticesValue(double practicesValue) {
        this.practicesValue = practicesValue;
    }

    public double getBehaviorValue() {
        return behaviorValue;
    }

    public void setBehaviorValue(double behaviorValue) {
        this.behaviorValue = behaviorValue;
    }

    public double getExamValue() {
        return examValue;
    }

    public void setExamValue(double examValue) {
        this.examValue = examValue;
    }

}
