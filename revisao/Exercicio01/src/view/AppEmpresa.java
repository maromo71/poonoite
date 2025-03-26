package view;

import model.Funcionario;
/*
    * Explique o papel dos atributos e métodos definidos, e descreva como o sistema
    * deve instanciar objetos dessa classe para representar diferentes funcionários.
    * Atributos privados, com métodos getters e setters definidos.
    * Metodo calcularSalarioLiquido quando invocado calcula 10% sobre o salario atual
    * Usado dois construtores, um padrão e um personalizado recebendo todas as infor-
    * macoes.
    * Abaixo uso completo na instanciação já passamos os dados e em seguida,
    * invocamos o metodo calcularSalarioLiquido. Por fim, mostramos o novo salario.
* */
public class AppEmpresa {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(
                "Paulo Cesar",
                "123",
                23000.00
        );
        funcionario.calcularSalarioLiquido();
        System.out.println("Novo Salario: " + funcionario.getSalario());
    }
}
