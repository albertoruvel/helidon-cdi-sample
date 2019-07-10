package com.albertoruvel.helidon.data.dto.response;

public class SayHi {
    private String message;

    public SayHi() {
        this.message = "Hello from a Helidon RESTful service";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
