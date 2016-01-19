import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;

import javax.enterprise.inject.Instance;

/**
 * Created by Administrator on 1/18/2016.
 */
public class StartTheCDIContainer {

    @Test
    public void startContainer(){
        WeldContainer container = new Weld().initialize();

       ConsolePrinter printer=  container.instance().select(ConsolePrinter.class).get();

       printer.printMessage("Hello CDI!");
    }
}
