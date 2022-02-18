package CambioTest;

import ejercicio3.CambioMonedaStatic;
import ejercicio3.UtilStatic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class CambioTestMock {

@BeforeAll
public static void before(){
    MockedStatic<UtilStatic> mock = Mockito.mockStatic(UtilStatic.class);
    mock.when(()->UtilStatic.convert("bolivianos", "dolares")).thenReturn(7);
    mock.when(()->UtilStatic.convert("bolivianos", "reales")).thenReturn(2);
}

    @Test
    public void verify(){
        CambioMonedaStatic convertirMonedaStatic = new CambioMonedaStatic();
        Assertions.assertEquals("Se convirtio a: 70",
                convertirMonedaStatic.cambio(10, "bolivianos", "dolares"), "Error");
    }

    @Test
    public void verifyWrong(){
        CambioMonedaStatic convertirMonedaStatic = new CambioMonedaStatic();
        Assertions.assertEquals("La cantidad ingresada es incorrecta",
                convertirMonedaStatic.cambio(-10, "bolivianos", "reales"), "Error");
    }

}