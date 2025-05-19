package org.example.behavioural.template;

import java.util.HashMap;
import java.util.Map;

public class JsonRestClient extends HttpRequestTemplate {
    @Override
    protected String prepareRequest(Object requestBody) {
        String json = (requestBody != null) ? "{\"data\": \"" + requestBody.toString() + "\"}" : "{}";
        System.out.println("Prepared JSON request: " + json);
        return json;
    }

    @Override
    protected <T> T processResponse(String rawResponse) {
        // Simulate parsing JSON to a String (could be a POJO in real use)
        System.out.println("Processing JSON response: " + rawResponse);
        return (T) ("Parsed: " + rawResponse);
    }

    public static void main(String[] args) {
        // JSON REST call
        HttpRequestTemplate jsonClient = new JsonRestClient();
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        System.out.println("JSON Request:");
        String jsonResult = jsonClient.execute("http://api.example.com", "POST", headers, "Hello");
        System.out.println("Result: " + jsonResult);
        System.out.println();

    }
}
