package Aufgabe1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException // read schmeißt Exception, schmeißen wir weiter, wird so oder so ausgegeben
    {
        ObjectMapperWeather omw = new ObjectMapperWeather(); // stellt Methoden für json (Dateispeicherart) Lesung und Schreibung zur Verfügung, beinhaltet read Methode, Klasse von jackson API
        System.out.println(omw.readJsonWithObjectMapper().toString()); // gibt Wetter aus,Methode - wertet json aus greift auf Methode toString zu
    }
}
