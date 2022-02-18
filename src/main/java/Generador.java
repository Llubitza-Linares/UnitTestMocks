public class Generador {
    PrimosUtils primosUtils;

    public Generador() {
        this.primosUtils = new PrimosUtils();
    }

    public Generador(PrimosUtils primoUtils) {
        this.primosUtils = primoUtils;
    }

    public String getNumberValues(int n) throws Exception {
        String resultado="";
        if (n <= 0) {
            throw new Exception("dato incorrecto");
        }
        if (this.primosUtils.esPrimo(n)) {
            for (int i = 2; i <= n; i += 2) {
                resultado += i+" ";
            }
        } else {
            for(int i = 1; i<=n ; i+=2) {
                resultado += i+" ";
            }
        }

        return resultado.trim();

    }
}