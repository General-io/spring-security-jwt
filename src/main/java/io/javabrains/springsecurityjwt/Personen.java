package io.javabrains.springsecurityjwt;

public class Personen {

    private String name;
    private String nachname;
    private String adresse;

    public Personen(String name, String nachname) {
        this.name = name;
        this.nachname = nachname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
