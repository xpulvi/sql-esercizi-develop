package com.github.xpulvi;

public class Utente {
    protected String name;
    protected String surname;

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

    public Utente(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
