package pl.PanConsole.Game;
import pl.PanConsole.CardsUsers.*;

public class Stos {

    // Zdefiniowanie tablicy i elementów odpowiedzialnych za wierzchołek.
     Karta[] stosik;
    public int  firstFree;
    public int SizeofStosik;

    // Konstruktor, który zainicjuje wierzchołek i stos o odpowiedniej
    // wielkości.
    public Stos() {
        stosik = new Karta[32];
        firstFree = 0;
        SizeofStosik=0;
    }

    // Metoda zwracająca maksymalny rozmiar stosu
    int getMaximumStackSize() {
        return stosik.length;
    }

    // Metoda zwracająca prawdę, jeżeli stos jest pusty
    boolean isEmpty() {
        if (firstFree == 0) {
            return true;
        } else
            return false;
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
    Karta Pop() throws IndexOutOfBoundsException {
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
    Karta display() throws IndexOutOfBoundsException {
        if (firstFree == 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiodła się");
        }


        return stosik[firstFree-1];


    }
    /* Metoda wielokrotnego zdjęcia
    void multiPop(int k) {
        if (k < firstFree) {
            for (int i = k; i > 0; i--) {
                System.out.println(Pop());
            }
        }
    }

     Metoda czyszcząca stos
    void clear() {
        for (int i = 0; i < firstFree; i++) {
            stosik.;

        }

        firstFree = 0;
    }*/

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