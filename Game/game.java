package pl.PanConsole.Game;
import pl.PanConsole.CardsUsers.*;

import java.io.IOException;
import java.util.Scanner;

public class game {

    public static void GameFor2(Player player1,Player player2) {
        Stos stol= new Stos();
        int PushOrPop;
        stol.Push(CardOper.find2Caro(player1,player2));
        do{
                System.out.println(stol.display());
                player1.PrintHand(); System.out.println();
                PushOrPop=Decyzja();
                if(PushOrPop==2){
                    RuchGracza(player1,stol);
                }else{
                    ZbierzKarty(player1,stol);
                }

                System.out.println(stol.display());
                player1.PrintHand();System.out.println();
                PushOrPop=Decyzja();
                if(PushOrPop==2) {
                    RuchGracza(player2, stol);
                }else{
                    ZbierzKarty(player2,stol);
                }

        }while(player1.getIleKart()!=0 && player2.getIleKart()!=0);
    }//koniec GameFor2


    public static int WybierzKarte(){
        Scanner odczyt=new Scanner(System.in);
        int chooseCard; String chooseCardTemp;
        System.out.println("\nWybierz kartę:  ");
        chooseCardTemp = odczyt.nextLine();
        chooseCard= Integer.parseInt(chooseCardTemp);
        chooseCard-=1;
        return chooseCard;

    }//koniec WybierzKarte
    public static int Decyzja(){
        Scanner odczyt=new Scanner(System.in);
        String TempDecyzja;int decyzja=0;
        do{
            System.out.println("1-zebrać karty 2-położyć kartę");
            TempDecyzja=odczyt.nextLine();
            decyzja=Integer.parseInt(TempDecyzja);
        }while (decyzja<1&&decyzja>2);

        return decyzja;
    }
    public static void clearScreen() {
        for(int clear = 0; clear < 20; clear++)
        {
            System.out.println("\b") ;
        }
    }

    //ruch gracza
    public static void RuchGracza(Player player,Stos stol){
       Karta NaStos=new Karta("0","0",0);
       Karta tempNaStos=new Karta("0","0",0);
       int index=0;
        do {
            clearScreen();
            System.out.println(stol.display());
            //ruch pierwszego gracza
            System.out.println("\nKarty Pierwszego gracza");
            player.PrintHand();
            index=WybierzKarte();
            tempNaStos = new Karta(player.ViewKartaFromReka(index));
        }while (CardOper.checkBeforePush(tempNaStos,stol.display()));
        tempNaStos = new Karta(player.TakeKartaFromReka(index));
        NaStos = new Karta(tempNaStos.getZnak(), tempNaStos.getColor(), tempNaStos.getValue());
        stol.Push(NaStos);
        clearScreen();

    }//koniec RuchGracza

    public static void ZbierzKarty(Player player,Stos stol){
        clearScreen();
        player.addKarta(stol.Pop());
        player.addKarta(stol.Pop());
        player.addKarta(stol.Pop());
        clearScreen();
    }
}
