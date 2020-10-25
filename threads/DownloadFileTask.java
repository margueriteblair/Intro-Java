package threads;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading a file...");
        System.out.println(Thread.currentThread().getName());

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}