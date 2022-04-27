package es.s2o.selenium.tests.herokuapp;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/herokuapp",
        glue = "es.s2o.selenium.stepsdefs.herokuapp")
public class HerokuappTest {
}
