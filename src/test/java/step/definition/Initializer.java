package step.definition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Utils;

public class Initializer extends Base {
	  @Before

	    public void beforeHooks(Scenario scenario) {
	        // We use the logger to log when the scenario started
	        logger.info("Scenario " + scenario.getName() + " started");
	        // These static methods are coming from Base class
	        // browser() will get the browser
	        browser();
	        //openBrowser() will launch the url for us and launch the browser
	        openBrowser();
	        Utils.verify = scenario;

	        
	    }



	    /* @After = When we add the @After annotation on top of our afterHooks method, this method will run
	     * after every scenario.
	     * In this method, we can also write the code to add a screenshot of our failed test step, if it fails.
	     */
	    @After
	    public void afterHooks(Scenario scenario) {
	        // we can also write code to capture screenshot if our test fails
	        if(scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png" , "Failed Test");
	        }else {
	            tearDown();
	            logger.info("Scenario" + scenario.getName() + " " + scenario.getStatus());
	        }

	    }}