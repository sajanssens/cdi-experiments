import javax.enterprise.context.Dependent;

/**
 * Created by Administrator on 1/18/2016.
 */
public class ConsolePrinter implements Printer {

    public void printMessage(String message){
        System.out.println("Message received: " + message);
    }
}
