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
                System.out.println(player1.getNazwaGracza());
                stol.display();
                player1.PrintHand(); System.out.println();
                PushOrPop=Decyzja();
                if(PushOrPop==2){
                    RuchGracza(player1,stol);
                }else{
                    ZbierzKarty(player1,stol);
                }

                System.out.println(player2.getNazwaGracza());
                stol.display();
                player2.PrintHand();System.out.println();
                PushOrPop=Decyzja();
                if(PushOrPop==2) {
                    RuchGracza(player2, stol);
                }else{
                    ZbierzKarty(player2,stol);
                }

        }while(player1.getIleKart()!=0 && player2.getIleKart()!=0);
    }//koniec GameFor2

    public static void GameFor3(Player player1,Player player2,Player player3) {
        Stos stol= new Stos();
        int PushOrPop;
        stol.Push(CardOper.find2Caro(player1,player2,player3));
        do{
            System.out.println(player1.getNazwaGracza());
            stol.display();
            player1.PrintHand(); System.out.println();
            PushOrPop=Decyzja();
            if(PushOrPop==2){
                RuchGracza(player1,stol);
            }else{
                ZbierzKarty(player1,stol);
            }

            System.out.println(player2.getNazwaGracza());
            stol.display();
            player2.PrintHand();System.out.println();
            PushOrPop=Decyzja();
            if(PushOrPop==2) {
                RuchGracza(player2, stol);
            }else{
                ZbierzKarty(player2,stol);
            }

            System.out.println(player3.getNazwaGracza());
            stol.display();
            player3.PrintHand();System.out.println();
            PushOrPop=Decyzja();
            if(PushOrPop==2) {
                RuchGracza(player3, stol);
            }else{
                ZbierzKarty(player3,stol);
            }

        }while(player1.getIleKart()!=0 && player2.getIleKart()!=0 && player3.getIleKart() !=0);
    }//koniec

    public static void GameFor4(Player player1,Player player2,Player player3,Player player4) {
        Stos stol= new Stos();
        int PushOrPop;
        stol.Push(CardOper.find2Caro(player1,player2,player3,player4));
        do{
            System.out.println(player1.getNazwaGracza());
            stol.display();
            player1.PrintHand(); System.out.println();
            PushOrPop=Decyzja();
            if(PushOrPop==2){
                RuchGracza(player1,stol);
            }else{
                ZbierzKarty(player1,stol);
            }

            System.out.println(player2.getNazwaGracza());
            stol.display();
            player2.PrintHand();System.out.println();
            PushOrPop=Decyzja();
            if(PushOrPop==2) {
                RuchGracza(player2, stol);
            }else{
                ZbierzKarty(player2,stol);
            }

            System.out.println(player3.getNazwaGracza());
            stol.display();
            player3.PrintHand();System.out.println();
            PushOrPop=Decyzja();
            if(PushOrPop==2) {
                RuchGracza(player3, stol);
            }else{
                ZbierzKarty(player3,stol);
            }

            System.out.println(player4.getNazwaGracza());
            stol.display();
            player4.PrintHand();System.out.println();
            PushOrPop=Decyzja();
            if(PushOrPop==2) {
                RuchGracza(player4, stol);
            }else{
                ZbierzKarty(player4,stol);
            }

        }while(player1.getIleKart()!=0 && player2.getIleKart()!=0 && player3.getIleKart() !=0);
    }//koniec GameFor3


    public static int WybierzKarte(Player p1){
        Scanner odczyt=new Scanner(System.in);
        int chooseCard=-1; String chooseCardTemp;
        do{
        System.out.println("\nWybierz kartę:  ");
        chooseCardTemp = odczyt.nextLine();
        try {
            chooseCard = Integer.parseInt(chooseCardTemp);
            chooseCard-=1;
        }catch (NumberFormatException e)
        {
            System.out.println("Podano niedpowiednią wartość");
        }

        }while( chooseCard<0 || chooseCard>=p1.getIleKart());
        return chooseCard;

    }//koniec WybierzKarte
    public static int Decyzja(){
        Scanner odczyt=new Scanner(System.in);
        String TempDecyzja;int decyzja=0;
        do{
            System.out.println("1-zebrać karty 2-położyć kartę");
            TempDecyzja=odczyt.nextLine();
            try {
                decyzja = Integer.parseInt(TempDecyzja);
            }catch (NumberFormatException e)
            {
                System.out.println("Podano nieodpowiednią wartość");
            }

        }while (decyzja!=1 && decyzja!=2);

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

            stol.display();
            //ruch gracza
            System.out.println("\nKarty gracza: "+ player.getNazwaGracza());
            for(int i=1; i<= player.getIleKart();i++){
                System.out.print(""+i+"      ");
            }
            System.out.println();
            player.PrintHand();
            index=WybierzKarte(player);
            tempNaStos = new Karta(player.ViewKartaFromReka(index));
        }while (CardOper.checkBeforePush(tempNaStos,stol.LastCard()));
        tempNaStos = new Karta(player.TakeKartaFromReka(index));
        NaStos = new Karta(tempNaStos.getZnak(), tempNaStos.getColor(), tempNaStos.getValue());
        stol.Push(NaStos);
        clearScreen();

    }//koniec RuchGracza

    public static void ZbierzKarty(Player player,Stos stol){
        clearScreen();
        for (int i=0;i<3;i++){
            if(stol.getFirstFree()!=1){
            player.addKarta(stol.Pop());
            }
        }
        clearScreen();
    }
}
