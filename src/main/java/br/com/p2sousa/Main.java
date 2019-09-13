package br.com.p2sousa;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String text = "1a.a";
        Integer key = 3;
	    CriptoCesar criptoCesar = new CriptoCesar(text, key);

	    String textEncrypt = criptoCesar.encrypt();

        System.out.println("texto a ser encriptado: " + text);
        System.out.println("texto encriptado: " + textEncrypt);


        JsonWrite file = new JsonWrite();
        file.createJson();


        JsonRead fileRead = new JsonRead();

        try {
            fileRead.readFile();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
