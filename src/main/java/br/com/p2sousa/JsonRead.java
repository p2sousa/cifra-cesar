package br.com.p2sousa;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonRead {

    public void readFile() throws IOException, ParseException {
        JSONObject jsonObject;
        JSONParser parser = new JSONParser();

        String nome;
        String sobrenome;
        String estado;
        String pais;

        try {

            jsonObject = (JSONObject) parser.parse(new FileReader("saida.json"));

            nome = (String) jsonObject.get("nome");
            sobrenome = (String) jsonObject.get("sobrenome");
            estado = (String) jsonObject.get("estado");
            pais = (String) jsonObject.get("pais");

            System.out.printf("Nome: %s\nSobrenome: %s\nEstado: %s\nPais: %s\n", nome, sobrenome, estado, pais);
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
