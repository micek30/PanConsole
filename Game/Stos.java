package pl.PanConsole.Game;
import pl.PanConsole.CardsUsers.*;

public class Stos {

    // Zdefiniowanie tablicy i elementów odpowiedzialnych za wierzchołek.
     Karta[] stosik;
    private int  firstFree;
    private int SizeofStosik;

    // Konstruktor, który zainicjuje wierzchołek i stos o odpowiedniej
    // wielkości.
    public Stos() {
        stosik = new Karta[32];
        firstFree=0;
        SizeofStosik=0;
    }


    // Metoda zwracająca rozmiar stosu
    int getSize() {
        return firstFree;
    }

    // Metoda dodająca na stos
    void Push(Karta E) throws ArrayIndexOutOfBoundsException {
        if (firstFree < stosik.length) {
            stosik[firstFree] = new Karta(E.getZnak(),E.getColor(),E.getValue());
            firstFree++;

        } else {
            throw new ArrayIndexOutOfBoundsException(
                    "Przepełnienie stosu, operacja nie powiodła się");
        }
    }

    // Metoda zdejmująca ze stosu
    Karta Pop() {
        if (firstFree <= 1) {
            throw new IndexOutOfBoundsException(
                    "Nie można zdjąć kart ze stosu");
        }

        Karta temp =new Karta(stosik[firstFree - 1].getZnak(),stosik[firstFree - 1].getColor(),stosik[firstFree - 1].getValue()) ;
        firstFree--;
        return temp;
    }

    // Metoda wyświetlająca zawartość stosu
    void displayStack() throws IndexOutOfBoundsException {
        if (firstFree == 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiodła się");
        }

        int temp = firstFree - 1;
        do {
            System.out.print(stosik[temp]+" ");
            temp--;
        } while (temp > -1);

    }
    // Metoda wyświetlająca wierzchołek stosu
    void display() {
        for (int i = 3; i >0; i--)
        {
            if (firstFree == 1 && i>1) {
               continue;
            }else if(firstFree==2 && i>2){
                continue;
        }

                {
                System.out.print(" "+stosik[firstFree - i]+" ");
            }
        }
        System.out.println();

    }
    Karta LastCard() {
        return stosik[firstFree - 1];

    }

    public Karta[] getStosik() {
        return stosik;
    }

    public void setStosik(Karta[] stosik) {
        this.stosik = stosik;
    }

    public int getFirstFree() {
        return firstFree;
    }

    public void setFirstFree(int firstFree) {
        this.firstFree = firstFree;
    }

    public int getSizeofStosik() {
        return SizeofStosik;
    }

    public void setSizeofStosik(int sizeofStosik) {
        SizeofStosik = sizeofStosik;
    }
}