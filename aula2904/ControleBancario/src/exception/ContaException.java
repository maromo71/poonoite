package exception;

public class ContaException extends Exception{
    private String numberException;

    public ContaException(String numberException){
        this.numberException = numberException;
    }

    @Override
    public String getMessage() {
        if(numberException.equalsIgnoreCase("RF01EX01")){
            return "Valor inválido para o depósito";
        }
        if(numberException.equalsIgnoreCase("RF01EX02")){
            return "Sem saldo suficiente para o saque";
        }
        return "Contate o administrator, erro desconhecido";
    }
}
