public class CustomTimer {

    int minutes;

    int seconds;

    public CustomTimer(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void start() {
        printTime();
        while (minutes != 0 || seconds != 0) {
            if (seconds == 0) {
                minutes --;
                seconds = 59;
            } else {
                seconds --;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            printTime();
        }
    }

    private void printTime() {
        String minutes = this.minutes < 10 ? "0" + this.minutes : this.minutes + "";
        String seconds = this.seconds < 10 ? "0" + this.seconds : this.seconds + "";
        System.out.println(minutes + ":" + seconds);
    }
}
