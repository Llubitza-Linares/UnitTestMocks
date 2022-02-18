package ejercicio3;

public class CambioMonedaStatic {
    public CambioMonedaStatic(){}

    public  String cambio(int monto, String moneda1, String moneda2){
        String message;
        if(monto > 0){
            message = "Se convirtio a: " + (monto*UtilStatic.convert(moneda1, moneda2));
        }else {
            message = "La cantidad ingresada es incorrecta";
        }
        return message;
    }
}