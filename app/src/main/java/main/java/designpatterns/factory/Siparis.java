package main.java.designpatterns.factory;

public class Siparis {

    public Siparis(){

    }

    public String getSiparis(){

        restaurant rest = new restaurant();

        menu adanaKebap = rest.menuGetir("adanaKebap", "250 Gr Adana Kebap, Çoban Salata", 40);

        menu tavukSis = rest.menuGetir("tavukSis", "250 Gr Tavuk Şiş, Çoban Salata,", 30);

        menu iskender = rest.menuGetir("iskender", "250 Gr İskender, Çoban Salata,", 35);



        String sonuc = "Sepetiniz : ";
        String ad = "Ad : ";
        String icerik = "İçerik : ";
        String fiyat = "Fiyat : ";
        String sonuc1 = "---------------------------------------------------";

        sonuc =  sonuc + "\n"+sonuc1+"\n"+ ad +adanaKebap.getAd() +"\n"+ icerik +adanaKebap.getIcerik()+ "\n"+fiyat+ adanaKebap.getFiyat() + "₺"
                + "\n"+sonuc1+"\n"+ ad +tavukSis.getAd() +"\n"+ icerik +tavukSis.getIcerik()+ "\n"+fiyat+ tavukSis.getFiyat() + "₺"
                + "\n"+sonuc1+"\n"+ ad +iskender.getAd() +"\n"+ icerik +iskender.getIcerik()+ "\n"+fiyat+ iskender.getFiyat() + "₺";


    return sonuc;
    }



}
