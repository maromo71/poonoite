package util;

public class CaixaException extends Exception {
    private String errNumber;

    public CaixaException(String errNumber) {
        this.errNumber = errNumber;
    }

    @Override
    public String getMessage() {
        String errDescription = "";
        if (errNumber != null) {
            if (errNumber.equalsIgnoreCase("RF27EX01")){
                errDescription = "Saldo insuficiente para o saque";
            }else if (errNumber.equalsIgnoreCase("RF27EX02")){
                errDescription = "Depósito deve ser valor positivo";
            }
        }
        return errDescription;
    }
}
