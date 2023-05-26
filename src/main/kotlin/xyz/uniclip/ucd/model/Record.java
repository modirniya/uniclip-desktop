package xyz.uniclip.ucd.model;

public class Record {
    String key;
    String value;

    public Record(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public Record() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
