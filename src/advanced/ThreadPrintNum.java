package advanced;

public class ThreadPrintNum implements Runnable {
    int start, end;

    public ThreadPrintNum(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}
