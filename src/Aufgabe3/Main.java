package Aufgabe3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws JAXBException // FileNotFoundException - signalisiert, dass ein Versuch, die durch einen angegebenen Pfadnamen angegebene Datei zu öffnen, fehlgeschlagen ist
    {
        File file = new File("src/Aufgabe2/weather.xml"); // neues File, Pfadname
        JAXBContext jaxbContext = JAXBContext.newInstance(Aufgabe2.Weather.class); // ermöglicht einfaches Mapping(bildet Daten ab)  eines Javaobjekts in eine xml Datei und umgekehrt, neue Instanz, auf Weather.class zugreifen, Struktur
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller(); //  Steuert den Prozess der Deserialisierung von XML-Daten in neu erstellten Java-Inhalt und überprüft ihn, neuer Unmarshaller, zurück in ein Objekt
        Aufgabe2.Weather w = (Aufgabe2.Weather) unmarshaller.unmarshal(file); // greift auf Aufgabe2 weather zu, File wird unmarshalled
        //System.out.println(w); // Ausgabe

        // Aufgabe 5

        Aufgabe5.Weather w2 = new Aufgabe5.Weather(); // neue Instanz, greift auf Aufgabe5.Weather zu
        w2.setId(w.getId()); // Id setzten, get
        w2.setMain(w.getMain()); // main setzten, get
        w2.setDescription(w.getDescription()); //description sezten, get
        w2.setIcon(w.getIcon()); // Icon setzten, get
        JSONWriterObjectMapper jom = new JSONWriterObjectMapper(); // neuer json Mapper Writer
        jom.writeWeatherToJson(w2); // auf Mapper zugreifen
    }
}