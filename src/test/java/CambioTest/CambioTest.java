package CambioTest;

import ejercicio3.CambioMoneda;
import ejercicio3.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CambioTest {
    Util mock = Mockito.mock(Util.class);

    @Test
    public void verify(){
        Mockito.when(mock.convert("dolares", "bolivianos")).thenReturn(7);
        CambioMoneda convertirMoneda = new CambioMoneda(mock);
        String result = "Se convirtio a: 70";
        String actual = convertirMoneda.cambio(10, "dolares", "bolivianos");
        Assertions.assertEquals(result, actual, "Error");
        Mockito.verify(mock).convert("dolares", "bolivianos");
    }

    @Test
    public void verifyError(){
        Mockito.when(mock.convert("reales", "bolivianos")).thenReturn(2);
        CambioMoneda convertirMoneda = new CambioMoneda(mock);
        String result = "La cantidad ingresada es incorrecta";
        String actual = convertirMoneda.cambio(-1, "reales", "bolivianos");
        Assertions.assertEquals(result, actual, "Error");
    }
}