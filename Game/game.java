package pl.PanConsole.Game;
import pl.PanConsole.CardsUsers.*;

import java.io.IOException;
import java.util.Scanner;

public class game {

    /*private int find2Caro(Player p1,Player p2){
        int indexOf2Caro;
        Karta Card2Caro=new Karta("2","karo",2);
        for(int i=0;i<p1.getIleKart();i++){
            if(p1.ViewKartaFromReka(i)="2 karo");

        }

    }*/

    public static void GameFor2(Player player1,Player player2) {
        Stos stol= new Stos();
        Karta NaStos,tempNaStos;

        do{
            //try{
                //Runtime.getRuntime().exec("cls");
                clearScreen();
                //ruch pierwszego gracza
                System.out.println("Karty Pierwszego gracza");
                player1.PrintHand();
                tempNaStos=new Karta(player1.TakeKartaFromReka(WybierzKarte()));
                NaStos=new Karta(tempNaStos.getZnak(),tempNaStos.getColor(),tempNaStos.getValue());
                stol.Push(NaStos);
                //Runtime.getRuntime().exec("cls");
                clearScreen();
                stol.display();
                //ruch drugiego gracza
                System.out.println("Karty drugiego gracza");
                player2.PrintHand();
                tempNaStos=new Karta(player2.TakeKartaFromReka(WybierzKarte()));
                NaStos=new Karta(tempNaStos.getZnak(),tempNaStos.getColor(),tempNaStos.getValue());
                stol.Push(NaStos);


            /*}catch (IOException e){
                e.printStackTrace();
            }*/

        }while(player1.getIleKart()!=0 && player2.getIleKart()!=0);


    }//koniec GameFor2
    public static int WybierzKarte(){
        Scanner odczyt=new Scanner(System.in);
        int chooseCard; String chooseCardTemp;
        System.out.println("Wybierz kartę:  ");
        chooseCardTemp = odczyt.nextLine();
        chooseCard= Integer.parseInt(chooseCardTemp);
        chooseCard-=1;
        return chooseCard;

    }//koniec WybierzKarte
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
