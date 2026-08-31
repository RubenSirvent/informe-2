package informe2.steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import informe2.Divide;

public class DivideSteps {

    private int dividendo;
    private int divisor;
    private int resultado;

    @Given("que tengo el número {int} y el número {int}")
    public void queTengoLosNumeros(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    @When("realizo la división")
    public void realizoLaDivision() {
        Divide divide = new Divide();
        resultado = divide.dividir(dividendo, divisor);
    }

    @Then("el resultado debe ser {int}")
    public void elResultadoDebeSer(int resultadoEsperado) {
        assertEquals(resultadoEsperado, resultado);
    }
}