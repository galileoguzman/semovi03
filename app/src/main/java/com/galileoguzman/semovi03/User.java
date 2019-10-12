package com.galileoguzman.semovi03;

// Aquí pasó el paso 3
// 3.-
public class User {

    private String name;
    private String surname;
    private String twitter;

    public User(String name, String surname, String twitter) {
        this.name = name;
        this.surname = surname;
        this.twitter = twitter;
    }

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

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFullname() {
        return this.name + " " + this.surname;
    }
}
