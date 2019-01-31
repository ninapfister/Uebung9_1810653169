package Aufgabe1;

public class Weather
{
    private int id; // Attribute
    private String main;
    private String description;
    private String icon;


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
    public String toString() // toString Methode
    {

        StringBuilder sb = new StringBuilder(); // macht StringBuilder ohne character, 16 characters möglich

        sb.append("\n----- Weather Information-----\n"); // append, fügt String hinzu

        sb.append("ID: " + getId() + "\n");

        sb.append("Main: " + getMain() + "\n");

        sb.append("Descriptiong: " + getDescription() + "\n");

        sb.append("Icon: " + getIcon() + "\n");

        sb.append("*****************************");

        return sb.toString(); // Rückgabe StringBuilder.toString Methode

    }
}