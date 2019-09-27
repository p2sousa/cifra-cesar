package br.com.p2sousa;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonRead {

    public void readFile(String filename) throws IOException, ParseException {
        JSONObject jsonObject;
        JSONParser parser = new JSONParser();

        String status;
        String message;
        String data;

        try {

            jsonObject = (JSONObject) parser.parse(new FileReader(filename));

            status = (String) jsonObject.get("status");
            message = (String) jsonObject.get("message");
            data = (String) jsonObject.get("data");

            System.out.printf("Nome: %s\nSobrenome: %s\nEstado: %s\nPais:", status, message, data);
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
