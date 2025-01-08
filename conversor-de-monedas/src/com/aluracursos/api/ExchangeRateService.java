package com.aluracursos.api;

import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExchangeRateService {
    private static final String apiKey = System.getenv("API_KEY_EXCHANGE_RATE");
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";

    public static JsonObject obtenerDivisas() throws Exception {
        URL url = new URL(API_URL);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        if (!"success".equals(jsonobj.get("result").getAsString())) {
            throw new RuntimeException("Error al obtener las divisas");
        }
        return jsonobj.getAsJsonObject("conversion_rates");
    }
}
