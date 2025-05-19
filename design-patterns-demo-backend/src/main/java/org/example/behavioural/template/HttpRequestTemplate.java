package org.example.behavioural.template;

import java.util.Map;

public abstract class HttpRequestTemplate {
        // Template method: Defines the HTTP request workflow
        public final <T> T execute(String url, String method, Map<String, String> headers, Object requestBody) {
            initializeConnection(url, method);
            configureHeaders(headers);
            String request = prepareRequest(requestBody);
            String rawResponse = sendRequest(request);
            return processResponse(rawResponse);
        }

        // Common step: Fixed for all requests
        private void initializeConnection(String url, String method) {
            System.out.println("Initializing " + method + " connection to " + url);
        }

        // Common step: Fixed but extensible
        protected void configureHeaders(Map<String, String> headers) {
            System.out.println("Setting default headers");
            if (headers != null) {
                headers.forEach((k, v) -> System.out.println("Header: " + k + "=" + v));
            }
        }

        // Abstract step: Subclasses define how to prepare the request body
        protected abstract String prepareRequest(Object requestBody);

        // Common step: Simulate sending the request
        private String sendRequest(String request) {
            System.out.println("Sending request: " + request);
            return "Raw response from server"; // Simulated response
        }

        // Abstract step: Subclasses define how to process the response
        protected abstract <T> T processResponse(String rawResponse);
    }
