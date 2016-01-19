import javax.enterprise.context.Dependent;

/**
 * Created by Administrator on 1/18/2016.
 */
@Console
public class ConsolePrinter implements Printer {

    public void printMessage(String message){
        System.out.println("Printed: " + message + " => to console" );
    }
}
