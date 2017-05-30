package pl.PanConsole.CardsUsers;
import pl.PanConsole.*;

public class CardOper {

    public static Karta find2Caro(Player p1,Player p2){

        Karta Card2Caro=new Karta("a","a",0);

        for(int i=0;i<p1.getIleKart();i++){

            if(p1.ViewKartaFromReka(i).toString().equalsIgnoreCase("2 karo")){

                Karta temp=new Karta(p1.TakeKartaFromReka(i));
                Card2Caro=new Karta(temp.getZnak(),temp.getColor(),temp.getValue());
                break ;
            }else if(p2.ViewKartaFromReka(i).toString().equalsIgnoreCase("2 karo")){

                Karta temp=new Karta(p2.TakeKartaFromReka(i));
                Card2Caro=new Karta(temp.getZnak(),temp.getColor(),temp.getValue());
                break ;
            } else {}


        }
        return Card2Caro;
    }//koniec find2Caro

    public static Karta find2Caro(Player p1,Player p2,Player p3){

        Karta Card2Caro=new Karta("a","a",0);

        for(int i=0;i<p1.getIleKart();i++){

            if(p1.ViewKartaFromReka(i).toString().equalsIgnoreCase("2 karo")){

                Karta temp=new Karta(p1.TakeKartaFromReka(i));
                Card2Caro=new Karta(temp.getZnak(),temp.getColor(),temp.getValue());
                break ;
            }else if(p2.ViewKartaFromReka(i).toString().equalsIgnoreCase("2 karo")){

                Karta temp=new Karta(p2.TakeKartaFromReka(i));
                Card2Caro=new Karta(temp.getZnak(),temp.getColor(),temp.getValue());
                break ;
            }else if(p3.ViewKartaFromReka(i).toString().equalsIgnoreCase("2 karo")){

                Karta temp=new Karta(p3.TakeKartaFromReka(i));
                Card2Caro=new Karta(temp.getZnak(),temp.getColor(),temp.getValue());
                break ;
            } else {}


        }
        return Card2Caro;
    }//koniec find2Caro

    public static Karta find2Caro(Player p1,Player p2,Player p3,Player p4){

        Karta Card2Caro=new Karta("a","a",0);

        for(int i=0;i<p1.getIleKart();i++){

            if(p1.ViewKartaFromReka(i).toString().equalsIgnoreCase("2 karo")){

                Karta temp=new Karta(p1.TakeKartaFromReka(i));
                Card2Caro=new Karta(temp.getZnak(),temp.getColor(),temp.getValue());
                break ;
            }else if(p2.ViewKartaFromReka(i).toString().equalsIgnoreCase("2 karo")){

                Karta temp=new Karta(p2.TakeKartaFromReka(i));
                Card2Caro=new Karta(temp.getZnak(),temp.getColor(),temp.getValue());
                break ;
            }else if(p3.ViewKartaFromReka(i).toString().equalsIgnoreCase("2 karo")){

                Karta temp=new Karta(p3.TakeKartaFromReka(i));
                Card2Caro=new Karta(temp.getZnak(),temp.getColor(),temp.getValue());
                break ;
            } else if(p4.ViewKartaFromReka(i).toString().equalsIgnoreCase("2 karo")){

                Karta temp=new Karta(p4.TakeKartaFromReka(i));
                Card2Caro=new Karta(temp.getZnak(),temp.getColor(),temp.getValue());
                break ;
            }else {}


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
