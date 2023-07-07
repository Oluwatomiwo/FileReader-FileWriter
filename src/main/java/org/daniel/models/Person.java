package org.daniel.models;

import java.util.Objects;

public class Person {
    private String Email;
    private String firstName;
    private String lastName;
    private int gradeLevel;

    public Person(String email, String firstName, String lastName, int gradeLevel) {
        Email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
    }

    public Person() {

    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return gradeLevel == person.gradeLevel && Objects.equals(Email, person.Email) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Email, firstName, lastName, gradeLevel);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Email='" + Email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gradeLevel=" + gradeLevel +
                '}';
    }
}


