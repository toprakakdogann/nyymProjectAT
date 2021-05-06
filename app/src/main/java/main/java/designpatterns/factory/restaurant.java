package main.java.designpatterns.factory;

public class restaurant {

    private  String ad;
    private  String icerik;
    private  int fiyat;

    public menu menuGetir(String ad, String icerik, int fiyat){

        menu menu;
        if("adanaKebap".equalsIgnoreCase(ad))
        {
            menu = new adanaKebap(ad,icerik,fiyat);
        }
        else if("tavukSis".equalsIgnoreCase(ad))
        {
            menu = new tavukSis(ad,icerik,fiyat);
        }
        else if("iskender".equalsIgnoreCase(ad))
        {
            menu = new iskender(ad,icerik,fiyat);
        }
        else
        {
            throw new RuntimeException("Malesef ürün bulunmamaktadır");
        }

        return menu;
    }
}
