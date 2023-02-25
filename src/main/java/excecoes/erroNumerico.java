package excecoes;

public class erroNumerico extends Exception{

    private String valor;

    public erroNumerico(String mensagem,String valor){
        super(mensagem + " '" + valor + "'");
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }
    
}
