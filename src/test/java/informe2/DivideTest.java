package informe2;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivideTest {

    @Test
    public void testDividir() {
        Divide divide = new Divide();
        int resultado = divide.dividir(10, 2);
        assertEquals(5, resultado);
    }
    
}
