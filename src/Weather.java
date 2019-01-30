public class Weather
{

    private int id; // Attribute
    private String main;
    private String description;
    private String icon;


    public int getId() // getter und setter
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getMain()
    {
        return main;
    }

    public void setMain(String main)
    {
        this.main = main;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getIcon()
    {
        return icon;
    }

    public void setIcon(String icon)
    {
        this.icon = icon;
    }

    @Override // überschreiben
    public String toString() // toString Methode
    {
        return "ID" + getId() + ", Main " + getMain() + ", Description: " + getDescription() + " Icon: " + getIcon(); // Rückgabe
    }
}
