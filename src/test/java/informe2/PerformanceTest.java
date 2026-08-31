package informe2;

import org.junit.Test;

public class PerformanceTest {

    @Test
    public void pruebaRendimientoDivision() {

        Divide divide = new Divide();

        int operaciones = 10000;
        int errores = 0;

        long inicio = System.nanoTime();

        for (int i = 0; i < operaciones; i++) {
            try {
                divide.dividir(100, 2);
            } catch (Exception e) {
                errores++;
            }
        }

        long fin = System.nanoTime();

        double tiempoSegundos = (fin - inicio) / 1_000_000_000.0;
        double tps = operaciones / tiempoSegundos;
        double latenciaMs = (tiempoSegundos * 1000) / operaciones;
        double porcentajeErrores = (errores * 100.0) / operaciones;

        System.out.println("===== PRUEBA DE PERFORMANCE =====");
        System.out.println("Operaciones: " + operaciones);
        System.out.println("TPS: " + tps);
        System.out.println("Latencia promedio (ms): " + latenciaMs);
        System.out.println("Errores: " + porcentajeErrores + "%");
    }
}