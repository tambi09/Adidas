package demoblaze.com.utilities;

public class BrowserUtils {
    public static void sleep(int second) {
        second = 1000;

        //1sec = 1000 milli seconds
        //1 1000 =

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();

            System.out.println("something happened in the sleep method");
        }
    }
}
