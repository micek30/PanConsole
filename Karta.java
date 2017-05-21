package pl.PanConsole;

public class Karta {
    private String znak;
    private String kolor;
    private int wartosc;



    public Karta(String znak, String kolor, int value)
    {
        this.znak = znak;
        this.kolor=kolor;
        this.wartosc=value;
    }

    public String toString(){
        return this.znak +" "+this.kolor;

    }

    public String getZnak(){
        return this.znak;
    }

    public String getColor(){
        return this.kolor;
    }

    public int getValue(){
        return this.wartosc;
    }

    public Karta getKarta(){
        return this;
    }


}
