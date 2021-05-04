package main.java.designpatterns.factory;

public class siparis {

    public static void main(String[] args){

        menu tavukSis = restaurant.getMenu("Tavuk Şiş", "250 Gr Tavuk Şiş, Çoban Salata, Mercimek Çorbası, Ayran", 40);

        menu adanaKebap = restaurant.getMenu("Adana Kebap", "250 Gr Adana Kebap, Çoban Salata, Mercimek Çorbası, Ayran", 50);

        System.out.println("IZGARALAR");
        System.out.println("-----------------------");

        System.out.print("1- ");
        System.out.println(tavukSis);
        System.out.print("2- ");
        System.out.println(adanaKebap);


    }
}
