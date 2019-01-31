package Aufgabe3;

import Aufgabe5.Weather;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JSONWriterObjectMapper
{
    ObjectMapper objectMapper = new ObjectMapper(); // stellt Methoden für json (Dateispeicherart) Lesung und Schreibung zur Verfügung, beinhaltet read Methode, Klasse von jackson API

    public void writeWeatherToJson(Weather w)
    {
        try{
            String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(w); // String erstellen, der ObjectMapper
            System.out.println("JSON String: " + jsonString); // Ausgabe
        } catch(JsonGenerationException e){
            e.printStackTrace();
        } catch (JsonMappingException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}