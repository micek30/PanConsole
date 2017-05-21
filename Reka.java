package pl.PanConsole;

import java.security.SecureRandom;
import java.util.Arrays;

public class Reka{

    public Karta[] reka;
    public int ileKart;

    public Reka(Karta reka,int index) {
        this.reka= new Karta[32];
        this.reka[index] = new Karta(reka.getZnak(),reka.getColor(),reka.getValue());
    }


    public Karta[] getReka() {
        return reka;
    }
}
