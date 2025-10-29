package exception;

public class CaixaException extends Exception  {
    private String errCode;
    private String errMsg;

    public CaixaException(String errCode){
        this.errCode = errCode;
        if(errCode.equalsIgnoreCase( "RF01EX01")){
            this.errMsg = "Saldo insuficiente";
        }else if(errCode.equalsIgnoreCase("RF01EX02")){
            this.errMsg = "Valor inválido para o deposito";
        }else{
            this.errMsg = "Erro: " +  errCode;
        }
    }

    @Override
    public String getMessage() {
        return errMsg;
    }
}
