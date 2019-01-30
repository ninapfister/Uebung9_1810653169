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
    public static void main(String[] args)  throws IOException, JAXBException, FileNotFoundException {
        ObjectMapperWeather omw = new ObjectMapperWeather();
        Weather w1 = omw.readJsonWithObjectMapper();

        Aufgabe2.Weather w = new Aufgabe2.Weather(w1.getId(), w1.getMain(), w1.getDescription(), w1.getIcon());
        JAXBContext jaxbContext = JAXBContext.newInstance(Aufgabe2.Weather.class);

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(w, new File("src/Aufgabe2/weather.xml"));
        marshaller.marshal(w, System.out);
    }
}