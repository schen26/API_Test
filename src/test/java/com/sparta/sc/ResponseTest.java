package com.sparta.sc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.*;

public class ResponseTest {
    ResponseReader responseReader = new ResponseReader("https://ghibliapi.herokuapp.com/films/58611129-2dbc-4a81-a72f-77ddfc1b1b49");
    Map<String, List<String>> headersMap = responseReader.gettingHeaders();

    @Test
    void testResponseCode() {
        Assertions.assertEquals(200, responseReader.gettingResponseCode());
    }

    @Test
    void testNumberOfHeaders() {
        Assertions.assertEquals(15, headersMap.size());
    }

    @Test
    void testServerHeader() {
        if (headersMap.containsKey("Server")) {
            Assertions.assertEquals("Cowboy", headersMap.get("Server").toArray()[0]);
        }
    }

    @Test
    void testConnectionHeader() {
        if (headersMap.containsKey("Connection")) {
            Assertions.assertEquals("keep-alive", headersMap.get("Connection").toArray()[0]);
        }
    }

    @Test
    void testXPoweredByHeader() {
        if (headersMap.containsKey("X-Powered-By")) {
            Assertions.assertEquals("Express", headersMap.get("X-Powered-By").toArray()[0]);
        }
    }

    @Test
    void testVaryHeader() {
        if (headersMap.containsKey("Vary")) {
            Assertions.assertEquals("[Origin, Accept-Encoding]", headersMap.get("Vary").toString());
        }
    }

    @Test
    void testAccessControlAllowCredentialsHeader() {
        if (headersMap.containsKey("Access-Control-Allow-Credentials")) {
            Assertions.assertEquals("true", headersMap.get("Access-Control-Allow-Credentials").toArray()[0]);
        }
    }

    //
    @Test
    void testCacheControlHeader() {
        if (headersMap.containsKey("Cache-Control")) {
            Assertions.assertEquals("no-cache", headersMap.get("Cache-Control").toArray()[0]);
        }
    }

    @Test
    void testPragmaHeader() {
        if (headersMap.containsKey("Pragma")) {
            Assertions.assertEquals("no-cache", headersMap.get("Pragma").toArray()[0]);
        }
    }

    @Test
    void testExpiresHeader() {
        if (headersMap.containsKey("Expires")) {
            Assertions.assertEquals("-1", headersMap.get("Expires").toArray()[0]);
        }
    }

    @Test
    void testXContentTypeOptionsHeader() {
        if (headersMap.containsKey("X-Content-Type-Options")) {
            Assertions.assertEquals("nosniff", headersMap.get("X-Content-Type-Options").toArray()[0]);
        }
    }

    @Test
    void testContentTypeHeader() {
        if (headersMap.containsKey("Content-Type")) {
            Assertions.assertEquals("application/json; charset=utf-8", headersMap.get("Content-Type").toArray()[0]);
        }
    }

    @Test
    void testEtagHeader() {
        if (headersMap.containsKey("Etag")) {
            Assertions.assertEquals("W/\"74c-YPwiumhS1uGqJRflxhTQ7fsMgAA\"", headersMap.get("Etag").toArray()[0]);
        }
    }

    @Test
    void testContentEncodingHeader() {
        if (headersMap.containsKey("Content-Encoding")) {
            Assertions.assertEquals("gzip", headersMap.get("Content-Encoding").toArray()[0]);
        }
    }

    @Test
    void testDateHeader() {
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EE, dd MMM yyyy HH:mm");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String date = dateFormat.format(today);

        if (headersMap.containsKey("Date")) {
            String gettingPartialDate = headersMap.get("Date").toArray()[0].toString();
            Assertions.assertEquals(date, gettingPartialDate.substring(0, gettingPartialDate.lastIndexOf(":")));
        }
    }

    @Test
    void testTransferEncodingHeader() {
        if (headersMap.containsKey("Transfer-Encoding")) {
            Assertions.assertEquals("chunked", headersMap.get("Transfer-Encoding").toArray()[0]);
        }
    }

    @Test
    void testViaHeader() {
        if (headersMap.containsKey("Via")) {
            Assertions.assertEquals("1.1 vegur", headersMap.get("Via").toArray()[0]);
        }
    }
}
