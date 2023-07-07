package org.daniel.models;

import java.util.Objects;

public class Teacher extends Person {

    public int teacherID;

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                '}';
    }

    public Teacher(int teacherID, String email, String firstName, String lastName, int gradeLevel) {
        super(email, firstName, lastName, gradeLevel);
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return teacherID == teacher.teacherID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teacherID);
    }

}
