package Aufgabe2;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD) // gibt an ob Felder oder Eigenschaften serialisiert werden, Umwandlung des Zustands eines Objekts
@XmlRootElement // besonderes Element, muss in jeder xml Datei vorkommen, Wurzelelement
public class Weather {
    @XmlAttribute(name = "id") // um Attribut/Eigenschaft hinzuzufügen
    private int id;
    @XmlElement(name = "main") // um Element hinzuzufügen
    private String main;
    @XmlElement(name = "description") // um Element hinzuzufügen
    private String description;


    //@XmlElement(name = "icon") //Aufgabe 4
   @XmlTransient // Auflösen von Namenskollisionen zwischen einem Eigenschaftsnamen und einem Feldnamen oder Verhindern der Zuordnung eines Felds / einer Eigenschaft
    private String icon;

    public Weather() {} // jackson API greift auf leeren Konstruktor zu

    public Weather(int id, String main, String description, String icon) // Konstruktor, greift auf private Attribute zu
    {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    // getter und setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override // überschreiben
    public String toString() // Methode toString
    {

        StringBuilder sb = new StringBuilder(); // macht StringBuilder ohne character, 16 characters möglich

        sb.append("\n----- Weather Information-----\n");  // append, fügt String hinzu, "\n" fügt neue Zeile in Text an diesem Punkt

        sb.append("ID: " + id + "\n");

        sb.append("Main: " + main + "\n");

        sb.append("Descriptiong: " + description + "\n");

        sb.append("Icon: " + icon + "\n");

        sb.append("*****************************");

        return sb.toString(); // Rückgabe StringBuilder.toString Methode

    }
}
