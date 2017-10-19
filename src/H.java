public class H {
    boolean isTurnedOn;
    int nOfFriends;

    private static int counter = 0;

    public H(){
        counter++;
    }

    public static int getNumOfInstances() {
        return counter;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            H prvy = new H();

        }
        System.out.println(getNumOfInstances());
    }
}
