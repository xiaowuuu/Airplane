package org.example.Flight;

public enum Airport {
    STANSTED("STN"),
    LONDON("LDN"),
    EDINBURGH("EDI");
    public final String code;

    public String getCode() {
        return code;
    }

    Airport(String code){
        this.code = code;
    }

}
