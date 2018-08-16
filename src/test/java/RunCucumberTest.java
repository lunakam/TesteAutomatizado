import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}
        , features = "/home/luna/Documents/AutomacaoJava/TesteAutomatizado/src/test/resources/features"
        , glue = {"stepsDefinition"})
public class RunCucumberTest {
}