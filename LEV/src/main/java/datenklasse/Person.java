package datenklasse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="person")
public class Person {

    @Id
    @GeneratedValue
    private int id;
    private int fachrichtungId;
    private String name;
    private String vorname;
    private String email;
    private String passwort;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFachrichtungId() {
        return fachrichtungId;
    }

    public void setFachrichtungId(int fachrichtungId) {
        this.fachrichtungId = fachrichtungId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
}
