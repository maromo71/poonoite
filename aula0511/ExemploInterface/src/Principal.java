import model.*;
import utils.GerenciarLogin;

public class Principal {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        diretor.setId(1);
        diretor.setNome("Andre");
        Secretaria secretaria = new Secretaria();
        secretaria.setId(2);
        secretaria.setNome("Luciana");
        Professor professor = new Professor();
        professor.setId(3);
        professor.setNome("Luis Felipe");
        Vigia vigia = new Vigia();
        vigia.setId(4);
        vigia.setNome("Vitor");
        Aluno aluno = new Aluno();
        aluno.setId(5);
        aluno.setNome("Maria");
        secretaria.login();
        diretor.login();
        professor.login();
        aluno.login();
        diretor.logout();

        GerenciarLogin gl = new GerenciarLogin();
        System.out.println("Logados no momento: ");
        gl.imprimirLogados();
    }
}
