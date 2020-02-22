package escala;

import static org.hamcrest.core.Is.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class EscalaLinealTest {
    EscalaLineal escala;

    @BeforeEach
    void setUp() {
        escala = new EscalaLineal(0, 100);
    }
    @Test
    void temperaturaParaLambdaTest() {
        assertThat(0.0, is(escala.temperaturaParaLambda(0)));

        assertThat(100.0, is(escala.temperaturaParaLambda(1)));
    }
}
