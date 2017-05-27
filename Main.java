package pl.PanConsole;

import pl.PanConsole.CardsUsers.*;
import pl.PanConsole.Game.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String tempIleGraczy;
        int ileGraczy=3;
        //Tworzenie i tasowanie talii
        Talia talia=new Talia();
	    talia.shuffle();

        //Pobieranie ilości graczy
	    Scanner odczyt = new Scanner(System.in);
	    do {
            System.out.println("Podaj ilość graczy 2-4 \n");
            tempIleGraczy = odczyt.nextLine();
            ileGraczy = Integer.parseInt(tempIleGraczy);
        }while(ileGraczy>4 &&ileGraczy<2);

	    //utworzenie i rozdanie kart między graczy
        switch (ileGraczy){
            case 2:{
                Player player1=new Player("Player 1");
                Player player2=new Player("Player 2");

                RozdawanieKart.RozdajNaDwoch(talia,player1,player2);
                game.GameFor2(player1,player2);

                break;
            }
            case 3:{
                Player player1=new Player("Player 1");
                Player player2=new Player("Player 2");
                Player player3=new Player("Player 3");
                RozdawanieKart.RozdajNaTrzech(talia,player1,player2,player3);
                break;
            }
            case 4:{
                Player player1=new Player("Player 1");
                Player player2=new Player("Player 2");
                Player player3=new Player("Player 3");
                Player player4=new Player("Player 4");
                RozdawanieKart.RozdajNaCzterech(talia,player1,player2,player3,player4);
                break;
            }

        }//koniec rozdawania kart

    }//koniec main
}
