# Atividade Prática: Introdução à Programação Orientada a Objetos em Java

## 🎯 Objetivo
Aplicar os conceitos fundamentais de POO:
* Criação de classes e objetos;
* Encapsulamento (atributos privados, métodos getters e setters);
* Métodos com regra de negócio e retorno de status (`boolean`);
* Modularização de interface em console com menu de opções e classe executável.

---

## 📋 Cenário: Gerenciamento de Produto em Estoque

Uma pequena loja necessita de um sistema em console para controlar a movimentação de estoque de um produto. O sistema deve permitir:
1. **Cadastrar** os dados do produto (código, descrição, quantidade em estoque e fabricante);
2. **Dar Entrada** no estoque (adicionando novas unidades);
3. **Dar Baixa** no estoque (realizando a saída/venda de unidades, desde que haja quantidade suficiente);
4. **Consultar** as informações e o saldo atual do produto;
5. **Sair** da aplicação.

---

## 📐 Diagrama de Classes (PlantUML)

```plantuml
@startuml
skinparam classAttributeIconSize 0

class Produto {
    - codigo: int
    - descricao: String
    - quantidade: int
    - fabricante: String
    
    + getCodigo(): int
    + setCodigo(codigo: int): void
    + getDescricao(): String
    + setDescricao(descricao: String): void
    + getQuantidade(): int
    + setQuantidade(quantidade: int): void
    + getFabricante(): String
    + setFabricante(fabricante: String): void
    + darEntrada(qtd: int): void
    + darBaixa(qtd: int): boolean
    + imprimir(): void
}

class ProdutoTeste {
    - p: Produto
    - sc: Scanner
    + {static} main(args: String[]): void
    + execCadastrar(): void
    + execDarEntrada(): void
    + execDarBaixa(): void
    + execConsultar(): void
}

ProdutoTeste ..> Produto : utiliza
@enduml