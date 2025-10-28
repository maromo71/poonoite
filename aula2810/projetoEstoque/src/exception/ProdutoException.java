package exception;

public class ProdutoException extends Exception {
    private String errCode;

    public ProdutoException(String errCode){
        this.errCode = errCode;
    }

    @Override
    public String getMessage() {
        String message = "";
        if(errCode.equalsIgnoreCase("RF01EX01")){
            message = "Registro de saída de Produto Inválido";
        }else if(errCode.equalsIgnoreCase("RF01EX02")){
            message = "Registro de entrada de Produto Inválido";
        }
        return message;
    }
}
