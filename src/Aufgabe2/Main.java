package Aufgabe2;

import Aufgabe1.ObjectMapperWeather;
import Aufgabe1.Weather;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  throws JAXBException, IOException // read braucht Exception, JAXB auch, FileNotFoundException - signalisiert, dass ein Versuch, die durch einen angegebenen Pfadnamen angegebene Datei zu öffnen, fehlgeschlagen ist
    {
        ObjectMapperWeather omw = new ObjectMapperWeather(); // stellt Methoden für json (Dateispeicherart) Lesung und Schreibung zur Verfügung
        Weather w1 = omw.readJsonWithObjectMapper(); // schreibt Inhalt von json Datei ins Objekt

        Aufgabe2.Weather w = new Aufgabe2.Weather(w1.getId(), w1.getMain(), w1.getDescription(), w1.getIcon()); // neue Instanz, greift auf weather zu, die Attribute aufrufen
        JAXBContext jaxbContext = JAXBContext.newInstance(Aufgabe2.Weather.class); // ermöglicht einfaches Mapping eines Javaobjekts in eine xml Datei und umgekehrt, neue Instanzz, auf Weather.class zugreifen, Struktur

        Marshaller marshaller = jaxbContext.createMarshaller(); // macht neuen Marshaller, von oben jaxbContext, umwandeln von Daten in ein Format
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // // . setProperty greift darauf zu, setzt Eigenschaftsnamen
        marshaller.marshal(w, new File("src/Aufgabe2/weather.xml")); // macht neues File, Pfad
        marshaller.marshal(w, System.out); // gibt Marshaller aus, .marshal Zugriff auf marshaller
    }
}