import Bod.Bod;

import java.util.Scanner;

public class SuradniceBodu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teraz budes pisat suradnice prveho bodu. Musia byt v rozmedzi 0 az 100, inak to crashne");
        System.out.println("Napis suradnicu x");
        int suradnicaX = sc.nextInt();
        System.out.println("Teraz suradnicu y");
        int suradnicaY = sc.nextInt();
        System.out.println("Uz len z");
        int suradnicaZ = sc.nextInt();

        Bod prvy = new Bod(suradnicaX,suradnicaY,suradnicaZ);
        System.out.println("X: " + suradnicaX + " " + "Y: " + suradnicaY + "Z: " + suradnicaZ);
    }
}