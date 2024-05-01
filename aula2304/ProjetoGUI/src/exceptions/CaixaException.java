package exceptions;

public class CaixaException extends Exception {
    private int codigoErro;

    public CaixaException(int codigoErro){
        this.codigoErro = codigoErro;
    }

    @Override
    public String getMessage() {
        String mensagem = "";
        switch (codigoErro){
            case 1:
                mensagem = "Sem saldo para a operação";
                break;
            case 2:
                mensagem = "Valor inválido para o depósito";
        }
        return mensagem;
    }
}
