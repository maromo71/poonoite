package ui;


import model.Aluno;
import model.Meses;

public class GerenciarAlunos {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        Aluno aluno2 = new Aluno("loginmeu", "senhaminha");

        Aluno aluno3 = new Aluno(123,
                "Marcos",
                "19-9090-9090",
                "outro",
                "outra",
                Meses.junho);
        System.out.println(aluno3);

        //imprimir todos os meses
        for(Meses mes : Meses.values()){
            System.out.println(mes);
        }

    }
}
