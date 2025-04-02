// Encapsulamento é o conceito de agrupar os
// atributos e metodos de uma classe em
// uma unica unidade (ocultando a visibilidade
// dos atributos e metodos)
public class Funcionario {
    public int registro;
    public String nome;
    public double salario;
}

//No exemplo acima, supondo que tenhamos uma
//regra para calcular o salario de um funcionario
//ficaria prejudicado, pois o acesso ao salario
//está publico, qualquer objeto da classe
//poderia alterar o salario do funcionario

//para evitar esse problema, basta encapsular
//o salario, tornando-o privado

//private double salario

//Se quisermos alterar o salario, teremos
//que criar um metodo para isso
//metódos getters//seters ou metodos
//publicos especificos;
//Exemplo:

//public double getSalario(){
//    return salario;
//}
//public void setSalario(double salario, int operador){
//    if(operador != 1) return;
//    this.salario = salario;
//}

//neste caso para definir o salario só operador
//1 (nivel) poderia alterar;
