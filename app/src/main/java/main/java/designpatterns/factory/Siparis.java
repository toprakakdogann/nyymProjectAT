package main.java.designpatterns.factory;

public class Siparis {

    public Siparis(){

    }

    public String getSiparis(){

        restaurant rest = new restaurant();

        menu adanaKebap = rest.menuGetir("adanaKebap", "250 Gr Adana Kebap, Çoban Salata", 40);

        menu tavukSis = rest.menuGetir("Tavuk Şiş", "250 Gr Tavuk Şiş, Çoban Salata,", 30);

        String sonuc = "Siparişiniz : ";
        String ad = "Ad : ";
        String icerik = "İçerik : ";
        String fiyat = "Fiyat : ";
        String sonuc1 = "---------------------------------------------------";


        sonuc =  sonuc + "\n"+sonuc1+"\n"+ ad +adanaKebap.getAd() +"\n"+ icerik +adanaKebap.getIcerik()+ "\n"+fiyat+ adanaKebap.getFiyat() + "₺"
                + "\n"+sonuc1+"\n"+ ad +tavukSis.getAd() +"\n"+ icerik +tavukSis.getIcerik()+ "\n"+fiyat+ tavukSis.getFiyat() + "₺";

        return sonuc;

    }

}
