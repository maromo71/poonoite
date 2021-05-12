package br.edu.fatecmm.calculadora_gui.util;

public class ExemploTryException extends Exception {

    private int codErro;

    public ExemploTryException(int erro) {
        this.codErro = erro;
    }

    public void setCodErro(int codErro) {
        this.codErro = codErro;
    }

    public int getCodErro() {
        return codErro;
    }


    public String getMessage() {
        return verificaerro();
    }

    private String verificaerro() {
        String mensagem = " ";
        switch (codErro){
            case 1:
                //Gravar um log no seu banco de dados
                mensagem = "Código do Cliente Inválido. Deve ser positivo, maior que ZERO";
                break;
            case 2:
                mensagem = "Nome do cliente deve possuir no mínimo 10 caracteres";
                break;
            default:
                mensagem = "Aconteceu um erro geral";
        }
        return mensagem;
    }
}
