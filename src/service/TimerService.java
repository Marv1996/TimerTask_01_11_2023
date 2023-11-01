package service;

public class TimerService {

    public static void timer(int minute, int second) throws InterruptedException {
        for (int i = second, j = minute; i >= 0; i--) {
            if (i == 0) {
                if (j > 9) {
                    System.out.println(j + ":00");
                } else {
                    System.out.println("0" + j + ":00");
                }
                Thread.sleep(1000);

                i += 59;
                j--;
            }
            if (j == -1) {
                break;
            }
            if (i > 9 && j > 9) {
                System.out.println(j + ":" + i);
            } else if (i > 9) {
                System.out.println("0" + j + ":" + i);
            } else if (j > 9) {
                System.out.println(j + ":" + "0" + i);
            } else {
                System.out.println("0" + j + ":" + "0" + i);
            }
            Thread.sleep(1000);
        }
    }
}
