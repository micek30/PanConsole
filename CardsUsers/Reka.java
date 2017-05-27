package pl.PanConsole.CardsUsers;
import java.security.SecureRandom;
import java.util.Arrays;

public class Reka{

    private Karta[] reka;
    private int ileKart;

    public Reka() {
        this.reka= new Karta[32];
        this.ileKart=0;
    }


    public Karta ViewCardReka(int index) {
        return reka[index];
    }
    public Karta TakeCardReka(int index) {
        Karta temp=new Karta(reka[index].getZnak(),reka[index].getColor(),reka[index].getValue());
        for(int i=index;i<ileKart;i++){
            reka[i]=reka[i+1];
        }
        //this.setIleKart(ileKart-1);
        return temp;
    }

    public int getIleKart() {
        return this.ileKart;
    }

    public void setIleKart(int ileKart) {
        this.ileKart = ileKart;
    }
    public void addCardToHand(Karta card){
        this.reka[ileKart]=new Karta(card.getZnak(),card.getColor(),card.getValue());
        this.setIleKart(ileKart+1);

    }
    public void PrintReka(){
        for(int i=0;i<ileKart;i++){
            System.out.print(this.reka[i]+" ");
        }
    }

}
