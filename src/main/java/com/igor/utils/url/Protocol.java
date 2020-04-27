package com.igor.utils.url;

public enum Protocol {
    HTTP("http"), HTTPS("https");

    private String value;

    Protocol(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
