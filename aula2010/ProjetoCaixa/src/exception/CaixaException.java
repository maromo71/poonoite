package exception;

public class CaixaException extends Exception{
    private String codigoErro;

    public CaixaException(String codigoErro){
        this.codigoErro = codigoErro;
    }

    @Override
    public String getMessage() {
        String mensagem = "";
        if(codigoErro.equalsIgnoreCase("RF01EX01")){
            mensagem = "Valor do depósito deve ser positivo";
        } else if (codigoErro.equalsIgnoreCase("RF01EX02")) {
            mensagem = "Sem saldo suficiente para o saque";
        } else{
            mensagem ="Contate o adm. Erro nao esperado";
        }
        return mensagem;
    }
}
