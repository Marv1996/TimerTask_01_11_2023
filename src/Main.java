public class Main {
    public static void main(String[] args) {

        int x = 2, y = 5;

        // 02:05
        // 02:04
        // 02:03
        // .....
        // 00:00

        CustomTimer customTimer = new CustomTimer(x, y);
        customTimer.start();
    }
}