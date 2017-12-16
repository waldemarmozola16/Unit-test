package com.infoshareacademy.javaintroduction.task14.pojo;

public class Line implements Comparable<Line> {
    private String name;
    private String surname;
    private String city;
    private int number;
    private boolean status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int compareTo(Line o) {
        if (name.compareTo(o.getName()) < 0){
            return -1;
        }

        return 1;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + city;
    }
}