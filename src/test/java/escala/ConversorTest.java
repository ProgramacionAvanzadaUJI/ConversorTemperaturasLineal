package escala;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ConversorTest {
    Conversor conversor;

    @BeforeEach
    void setUp() {
        conversor = new Conversor(new EscalaLineal(0, 100), new EscalaLineal(32, 212));
    }

    @AfterEach
    void tearDown() {
        conversor = null;
    }

    @Test
    void conversorTest() {
        assertThat(32.0, is(conversor.convierte(0)));

        assertThat(212.0, is(conversor.convierte(100)));
    }
}
