import javax.inject.Inject;

/**
 * Created by Administrator on 1/18/2016.
 */
public class ClassInNeedOfPrinter {

    @Inject
    private Printer printer;

    public void doSomeWork(){
        printer.printMessage("Start with work");

        // do some work

        printer.printMessage("Finished doing work");
    }
}

