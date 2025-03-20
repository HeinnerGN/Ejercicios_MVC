package Modelo;

import java.util.ArrayList;
import java.util.Random;

public class Luces {
    private static Random random = new Random();
    private ArrayList<Boolean> info;
    private static String textone = "Luces encendidas";
    private static String texttwo = "Luces apagadas";

    public Luces() {
        info = new ArrayList<>();
    }

    public String Datos() {
        boolean noche;
        boolean movi;
        info.add(random.nextBoolean());
        info.add(random.nextBoolean()); 
        noche = info.get(0);
        movi = info.get(1);

        if (noche && movi) {
            return textone;
        } else {
            return texttwo;
        }
    }
}
