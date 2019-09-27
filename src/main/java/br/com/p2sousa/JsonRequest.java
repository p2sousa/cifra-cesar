package br.com.p2sousa;

import com.oracle.javafx.jmx.json.JSONException;
import org.json.simple.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

public class JsonRequest {

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);

            System.out.println(jsonText);

            JSONObject json = new JSONObject(jsonText);
//            return json;
            return new JSONObject();
        } finally {
            is.close();
        }
    }

    public static void main(String[] args) throws IOException, JSONException {
        JSONObject json = readJsonFromUrl("https://superaudio.com.br/radio-store/manager-clients/authorize-client-id");
        System.out.println(json.toString());
        System.out.println(json.get("id"));
    }
}
