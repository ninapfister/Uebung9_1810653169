import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Main
{
    public static void main (String[]args) throws Exception // readValue schmeißt Exception, schmeißen wir weiter, wird so oder so ausgegeben
    {
        // Aufgabe 1

        ObjectMapper mapper = new ObjectMapper(); // stellt Methoden für json lesung und schreibung zur Verfügung, beinhaltet readValue Methode, Klasse von jackson API
        Weather wetter = mapper.readValue(new File("src/weather.json"), Weather.class); //  schreibt Inhalt von json Datei ins Objekt, macht neues File, Name weil es in src ist, weather.class damit er auf die Klasse zugreift

        System.out.println(wetter); // gibt Wetter aus
    }
}
