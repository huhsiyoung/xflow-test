package com.test.message;

public class RequestMessage extends Message{
    StringBuilder sb;
    String method;
    String requestTarget;
    String version;
    String host;
    int port;
    String data;
    String contentType;
    String contentLength;
    String body;

    public RequestMessage(String method, String requestTarget, int port) {
        sb = new StringBuilder();
        this.method = method;
        this.requestTarget = requestTarget;
        version = "HTTP/1.1";
        host = "localhost";
        this.port = port;
    }

    public void request() {
        if (method.equalsIgnoreCase("GET")) {
            sb.append(method + " " + requestTarget + " " + version + "\n");
            sb.append("ContentType : " + contentType);
            sb.append("ContentLength : " + contentLength);
            sb.append("\n\r\n");
        } else if (method.equalsIgnoreCase("POST")) {
            // POST는 데이터를 전송해야함 바디 부분 필요
            sb.append(method + " " + requestTarget + " " + version + "\n");
            sb.append("\n\r\n");
        }
    }



}
