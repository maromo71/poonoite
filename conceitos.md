# **Resumo: Programação Orientada a Objetos (POO) em Java**

## **1. Programação Estrutural x Orientação a Objetos**

A **Programação Estrutural** é baseada na organização do código em funções e procedimentos, enfatizando a sequência lógica do programa. As variáveis são manipuladas diretamente, e os dados não possuem proteção adequada contra modificações indevidas. O fluxo do programa é determinado por estruturas como `if`, `for`, `while`, e `switch`.

Já a **Programação Orientada a Objetos (POO)** é um paradigma que estrutura o código em **objetos**, que encapsulam **dados (atributos)** e **comportamentos (métodos)**. POO permite reutilização, modularidade e manutenção mais eficiente do código.

### **Exemplo: Estrutural vs. POO**

**Programação Estrutural:**
```java
// Programa estrutural para representar um carro
double velocidade = 0;

void acelerar() {
    velocidade += 10;
}
```

**Programação Orientada a Objetos:**
```java
class Carro {
    private double velocidade;
    
    public void acelerar() {
        velocidade += 10;
    }
}
```
---

## **2. Classes e Objetos**

Uma **classe** é um modelo que define um conjunto de atributos e métodos. Um **objeto** é uma instância dessa classe.

### **Exemplo de Classe e Instanciação de Objeto:**
```java
public class Carro {
    String modelo;
    int ano;
    
    void exibirDetalhes() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);
    }
}

public class Teste {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Fusca";
        meuCarro.ano = 1970;
        meuCarro.exibirDetalhes();
    }
}
```
---

## **3. Atributos e Métodos**

Atributos são as **características** de uma classe, enquanto métodos definem os comportamentos dos objetos.

### **Modificadores de Acesso:**
- **`private`**: Apenas a própria classe pode acessar.
- **`protected`**: Acessível na mesma classe, subclasses e mesmo pacote.
- **`public`**: Acessível por qualquer outra classe.

### **Exemplo de Método:**
```java
class Carro {
    private int velocidade;
    
    public void acelerar() {
        velocidade += 10;
    }
}
```
---

## **4. Correção de Erros em Código Java**

### **Erro Comum no Construtor:**
```java
public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        nome = nome;  // Erro
        idade = idade;  // Erro
    }
}
```
**Correção:**
```java
public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;  // Correto
        this.idade = idade;
    }
}
```
O erro ocorre porque os parâmetros do construtor têm o mesmo nome dos atributos da classe. O `this` diferencia os atributos da classe dos parâmetros do método.

---

## **5. Encapsulamento**

O encapsulamento protege os atributos da classe e força o uso de métodos para acessá-los.

### **Exemplo de Encapsulamento:**
```java
class Pessoa {
    private String nome;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
```

---

## **6. Atributos e Métodos Estáticos**

- **Atributos estáticos (`static`)** pertencem à classe e são compartilhados por todas as instâncias.
- **Métodos estáticos (`static`)** podem ser chamados sem precisar instanciar um objeto.

### **Exemplo:**
```java
class Contador {
    static int totalContadores = 0;
    
    public Contador() {
        totalContadores++;
    }
}
```

---

## **7. Construtores e Construtores Sobrecarregados**

Construtores são métodos especiais chamados automaticamente quando um objeto é criado.

### **Exemplo:**
```java
class Pessoa {
    String nome;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
}
```

### **Exemplo de Construtores Sobrecarregados:**
```java
class Pessoa {
    String nome;
    int idade;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```
---

## **8. Método `main` e Execução de Programas Java**

O método `main` é o ponto de entrada de execução de um programa Java.

```java
public class Programa {
    public static void main(String[] args) {
        System.out.println("Executando Java...");
    }
}
```
Se o `main` estiver ausente, a JVM não encontra o ponto de entrada do programa e ocorre um erro de compilação.

---

## **9. Classes Abstratas e Restrição de Instanciação**

A palavra-chave `abstract` impede que uma classe seja instanciada diretamente.

```java
abstract class Animal {
    abstract void fazerSom();
}

// Erro ao tentar instanciar
Animal a = new Animal(); // Não permitido
```
---

## **10. Construtores Padrão e Implícitos**

Se um construtor não for declarado, o Java cria um **construtor padrão** automaticamente.

```java
class Carro {
    String modelo;
}

// Funciona pois Java adiciona um construtor vazio automaticamente
Carro c = new Carro();
```
Se um construtor for definido manualmente, o **construtor padrão não será mais criado automaticamente**.

---

### **Conclusão**
Este resumo cobre os conceitos fundamentais da Programação Orientada a Objetos em Java, detalhando os principais temas abordados na sala de aula, incluindo correção de erros comuns, encapsulamento, métodos estáticos e execução de programas. Compreender esses tópicos melhora a estrutura, reutilização e manutenção do código.

