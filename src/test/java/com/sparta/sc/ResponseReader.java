package com.sparta.sc;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class ResponseReader {
    URL url;
    HttpURLConnection con;

    public ResponseReader(String url) {
        try {
            this.url = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public int gettingResponseCode() {
        int response = 0;
        try {
            con = (HttpURLConnection) url.openConnection();
            response = con.getResponseCode();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    public Map<String, List<String>> gettingHeaders() {
        Map<String, List<String>> headersMap;
        try {
            con = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        headersMap = con.getHeaderFields();
        return headersMap;
    }
}



