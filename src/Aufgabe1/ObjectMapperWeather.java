package Aufgabe1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectMapperWeather {
    public Weather readJsonWithObjectMapper() throws IOException // readValue schmeißt Exception
    {

        ObjectMapper objectMapper = new ObjectMapper(); // stellt Methoden für json (Dateispeicherart) Lesung und Schreibung zur Verfügung

        Weather emp = objectMapper.readValue(new File("src/Aufgabe1/weather.json"), Weather.class); // schreibt Inhalt von json Datei ins Objekt, macht neues File, Name weil es in src ist, weather.class auf Klasse zugreifen

        return emp; // Rückgabe

    }
}