package org.daniel.models;

import java.util.Objects;

public class Student extends Person{

    private  String studentID;
    private String guardianemail1;
    private String guardianemail2;
    private Boolean isAchieved;
    private Boolean isDeleted;



    public String getGuardianemail1() {
        return guardianemail1;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setGuardianemail1(String guardianemail1) {
        this.guardianemail1 = guardianemail1;
    }

    public String getGuardianemail2() {
        return guardianemail2;
    }

    public void setGuardianemail2(String guardianemail2) {
        this.guardianemail2 = guardianemail2;
    }

    public Boolean getAchieved() {
        return isAchieved;
    }

    public void setAchieved(Boolean achieved) {
        isAchieved = achieved;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return studentID == student.studentID && Objects.equals(guardianemail1, student.guardianemail1) && Objects.equals(guardianemail2, student.guardianemail2) && Objects.equals(isAchieved, student.isAchieved) && Objects.equals(isDeleted, student.isDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentID, guardianemail1, guardianemail2, isAchieved, isDeleted);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", guardianemail1='" + guardianemail1 + '\'' +
                ", guardianemail2='" + guardianemail2 + '\'' +
                ", isAchieved=" + isAchieved +
                ", isDeleted=" + isDeleted +
                '}';
    }
}



