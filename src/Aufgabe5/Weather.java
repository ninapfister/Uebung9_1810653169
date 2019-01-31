package Aufgabe5;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {
    private int id;
    private String main;
    private String description;
    private String icon;

    @JsonProperty("Identifikation") // rename Variable, Eigenschaft
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonIgnore // wird nicht ausgesendet, ohne Passwort einloggen nicht möglich, geblocked für serialisieren
    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    @JsonProperty("Beschreibung") // Eigenschaft
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("Bild") // Eigenschaft
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override // überschreiben
    public String toString() {

        StringBuilder sb = new StringBuilder(); // macht StringBuilder ohne character, 16 characters möglich

        sb.append("\n----- Weather Information-----\n"); // append fügt String hinzu, kennzeichnet einen Zeilenumbruch

        sb.append("ID: " + getId() + "\n");

        sb.append("Main: " + getMain() + "\n");

        sb.append("Descriptiong: " + getDescription() + "\n");

        sb.append("Icon: " + getIcon() + "\n");

        sb.append("*****************************");

        return sb.toString(); // Rückgabe StringBuilder.toString Methode

    }
}