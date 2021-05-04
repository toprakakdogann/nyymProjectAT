package main.java.designpatterns.factory;

public class restaurant {

    private static String ad;
    private static String icerik;
    private static int fiyat;

    public static menu getMenu(String ad, String icerik, int fiyat){
        restaurant.ad = ad;
        restaurant.icerik = icerik;
        restaurant.fiyat = fiyat;

        menu menu;
        if("adanaKebap".equalsIgnoreCase(ad)){
            menu = new adanaKebap(ad,icerik,fiyat);
        }else if("tavukSis".equalsIgnoreCase(ad)){
            menu = new tavukSis(ad,icerik,fiyat);
        }else{
            throw new RuntimeException("Malesef ürün bulunmamaktadır");
        }

        return menu;
    }
}
