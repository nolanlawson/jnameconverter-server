package com.nolanlawson.jnameconverter.server;

public class ConversionResult {

    private boolean error;
    private String roomaji;
    private String katakana;
    private String q;

    public ConversionResult() {
    }

    public ConversionResult(boolean error, String q, String roomaji, String katakana) {
        this.error = error;
	this.q = q;
        this.roomaji = roomaji;
        this.katakana = katakana;
    }
    public String getQ() {
	    return q;
    }
    public void setQ(String q) {
	    this.q = q;
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
