package pl.PanConsole.CardsUsers;
public class RozdawanieKart {


    public static void RozdajNaDwoch(Talia t2,Player p1,Player p2){
        p1.setReka();
        p2.setReka();

        for(int i=0;i<16;i++){
            Karta tempP1 =new Karta(t2.talia[i].getZnak(),t2.talia[i].getColor(),t2.talia[i].getValue());
            Karta tempP2 =new Karta(t2.talia[i+16].getZnak(),t2.talia[i+16].getColor(),t2.talia[i+16].getValue());
            p1.addKarta(tempP1);
            p2.addKarta(tempP2);

        }

    }
    public static void RozdajNaTrzech(Talia t2,Player p1,Player p2,Player p3){
        p1.setReka();
        p2.setReka();
        p3.setReka();
        for(int i=0;i<11;i++) {
            Karta tempP1 =new Karta(t2.talia[i].getZnak(),t2.talia[i].getColor(),t2.talia[i].getValue());
            Karta tempP2 =new Karta(t2.talia[i+11].getZnak(),t2.talia[i+11].getColor(),t2.talia[i+11].getValue());
            p1.addKarta(tempP1);
            p2.addKarta(tempP2);

        }
        for(int i=22;i<32;i++){
            Karta tempP1 =new Karta(t2.talia[i].getZnak(),t2.talia[i].getColor(),t2.talia[i].getValue());
            p3.addKarta(tempP1);
        }

    }
    public static void RozdajNaCzterech(Talia t2,Player p1,Player p2,Player p3,Player p4){
        p1.setReka();
        p2.setReka();
        p3.setReka();
        p4.setReka();

        for(int i=0;i<8;i++){
            Karta tempP1 =new Karta(t2.talia[i].getZnak(),t2.talia[i].getColor(),t2.talia[i].getValue());
            Karta tempP2 =new Karta(t2.talia[i+8].getZnak(),t2.talia[i+8].getColor(),t2.talia[i+8].getValue());
            Karta tempP3 =new Karta(t2.talia[i+16].getZnak(),t2.talia[i+16].getColor(),t2.talia[i+16].getValue());
            Karta tempP4 =new Karta(t2.talia[i+24].getZnak(),t2.talia[i+24].getColor(),t2.talia[i+24].getValue());

            p1.addKarta(tempP1);
            p2.addKarta(tempP2);
            p3.addKarta(tempP3);
            p4.addKarta(tempP4);

        }

    }





}
