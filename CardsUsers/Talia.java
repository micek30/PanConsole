package pl.PanConsole.CardsUsers;
import java.security.SecureRandom;

public class Talia {

    public Karta[] talia;

    public Talia(){
        this.talia=new Karta[32];
        String[] znakKarty={"2","3","4","5","6","7","8","9"};
        String[] kolor={"trefl","pik","karo","kier"};
        int[] wartosc={2,3,4,5,6,7,8,9};

        final int ileKolorow=4;       //ilosc kolorów
        final int ileZnakow=8;     //ilosc wartosci



        //Tworzenie talii
        for(int kolorFor=0;kolorFor<ileKolorow;kolorFor++){
            for (int znakFor=0;znakFor< ileZnakow;znakFor++) {

                this.talia[(znakFor+(kolorFor*8))]=new Karta(znakKarty[znakFor], kolor[kolorFor], znakFor+7);//konstruktor karty
                } //drugi for
            } //pierwszy for


        } //koniec konstruktora



    public void shuffle(){
        SecureRandom random= new SecureRandom();
        for(int first=0;first<this.talia.length;first++){
            int second=random.nextInt(32);
            Karta temp=this.talia[first];
            this.talia[first]=this.talia[second];
            this.talia[second]=temp;
        }
    }

    public Karta[] getTalia() {
        return talia;
    }

    /*public void printDeck() {
        for (Karta k:this.talia){
            System.out.println(k);
        }*/
    public void printDeck(){

    System.out.println(talia[0]);
    }


}
