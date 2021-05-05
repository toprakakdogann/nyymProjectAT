package main.java.designpatterns.factory;

public class tavukSis implements menu {

    private String ad;
    private  String icerik;
    private int fiyat;

    public tavukSis(String ad, String icerik, int fiyat) {
        this.ad = ad;
        this.icerik = icerik;
        this.fiyat = fiyat;
    }

    @Override
    public String getAd() {
        return ad;
    }

    @Override
    public String getIcerik() {
        return icerik;
    }

    @Override
    public int getFiyat() {
        return fiyat;
    }

    @Override
    public String toString() {
        return "adanaKebap{" +
                "ad='" + ad + '\'' +
                ", icerik='" + icerik + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}