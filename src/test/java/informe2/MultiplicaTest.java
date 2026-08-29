package informe2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicaTest {

    @Test
    public void testMultiplicar() {
        Multiplica multiplica = new Multiplica();
        int resultado = multiplica.multiplicar(3, 4);
        assertEquals(12, resultado);
    }

}
