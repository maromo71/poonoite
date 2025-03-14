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

## **4. Associações Entre Classes**

A **associação** define um relacionamento entre duas classes, onde uma pode referenciar objetos da outra.
- **Agregação**: Um objeto pode existir independentemente do outro.
- **Composição**: Um objeto depende do outro e é destruído junto com ele.

### **Exemplo de Associação:**
```java
class Motor {
    String tipo;
}

class Carro {
    Motor motor;
}
```
---

## **5. Pacotes e Importação de Classes**

Os **pacotes** servem para organizar classes dentro de um projeto Java.
- O comando `import` permite o uso de classes de outros pacotes.
- O pacote **padrão** em Java é `java.lang` e não requer importação explícita.

### **Exemplo de Uso de Pacotes:**
```java
package veiculos;

public class Carro {
    // Código da classe
}
```

Em outro arquivo:
```java
import veiculos.Carro;
```
---

## **6. Encapsulamento**

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

## **8. Atributos e Métodos Estáticos**

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

## **9. Correção de Erros em Código Java**

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

## **10. Método `main` e Execução de Programas Java**

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

### **Conclusão**
Este resumo cobre os conceitos fundamentais da Programação Orientada a Objetos em Java, detalhando os principais temas abordados na sala de aula (laboratório), incluindo **associações entre classes, pacotes e importação, encapsulamento, métodos estáticos** e **execução de programas**. Compreender esses tópicos melhora a estrutura, reutilização e manutenção do código.

