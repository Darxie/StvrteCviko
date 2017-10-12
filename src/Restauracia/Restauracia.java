package Restauracia;

public class Restauracia {
    int pocetKucharov;
    int pocetCasnikov;

    public Restauracia(){
        pocetCasnikov = 31;
        pocetKucharov = 5;
    }

    public static void pocetZamestnancov(){
        Restauracia restauracia = new Restauracia();
        int pocZam = restauracia.pocetCasnikov + restauracia.pocetKucharov;
        System.out.println("Zamestnancov je : " + pocZam);
    }

    public static void main(String[] args) {

        pocetZamestnancov();
    }
}
