package com.ashish;

import java.util.Date;

public class Student extends Person
{
    private String coursename;
    private float Marks[];
    private float total;
    private float percentage;
    private String result;


    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public float[] getMarks() {
        return Marks;
    }

    public void setMarks(float[] marks) {
        Marks = marks;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public void display() {

    }

    @Override
    public void print() {

    }
}

