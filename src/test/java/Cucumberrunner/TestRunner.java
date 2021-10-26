package Cucumberrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)   Here we are running with testNg runner hence no more required
@CucumberOptions(
		features="C:\\Users\\Prathap\\eclipse-workspace\\Prathap\\Prathap.java\\CoreJava\\Framework\\src\\test\\java\\features\\Login.feature",
		glue="stepDefinition"
		)

public class TestRunner extends AbstractTestNGCucumberTests {    //here we have to extend one class from website to convert junit runner to testng runner
	



	}





//Here we have to pass the path for feature file and stepdefination:-- Use a annotation   : CucumberOptons(path of fetfile and stepdefination(glue))
//glue is parameter to define a stepdefination file
//In cucumber we maintain skeleton
//There should be one mapping implementation for each gherkin line
//Test run and stepdefination preferably lies in same parent
//If there were multiple scenario where some of have different value implements here...reg Ex


//To run as testng we have to add dependency called cucmber-testng  --> create testng file and give information--.convert testrunner to testng runner



/* To integrate cucmber with testNg:- 
We have to convert junit runner to test ng runner --->cucumber testng maven dependency -->
*/