package com.startup.job.infrastructure.http;


import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.ANY, isGetterVisibility = JsonAutoDetect.Visibility.NONE)
public class Response {

    String status;
    String message;

    public Response(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
