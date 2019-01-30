package Aufgabe1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectMapperWeather {
    public Weather readJsonWithObjectMapper() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        Weather emp = objectMapper.readValue(new File("src/Aufgabe1/weather.json"), Weather.class);

        return emp;

    }
}