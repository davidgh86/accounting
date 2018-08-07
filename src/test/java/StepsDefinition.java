
import com.ust.calc.calculadora.CalculadoraApplicationTests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefinition extends CalculadoraApplicationTests {
    
	private String inputJson;

	
	@When("^I create a new employee and the size of the cadastre ref is 14$")
	public void setUpCadastre14positions() {
		inputJson = "{\"name\":\"Perico Palotes\", \"email\":\"ppito@kfoei.com\", \"dni\": \"889754235S\", \"birthDate\":\"1995-11-05T00:00:00.000Z\", \"contract\":{\"category\":\"x\",\"contractType\":\"S\",\"startDate\":\"15/05/2015\",\"salary\":\"38559.58\",\"endDate\":\"15/05/2016\",\"insuranceNumber\":\"73483859\",\"civilStatus\":\"married\",\"contractType\":\"ES283845899012859843\"},\"cadastreRef\":\"1234567890ABCD\"}";
	}
	
	@When("^I create a new employee and the size of the cadastre ref is 20$")
	public void setUpCadastre20positions() {
		inputJson = "{\"name\":\"Perico Palotes\", \"email\":\"ppito@kfoei.com\", \"dni\": \"889754235S\", \"birthDate\":\"1995-11-05T00:00:00.000Z\", \"contract\":{\"category\":\"x\",\"contractType\":\"S\",\"startDate\":\"2017-08-12T00:00:00.000Z\",\"salary\":\"38559.58\",\"endDate\":\"2018-05-12T00:00:00.000Z\",\"insuranceNumber\":\"73483859\",\"civilStatus\":\"married\",\"contractType\":\"ES283845899012859843\"},\"cadastreRef\":\"1234567890ABCD5FE2l4\"}";
	}
	
    @Then("^a new employee is created$")
    public void iGetAnOKResponse() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        postRestOK("/employee", inputJson);
        System.out.print("ok");
    }
    
    @When("^I create a new employee and the size of the cadastre ref. is not 14 or 20$")
    public void setUpInvalidCadastre() {
    	inputJson = "{\"name\":\"Perico Palotes\", \"email\":\"ppito@kfoei.com\", \"dni\": \"889754235S\", \"birthDate\":\"1995-11-05T00:00:00.000Z\", \"contract\":{\"category\":\"x\",\"contractType\":\"S\",\"startDate\":\"2017-08-12T00:00:00.000Z\",\"salary\":\"38559.58\",\"endDate\":\"2018-05-12T00:00:00.000Z\",\"insuranceNumber\":\"73483859\",\"civilStatus\":\"married\",\"contractType\":\"ES283845899012859843\"},\"cadastreRef\":\"123456789\"}";
    }
    
    @Then("^an error of not created employee is shown$")
    public void iGetAKOResponse() throws Throwable {
    	 postRestKO("/employee", inputJson);
    }
    
    
}
