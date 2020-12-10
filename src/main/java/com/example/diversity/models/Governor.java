package com.example.diversity.models;

import java.time.LocalDate;

public class Governor {

    Person person;
    LocalDate yearStart;
    LocalDate yearEnd;
    String state;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LocalDate getYearStart() {
        return yearStart;
    }

    public void setYearStart(LocalDate yearStart) {
        this.yearStart = yearStart;
    }

    public LocalDate getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(LocalDate yearEnd) {
        this.yearEnd = yearEnd;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
