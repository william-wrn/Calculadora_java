package calculadora;

import conversoes.ConversorNumerico;
import excecoes.erroNumerico;

public class Calculadora {
    static public String raiz2(String numero) throws erroNumerico{
        if (!ConversorNumerico.ehNumerico(numero)){
            throw new erroNumerico("Valor não numérico!",numero);
        }
        Double num = ConversorNumerico.toDouble(numero);
        Double resultado = Math.sqrt(num);
        if (Double.isNaN(resultado)){
            throw new erroNumerico("Raiz quadrada não existe para", numero);
        }
        return resultado.toString();
    }

    static public String potencia(String numero1, String numero2) throws erroNumerico{
        if (!ConversorNumerico.ehNumerico(numero1)){
            throw new erroNumerico("Valor não é numérico!",numero1);
        }
        if (!ConversorNumerico.ehNumerico(numero2)){
            throw new erroNumerico("Valor não é numérico!",numero2);
        }
        Double num1 = ConversorNumerico.toDouble(numero1);
        Double num2 = ConversorNumerico.toDouble(numero2);
        Double resultado = Math.pow(num1,num2);
        return resultado.toString();
    }

    static public String media(String numero1, String numero2) throws erroNumerico{
        if (!ConversorNumerico.ehNumerico(numero1)){
            throw new erroNumerico("Valor não é numérico!",numero1);
        }
        if (!ConversorNumerico.ehNumerico(numero2)){
            throw new erroNumerico("Valor não é numérico!",numero2);
        }
        Double num1 = ConversorNumerico.toDouble(numero1);
        Double num2 = ConversorNumerico.toDouble(numero2);
        Double resultado = (num1 + num2) / 2;
        return resultado.toString();
    }

    static public String divisao(String numero1, String numero2) throws erroNumerico{
        if (!ConversorNumerico.ehNumerico(numero1)){
            throw new erroNumerico("Valor não é numérico!",numero1);
        }
        if (!ConversorNumerico.ehNumerico(numero2)){
            throw new erroNumerico("Valor não é numérico!",numero2);
        }
        Double num1 = ConversorNumerico.toDouble(numero1);
        Double num2 = ConversorNumerico.toDouble(numero2);
        Double resultado = num1 / num2;
        if (Double.isInfinite(resultado)){
            throw new erroNumerico("Divisão impossível por", numero2);
        }
        return resultado.toString();
    }

    static public String multiplicacao(String numero1, String numero2) throws erroNumerico{
        if (!ConversorNumerico.ehNumerico(numero1)){
            throw new erroNumerico("Valor não é numérico!",numero1);
        }
        if (!ConversorNumerico.ehNumerico(numero2)){
            throw new erroNumerico("Valor não é numérico!",numero2);
        }
        Double num1 = ConversorNumerico.toDouble(numero1);
        Double num2 = ConversorNumerico.toDouble(numero2);
        Double resultado = num1 * num2;
        return resultado.toString();
    }

    static public String subtracao(String numero1, String numero2) throws erroNumerico{
        if (!ConversorNumerico.ehNumerico(numero1)){
            throw new erroNumerico("Valor não é numérico!",numero1);
        }
        if (!ConversorNumerico.ehNumerico(numero2)){
            throw new erroNumerico("Valor não é numérico!",numero2);
        }
        Double num1 = ConversorNumerico.toDouble(numero1);
        Double num2 = ConversorNumerico.toDouble(numero2);
        Double resultado = num1 - num2;
        return resultado.toString();
    }

    static public String soma(String numero1, String numero2) throws erroNumerico{
        if (!ConversorNumerico.ehNumerico(numero1)){
            throw new erroNumerico("Valor não é numérico!",numero1);
        }
        if (!ConversorNumerico.ehNumerico(numero2)){
            throw new erroNumerico("Valor não é numérico!",numero2);
        }
        Double num1 = ConversorNumerico.toDouble(numero1);
        Double num2 = ConversorNumerico.toDouble(numero2);
        Double resultado = num1 + num2;
        return resultado.toString();
    }
}
