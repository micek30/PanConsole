package pl.PanConsole.CardsUsers;

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
    public Karta(Karta Card)
    {
        this.znak = Card.getZnak();
        this.kolor=Card.getColor();
        this.wartosc=Card.getValue();
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

    public static boolean Compare2Cards(Karta a,Karta b)
    {
        if (
                a.getZnak()==b.getZnak()&&
                a.getColor()==b.getColor()&&
                a.getValue()==b.getValue()
            ){
            System.out.println(a.getZnak()+" "+a.getColor()+" druga "+b.getZnak()+" "+b.getColor());
            return true;}
        else return false;

    }


}
