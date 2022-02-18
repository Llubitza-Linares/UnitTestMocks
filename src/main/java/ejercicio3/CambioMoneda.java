package ejercicio3;

public class CambioMoneda {
    private Util util = new Util();
    private String message;

    public CambioMoneda(){}

    public CambioMoneda(Util utilMock){
        util = utilMock;
    }

    public  String cambio(int monto, String moneda1, String moneda2){
        if(monto > 0){
            message = "Se convirtio a: " + (monto*util.convert(moneda1, moneda2));
        }else {
            message = "La cantidad ingresada es incorrecta";
        }
        return message;
    }
}
