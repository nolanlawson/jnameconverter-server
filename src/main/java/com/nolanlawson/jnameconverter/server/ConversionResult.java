package com.nolanlawson.jnameconverter.server;

public class ConversionResult {

    private boolean error;
    private String roomaji;
    private String katakana;

    public ConversionResult() {
    }

    public ConversionResult(boolean error, String roomaji, String katakana) {
        this.error = error;
        this.roomaji = roomaji;
        this.katakana = katakana;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getRoomaji() {
        return roomaji;
    }

    public void setRoomaji(String roomaji) {
        this.roomaji = roomaji;
    }

    public String getKatakana() {
        return katakana;
    }

    public void setKatakana(String katakana) {
        this.katakana = katakana;
    }

}
