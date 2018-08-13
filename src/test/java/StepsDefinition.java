
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ust.calc.calculadora.CalculadoraApplicationTests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefinition extends CalculadoraApplicationTests {
    
	private ResultActions resultActions;
	private ResponseEntity<String> responseEmployee;

	
	@When("^I create a new employee with cadastreRef \"([^\"]*)\"$")
	public void setUpCadastre14positions(String cadastreRef) throws Throwable {
		String inputJson = new StringBuilder("{\"name\":\"Perico Palotes\", \"email\":\"ppito@kfoei.com\", \"dni\": \"88975423S\", \"birthDate\":\"1995-11-05T00:00:00.000Z\", \"contract\":{\"category\":\"x\",\"contractType\":\"S\",\"startDate\":\"15/05/2015\",\"salary\":\"38559.58\",\"currency\":\"EUR\",\"endDate\":\"15/05/2016\",\"insuranceNumber\":\"73483859\",\"civilStatus\":\"married\",\"currentAccount\":\"ES283845899012859843\"},\"cadastreRef\":\"").append(cadastreRef).append("\"}").toString();
		resultActions = postRestOK("/employee", inputJson);
	}
	
    @Then("^a new employee is created with cadastreRef \"([^\"]*)\"$")
    public void iGetAnOKResponse(String cadastreRefResult) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	resultActions.andExpect(status().isCreated())
    	.andExpect(jsonPath("$.cadastreRef").value(cadastreRefResult));
        System.out.print("ok");
    }
    
    @When("^I create a new employee and the size of the cadastre ref. is not 14 or 20$")
    public void setUpInvalidCadastre() throws Throwable {
    	String inputJson = "{\"name\":\"Perico Palotes\", \"email\":\"ppito@kfoei.com\", \"dni\": \"88975423S\", \"birthDate\":\"1995-11-05T00:00:00.000Z\", \"contract\":{\"category\":\"x\",\"contractType\":\"S\",\"startDate\":\"15/05/2015\",\"salary\":\"38559.58\",\"currency\":\"EUR\",\"endDate\":\"15/05/2016\",\"insuranceNumber\":\"73483859\",\"civilStatus\":\"married\",\"currentAccount\":\"ES283845899012859843\"},\"cadastreRef\":\"1234567890ABCD7856\"}";
    	responseEmployee = postRestKO("/employee", inputJson);
    }
    
    @Then("^an error of not created employee is shown$")
    public void iGetAKOResponse() throws Throwable {
    	ObjectMapper mapper = new ObjectMapper();
        JsonNode actualObj = mapper.readTree(responseEmployee.getBody());
        assertThat(responseEmployee.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
        assertThat(actualObj.path("errors").elements().next().get("defaultMessage").asText()).isEqualTo("cadastreRef size must be 14 or 20 characters");
    }
    
    
}
