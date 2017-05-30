package pl.PanConsole.CardsUsers;

public class Player {
    private Reka reka;
    private String NazwaGracza;


    public Player(String s){
        this.setNazwaGracza(s);


    }

    public void setReka() {
        this.reka = new Reka();
    }
    public void setRekaSize(int size) {
        this.reka.setIleKart(size);
    }



    public Karta ViewKartaFromReka(int index) {

        return this.reka.ViewCardReka(index);
    }

    public Karta TakeKartaFromReka(int index) {

        return this.reka.TakeCardReka(index);
    }


    public void addKarta(Karta karta) {
        this.reka.addCardToHand(karta);
    }

    public int getIleKart() {
        return this.reka.getIleKart();
    }

    public String getNazwaGracza() {
        return NazwaGracza;
    }

    public void setNazwaGracza(String nazwaGracza) {
        this.NazwaGracza = nazwaGracza;
    }
    public void PrintHand(){
        this.reka.PrintReka();
    }
}
