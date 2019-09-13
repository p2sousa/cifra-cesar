package br.com.p2sousa;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWrite {

    public JsonWrite() {

    }

    public void createJson() {
        JSONObject jsonObject = new JSONObject();

        FileWriter writeFile = null;

        jsonObject.put("nome", "Allan");
        jsonObject.put("sobrenome", "Romanato");
        jsonObject.put("pais", "Brasil");
        jsonObject.put("estado", "SP");

        try{
            writeFile = new FileWriter("saida.json");
            writeFile.write(jsonObject.toJSONString());
            writeFile.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        System.out.println(jsonObject);
    }
}
