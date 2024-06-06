import br.com.main.ArrayPessoas;
import org.junit.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ClasseTest {

    @Test
    public void testFiltrarMulheres(){
        String input = "joao - m, bia - f, maria - f, carlos - m, ana - f";
        List<String> esperado = Arrays.asList(" bia - f", " maria - f", " ana - f");

        List<String> resultado = ArrayPessoas.filtrarMulheres(input);

        assertEquals(esperado, resultado);
    }
}
