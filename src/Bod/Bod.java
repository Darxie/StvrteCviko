package Bod;

public class Bod {
    int x, y, z;


    public Bod(int suradnicaX, int suradnicaY, int suradnicaZ) {
        if ((suradnicaX > 0) && (suradnicaX < 100)) {
            x = suradnicaX;
        }
        if ((suradnicaY > 0) && (suradnicaY < 100)) {
            y = suradnicaY;
        }
        if ((suradnicaZ > 0) && (suradnicaZ < 100)) {
            z = suradnicaZ;
        }
    }
}
