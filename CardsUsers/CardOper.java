package pl.PanConsole.CardsUsers;
import pl.PanConsole.*;

public class CardOper {

    public static Karta find2Caro(Player p1,Player p2){
        //Karta szablon=new Karta("2","karo",2);
        //Karta temp=new Karta("b","b",3);
        Karta Card2Caro=new Karta("a","a",0);
        petla:
        for(int i=0;i<p1.getIleKart();i++){
            //System.out.println(p1.ViewKartaFromReka(i));
            if(p1.ViewKartaFromReka(i).toString().equalsIgnoreCase("2 karo")){
                //System.out.println(p1.ViewKartaFromReka(i));
                Karta temp=new Karta(p1.TakeKartaFromReka(i));
                Card2Caro=new Karta(temp.getZnak(),temp.getColor(),temp.getValue());
                break petla;
            }else if(p2.ViewKartaFromReka(i).toString().equalsIgnoreCase("2 karo")){
                //System.out.println(p2.ViewKartaFromReka(i));
                Karta temp=new Karta(p2.TakeKartaFromReka(i));
                Card2Caro=new Karta(temp.getZnak(),temp.getColor(),temp.getValue());
                break petla;
            } else {}
            //System.out.println(p2.ViewKartaFromReka(i));

        }
        return Card2Caro;
    }//koniec find2Caro

    public static boolean checkBeforePush(Karta gracza,Karta stosu){
        if(gracza.getValue()>=stosu.getValue()){
            return false;
        }
        else {
            System.out.println("Podano złą kartę. Podaj kartę większą lub równą tej na stosie");
            return true;
        }


    }
}
