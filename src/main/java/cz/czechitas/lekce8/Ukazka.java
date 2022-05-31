package cz.czechitas.lekce8;

import cz.czechitas.lekce8.losovani.LosovaciZarizeni;

import java.util.Arrays;
import java.util.List;

public class Ukazka {
    public static void main(String[] args) {
        new LosovaciZarizeni()
                .losujSeznamCisel(1, 6, 10)
                .forEach(cislo -> System.out.println(cislo));





       /* List<String> dny = Arrays.asList("pondělí", "úterý", "středa", "čtvrtek", "pátek", "sobota", "neděle");

        /*for (String den : dny) {
            System.out.println(den);
        }*/

        /*dny.forEach((den) -> {
            System.out.println(den);
            System.out.println();
        });*/

       /* dny.forEach(Ukazka::vypisDen);
    }




    private static void vypisDen(String den){
        System.out.print("* ");
        System.out.println(den);*/
    }
}