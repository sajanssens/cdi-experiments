import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;

/**
 * Created by Administrator on 1/18/2016.
 */
@Default
public class FilePrinter implements Printer {


    public void printMessage(String message) {
        System.out.println("Printed: " + message + " => to file: ");
    }
}
