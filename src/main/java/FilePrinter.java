import javax.enterprise.context.ApplicationScoped;

/**
 * Created by Administrator on 1/18/2016.
 */
public class FilePrinter implements Printer {


    public void printMessage(String message) {
        System.out.println("Printed: " + message + " => to file: ");
    }
}
