package pl.PanConsole;


public class Player {
    private Reka reka;
    private String NazwaGracza;


    public Player(String s){
        this.setNazwaGracza(s);


    }

    public void setReka(Reka reka) {
        this.reka = reka;
    }
    public void setRekaSize(int size) {
        this.reka.ileKart = size;
    }



    public Karta getKartaFromReka(int index) {
        return this.reka.reka[index];
    }

    public String getNazwaGracza() {
        return NazwaGracza;
    }

    public void setNazwaGracza(String nazwaGracza) {
        NazwaGracza = nazwaGracza;
    }
}
