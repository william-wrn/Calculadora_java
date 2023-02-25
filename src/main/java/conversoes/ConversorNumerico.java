package conversoes;

public class ConversorNumerico{
    static public boolean ehNumerico(String strNumero) {
        if (strNumero == null)
            return false;
        String numero = strNumero.replaceAll(",", ".");

        try {
            toDouble(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static public Double toDouble(String numero) {
        String num = numero.replaceAll(",", ".");
        return Double.parseDouble(num);
    }
}
