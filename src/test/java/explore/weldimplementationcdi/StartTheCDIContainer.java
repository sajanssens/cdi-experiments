package explore.weldimplementationcdi;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.enterprise.inject.Instance;
import javax.enterprise.inject.se.SeContainer;

/**
 * Created by Administrator on 1/18/2016.
 */
public class StartTheCDIContainer {

    @Test
    public void startContainer(){

        WeldContainer container = new Weld().initialize();

        final Instance<Object> instance = container.instance();
        ConsolePrinter printer=  instance.select(ConsolePrinter.class).get();

        printer.printMessage("Hello CDI!");
    }

    @Test
    public void getBeanFromCDIWithDependenciesInjected(){
        WeldContainer container = new Weld().initialize();

        final Instance<Object> instance = container.instance();
        ClassInNeedOfPrinter worker = instance.select(ClassInNeedOfPrinter.class).get();

        worker.doSomeWork();
    }

    @Test(expected = org.jboss.weld.exceptions.DeploymentException.class)
    public void howDoesTheContainerReactWhenMoreThanOneBeanCanBeInjected(){
        WeldContainer container = new Weld().initialize();

        final Instance<Object> instance = container.instance();
        ClassInNeedOfPrinter worker = instance.select(ClassInNeedOfPrinter.class).get();

        worker.doSomeWork();
    }

    @Test(expected = org.jboss.weld.exceptions.DeploymentException.class)
    public void resolveAmbiguousDependencyWithQualifiers(){
        WeldContainer container = new Weld().initialize();

        final Instance<Object> instance = container.instance();
        ClassInNeedOfPrinter worker = instance.select(ClassInNeedOfPrinter.class).get();

        worker.doSomeWork();
    }

    @Test
    public void usingTheCorrectRetentionPolicy(){
        WeldContainer container = new Weld().initialize();

        final Instance<Object> instance = container.instance();
        ClassInNeedOfPrinter worker = instance.select(ClassInNeedOfPrinter.class).get();

        worker.doSomeWork();
    }

    @Test
    public void finallyUsingTheConsolePrinter() throws Exception {
        WeldContainer container = new Weld().initialize();

        final Instance<Object> instance = container.instance();
        ClassInNeedOfPrinter worker = instance.select(ClassInNeedOfPrinter.class).get();

        worker.doSomeWork();

    }
    
    @Test
	public void usingAStandardCDIInterfaceToInteractWithWeldContainer() throws Exception {
    	WeldContainer weldContainer = new  Weld().initialize();

    	SeContainer cdiContainer=(SeContainer)weldContainer;
    	
    	ClassInNeedOfPrinter worker = cdiContainer.select(ClassInNeedOfPrinter.class).get();
    	
    	worker.doSomeWork();
    }
}
