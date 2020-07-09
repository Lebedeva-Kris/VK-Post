package ru.netology.domain;

public class GeoInfo {
    private int geoId;
    private String geoType;
    private int Coordinates;


    public int getGeoId() {
        return geoId;
    }
    public void setGeoId(int geoId) {
        this.geoId = geoId;
    }


    public String getGeoType() {
        return geoType;
    }
    public void setGeoType(String geoType) {
        this.geoType = geoType;
    }


    public int getCoordinates() {
        return Coordinates;
    }
    public void setCoordinates(int coordinates) {
        Coordinates = coordinates;
    }

}
