package pl.PanConsole;

public class RozdawanieKart {


    public static void RozdajNaDwoch(Talia t2,Player p1,Player p2){
        
        for(int i=0;i<16;i++){
            Karta tempP1 =new Karta(t2.talia[i].getZnak(),t2.talia[i].getColor(),t2.talia[i].getValue());
            Karta tempP2 =new Karta(t2.talia[i+16].getZnak(),t2.talia[i+16].getColor(),t2.talia[i+16].getValue());
            p1.setReka(new Reka(tempP1.getKarta(),i));
            p1.setRekaSize(16);
            p2.setReka(new Reka(tempP2.getKarta(),i));
            p2.setRekaSize(16);

            //System.out.print(p1.getKartaFromReka(i)+" "); //wyświetlanie ręki
            //System.out.print(p2.getKartaFromReka(i)+" ");
        }
        
    }
    public static void RozdajNaTrzech(Talia t2,Player p1,Player p2,Player p3){

        for(int i=0;i<11;i++) {
            Karta tempP1 =new Karta(t2.talia[i].getZnak(),t2.talia[i].getColor(),t2.talia[i].getValue());
            Karta tempP2 =new Karta(t2.talia[i+11].getZnak(),t2.talia[i+11].getColor(),t2.talia[i+11].getValue());
            p1.setReka(new Reka(tempP1.getKarta(),i));
            p1.setRekaSize(11);
            p2.setReka(new Reka(tempP2.getKarta(),i));
            p2.setRekaSize(11);

        }
        for(int i=22;i<32;i++){
            Karta tempP1 =new Karta(t2.talia[i].getZnak(),t2.talia[i].getColor(),t2.talia[i].getValue());
            p3.setReka(new Reka(tempP1.getKarta(),i));
            p1.setRekaSize(10);
        }

    }
    public static void RozdajNaCzterech(Talia t2,Player p1,Player p2,Player p3,Player p4){

        for(int i=0;i<8;i++){
            Karta tempP1 =new Karta(t2.talia[i].getZnak(),t2.talia[i].getColor(),t2.talia[i].getValue());
            Karta tempP2 =new Karta(t2.talia[i+8].getZnak(),t2.talia[i+8].getColor(),t2.talia[i+8].getValue());
            Karta tempP3 =new Karta(t2.talia[i+8].getZnak(),t2.talia[i+8].getColor(),t2.talia[i+8].getValue());
            Karta tempP4 =new Karta(t2.talia[i+8].getZnak(),t2.talia[i+8].getColor(),t2.talia[i+8].getValue());
            p1.setReka(new Reka(tempP1.getKarta(),i));
            p1.setRekaSize(8);

            p2.setReka(new Reka(tempP2.getKarta(),i));
            p1.setRekaSize(8);

            p3.setReka(new Reka(tempP2.getKarta(),i));
            p1.setRekaSize(8);

            p4.setReka(new Reka(tempP2.getKarta(),i));
            p1.setRekaSize(8);


        }

    }





}
