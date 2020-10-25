package threads;

public class ThreadDemo {
    public static void show() {
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {

            thread.join();
            System.out.println("File is ready to be scanned.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         //this will block the current thread until the downloaded thread has finished
    }
}