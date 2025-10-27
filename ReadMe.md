# Documentação Completa de Java
## Fundamentos e Programação Orientada a Objetos

---

## 📑 Índice Completo

### Parte I: Fundamentos de Java
1. [Introdução](#introdução)
2. [Estrutura Básica](#estrutura-básica)
3. [Tipos de Dados](#tipos-de-dados)
4. [Variáveis e Constantes](#variáveis-e-constantes)
5. [Operadores](#operadores)
6. [Arrays](#arrays)
7. [Entrada e Saída de Dados](#entrada-e-saída-de-dados)
8. [Estruturas Condicionais](#estruturas-condicionais)
9. [Estruturas de Repetição](#estruturas-de-repetição)
10. [Métodos em Java](#métodos-em-java)
11. [Classe Math](#classe-math)
12. [Classe Random](#classe-random)
13. [Manipulação de Strings](#manipulação-de-strings)
14. [Tratamento de Exceções](#tratamento-de-exceções)
15. [Interface Gráfica (Swing)](#interface-gráfica-swing)

### Parte II: Programação Orientada a Objetos
16. [Conceitos Fundamentais de POO](#conceitos-fundamentais-de-poo)
17. [Classes e Objetos](#classes-e-objetos)
18. [Instanciação de Objetos](#instanciação-de-objetos)
19. [Atributos e Métodos](#atributos-e-métodos)
20. [Encapsulamento](#encapsulamento)
21. [Getters e Setters](#getters-e-setters)
22. [Construtores](#construtores)
23. [Métodos Especiais (toString)](#métodos-especiais-tostring)
24. [Static - Atributos e Métodos Estáticos](#static-atributos-e-métodos-estáticos)
25. [Composição](#composição)
26. [Agregação](#agregação)
27. [Injeção de Dependências](#injeção-de-dependências)
28. [Serialização](#serialização)
29. [Threads e Sincronização](#threads-e-sincronização)
30. [Recursividade](#recursividade)

### Parte III: Herança e Polimorfismo
31. [Herança](#herança)
32. [Modificadores de Acesso](#modificadores-de-acesso)
33. [Classes Abstratas](#classes-abstratas)
34. [Polimorfismo](#polimorfismo)
35. [Override (Sobrescrita)](#override-sobrescrita)
36. [Palavra-chave super](#palavra-chave-super)

### Parte IV: Interfaces e Recursos Avançados
37. [Interfaces](#interfaces)
38. [Implementação Múltipla de Interfaces](#implementação-múltipla-de-interfaces)
39. [Polimorfismo com Interfaces](#polimorfismo-com-interfaces)
40. [Padrão Consumer/Provider](#padrão-consumerprovider)
41. [Interfaces vs Classes Abstratas](#interfaces-vs-classes-abstratas)
42. [Classes Internas (Inner Classes)](#classes-internas-inner-classes)
43. [Boas Práticas com Interfaces](#boas-práticas-com-interfaces)

### Parte V: Exemplos e Referências
44. [Exemplos Práticos Completos](#exemplos-práticos-completos)
45. [Boas Práticas](#boas-práticas)
46. [Glossário](#glossário)
47. [Quadro Comparativo de Conceitos](#quadro-comparativo-de-conceitos)

---

# PARTE I: FUNDAMENTOS DE JAVA

## Introdução

Java é uma linguagem de programação orientada a objetos, multiplataforma e amplamente utilizada no desenvolvimento de aplicações empresariais e desktop. Este guia apresenta os conceitos fundamentais através de exemplos práticos e exercícios.

**Características principais do Java:**
- **Orientada a Objetos**: Tudo é baseado em classes e objetos
- **Multiplataforma**: "Write once, run anywhere" (WORA)
- **Fortemente tipada**: Tipos de dados devem ser declarados explicitamente
- **Gerenciamento automático de memória**: Garbage Collection
- **Rica biblioteca padrão**: APIs extensas para diversas funcionalidades

---

## Estrutura Básica

### Classe Principal
```java
public class OlaPessoal {
    public static void main(String[] args) {
        System.out.println("Olá pessoal!");
        System.out.print("Eu sou o Rafael");
        System.out.println("Se apresentem!");
    }
}
```

**Conceitos importantes:**
- **Classe**: Estrutura fundamental em Java (`public class NomeDaClasse`)
- **Método main**: Ponto de entrada da aplicação
- **System.out.print()**: Imprime sem quebra de linha
- **System.out.println()**: Imprime com quebra de linha

### Pacotes
```java
package aula0808;  // Organização de classes em pacotes

import java.util.Scanner;  // Importação de classes externas
import javax.swing.JOptionPane;
```

**Convenções de nomenclatura:**
- **Classes**: PascalCase (`MinhaClasse`)
- **Métodos e variáveis**: camelCase (`meuMetodo`)
- **Constantes**: MAIÚSCULO (`MINHA_CONSTANTE`)
- **Pacotes**: minúsculo (`com.empresa.projeto`)

---

## Tipos de Dados

### Tipos Primitivos

#### Números Inteiros
```java
byte idade = 127;           // -128 a 127 (8 bits)
short ano = 2024;           // -32,768 a 32,767 (16 bits)
int populacao = 210000000;  // -2,147,483,648 a 2,147,483,647 (32 bits)
long distancia = 9460730472580800L; // -9.223... a 9.223... (64 bits)
```

#### Números Decimais
```java
float altura = 1.75f;       // Precisão simples (32 bits) - usar 'f'
double salario = 3500.50;   // Precisão dupla (64 bits)
```

#### Outros Tipos
```java
char letra = 'A';           // Um único caractere Unicode (16 bits)
boolean ativo = true;       // true ou false
```

### Tipos Não-Primitivos (Referência)
```java
String nome = "Rafael";  // Sequência de caracteres
String sobrenome = new String("Silva");  // Forma alternativa
```

**Diferenças importantes:**
- **Primitivos**: Armazenam valores diretamente na memória
- **Não-primitivos**: Armazenam referências para objetos na memória
- **Não-primitivos**: Possuem métodos e propriedades

---

## Variáveis e Constantes

### Variáveis
```java
int idade = 25;              // Valor pode ser alterado
String nome = "João";        // Referência pode ser alterada
idade = 26;                  // Alteração válida
nome = "Maria";              // Nova referência válida
```

### Constantes
```java
final int MESES_DO_ANO = 12;          // Valor fixo, não pode ser alterado
final double PI = 3.14159;            // Constante matemática
final String EMPRESA = "Tech Corp";   // String constante
```

### Classe de Constantes Organizadas
```java
public class Constantes {
    // Validações gerais
    public static final class Validacao {
        public static final int IDADE_MINIMA = 0;
        public static final int IDADE_MAXIMA = 120;
        public static final int TAMANHO_CPF = 11;
    }
    
    // Mensagens do sistema
    public static final class Mensagens {
        public static final String ERRO_NUMERO = "Digite apenas números";
        public static final String ERRO_IDADE = "Idade deve estar entre 0 e 120";
        public static final String SUCESSO = "Operação realizada com sucesso!";
    }
    
    // Configurações de meses
    public static final byte MES_MINIMO = 1;
    public static final byte MES_MAXIMO = 12;
}
```

**Convenções para constantes:**
- Usar `final` para tornar imutável
- Nomenclatura em **MAIÚSCULO** com underscore
- `static` permite acesso sem instanciar a classe

---

## Operadores

### Operadores Aritméticos
```java
int a = 10, b = 3;

System.out.println(a + b);  // 13 - Adição
System.out.println(a - b);  // 7  - Subtração  
System.out.println(a * b);  // 30 - Multiplicação
System.out.println(a / b);  // 3  - Divisão inteira
System.out.println(a % b);  // 1  - Resto da divisão (módulo)

// Divisão com decimais
double resultado = (double)a / b;  // 3.333...
```

### Operadores de Atribuição
```java
int x = 10;

x += 5;   // x = x + 5;  → x = 15
x -= 3;   // x = x - 3;  → x = 12
x *= 2;   // x = x * 2;  → x = 24
x /= 4;   // x = x / 4;  → x = 6
x %= 4;   // x = x % 4;  → x = 2

// Incremento e decremento
x++;      // Pós-incremento: usa x, depois incrementa
++x;      // Pré-incremento: incrementa x, depois usa
x--;      // Pós-decremento: usa x, depois decrementa
--x;      // Pré-decremento: decrementa x, depois usa
```

### Operadores de Comparação
```java
int a = 10, b = 5;

System.out.println(a == b);  // false - Igual
System.out.println(a != b);  // true  - Diferente
System.out.println(a > b);   // true  - Maior que
System.out.println(a < b);   // false - Menor que
System.out.println(a >= b);  // true  - Maior ou igual
System.out.println(a <= b);  // false - Menor ou igual
```

### Operadores Lógicos
```java
boolean x = true, y = false;

System.out.println(x && y);  // false - E lógico (AND)
System.out.println(x || y);  // true  - OU lógico (OR)
System.out.println(!x);      // false - NÃO lógico (NOT)

// Avaliação com curto-circuito
if (x && metodoCaroParaTeste()) {  
    // Se x for false, o método não é executado
    System.out.println("Ambas condições são verdadeiras");
}
```

### Operador Ternário
```java
// Sintaxe: condição ? valorSeVerdadeiro : valorSeFalso
int idade = 20;
String categoria = (idade >= 18) ? "Maior de idade" : "Menor de idade";

// Exemplo prático - análise de RA
String ra = "1050482423017";
String semestre = (ra.substring(8, 9).equals("1")) ? 
                  "Primeiro semestre" : "Segundo semestre";
```

### Precedência de Operadores
```java
int resultado = 2 + 3 * 4;     // 14 (não 20) - multiplicação primeiro
int resultado2 = (2 + 3) * 4;  // 20 - parênteses alteram precedência

// Ordem de precedência (do maior para menor):
// 1. () [] . 
// 2. ++ -- ! (unários)
// 3. * / %
// 4. + -
// 5. < <= > >=
// 6. == !=
// 7. &&
// 8. ||
// 9. ? : (ternário)
// 10. = += -= *= /= %= (atribuição)
```

---

## Arrays

### Declaração e Inicialização
```java
// Forma 1: Declaração com valores iniciais
String[] nomes = {"Ana", "Bruno", "Carlos"};
int[] numeros = {10, 20, 30, 40, 50};

// Forma 2: Declaração com tamanho específico
String[] cidades = new String[5];
cidades[0] = "São Paulo";
cidades[1] = "Rio de Janeiro";
cidades[2] = "Belo Horizonte";

// Forma 3: Declaração e inicialização separadas
int[] idades;
idades = new int[10];
```

### Propriedades e Acesso
```java
String[] frutas = {"Maçã", "Banana", "Laranja"};

System.out.println("Tamanho: " + frutas.length);  // 3
System.out.println("Primeira: " + frutas[0]);     // Maçã
System.out.println("Última: " + frutas[frutas.length - 1]);  // Laranja
```

### Percorrendo Arrays
```java
String[] animais = {"Gato", "Cachorro", "Pássaro", "Peixe"};

// Loop tradicional (com índice)
for (int i = 0; i < animais.length; i++) {
    System.out.println("Posição " + i + ": " + animais[i]);
}

// Enhanced for / For-each (mais limpo)
for (String animal : animais) {
    System.out.println(animal);
}

// Percorrendo ao contrário
for (int i = animais.length - 1; i >= 0; i--) {
    System.out.println(animais[i]);
}
```

### Arrays Multidimensionais
```java
// Matriz 3x3
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Percorrendo matriz
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

---

## Entrada e Saída de Dados

### Console com Scanner
```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

System.out.print("Digite seu nome: ");
String nome = scanner.nextLine();

System.out.print("Digite sua idade: ");
int idade = scanner.nextInt();

System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

scanner.close(); // Sempre fechar o Scanner
```

### Interface Gráfica com JOptionPane
```java
import javax.swing.JOptionPane;

// Entrada de dados
String nome = JOptionPane.showInputDialog("Digite seu nome:");
String idadeStr = JOptionPane.showInputDialog("Digite sua idade:");

// Saída de dados
JOptionPane.showMessageDialog(null, "Olá " + nome + "!");

// Confirmação
int opcao = JOptionPane.showConfirmDialog(null, 
    "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);

if (opcao == JOptionPane.YES_OPTION) {
    JOptionPane.showMessageDialog(null, "Continuando...");
}
```

### Conversão de Tipos (Parsing)
```java
// String para números
String numeroStr = "123";
String decimalStr = "45.67";

int numero = Integer.parseInt(numeroStr);
float decimal = Float.parseFloat(decimalStr);
double precisao = Double.parseDouble(decimalStr);

// Números para String
int valor = 100;
String valorStr = String.valueOf(valor);
String valorStr2 = Integer.toString(valor);
```

### Validação de Entrada
```java
String entrada = JOptionPane.showInputDialog("Digite um número:");

// Verificar se é null (cancelou)
if (entrada != null) {
    // Verificar se não está vazio
    if (!entrada.trim().equals("")) {
        try {
            int numero = Integer.parseInt(entrada.trim());
            JOptionPane.showMessageDialog(null, "Número válido: " + numero);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida!");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Campo não pode estar vazio!");
    }
}
```

---

## Estruturas Condicionais

### If-Else Simples
```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

### If-Else Encadeado
```java
double nota = 8.5;

if (nota >= 9.0) {
    System.out.println("Excelente!");
} else if (nota >= 7.0) {
    System.out.println("Bom!");
} else if (nota >= 5.0) {
    System.out.println("Regular");
} else {
    System.out.println("Insuficiente");
}
```

### Condições Compostas
```java
int mes = 6;

if (mes >= Constantes.MES_MINIMO && mes <= Constantes.MES_MAXIMO) {
    System.out.println("Mês válido: " + mes);
} else {
    System.out.println("Mês inválido!");
}

// Validação de string
String texto = "Java";
if (texto != null && !texto.isEmpty() && texto.length() > 2) {
    System.out.println("Texto válido: " + texto);
}
```

### Switch-Case
```java
int mes = 3;
String mesExtenso = "";

switch (mes) {
    case 1: mesExtenso = "Janeiro"; break;
    case 2: mesExtenso = "Fevereiro"; break;
    case 3: mesExtenso = "Março"; break;
    case 4: mesExtenso = "Abril"; break;
    case 5: mesExtenso = "Maio"; break;
    case 6: mesExtenso = "Junho"; break;
    case 7: mesExtenso = "Julho"; break;
    case 8: mesExtenso = "Agosto"; break;
    case 9: mesExtenso = "Setembro"; break;
    case 10: mesExtenso = "Outubro"; break;
    case 11: mesExtenso = "Novembro"; break;
    case 12: mesExtenso = "Dezembro"; break;
    default: mesExtenso = "Mês inválido";
}

System.out.println("Mês: " + mesExtenso);
```

### Switch Moderno (Java 12+)
```java
int mes = 3;
String mesExtenso = switch (mes) {
    case 1 -> "Janeiro";
    case 2 -> "Fevereiro";
    case 3 -> "Março";
    case 4 -> "Abril";
    case 5 -> "Maio";
    case 6 -> "Junho";
    case 7 -> "Julho";
    case 8 -> "Agosto";
    case 9 -> "Setembro";
    case 10 -> "Outubro";
    case 11 -> "Novembro";
    case 12 -> "Dezembro";
    default -> "Mês inválido";
};
```

---

## Estruturas de Repetição

### For Tradicional
```java
// Loop básico de 0 a 9
for (int i = 0; i < 10; i++) {
    System.out.println("Número: " + i);
}

// Loop decrescente
for (int i = 10; i >= 1; i--) {
    System.out.println("Contagem regressiva: " + i);
}

// Loop com step personalizado
for (int i = 0; i <= 100; i += 5) {
    System.out.println("Múltiplo de 5: " + i);
}
```

### For com Caracteres
```java
// Letras maiúsculas
for (char letra = 'A'; letra <= 'Z'; letra++) {
    System.out.println(letra + " = " + (int)letra);  // Casting para ASCII
}

// Letras minúsculas
for (char letra = 'a'; letra <= 'z'; letra++) {
    System.out.print(letra + " ");
}
```

### Enhanced For (For-Each)
```java
String[] nomes = {"Ana", "Bruno", "Carlos", "Diana"};

// Percorrer array
for (String nome : nomes) {
    System.out.println("Nome: " + nome);
}

// Percorrer String como array de caracteres
String palavra = "Java";
for (char letra : palavra.toCharArray()) {
    System.out.println("Letra: " + letra);
}
```

### While
```java
int contador = 0;
while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}

// Exemplo prático - validação de entrada
boolean entradaValida = false;
while (!entradaValida) {
    String entrada = JOptionPane.showInputDialog("Digite um número entre 1 e 10:");
    
    if (entrada != null) {
        try {
            int numero = Integer.parseInt(entrada);
            if (numero >= 1 && numero <= 10) {
                JOptionPane.showMessageDialog(null, "Número válido: " + numero);
                entradaValida = true;
            } else {
                JOptionPane.showMessageDialog(null, "Número deve estar entre 1 e 10!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
        }
    } else {
        break; // Usuário cancelou
    }
}
```

### Do-While
```java
int numero;
do {
    String entrada = JOptionPane.showInputDialog("Digite um número positivo:");
    numero = Integer.parseInt(entrada);
    
    if (numero <= 0) {
        JOptionPane.showMessageDialog(null, "Número deve ser positivo!");
    }
} while (numero <= 0);

JOptionPane.showMessageDialog(null, "Número válido: " + numero);
```

### Controle de Fluxo (break e continue)
```java
// break - sai do loop
for (int i = 1; i <= 10; i++) {
    if (i == 6) {
        break; // Para o loop quando i = 6
    }
    System.out.println(i);
} // Imprime: 1, 2, 3, 4, 5

// continue - pula para próxima iteração
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // Pula números pares
    }
    System.out.println(i);
} // Imprime: 1, 3, 5, 7, 9
```

---

## Métodos em Java

### Conceitos Fundamentais

**Definição**: Métodos são blocos de código que executam tarefas específicas. Podem receber dados de entrada (parâmetros), processá-los e retornar um resultado.

```
Entrada (argumentos) → Método() → Saída (retorno)
```

### Anatomia de um Método
```java
public static float somar(float a, float b) {
    return a + b;
}
```

**Componentes:**
- `public`: **Modificador de acesso** (visibilidade)
- `static`: **Modificador de escopo** (pertence à classe)
- `float`: **Tipo de retorno**
- `somar`: **Nome do método**
- `(float a, float b)`: **Parâmetros**
- `{ return a + b; }`: **Corpo/Implementação**

### Modificadores de Acesso
```java
public class ExemplosAcesso {
    public void metodoPublico() {
        // Acessível de qualquer lugar
    }
    
    private void metodoPrivado() {
        // Acessível apenas nesta classe
    }
    
    protected void metodoProtegido() {
        // Acessível no pacote e subclasses
    }
    
    void metodoDefault() {
        // Acessível apenas no mesmo pacote
    }
}
```

### Escopo: Static vs Não-Static

#### Métodos Estáticos (Escopo de Classe)
```java
public class Calculadora {
    // Pertence à CLASSE
    public static int somar(int a, int b) {
        return a + b;
    }
}

// Chamada: NomeClasse.nomeMetodo()
int resultado = Calculadora.somar(10, 20);
```

#### Métodos de Instância (Escopo de Objeto)
```java
public class Calculadora {
    // Pertence ao OBJETO
    public int somar(int a, int b) {
        return a + b;
    }
}

// Chamada: objeto.nomeMetodo()
Calculadora calc = new Calculadora();
int resultado = calc.somar(10, 20);
```

### Tipos de Retorno
```java
// void - Não retorna nada
public static void imprimir(String texto) {
    System.out.println(texto);
}

// Retorna um valor específico
public static String inverter(String texto) {
    StringBuilder resultado = new StringBuilder();
    for (int i = texto.length() - 1; i >= 0; i--) {
        resultado.append(texto.charAt(i));
    }
    return resultado.toString();
}

// Retorna boolean para indicar sucesso/falha
public static boolean isIdadeValida(int idade) {
    return idade >= 0 && idade <= 120;
}
```

### Sobrecarga de Métodos (Overloading)
```java
public class Impressora {
    // Versão básica
    public static void imprimir() {
        System.out.println("Documento padrão");
    }
    
    // Com texto personalizado
    public static void imprimir(String texto) {
        System.out.println(texto);
    }
    
    // Com repetição
    public static void imprimir(String texto, int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println(texto);
        }
    }
    
    // Com formatação
    public static void imprimir(String texto, boolean maiusculo) {
        if (maiusculo) {
            System.out.println(texto.toUpperCase());
        } else {
            System.out.println(texto.toLowerCase());
        }
    }
}
```

### Documentação JavaDoc
```java
/**
 * Classe utilitária para cálculos matemáticos básicos
 * @author Rafael
 * @version 1.0
 * @since 2024
 */
public class CalculadoraUtil {
    
    /**
     * Calcula a média aritmética de um array de números
     * @param numeros array com os valores
     * @return a média dos valores, ou 0 se array vazio
     * @throws IllegalArgumentException se array for null
     */
    public static double calcularMedia(double[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("Array não pode ser null");
        }
        
        if (numeros.length == 0) return 0;
        
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        return soma / numeros.length;
    }
}
```

---

## Classe Math

### Métodos Básicos
```java
// Valor absoluto
int absoluto = Math.abs(-15);     // 15
double abs = Math.abs(-3.14);     // 3.14

// Máximo e mínimo
int maior = Math.max(10, 25);     // 25
double menor = Math.min(3.14, 2.71); // 2.71

// Para 3 ou mais valores
int maiorDeTres = Math.max(Math.max(5, 12), 8);  // 12
```

### Arredondamento
```java
double numero = 85.7;

// Arredonda para o inteiro mais próximo
long arredondado = Math.round(numero);        // 86

// Arredonda para cima (teto)
double paraCima = Math.ceil(numero);          // 86.0

// Arredonda para baixo (chão)  
double paraBaixo = Math.floor(numero);        // 85.0
```

**Exemplo prático - Cálculo de ônibus:**
```java
final int PASSAGEIROS_POR_ONIBUS = 40;
int numeroAlunos = 85;

// Quantos ônibus são necessários?
int onibusNecessarios = (int) Math.ceil((double) numeroAlunos / PASSAGEIROS_POR_ONIBUS);
System.out.println("Ônibus necessários: " + onibusNecessarios); // 3
```

### Potenciação e Raiz
```java
// Potenciação
double potencia = Math.pow(2, 8);      // 2^8 = 256.0
double quadrado = Math.pow(5, 2);      // 5^2 = 25.0

// Raiz quadrada
double raiz = Math.sqrt(16);           // 4.0
double raizCubica = Math.cbrt(27);     // 3.0 (raiz cúbica)
```

### Números Aleatórios
```java
// Gera número entre 0.0 (incluído) e 1.0 (exclusivo)
double aleatorio = Math.random();

// Número inteiro entre 1 e 6 (dado)
int dado = (int)(1 + Math.random() * 6);

// Número inteiro entre min e max (incluído)
int min = 10, max = 50;
int numeroAleatorio = (int)(min + Math.random() * (max - min + 1));

// Gerador da Mega-Sena
System.out.println("Números da sorte:");
for (int i = 0; i < 6; i++) {
    int numero = (int)(1 + Math.random() * 60);
    System.out.print(numero + " ");
}
```

### Constantes Matemáticas
```java
double pi = Math.PI;        // 3.141592653589793
double e = Math.E;          // 2.718281828459045

// Cálculo da área do círculo
double raio = 5.0;
double area = Math.PI * Math.pow(raio, 2);
System.out.println("Área: " + area);
```

---

## Classe Random

### Vantagens sobre Math.random()
```java
import java.util.Random;

Random random = new Random();

// Números inteiros em intervalos específicos
int numeroEntre0e9 = random.nextInt(10);        // 0 a 9
int numeroEntre10e19 = random.nextInt(10, 20);  // 10 a 19 (Java 17+)

// Números decimais
float decimal = random.nextFloat();             // 0.0 a 1.0
double precisao = random.nextDouble();          // 0.0 a 1.0

// Boolean aleatório
boolean booleano = random.nextBoolean();        // true ou false
```

### Seeds (Reprodutibilidade)
```java
// Seed fixa para testes
Random randomComSeed = new Random(42);

// Com a mesma seed, a sequência será sempre igual
System.out.println(randomComSeed.nextInt(100)); // Sempre o mesmo resultado
System.out.println(randomComSeed.nextInt(100)); // Previsível para testes
```

### Aplicação Prática - Gerador de Senhas
```java
public class GeradorSenhas {
    private static final String NUMEROS = "0123456789";
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String SIMBOLOS = "!@#$%^&*()_+-=[]{}|;:,.<>?";
    
    public static String gerarSenhaSimples(int tamanho) {
        String caracteres = NUMEROS + MINUSCULAS + MAIUSCULAS;
        return gerarSenha(caracteres, tamanho);
    }
    
    public static String gerarSenhaComplexa(int tamanho) {
        String caracteres = NUMEROS + MINUSCULAS + MAIUSCULAS + SIMBOLOS;
        return gerarSenha(caracteres, tamanho);
    }
    
    private static String gerarSenha(String caracteres, int tamanho) {
        Random random = new Random();
        StringBuilder senha = new StringBuilder();
        
        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }
        
        return senha.toString();
    }
}
```

---

## Manipulação de Strings

### Métodos Básicos
```java
String texto = "Programação Java";

// Informações básicas
int tamanho = texto.length();                    // 16
boolean vazio = texto.isEmpty();                 // false
boolean contemJava = texto.contains("Java");     // true

// Conversão de caso
String maiuscula = texto.toUpperCase();          // "PROGRAMAÇÃO JAVA"
String minuscula = texto.toLowerCase();          // "programação java"

// Acesso a caracteres
char primeiraLetra = texto.charAt(0);            // 'P'
char ultimaLetra = texto.charAt(texto.length()-1); // 'a'
```

### Busca e Localização
```java
String frase = "Java é uma linguagem de programação Java";

// Encontrar posição
int primeiraOcorrencia = frase.indexOf("Java");      // 0
int ultimaOcorrencia = frase.lastIndexOf("Java");    // 40
int posicaoLinguagem = frase.indexOf("linguagem");   // 13

// Verificar início e fim
boolean comecaComJava = frase.startsWith("Java");    // true
boolean terminaComJava = frase.endsWith("Java");     // true
```

### Substring - Extraindo Partes
```java
String ra = "1050482423017";

// Extrair por posições (início incluído, fim excluído)
String unidade = ra.substring(0, 3);        // "105"
String curso = ra.substring(3, 6);          // "048"  
String ano = "20" + ra.substring(6, 8);     // "2023"

// Do índice até o final
String sequencial = ra.substring(9);        // "3017"

// Análise completa do RA
String semestre = ra.substring(8, 9).equals("1") ? 
                  "1º semestre" : "2º semestre";
```

### Divisão e Junção (Split e Join)
```java
String frase = "Java,Python,JavaScript,C++";
String[] linguagens = frase.split(",");

// Percorrer array resultante
for (String linguagem : linguagens) {
    System.out.println("Linguagem: " + linguagem);
}

// Juntar elementos (Java 8+)
String resultado = String.join(" | ", linguagens);
System.out.println(resultado); // "Java | Python | JavaScript | C++"
```

### Limpeza e Formatação
```java
String textoComEspacos = "   Java Programming   ";

// Remover espaços do início e fim
String limpo = textoComEspacos.trim();       // "Java Programming"

// Substituições
String texto = "Olá mundo! Mundo Java!";
String substituido = texto.replace("mundo", "pessoal");  // Todas as ocorrências
String primeiraSubst = texto.replaceFirst("mundo", "pessoal");  // Apenas primeira

// Remover caracteres específicos
String somenteNumeros = "ABC123DEF456".replaceAll("[^0-9]", ""); // "123456"
String somenteLetras = "ABC123DEF456".replaceAll("[^A-Za-z]", ""); // "ABCDEF"
```

### Comparação de Strings
```java
String str1 = "Java";
String str2 = "java";
String str3 = "Java";

// Comparação sensível a maiúsculas/minúsculas
boolean igual1 = str1.equals(str3);           // true
boolean igual2 = str1.equals(str2);           // false

// Comparação ignorando maiúsculas/minúsculas
boolean igualIgnoreCase = str1.equalsIgnoreCase(str2); // true

// Comparação lexicográfica
int comparacao = str1.compareTo(str2);        // Negativo (J < j em ASCII)
```

### StringBuilder para Performance
```java
// ❌ Ineficiente - cria nova String a cada concatenação
String resultado = "";
for (int i = 0; i < 1000; i++) {
    resultado += "a";  // Muito lento!
}

// ✅ Eficiente - usa buffer interno
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append("a");
}
String resultado = sb.toString();
```

---

## Tratamento de Exceções

### Try-Catch Básico
```java
public static void exemplo() {
    try {
        int resultado = 10 / 0;  // ArithmeticException
    } catch (ArithmeticException e) {
        System.out.println("Erro: Divisão por zero!");
        e.printStackTrace();
    }
}
```

### Try-Catch com Múltiplas Exceções
```java
public static void lerArquivo(String nomeArquivo) {
    try {
        FileReader arquivo = new FileReader(nomeArquivo);
        BufferedReader leitor = new BufferedReader(arquivo);
        String linha = leitor.readLine();
        System.out.println(linha);
        leitor.close();
        
    } catch (FileNotFoundException e) {
        System.out.println("Arquivo não encontrado: " + nomeArquivo);
        
    } catch (IOException e) {
        System.out.println("Erro ao ler arquivo: " + e.getMessage());
        
    } catch (Exception e) {
        System.out.println("Erro inesperado: " + e.getMessage());
    }
}
```

### Try-Catch-Finally
```java
FileWriter arquivo = null;
try {
    arquivo = new FileWriter("dados.txt");
    arquivo.write("Conteúdo importante");
    
} catch (IOException e) {
    System.out.println("Erro ao escrever: " + e.getMessage());
    
} finally {
    // SEMPRE executa, mesmo com exceção
    if (arquivo != null) {
        try {
            arquivo.close();
        } catch (IOException e) {
            System.out.println("Erro ao fechar arquivo");
        }
    }
}
```

### Try-with-Resources (Java 7+)
```java
// Auto-fechamento de recursos
public static void gravarComAutoClose(String conteudo) {
    try (FileWriter arquivo = new FileWriter("dados.txt")) {
        arquivo.write(conteudo);
        // arquivo.close() é chamado automaticamente
        
    } catch (IOException e) {
        System.out.println("Erro: " + e.getMessage());
    }
}
```

### Throws - Lançando Exceções
```java
// Método que lança exceção
public static void processar() throws IOException {
    FileWriter arquivo = new FileWriter("dados.txt");
    arquivo.write("Teste");
    arquivo.close();
    // Quem chama este método deve tratar a exceção
}

// Método chamador
public static void main(String[] args) {
    try {
        processar();
    } catch (IOException e) {
        System.out.println("Erro ao processar: " + e.getMessage());
    }
}
```

### Criando Exceções Customizadas
```java
// Exceção personalizada
public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

// Uso da exceção customizada
public class Pessoa {
    private int idade;
    
    public void setIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0 || idade > 150) {
            throw new IdadeInvalidaException("Idade inválida: " + idade);
        }
        this.idade = idade;
    }
}
```

---

## Interface Gráfica (Swing)

### Componentes Básicos
```java
import javax.swing.*;
import java.awt.*;

public class JanelaSimples {
    public static void main(String[] args) {
        // Criar janela
        JFrame janela = new JFrame("Minha Aplicação");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);  // Centralizar
        
        // Adicionar componentes
        JLabel rotulo = new JLabel("Olá, Mundo!");
        rotulo.setHorizontalAlignment(SwingConstants.CENTER);
        janela.add(rotulo);
        
        // Exibir janela
        janela.setVisible(true);
    }
}
```

### Layouts
```java
// BorderLayout
JFrame janela = new JFrame();
janela.setLayout(new BorderLayout());
janela.add(new JButton("Norte"), BorderLayout.NORTH);
janela.add(new JButton("Sul"), BorderLayout.SOUTH);
janela.add(new JButton("Centro"), BorderLayout.CENTER);

// FlowLayout (padrão de JPanel)
JPanel painel = new JPanel(new FlowLayout());
painel.add(new JButton("Botão 1"));
painel.add(new JButton("Botão 2"));

// GridLayout
JPanel grade = new JPanel(new GridLayout(3, 2));
for (int i = 1; i <= 6; i++) {
    grade.add(new JButton("Botão " + i));
}
```

### Eventos e Listeners
```java
import javax.swing.*;
import java.awt.event.*;

public class ExemploEventos extends JFrame {
    private JButton botao;
    private JLabel label;
    private int contador = 0;
    
    public ExemploEventos() {
        setTitle("Eventos");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        label = new JLabel("Cliques: 0");
        botao = new JButton("Clique aqui");
        
        // ActionListener com classe anônima
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contador++;
                label.setText("Cliques: " + contador);
            }
        });
        
        // Ou com lambda (Java 8+)
        // botao.addActionListener(e -> {
        //     contador++;
        //     label.setText("Cliques: " + contador);
        // });
        
        add(label);
        add(botao);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new ExemploEventos();
    }
}
```

### Campos de Entrada
```java
public class FormularioSimples extends JFrame {
    private JTextField campoNome;
    private JPasswordField campoSenha;
    private JTextArea areaTexto;
    private JButton botaoEnviar;
    
    public FormularioSimples() {
        setTitle("Formulário");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Campo de texto
        add(new JLabel("Nome:"));
        campoNome = new JTextField(20);
        add(campoNome);
        
        // Campo de senha
        add(new JLabel("Senha:"));
        campoSenha = new JPasswordField(20);
        add(campoSenha);
        
        // Área de texto
        areaTexto = new JTextArea(5, 30);
        add(new JScrollPane(areaTexto));
        
        // Botão
        botaoEnviar = new JButton("Enviar");
        botaoEnviar.addActionListener(e -> {
            String nome = campoNome.getText();
            String senha = new String(campoSenha.getPassword());
            areaTexto.setText("Nome: " + nome + "\nSenha: " + senha);
        });
        add(botaoEnviar);
        
        setVisible(true);
    }
}
```

---

# PARTE II: PROGRAMAÇÃO ORIENTADA A OBJETOS

## Conceitos Fundamentais de POO

### O que é Programação Orientada a Objetos?

A POO é um paradigma de programação baseado no conceito de "objetos", que podem conter dados (atributos) e código (métodos). Os quatro pilares da POO são:

- **Encapsulamento**: Proteção dos dados internos de um objeto
- **Herança**: Capacidade de uma classe herdar características de outra
- **Polimorfismo**: Capacidade de objetos diferentes responderem de forma diferente ao mesmo método
- **Abstração**: Simplificação de sistemas complexos modelando classes apropriadas

### Classe vs Objeto

**Classe**: É o modelo, a planta ou blueprint que define as características e comportamentos.

**Objeto**: É a instância concreta da classe, uma realização específica.

```java
Pincel pincel = new Pincel(); // 'pincel' é o objeto, 'Pincel' é a classe
```

**Analogia**: Se a classe é a planta de uma casa, o objeto é a casa construída.

---

## Classes e Objetos

### Criando uma Classe

```java
public class Pincel {
    // Atributos
    public String cor;
    public double preco;
    public int tamanho;
    
    // Métodos
    public void mostrar() {
        System.out.println("cor: " + cor);
        System.out.println("tamanho: " + tamanho);
        System.out.println("preço: " + preco);
    }
}
```

### Instanciando Objetos

```java
// Forma 1: Declaração e instanciação separadas
Pincel p;              // Reserva espaço na memória
p = new Pincel();      // Cria o objeto

// Forma 2: Declaração e instanciação juntas
Pincel p1 = new Pincel();
```

⚠️ **IMPORTANTE**: Antes de usar `new`, o objeto não existe, apenas o espaço reservado.

### Estados de um Objeto

Um objeto pode ter **N estados** diferentes, mas possui **1 comportamento** consistente.

**Exemplo com a classe Pincel**:
- Estado 1: cor="vermelho", preco=80.00, tamanho=5
- Estado 2: cor="azul", preco=9.99, tamanho=15
- Comportamento: mostrar(), limpar(), abrirTampa(), fecharTampa()

---

## Instanciação de Objetos

### O que é Instanciar?

**Instanciar** significa criar um objeto concreto a partir de uma classe. A classe é como um molde ou blueprint, e a instância é o objeto real criado na memória do computador.

```java
// A classe é o molde/modelo
Pessoa p1 = new Pessoa(1, "Ana");
//  ↑         ↑
// variável  instanciação (cria o objeto na memória)
```

### Pontos Importantes sobre Instanciação

- **Cada instância ocupa um espaço próprio na memória**: Cada objeto criado é único e independente
- **Instâncias podem ter valores diferentes**: Mesmo sendo da mesma classe, cada objeto pode ter estado diferente
- **O operador `new` é essencial**: É ele quem realmente cria o objeto na memória (heap)
- **O construtor é chamado**: Durante a instanciação, o construtor da classe é automaticamente executado
- **Múltiplas instâncias**: Você pode criar quantos objetos precisar da mesma classe

### Exemplo Prático de Múltiplas Instâncias

```java
// Criando várias instâncias da mesma classe
Pessoa p1 = new Pessoa(1, "Ana");
Pessoa p2 = new Pessoa(2, "Lucas");
Pessoa p3 = new Pessoa(3, "Maria");

// p1, p2 e p3 são instâncias DIFERENTES da classe Pessoa
// Cada uma tem seu próprio espaço na memória
// Cada uma pode ter valores diferentes para id e nome
```

### Processo de Instanciação

1. **Declaração da variável**: `Pessoa p1;` - Cria uma referência (ainda null)
2. **Chamada do `new`**: `new Pessoa(...)` - Aloca memória no heap
3. **Execução do construtor**: Inicializa os atributos do objeto
4. **Atribuição da referência**: A variável recebe o endereço do objeto criado

```java
Pessoa p1;                    // Passo 1: Declaração (p1 = null)
p1 = new Pessoa(1, "Ana");    // Passos 2, 3 e 4: Criação e atribuição
```

### Visualização em Memória

```
Stack (pilha)           Heap (memória dinâmica)
┌──────────────┐       ┌────────────────────┐
│ p1 ─────────┼──────>│ Objeto Pessoa       │
└──────────────┘       │ id = 1              │
┌──────────────┐       │ nome = "Ana"        │
│ p2 ─────────┼──┐     └────────────────────┘
└──────────────┘ │     ┌────────────────────┐
                 └────>│ Objeto Pessoa       │
                       │ id = 2              │
                       │ nome = "Lucas"      │
                       └────────────────────┘
```

### Diferença: Declaração vs Instanciação

```java
// APENAS DECLARAÇÃO (não cria objeto!)
Pessoa p;
// p == null (não aponta para nenhum objeto)
// p.nome → ERRO! NullPointerException

// DECLARAÇÃO + INSTANCIAÇÃO
Pessoa p = new Pessoa(1, "Ana");
// Agora p aponta para um objeto real na memória
// p.nome → "Ana" ✓
```

---

## Atributos e Métodos

### Atributos (Propriedades)

Os atributos definem o **ESTADO** de um objeto. Também chamados de:
- Propriedades
- Variáveis de instância
- Fields

```java
public String cor;      // Atributo público
private int volume;     // Atributo privado
```

### Métodos

Os métodos definem o **COMPORTAMENTO** de um objeto, realizando ações sobre seus dados.

#### Características de um Método

Um método pode ser:

1. **Público ou Privado**
   ```java
   public void mostrar() { }
   private void calcular() { }
   ```

2. **Estático ou Não Estático**
   ```java
   public static void imprimir() { }  // Pertence à classe
   public void acelerar() { }          // Pertence ao objeto
   ```

3. **Com ou Sem Retorno**
   ```java
   public void ligar() { }            // Sem retorno
   public String consumir(int v) { }  // Com retorno
   ```

4. **Sincronizado ou Não**
   ```java
   public synchronized static void imprimir() { }
   ```

5. **Recursivo ou Não**
   ```java
   public static int somar(int n) {
       if(n == 1) return 1;
       return n + somar(n-1);  // Chama a si mesmo
   }
   ```

---

## Encapsulamento

O encapsulamento é um mecanismo que possibilita **restringir o acesso**, **separar em partes**, **isolar**, **proteger** e **restringir conteúdo**.

### O que é Encapsulamento?

É o princípio de esconder os detalhes internos de um objeto e expor apenas o necessário através de uma interface controlada.

**Analogia**: Como um carro - você não precisa saber como o motor funciona internamente, apenas usa o volante, pedais e câmbio (interface pública).

### Modificadores de Acesso (Visibilidade)

A visibilidade define **quem enxerga** atributos e métodos.

| Modificador | Visibilidade | Uso |
|-------------|--------------|-----|
| `public`    | Sem restrições, acessível de qualquer lugar | Métodos de interface pública |
| `private`   | Maior restrição, apenas dentro da própria classe | **Mais usado** para encapsular |
| `protected` | Nível intermediário, classe e subclasses | Herança |
| (default)   | Apenas no mesmo pacote | Classes do mesmo módulo |

### Exemplo Prático: Conta Bancária

```java
public class ContaBancaria {
    private int numero;           // Encapsulado
    public String titular;        // NÃO encapsulado
    private double saldo;         // Encapsulado
    private final double LIMITE_PARA_SAQUE = 1000;  // Constante privada
    
    public void depositar(double valor) {
        if(valor > 0) {              // Regra de negócio
            saldo += valor;
        }
    }
    
    public String sacar(double valor) {
        if(valor <= LIMITE_PARA_SAQUE) {
            if(saldo >= valor) {
                saldo -= valor;
                return "Saque realizado com sucesso";
            } else {
                return titular + " você não possui esta quantia";
            }
        } else {
            return titular + " o seu limite para saque é " + LIMITE_PARA_SAQUE;
        }
    }
}
```

### Por que Encapsular?

✅ **Benefícios**:
- **Proteção de dados**: Evita valores inválidos (saldo negativo, número de conta 0)
- **Regras de negócio**: Valida operações (limite de saque, valor positivo)
- **Facilita manutenção**: Alterar implementação interna sem afetar código externo
- **Segurança**: Dados críticos não podem ser alterados diretamente

**Comparação**:
```java
// SEM encapsulamento (❌ PERIGOSO)
conta.saldo = -1000;  // Permite saldo negativo!

// COM encapsulamento (✅ SEGURO)
conta.depositar(-1000);  // Validação impede valor negativo
```

---

## Getters e Setters

Getters e Setters são métodos que **controlam o acesso** aos atributos privados.

### Convenção de Nomenclatura

```java
private int codigo;
private String nome;
private boolean novo;

// GETTER: pegar/obter o valor
public int getCodigo() {
    return codigo;
}

// SETTER: definir/modificar o valor
public void setCodigo(int codigo) {
    this.codigo = codigo;
}

// Para boolean, usa "is" no getter
public boolean isNovo() {
    return novo;
}

public void setNovo(boolean novo) {
    this.novo = novo;
}
```

### Getters e Setters com Validação

```java
private double valor;

public double getValor() {
    return valor;
}

public void setValor(double valor) {
    if(valor > 0) {              // Validação
        this.valor = valor;
    }
    // Se valor <= 0, não altera!
}
```

### A Palavra-chave `this`

`this` refere-se ao **objeto atual**, distinguindo entre parâmetro e atributo:

```java
public void setNome(String nome) {
    this.nome = nome;
    // this.nome = atributo do objeto
    // nome = parâmetro do método
}
```

### Métodos de Acesso Personalizados

Você pode criar nomes personalizados se fizer sentido:

```java
public void definirNumero(int n) {  // Ao invés de setNumero
    if(n > 0) {
        numero = n;
    }
}

public int pegarNumero() {          // Ao invés de getNumero
    return numero;
}

public double consultarSaldo() {     // Ao invés de getSaldo
    return saldo;
}
```

---

## Construtores

O construtor é um **método especial** usado para **inicializar objetos** no momento da criação.

### Características do Construtor

- ✅ **Mesmo nome da classe** (começa com letra maiúscula)
- ✅ **Não possui tipo de retorno** (nem void)
- ✅ Invocado automaticamente com `new`
- ✅ Objetivo: atribuir valores iniciais ao objeto
- ✅ Pode haver múltiplos construtores (sobrecarga)

### Construtor Default

Quando você não cria nenhum construtor, Java fornece um **construtor padrão vazio**:

```java
public class Produto {
    private int codigo;
    private String nome;
    
    // Java cria automaticamente:
    // public Produto() { }
}

// Uso:
Produto p = new Produto();  // Funciona!
```

⚠️ **ATENÇÃO**: Se você criar qualquer construtor, o default **não é mais criado automaticamente**!

### Criando Construtores

#### Construtor sem parâmetros (explícito)

```java
public Produto() {
    // Inicialização vazia ou com valores padrão
}
```

#### Construtor com parâmetros

```java
public Produto(int codigo, String nome) {
    this.codigo = codigo;
    this.nome = nome;
}

// Uso:
Produto p = new Produto(1, "Sabonete");
```

#### Construtor completo

```java
public Produto(int codigo, String nome, double valor, boolean novo, char tipo) {
    this.codigo = codigo;
    this.nome = nome;
    setValor(valor);      // Usa setter para validar!
    this.novo = novo;
    this.tipo = tipo;
}
```

### Por que Usar Setter no Construtor?

Se há validação no setter, **chame o setter** ao invés de atribuir diretamente:

```java
// ❌ RUIM: Duplica validação
public Produto(double valor) {
    if(valor > 0) {
        this.valor = valor;
    }
}

// ✅ BOM: Reutiliza validação
public Produto(double valor) {
    setValor(valor);  // Setter já valida
}
```

### Sobrecarga de Construtores

Você pode ter **múltiplos construtores** com diferentes parâmetros:

```java
public class Produto {
    private int codigo;
    private String nome;
    
    // Construtor vazio
    public Produto() {
    }
    
    // Construtor com 2 parâmetros
    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    // Construtor completo
    public Produto(int codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        setValor(valor);
    }
}

// Uso:
Produto p1 = new Produto();
Produto p2 = new Produto(1, "Sabonete");
Produto p3 = new Produto(1, "Sabonete", 2.34);
```

---

## Métodos Especiais (toString)

### O Método toString()

`toString()` é um método especial que **retorna uma representação em String do objeto**.

#### Sem toString()

```java
ContaBancaria cb = new ContaBancaria();
System.out.println(cb);
// Saída: aula2609.ContaBancaria@15db9742  (código hash)
```

#### Com toString()

```java
@Override
public String toString() {
    return "[" + numero + "; " + titular + "; " + saldo + "]";
}

ContaBancaria cb = new ContaBancaria();
System.out.println(cb);
// Saída: [1000; Jorginho Bezerra; 1000.0]
```

### Por que usar @Override?

A anotação `@Override` indica que você está **sobrescrevendo** um método da superclasse (Object). Benefícios:

- Previne erros de digitação
- Deixa claro a intenção
- Compilador verifica se o método realmente existe na superclasse

### toString() Completo

```java
@Override
public String toString() {
    return "Produto [codigo=" + codigo + 
           ", nome=" + nome + 
           ", valor=" + valor + 
           ", novo=" + novo + 
           ", tipo=" + tipo + 
           ", empresa=" + empresa + "]";
}
```

**Uso prático**:
```java
Produto p = new Produto(1, "Sabonete", 2.34, true, 'S');
System.out.println(p);  // Chama toString() automaticamente
```

---

## Static - Atributos e Métodos Estáticos

### O que é `static`?

`static` indica que um atributo ou método **pertence à classe**, não aos objetos individuais.

### Diferença: Static vs Não-Static

```java
public class Produto {
    public static String empresa;  // STATIC - da classe
    private int codigo;            // Não-static - do objeto
}
```

**Visualização**:
```
Classe Produto
├── empresa = "Fatec"  (1 única cópia para TODOS)
│
Objeto p1              Objeto p2              Objeto p3
├── codigo = 1         ├── codigo = 2         ├── codigo = 3
└── nome = "A"         └── nome = "B"         └── nome = "C"
```

### Características de Atributos Static

- **Compartilhado**: Todos os objetos veem o mesmo valor
- **Acesso pela classe**: `Produto.empresa` (não precisa de objeto)
- **Único na memória**: Apenas uma cópia existe

```java
Produto p1 = new Produto();
Produto p2 = new Produto();

Produto.empresa = "Fatec";  // Acesso pela classe

System.out.println(p1.empresa);  // Fatec
System.out.println(p2.empresa);  // Fatec (mesmo valor!)
```

### Métodos Static

Métodos static **não têm acesso a atributos não-static** (pois não têm um objeto):

```java
public class ContaBancaria {
    private double saldo;  // Não-static
    
    // Método static
    public static boolean fazerPix(ContaBancaria origem, 
                                   ContaBancaria destino, 
                                   double valor) {
        // Precisa receber as contas como parâmetros
        origem.sacar(valor);
        destino.depositar(valor);
        return true;
    }
}

// Uso:
ContaBancaria.fazerPix(cb1, cb2, 100);  // Pela classe!
```

### Quando Usar Static?

✅ **Use static para**:
- Constantes compartilhadas: `public static final double PI = 3.14159`
- Métodos utilitários: `Math.sqrt()`, `Arrays.sort()`
- Contadores: `private static int totalObjetos`
- Factory methods: `public static Produto criar()`

❌ **NÃO use static para**:
- Atributos que variam por objeto
- Métodos que precisam de estado do objeto

---

## Composição

### Conceito Fundamental

**Composição** representa um relacionamento "todo-parte" **forte**, onde:
- O objeto "todo" é **responsável por criar** suas "partes"
- As partes são criadas **ao mesmo tempo** que o todo
- As partes **não existem sem** o todo
- Há **forte dependência** entre os objetos
- Os objetos internos são **exclusivos** daquele todo

**Frase-chave**: "Nasce junto, morre junto"

### Notação UML

- Representado por um **losango preto (preenchido)** ◆ no diagrama de classes
- O losango fica do lado da classe "todo"
- Indica que o todo é responsável pela existência das partes

```
Casa ◆──── Quarto
     ◆──── Sala
     ◆──── Cozinha
```

### Características Principais

1. **Criação simultânea**: Os objetos são criados juntos no construtor
2. **Responsabilidade de criação**: A classe principal cria os objetos internos
3. **Ciclo de vida compartilhado**: Quando o todo é destruído, as partes também são
4. **Exclusividade**: As partes pertencem apenas àquele todo
5. **Forte acoplamento**: Alta dependência entre todo e partes

### Exemplo 1: Casa e seus Cômodos

```java
public class Casa {
    public Quarto quarto1, quarto2, quarto3;
    public Sala sala;
    public Cozinha cozinha;
    
    // COMPOSIÇÃO: a Casa CRIA seus próprios cômodos no construtor
    public Casa() {
        quarto1 = new Quarto();    // Cria o quarto 1
        quarto2 = new Quarto();    // Cria o quarto 2
        quarto3 = new Quarto();    // Cria o quarto 3
        sala = new Sala();         // Cria a sala
        cozinha = new Cozinha();   // Cria a cozinha
    }
}
```

**Por que é composição?**
- ✓ A Casa cria os cômodos no construtor
- ✓ Os cômodos são criados junto com a Casa
- ✓ Não faz sentido ter um quarto sem casa (dependência forte)
- ✓ Se a casa for destruída, os cômodos também serão
- ✓ Esses cômodos são exclusivos desta casa

### Exemplo 2: Sala e Lâmpadas

```java
public class Sala {
    public Lampada lampada1, lampada2;
    public ArCondicionado ar;
    
    // As lâmpadas são criadas DENTRO da sala
    public Sala() {
        lampada1 = new Lampada();        // Composição
        lampada2 = new Lampada();        // Composição
        ar = new ArCondicionado();       // Composição
    }
}
```

### Exemplo 3: Cozinha e Lâmpada

```java
public class Cozinha {
    public Lampada lampada;
    
    public Cozinha() {
        // A lâmpada é parte integrante e exclusiva da cozinha
        lampada = new Lampada();
    }
}
```

### Uso Prático de Composição

```java
public static void main(String[] args) {
    Casa casa = new Casa();
    
    // Ao criar a casa, TODOS os cômodos já foram automaticamente criados!
    // Não precisamos criar os cômodos manualmente
    
    casa.cozinha.lampada.ligar();      // Acessa objetos internos
    casa.sala.lampada1.ligar();
    casa.sala.lampada2.ligar();
    casa.quarto1.lampada.desligar();
}
```

### Vantagens da Composição

✅ **Benefícios**:
- **Controle total**: O todo controla completamente a criação das partes
- **Encapsulamento**: Detalhes de criação ficam ocultos
- **Garantia de existência**: As partes sempre existem quando o todo existe
- **Simplicidade de uso**: Cliente não precisa criar partes manualmente

❌ **Desvantagens**:
- **Baixa flexibilidade**: Não é possível trocar as partes facilmente
- **Forte acoplamento**: Mudanças nas partes podem afetar o todo
- **Sem reutilização**: As partes não podem ser compartilhadas

### Quando Usar Composição?

**Use Composição quando:**
- O objeto "parte" não faz sentido sem o "todo"
- Você quer controle total sobre a criação
- As partes são exclusivas e não serão compartilhadas
- O ciclo de vida das partes depende do todo

**Exemplos do mundo real:**
- 🏠 Casa → Cômodos (quarto não existe sem casa)
- 🚗 Carro → Motor (motor específico daquele carro)
- 📱 Celular → Tela (tela exclusiva do celular)
- 📄 Documento → Páginas (páginas do documento)

---

## Agregação

### Conceito Fundamental

**Agregação** representa um relacionamento "todo-parte" **fraco**, onde:
- Os objetos são criados em **momentos diferentes**
- A classe **não tem responsabilidade** por criar os objetos
- Usa **injeção de dependências** (recebe objetos prontos)
- Os objetos vêm de fora (externamente)
- Os objetos podem ser **compartilhados** entre várias instâncias

**Frase-chave**: "Cada um na sua, mas trabalham juntos"

### Notação UML

- Representado por um **losango branco (vazio)** ◇ no diagrama de classes
- O losango fica do lado da classe que "possui" a agregação
- Indica que os objetos têm existência independente

```
Funcionario ◇──── Cargo
Professor   ◇──── Disciplina
Aluno       ◇──── Curso
```

### Características Principais

1. **Criação independente**: Objetos existem antes da associação
2. **Sem responsabilidade de criação**: Recebe objetos já criados (injeção)
3. **Ciclo de vida independente**: A destruição de um não afeta o outro
4. **Compartilhamento**: Um objeto pode pertencer a vários "todos"
5. **Fraco acoplamento**: Baixa dependência entre os objetos

### Exemplo 1: Funcionário e Cargo

```java
public class Funcionario {
    public int id;
    public String nome;
    public Cargo cargo;  // AGREGAÇÃO: recebe o cargo de fora (injeção)
    
    // Construtor SEM criar o cargo
    public Funcionario(int id, String nome) {
        this.id = id;
        this.nome = nome;
        // NÃO cria o cargo aqui!
    }
}
```

```java
public class Cargo {
    public int id;
    public String nome;
    
    public Cargo(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
```

**Uso demonstrando agregação**:
```java
// 1. Cria o cargo ANTES (independente)
Cargo c = new Cargo(100, "Programador");

// 2. Cria funcionários
Funcionario f1 = new Funcionario(1, "Pedro");
Funcionario f2 = new Funcionario(2, "Lucas");

// 3. INJETA o cargo (associação posterior)
f1.cargo = c;  // Pedro é Programador
f2.cargo = c;  // Lucas também é Programador (MESMO cargo compartilhado!)
```

**Por que é agregação?**
- ✓ O Cargo existe independentemente do Funcionário
- ✓ Vários funcionários podem ter o mesmo cargo (compartilhamento)
- ✓ O cargo é criado antes e injetado depois
- ✓ Se o funcionário for removido, o cargo continua existindo
- ✓ Baixo acoplamento entre as classes

### Exemplo 2: Cargo e Lista de Funcionários (Bidirecional)

```java
public class Cargo {
    public int id;
    public String nome;
    public List<Funcionario> listafuncionarios;  // Agregação bidirecional
    
    public Cargo(int id, String nome) {
        this.id = id;
        this.nome = nome;
        listafuncionarios = new ArrayList<>();  // Apenas cria a lista, não os funcionários
    }
}
```

**Uso com agregação bidirecional**:
```java
// Criando funcionários SEPARADAMENTE
Funcionario f1 = new Funcionario(1, "Paulo");
Funcionario f2 = new Funcionario(2, "Ana");

// Criando cargo
Cargo c = new Cargo(100, "Desenvolvedor");

// Associação bidirecional
f1.cargo = c;
f2.cargo = c;
c.listafuncionarios.add(f1);
c.listafuncionarios.add(f2);

// OU usando uma lista pronta (injeção)
List<Funcionario> lista = new ArrayList<>();
lista.add(f1);
lista.add(f2);
c.listafuncionarios = lista;  // Injeta a lista pronta
```

### Exemplo 3: Casamento

```java
public class Casamento {
    public Homem homi;    // Agregação
    public Mulher muie;   // Agregação
    
    public Casamento() {
        // NÃO cria Homem nem Mulher aqui!
    }
}
```

```java
// Homem e Mulher são criados ANTES e existem independentemente
Homem h = new Homem();
h.nome = "Sérgio";

Mulher m = new Mulher();
m.nome = "Ivone";

// Casamento recebe os objetos prontos (INJEÇÃO DE DEPENDÊNCIAS)
Casamento c = new Casamento();
c.homi = h;  // Injeta o homem
c.muie = m;  // Injeta a mulher
```

**Por que é agregação?**
- ✓ Homem e Mulher existem antes do casamento
- ✓ Se o casamento acabar, as pessoas continuam existindo (ciclo de vida independente)
- ✓ As pessoas não são criadas pelo casamento
- ✓ Baixo acoplamento: Casamento não controla a existência das pessoas

### Exemplo 4: Pessoa e Cônjuge (Auto-relacionamento)

```java
public class Pessoa {
    public int id;
    public String nome;
    public Pessoa conjuge;  // Agregação: referência a outra Pessoa
    
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
```

**Uso com auto-relacionamento**:
```java
Pessoa p1 = new Pessoa(1, "Ana");
Pessoa p2 = new Pessoa(2, "Daniel");

// Associação feita DEPOIS da criação (agregação)
p1.conjuge = p2;  // Ana casa com Daniel
p2.conjuge = p1;  // Daniel casa com Ana (bidirecional)
```

### Vantagens da Agregação

✅ **Benefícios**:
- **Alta flexibilidade**: Pode trocar objetos facilmente
- **Reutilização**: Mesmos objetos podem ser usados em vários contextos
- **Testabilidade**: Facilita criar testes com objetos mock
- **Baixo acoplamento**: Classes não dependem de implementações específicas
- **Compartilhamento**: Um objeto pode pertencer a vários "todos"

❌ **Desvantagens**:
- **Responsabilidade externa**: Cliente deve criar e gerenciar os objetos
- **Possível inconsistência**: Objetos podem estar em estados inesperados
- **Mais código**: Requer mais código para associar os objetos

### Quando Usar Agregação?

**Use Agregação quando:**
- Os objetos têm existência independente
- O mesmo objeto pode ser compartilhado entre várias instâncias
- Você recebe objetos de outras partes do sistema
- O ciclo de vida dos objetos é independente

**Exemplos do mundo real:**
- 👨‍💼 Professor ◇ Disciplina (professor pode lecionar várias disciplinas)
- 👨‍🎓 Aluno ◇ Curso (aluno existe antes e depois do curso)
- 🚗 Motorista ◇ Carro (motorista pode dirigir vários carros)
- 📚 Biblioteca ◇ Livro (livros existem independentemente)

---

## Injeção de Dependências

### O que é Injeção de Dependências?

**Injeção de dependências** (Dependency Injection - DI) é o padrão usado na **agregação**, onde um objeto recebe suas dependências de fora, ao invés de criá-las internamente.

É uma forma de implementar o **Princípio de Inversão de Dependências** (DIP - um dos princípios SOLID).

### Conceito

Ao invés de:
```java
// ❌ SEM injeção (composição rígida)
public class Funcionario {
    private Cargo cargo;
    
    public Funcionario() {
        cargo = new Cargo();  // CRIA a dependência internamente
    }
}
```

Fazemos:
```java
// ✅ COM injeção (agregação flexível)
public class Funcionario {
    private Cargo cargo;
    
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;  // RECEBE a dependência de fora
    }
}
```

### Formas de Injeção de Dependências

#### 1. Injeção via Atribuição Direta (Field Injection)

```java
Funcionario f = new Funcionario();
f.cargo = cargoExistente;  // Injeta a dependência diretamente
```

#### 2. Injeção via Setter (Setter Injection)

```java
public class Funcionario {
    private Cargo cargo;
    
    // Método setter para injeção
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}

// Uso
Funcionario f = new Funcionario();
f.setCargo(cargoExistente);  // Injeta via setter
```

#### 3. Injeção via Construtor (Constructor Injection) ⭐ **Boa Prática**

```java
public class Funcionario {
    private final Cargo cargo;  // Pode ser final
    
    // Construtor recebe a dependência
    public Funcionario(Cargo cargo) {
        this.cargo = cargo;  // Injeta via construtor
    }
}

// Uso
Cargo c = new Cargo(100, "Programador");
Funcionario f = new Funcionario(c);  // Injeta no momento da criação
```

### Vantagens da Injeção de Dependências

1. **Flexibilidade**: Pode trocar implementações facilmente sem alterar código
2. **Testabilidade**: Facilita criar testes unitários com objetos mock/stub
3. **Reutilização**: Mesmos objetos podem ser usados em vários contextos
4. **Baixo acoplamento**: Classes não dependem de implementações concretas específicas
5. **Manutenibilidade**: Mais fácil de manter e evoluir o código

### Exemplo Comparativo Completo

```java
// SEM Injeção de Dependências (Composição rígida)
public class Pedido {
    private ProcessadorPagamento processador;
    
    public Pedido() {
        processador = new ProcessadorPagamentoCartao();  // Acoplado!
    }
    
    public void processar() {
        processador.processar();
        // Como testar com outro processador? Difícil!
    }
}
```

```java
// COM Injeção de Dependências (Agregação flexível)
public class Pedido {
    private ProcessadorPagamento processador;
    
    // Recebe qualquer ProcessadorPagamento
    public Pedido(ProcessadorPagamento processador) {
        this.processador = processador;  // INJETADO!
    }
    
    public void processar() {
        processador.processar();
    }
}

// Uso - pode trocar facilmente:
Pedido p1 = new Pedido(new ProcessadorPagamentoCartao());
Pedido p2 = new Pedido(new ProcessadorPagamentoPix());
Pedido p3 = new Pedido(new ProcessadorPagamentoBoleto());

// Para testes:
Pedido pTeste = new Pedido(new ProcessadorPagamentoMock());
```

### Frameworks de Injeção de Dependências

Em aplicações maiores, frameworks automatizam a injeção:

- **Spring Framework** (Java Enterprise)
- **Google Guice** (Java)
- **Dagger** (Android)
- **CDI** (Java EE)

Exemplo com Spring:
```java
@Component
public class Funcionario {
    private final Cargo cargo;
    
    @Autowired  // Spring injeta automaticamente
    public Funcionario(Cargo cargo) {
        this.cargo = cargo;
    }
}
```

---

## Comparação: Composição vs Agregação

### Quadro Comparativo

| Aspecto | Composição ◆ | Agregação ◇ |
|---------|--------------|-------------|
| **Símbolo UML** | ◆ Losango preto (preenchido) | ◇ Losango branco (vazio) |
| **Momento de criação** | Objetos criados juntos | Objetos criados separadamente |
| **Responsabilidade** | Classe cria os objetos | Recebe objetos prontos (injeção) |
| **Dependência** | Forte (tight coupling) | Fraca (loose coupling) |
| **Ciclo de vida** | Partes morrem com o todo | Independente |
| **Exclusividade** | Objetos exclusivos | Objetos compartilhados |
| **Flexibilidade** | Baixa | Alta |
| **Controle** | Total controle | Controle externo |
| **Testabilidade** | Mais difícil | Mais fácil |
| **Palavra-chave** | "Nasce junto, morre junto" | "Cada um na sua" |
| **Exemplo** | Casa → Cômodos | Funcionário → Cargo |

### Exemplos Lado a Lado

```java
// COMPOSIÇÃO (Casa cria os cômodos)
public class Casa {
    private Quarto quarto;
    
    public Casa() {
        quarto = new Quarto();  // CRIA internamente
    }
}

// Uso
Casa casa = new Casa();  // Quarto é criado automaticamente


// AGREGAÇÃO (Funcionário recebe o cargo)
public class Funcionario {
    private Cargo cargo;
    
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;  // RECEBE de fora
    }
}

// Uso
Cargo c = new Cargo();          // Cria cargo primeiro
Funcionario f = new Funcionario();
f.setCargo(c);                  // Injeta o cargo
```

### Quando Usar Cada Um?

#### Use Composição quando:
- ✓ O objeto "parte" não faz sentido sem o "todo"
- ✓ Você quer controle total sobre a criação
- ✓ As partes são exclusivas e não serão compartilhadas
- ✓ O ciclo de vida das partes depende do todo
- ✓ **Exemplo**: Carro e seu Motor específico

#### Use Agregação quando:
- ✓ Os objetos têm existência independente
- ✓ O mesmo objeto pode ser compartilhado
- ✓ Você recebe objetos de outras partes do sistema
- ✓ Quer facilitar testes (usar mocks)
- ✓ **Exemplo**: Professor e Disciplinas que leciona

### Dica Visual Rápida

```
COMPOSIÇÃO ◆
Casa ──◆── Quarto
   └─ "Nasce junto, morre junto"
   └─ Casa CRIA o quarto
   └─ Quarto pertence apenas àquela casa


AGREGAÇÃO ◇
Funcionário ──◇── Cargo
   └─ "Cada um na sua"
   └─ Funcionário RECEBE o cargo
   └─ Cargo pode ser compartilhado
```

---

## Serialização

### O que é Serialização?

Serialização é o processo de **converter um objeto em bytes** para salvá-lo em arquivo ou transmiti-lo pela rede.

**Persistência** = Objeto sobrevive após o programa terminar.

### Implementando Serializable

```java
import java.io.Serializable;

public class Aluno implements Serializable {
    public String ra, nome;
    public int idade;
}
```

⚠️ **IMPORTANTE**: A classe deve implementar `Serializable` (é uma interface marcadora, sem métodos).

### Gravando Objetos em Arquivo

```java
import java.io.*;

public static String gravar(Aluno a) {
    String retorno = "Objeto armazenado com sucesso";
    try {
        FileOutputStream fos = new FileOutputStream("aluno.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);  // Grava o objeto
        oos.flush();         // Garante escrita
        oos.close();         // Fecha arquivo
    } catch(IOException e) {
        retorno = "Falha ao gravar o objeto " + e;
    }
    return retorno;
}
```

### Lendo Objetos de Arquivo

```java
public static Aluno ler() {
    Aluno a = null;
    try {
        FileInputStream fis = new FileInputStream("aluno.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        a = (Aluno) ois.readObject();  // Lê e converte
        ois.close();
    } catch(IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    return a;
}
```

### Uso Prático

```java
// Criar e gravar
Aluno a = new Aluno();
a.nome = "Pedro Denny Re";
a.ra = "10519012901";
a.idade = 19;
System.out.println(Aluno.gravar(a));

// Ler depois
Aluno aRecuperado = Aluno.ler();
System.out.println(aRecuperado.nome);  // Pedro Denny Re
```

### Quando Usar Serialização?

✅ **Casos de uso**:
- Salvar configurações do programa
- Cache de objetos
- Transmissão de objetos pela rede
- Persistência simples sem banco de dados

⚠️ **Limitações**:
- Não é adequado para grandes volumes de dados
- Versão da classe pode causar incompatibilidade
- Para produção, considere banco de dados ou JSON

---

## Threads e Sincronização

### O que são Threads?

Threads permitem que um programa execute múltiplas tarefas simultaneamente (programação assíncrona).

### Criando uma Thread

```java
public class Word01 extends Thread {
    String texto = "Apostila de Python";
    
    public void run() {  // Não é main, é run()!
        Impressora.imprimir(texto);
    }
}
```

### Executando Threads

```java
public static void main(String[] args) {
    Word01 w1 = new Word01();
    Word02 w2 = new Word02();
    
    w1.start();  // Inicia a thread
    w2.start();  // Inicia outra thread
}
```

⚠️ **IMPORTANTE**:
- Uma classe Thread não tem `main()`, tem `run()`
- O método `run()` não é estático
- Use `start()` para executar, não `run()` diretamente

### Sincronização de Métodos

Quando múltiplas threads acessam o mesmo recurso, pode haver conflitos. A palavra-chave `synchronized` resolve isso.

```java
public synchronized static void imprimir(String texto) {
    for(int i = 1; i <= 10; i++) {
        System.out.println(texto + " " + i);
    }
}
```

**Sem synchronized**:
```
Apostila de Python 1
Mapa Mental de Java 1
Apostila de Python 2
Mapa Mental de Java 2
```

**Com synchronized**:
```
Apostila de Python 1
Apostila de Python 2
...
Apostila de Python 10
Mapa Mental de Java 1
...
Mapa Mental de Java 10
```

### Controle de Threads

```java
public class MinhaThread extends Thread {
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            
            try {
                Thread.sleep(1000);  // Pausa por 1 segundo
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Uso
MinhaThread t1 = new MinhaThread();
t1.setName("Thread-A");
t1.start();
```

---

## Recursividade

### O que é Recursividade?

Recursividade ocorre quando um método **chama a si mesmo**. É útil para resolver problemas que podem ser divididos em subproblemas menores e similares.

### Estrutura Básica

Todo método recursivo precisa de:
1. **Caso Base**: Condição de parada
2. **Caso Recursivo**: Chamada do método a si mesmo

### Exemplos Práticos

#### Factorial
```java
public static int factorial(int n) {
    // Caso base
    if(n == 0 || n == 1) {
        return 1;
    }
    
    // Caso recursivo
    return n * factorial(n - 1);
}

// factorial(5) = 5 * factorial(4)
//              = 5 * 4 * factorial(3)
//              = 5 * 4 * 3 * factorial(2)
//              = 5 * 4 * 3 * 2 * factorial(1)
//              = 5 * 4 * 3 * 2 * 1 = 120
```

#### Fibonacci
```java
public static int fibonacci(int n) {
    // Caso base
    if(n <= 1) {
        return n;
    }
    
    // Caso recursivo
    return fibonacci(n - 1) + fibonacci(n - 2);
}

// fibonacci(5) = fibonacci(4) + fibonacci(3)
//              = (fibonacci(3) + fibonacci(2)) + (fibonacci(2) + fibonacci(1))
//              = ... = 5
```

#### Soma de Array
```java
public static int somarArray(int[] array, int indice) {
    // Caso base
    if(indice == array.length) {
        return 0;
    }
    
    // Caso recursivo
    return array[indice] + somarArray(array, indice + 1);
}
```

### Vantagens e Desvantagens

✅ **Vantagens**:
- Código mais limpo e elegante
- Natural para problemas recursivos (árvores, grafos)
- Mais fácil de entender em alguns casos

❌ **Desvantagens**:
- Pode consumir muita memória (pilha de chamadas)
- Pode ser mais lento que iteração
- Risco de estouro de pilha (StackOverflowError)

---

# PARTE III: HERANÇA E POLIMORFISMO

## Herança

### Conceito

Herança é um mecanismo fundamental da POO que permite que classes compartilhem atributos e operações baseados em um relacionamento hierárquico. Uma **subclasse** (classe filha/derivada) herda atributos e métodos de uma **superclasse** (classe mãe/base).

### Terminologia

- **Classe Mãe**: Também chamada de classe base ou superclasse
- **Classe Filha**: Também chamada de subclasse ou classe derivada
- A classe filha (mais específica) herda da classe mãe (mais genérica)

### Sintaxe em Java

```java
public class ClasseFilha extends ClasseMae {
    // código da classe filha
}
```

### Características Importantes

- Por padrão, todas as classes em Java herdam da classe `Object`
- **⚠️ IMPORTANTE**: Atributos e métodos **privados** NÃO são herdados pela subclasse
- Atributos e métodos **públicos** e **protected** são herdados

### Vantagens da Herança

1. **Reutilização de código**: Evita duplicação de código
2. **Modificação sem alteração**: Permite adicionar novos métodos e variáveis sem mudar a classe original
3. **Flexibilidade**: Permite alterar o comportamento de uma classe através de sobrescrita

### Exemplo Prático

```java
// Hierarquia: Pessoa -> PessoaFisica -> Funcionario -> Vendedor

public abstract class Pessoa {
    private int numero;
    protected String nome;
    
    public void digitar() {
        // lógica de entrada
    }
}

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;
    
    @Override
    public void digitar() {
        super.digitar(); // chama o método da classe mãe
        // adiciona lógica específica
    }
}
```

---

## Modificadores de Acesso

### Tipos de Modificadores

| Modificador | Mesma Classe | Mesmo Pacote | Subclasse (outro pacote) | Qualquer Lugar |
|-------------|--------------|--------------|--------------------------|----------------|
| `private` | ✅ | ❌ | ❌ | ❌ |
| `default` (sem modificador) | ✅ | ✅ | ❌ | ❌ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `public` | ✅ | ✅ | ✅ | ✅ |

### Protected - Conceito Especial

O modificador `protected` (#) tem um comportamento único:
- Funciona como **público** dentro de uma hierarquia ou pacote
- **Não pode** ser acessado fora da hierarquia
- Se você criar uma classe em outro pacote que estende uma classe da hierarquia, os atributos `protected` dessa hierarquia continuarão acessíveis

### Exemplo

```java
public abstract class Pessoa {
    private int numero;      // NÃO é herdado
    protected String nome;   // É herdado e acessível em subclasses
    
    public void mostrar() {  // É herdado
        System.out.println(numero);
        System.out.println(nome);
    }
}
```

---

## Classes Abstratas

### Conceito

Uma classe abstrata é um **conceito**, um **modelo** que não gera instâncias. Ela serve como base para outras classes, definindo um comportamento comum.

### Características

- Declarada com a palavra-chave `abstract`
- **Não pode ser instanciada** diretamente
- Pode conter métodos abstratos (sem implementação) e métodos concretos (com implementação)
- Em UML, o nome da classe abstrata aparece em *itálico*
- É muito comum que superclasses em uma hierarquia sejam abstratas

### Sintaxe

```java
public abstract class Animal {
    // Método concreto
    public void comer() {
        // pode ter implementação
    }
    
    // Método abstrato (se necessário)
    public abstract void emitirSom();
}
```

### Exemplo Prático

```java
public abstract class Fruta {
    public void descascar() {
        // implementação padrão (pode ser vazia)
    }
}

public class Banana extends Fruta {
    @Override
    public void descascar() {
        System.out.println("Descascando a banana");
    }
}
```

### Por que usar?

- Define um **contrato** que subclasses devem seguir
- Permite criar **hierarquias consistentes**
- Evita que objetos genéricos sejam criados quando só faz sentido ter objetos específicos

---

## Polimorfismo

### Conceito

Polimorfismo vem do grego: **Poli** (muitas) + **Morphos** (formas) = "Muitas formas"

É a capacidade de um objeto decidir qual método aplicar a si mesmo. É o mecanismo que permite a um objeto assumir múltiplas formas (uma de cada vez).

### Definição Técnica

A propriedade segundo a qual uma subclasse redefine a implementação de um método herdado da superclasse.

### Vantagem Principal

**Economia de recursos**: Facilita a adição de novas classes ao sistema com o mínimo de modificações no código existente.

### Tipos de Polimorfismo

#### 1. Polimorfismo de Sobrescrita (Override)

Quando uma subclasse fornece uma implementação específica para um método já definido na superclasse.

```java
public abstract class Animal {
    public void comer() { }
}

public class Gato extends Animal {
    @Override
    public void comer() {
        System.out.println("Gato comendo");
    }
}
```

#### 2. Polimorfismo de Referência

Quando uma variável do tipo da superclasse pode referenciar objetos de qualquer subclasse.

```java
// "Esquisito, mas é polimorfismo"
Animal a = new Gato();  // Referência Animal, objeto Gato
a.beber();  // Chama o método de Gato
a.comer();  // Chama o método de Gato
```

### Exemplo Prático - Descascador Polimórfico

```java
public class Descascador {
    // Método genérico que aceita qualquer Fruta
    public static void agir(Fruta f) {
        f.descascar();  // Polimorfismo: chama o método correto em tempo de execução
    }
    
    public static void main(String[] args) {
        Fruta f = new AbacaxiReal();  // Polimorfismo de referência
        agir(f);  // Saída: "Descascando o abacaxi real..."
    }
}
```

### Comparação: Com e Sem Polimorfismo

**Sem Polimorfismo**:
```java
Banana b = new Banana();
b.descascar();

Abacaxi a = new Abacaxi();
a.descascar();

Melancia m = new Melancia();
m.descascar();
// Repetitivo e difícil de manter
```

**Com Polimorfismo**:
```java
public static void agir(Fruta f) {
    f.descascar();
}
// Único método para todas as frutas!
```

---

## Override (Sobrescrita)

### Conceito

Métodos com o **mesmo nome e assinatura** em classes diferentes, mas com **implementações diferentes**.

### Anotação @Override

A anotação `@Override` é uma proteção do compilador:
- Verifica em **tempo de compilação** se o método realmente existe na classe mãe
- Se não existir, gera **erro de compilação**
- Garante que você está realmente sobrescrevendo um método, não criando um novo

### Importante

⚠️ Se não houver mesmo nome e assinatura, **NÃO há sobrescrita**, apenas uso de dados diferentes.

### Exemplo

```java
public class PessoaFisica extends Pessoa {
    @Override  // Garante que estamos sobrescrevendo
    public void digitar() {
        super.digitar();  // Chama o método da classe mãe
        cpf = JOptionPane.showInputDialog("CPF a ser digitado: ");
        rg = JOptionPane.showInputDialog("RG a ser digitado: ");
    }
}
```

### Regras para Override

1. **Mesmo nome** do método
2. **Mesma assinatura** (tipos e quantidade de parâmetros)
3. **Mesmo tipo de retorno** (ou tipo compatível - covariante)
4. **Não pode reduzir a visibilidade** (se era public, não pode ser protected)
5. **Não pode adicionar exceções checked novas**

---

## Palavra-chave super

### Conceito

A palavra-chave `super` é usada para acessar membros da classe mãe (superclasse).

### Usos Principais

#### 1. Chamar Método da Superclasse

```java
public void digitar() {
    super.digitar();  // Chama o método digitar() da classe mãe
    // Adiciona comportamento específico da subclasse
}
```

#### 2. Chamar Construtor da Superclasse

```java
public class Funcionario extends PessoaFisica {
    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);  // Chama construtor de PessoaFisica
        this.salario = salario;
    }
}
```

### Quando Usar super

- Para **reaproveitar** código da classe mãe
- Para **estender** funcionalidade sem duplicar código
- Para acessar atributos ou métodos **ocultos** por sobrescrita

### Exemplo da Hierarquia

```java
Vendedor -> Funcionario -> PessoaFisica -> Pessoa

// No Vendedor:
public void digitar() {
    super.digitar();  // Chama Funcionario.digitar()
    // que por sua vez chama super.digitar() de PessoaFisica
    // que por sua vez chama super.digitar() de Pessoa
    comissao = Float.parseFloat(JOptionPane.showInputDialog("Comissão: "));
}
```

---

# PARTE IV: INTERFACES E RECURSOS AVANÇADOS

## Interfaces

### O que são Interfaces?

**Interface** é um recurso que define ações que devem ser obrigatoriamente implementadas pelas classes. É como um **contrato** que a classe assina, especificando **O QUE** deve ser feito, mas não **COMO** fazer.

Uma interface é uma **promessa** de comportamento, um **compromisso** que a classe assume de fornecer determinadas funcionalidades.

### Analogia do Mundo Real

Pense em uma interface como:
- 📋 **Contrato de trabalho**: Define responsabilidades, não como executá-las
- 🔌 **Tomada elétrica**: Define padrão de conexão, não como a eletricidade é gerada
- 🚗 **Manual do motorista**: Define controles (volante, pedais), não como o motor funciona

### Sintaxe Básica

```java
public interface Motor {
    void ligar();
    void desligar();
    void acelerar();
    void frear();
}
```

### Características Fundamentais

1. **Apenas especificações**: Não possui implementação, apenas definições de métodos
2. **Métodos abstratos**: Todos os métodos são implicitamente `public abstract`
3. **Valores constantes**: Só pode ter atributos `public static final` (constantes)
4. **Não pode ser instanciada**: Não é possível fazer `new Interface()`
5. **Sem construtor**: Interfaces não têm métodos construtores
6. **Múltipla implementação**: Uma classe pode implementar várias interfaces
7. **Herança entre interfaces**: Uma interface pode estender (extends) outra interface

### Exemplo Completo: Interface Fisio

```java
// Definindo a interface
public interface Fisio {
    void comer();    // Implicitamente public abstract
    void beber();    // Implicitamente public abstract
    void dormir();   // Implicitamente public abstract
}

// Implementando a interface
public class Pessoa implements Fisio {
    @Override
    public void comer() {
        System.out.println("Pessoa come");
    }
    
    @Override
    public void beber() {
        System.out.println("Pessoa bebe");
    }
    
    @Override
    public void dormir() {
        System.out.println("Pessoa dorme");
    }
}
```

### Notação UML

Em diagramas UML, dizemos que uma classe **"realiza" (realizes)** uma interface:
- Representado por uma **linha tracejada com seta triangular vazia**
- Ou pelo estereótipo `<<interface>>` acima do nome

```
<<interface>>
    Fisio
      ↑
      ┊ (linha tracejada)
      ┊
   Pessoa
```

### Por que Usar Interfaces?

✅ **Vantagens**:

1. **Padronização**: Garante que classes diferentes tenham os mesmos métodos
2. **Polimorfismo**: Permite tratar objetos diferentes de forma uniforme
3. **Desacoplamento**: Reduz dependências entre classes
4. **Flexibilidade**: Fácil trocar implementações
5. **Testabilidade**: Facilita criar mocks para testes
6. **Múltipla herança de comportamento**: Simula herança múltipla

### Exemplo: Interface Motor

```java
public interface Motor {
    void ligar();
    void desligar();
    void acelerar();
    void frear();
}

// Diferentes implementações
public class Moto implements Motor {
    @Override
    public void ligar() {
        System.out.println("Liga a moto");
    }
    
    @Override
    public void desligar() {
        System.out.println("Desliga a moto");
    }
    
    @Override
    public void acelerar() {
        System.out.println("Acelera a moto");
    }
    
    @Override
    public void frear() {
        System.out.println("Freia a moto");
    }
}

public class Aviao implements Motor {
    @Override
    public void ligar() {
        System.out.println("Liga o avião");
    }
    
    @Override
    public void desligar() {
        System.out.println("Desliga o avião");
    }
    
    @Override
    public void acelerar() {
        System.out.println("Acelera o avião");
    }
    
    @Override
    public void frear() {
        System.out.println("Freia o avião");
    }
}
```

### Regras Importantes

⚠️ **Atenção**:

1. **Todos os métodos devem ser implementados**: A classe concreta DEVE implementar todos os métodos da interface
2. **Métodos são public**: Sempre devem ser declarados como `public` na implementação
3. **Use @Override**: Boa prática usar a anotação `@Override`
4. **Não pode ter atributos de instância**: Apenas constantes (`static final`)

---

## Implementação Múltipla de Interfaces

### Uma Classe, Várias Interfaces

Uma das grandes vantagens das interfaces é permitir que uma classe implemente múltiplas interfaces, simulando **herança múltipla de comportamento** (não permitida com classes).

```java
// Uma classe implementa TRÊS interfaces
public class Automovel implements Motor, Turbo, Porta {
    // Deve implementar TODOS os métodos das três interfaces
}
```

### Exemplo Completo

```java
public interface Motor {
    void ligar();
    void desligar();
    void acelerar();
    void frear();
}

public interface Turbo {
    void acionar();
    void resetar();
}

public interface Porta {
    void abrir();
    void fechar();
}

// Automóvel implementa as três interfaces
public class Automovel implements Motor, Turbo, Porta {
    // Métodos de Motor
    @Override
    public void ligar() {
        System.out.println("Liga o motor do automóvel");
    }
    
    @Override
    public void desligar() {
        System.out.println("Desliga o motor do automóvel");
    }
    
    @Override
    public void acelerar() {
        System.out.println("Acelera o motor do automóvel");
    }
    
    @Override
    public void frear() {
        System.out.println("Freia o motor do automóvel");
    }
    
    // Métodos de Turbo
    @Override
    public void acionar() {
        System.out.println("Turbo do automóvel acionado");
    }
    
    @Override
    public void resetar() {
        System.out.println("Turbo do automóvel resetado");
    }
    
    // Métodos de Porta
    @Override
    public void abrir() {
        System.out.println("A porta do automóvel foi aberta");
    }
    
    @Override
    public void fechar() {
        System.out.println("A porta do automóvel foi fechada");
    }
}
```

### Herança entre Interfaces

Uma interface pode estender (extends) outra interface, herdando seus métodos:

```java
public interface Motor {
    void ligar();
    void desligar();
    void acelerar();
    void frear();
}

// Turbo ESTENDE Motor, herdando todos os seus métodos
public interface Turbo extends Motor {
    void acionar();   // Método adicional
    void resetar();   // Método adicional
}
```

**Importante**: Quando uma classe implementa `Turbo`, ela deve implementar:
- Todos os métodos de `Turbo` (acionar, resetar)
- **E** todos os métodos de `Motor` (ligar, desligar, acelerar, frear)

```java
public class CarroEsportivo implements Turbo {
    // Deve implementar 6 métodos no total:
    // 4 de Motor + 2 de Turbo
    
    @Override
    public void ligar() { /* ... */ }
    
    @Override
    public void desligar() { /* ... */ }
    
    @Override
    public void acelerar() { /* ... */ }
    
    @Override
    public void frear() { /* ... */ }
    
    @Override
    public void acionar() { /* ... */ }
    
    @Override
    public void resetar() { /* ... */ }
}
```

### Benefícios da Implementação Múltipla

✅ **Composição de comportamentos**:
```java
// Classe pode ter múltiplas capacidades
public class SuperCarro implements Motor, Turbo, Conversivel, GPS {
    // Tem comportamentos de motor, turbo, conversível e GPS
}
```

✅ **Flexibilidade**:
```java
// Diferentes classes podem implementar combinações diferentes
public class Moto implements Motor {
    // Apenas motor
}

public class Ferrari implements Motor, Turbo {
    // Motor com turbo
}

public class JipeSafari implements Motor, Rastreavel {
    // Motor com rastreamento
}
```

---

## Polimorfismo com Interfaces

### Conceito

Interfaces permitem criar **polimorfismo**, onde uma variável do tipo interface pode referenciar qualquer objeto de classe que implemente essa interface.

Isso é extremamente poderoso para escrever código genérico e reutilizável.

### Exemplo Básico

```java
// Diferentes classes implementam a mesma interface
Motor m = new Moto();
m.ligar();           // Liga a moto

m = new Aviao();     // Pode trocar para outro tipo!
m.ligar();           // Liga o avião

m = new Automovel(); // Pode trocar novamente!
m.acelerar();        // Acelera o automóvel
```

### Exemplo com Collections

```java
// Lista de objetos que implementam Motor
List<Motor> motores = new ArrayList<>();
motores.add(new Moto());
motores.add(new Aviao());
motores.add(new Automovel());
motores.add(new Caminhao());

// Polimorfismo: cada um executa seu próprio ligar()
for (Motor m : motores) {
    m.ligar();  // Comportamento diferente para cada tipo
}
```

### Vantagens do Polimorfismo com Interfaces

1. **Flexibilidade**: Pode trocar implementações sem mudar código cliente
2. **Substituição**: Uma classe pode ser substituída por outra facilmente
3. **Desacoplamento**: O código não depende de classes concretas
4. **Extensibilidade**: Fácil adicionar novos tipos
5. **Manutenibilidade**: Mudanças localizadas, não em cascata

### Exemplo Prático: Sistema de Pagamentos

```java
public interface ProcessadorPagamento {
    boolean processar(double valor);
    String obterRecibo();
}

public class PagamentoCartao implements ProcessadorPagamento {
    @Override
    public boolean processar(double valor) {
        System.out.println("Processando R$" + valor + " no cartão...");
        return true;
    }
    
    @Override
    public String obterRecibo() {
        return "Recibo de cartão de crédito";
    }
}

public class PagamentoPix implements ProcessadorPagamento {
    @Override
    public boolean processar(double valor) {
        System.out.println("Processando R$" + valor + " via PIX...");
        return true;
    }
    
    @Override
    public String obterRecibo() {
        return "Comprovante PIX";
    }
}

// Uso polimórfico
public class Caixa {
    public void finalizarCompra(ProcessadorPagamento processador, double valor) {
        if (processador.processar(valor)) {
            System.out.println(processador.obterRecibo());
        }
    }
}

// Cliente pode escolher qualquer processador
Caixa caixa = new Caixa();
caixa.finalizarCompra(new PagamentoCartao(), 100.00);
caixa.finalizarCompra(new PagamentoPix(), 50.00);
```

---

## Padrão Consumer/Provider

### Conceito

O padrão **Consumer/Provider** (Consumidor/Provedor) é um design pattern fundamental no uso de interfaces:

- **Provider (Provedor)**: Classe que **implementa** a interface e **fornece** funcionalidades
- **Consumer (Consumidor)**: Classe/método que **usa** a interface e **consome** funcionalidades

Este padrão permite **desacoplar** quem fornece o serviço de quem usa o serviço.

### Visualização do Padrão

```
   Interface Fisio
   (Contrato)
        ↑
        │ implementa
        │
   ┌────┴────┬─────────┐
   │         │         │
Pessoa    Animal      ET
(Provider) (Provider) (Provider)
   ↑         ↑         ↑
   └─────────┼─────────┘
             │ usa
             │
          Vida
        (Consumer)
```

### Exemplo Clássico

```java
// INTERFACE - o contrato
public interface Fisio {
    void comer();
    void beber();
    void dormir();
}

// PROVIDERS - fornecem implementações
public class Pessoa implements Fisio {
    @Override
    public void comer() {
        System.out.println("Pessoa come");
    }
    
    @Override
    public void beber() {
        System.out.println("Pessoa bebe");
    }
    
    @Override
    public void dormir() {
        System.out.println("Pessoa dorme");
    }
}

public class Animal implements Fisio {
    @Override
    public void comer() {
        System.out.println("Animal come");
    }
    
    @Override
    public void beber() {
        System.out.println("Animal bebe");
    }
    
    @Override
    public void dormir() {
        System.out.println("Animal dorme");
    }
}

// CONSUMER - consome qualquer Fisio
public class Vida {
    // Método genérico que aceita QUALQUER implementação de Fisio
    public static void viver(Fisio f) {
        f.comer();
        f.beber();
        f.dormir();
    }
}

// USO
public static void main(String[] args) {
    Fisio f = new Pessoa();
    Vida.viver(f);  // Consumer usa o provider Pessoa
    
    Fisio a = new Animal();
    Vida.viver(a);  // Consumer usa o provider Animal (mesmo método!)
}
```

### Benefício Principal

**O Consumer (Vida) não precisa saber se está usando Pessoa, Animal ou qualquer outra implementação**. Ele só precisa saber que tem um objeto que implementa `Fisio`.

### Outro Exemplo: Veículo e Motor

```java
// Consumer
public class Veiculo {
    // Recebe qualquer Motor (provider)
    public static void utilizar(Motor m) {
        m.ligar();
        m.acelerar();
        m.frear();
        m.desligar();
    }
}

// Uso
public static void main(String[] args) {
    Motor moto = new Moto();
    Veiculo.utilizar(moto);  // Funciona
    
    Motor aviao = new Aviao();
    Veiculo.utilizar(aviao);  // Funciona
    
    Turbo automovel = new Automovel();
    Veiculo.utilizar(automovel);  // Funciona (Turbo extends Motor)
}
```

### Vantagens do Padrão

✅ **Desacoplamento**: Consumer não conhece implementações concretas
✅ **Flexibilidade**: Fácil adicionar novos providers
✅ **Testabilidade**: Pode criar providers mock para testes
✅ **Reutilização**: Mesmo consumer para múltiplos providers
✅ **Manutenibilidade**: Mudanças em providers não afetam consumer

---

## Interfaces vs Classes Abstratas

### Comparação Detalhada

| Aspecto | Interface | Classe Abstrata |
|---------|-----------|-----------------|
| **Métodos** | Só abstratos (Java < 8) | Abstratos e concretos |
| **Atributos** | Só constantes (public static final) | Qualquer tipo de atributo |
| **Herança** | Múltipla (implements várias) | Simples (extends uma) |
| **Construtor** | Não pode ter | Pode ter |
| **Implementação** | Nenhuma (só definição) | Pode ter implementação parcial |
| **Palavra-chave** | `implements` | `extends` |
| **Flexibilidade** | Menos flexível (só contrato) | Mais flexível (estado + comportamento) |
| **Quando usar** | Contrato de comportamento | Classe base com código comum |
| **Exemplo** | `Comparable`, `Serializable` | `Animal`, `Veiculo` |

### Classes Abstratas: Mais Recursos

Classes abstratas oferecem mais recursos que interfaces:

```java
public abstract class Motor {
    // ✓ Pode ter atributos de instância (ESTADO)
    public int codigo;
    public String fabricante;
    public double preco;
    protected boolean ligado;
    
    // ✓ Pode ter métodos abstratos (obrigatórios para subclasses)
    public abstract void ligar();
    public abstract void desligar();
    public abstract void acelerar();
    public abstract void frear();
    
    // ✓ Pode ter métodos concretos (implementação pronta)
    public void esfriar() {
        System.out.println("Esfriando motor...");
        ligado = false;
    }
    
    public void mostrarInfo() {
        System.out.println("Motor " + fabricante + " - R$" + preco);
    }
    
    // ✓ Pode ter construtores
    public Motor(int codigo, String fabricante, double preco) {
        this.codigo = codigo;
        this.fabricante = fabricante;
        this.preco = preco;
        this.ligado = false;
    }
}
```

### Interfaces: Apenas Contrato

```java
public interface Motor {
    // ✓ Métodos abstratos (sem implementação)
    void ligar();
    void desligar();
    void acelerar();
    void frear();
    
    // ✓ Apenas constantes (não atributos variáveis)
    int TEMPERATURA_MAXIMA = 120;
    String TIPO_COMBUSTIVEL = "Gasolina";
    
    // ✗ NÃO pode ter atributos de instância
    // ✗ NÃO pode ter construtores
    // ✗ NÃO pode ter métodos com implementação (Java < 8)
}
```

### Quando Usar Cada Uma?

#### Use **Interface** quando:
- ✓ Quer definir um contrato/capacidade puro (sem estado)
- ✓ Precisa de herança múltipla de comportamento
- ✓ Classes não relacionadas devem ter mesmo comportamento
- ✓ Não precisa de atributos de instância
- ✓ Quer máxima flexibilidade

**Exemplos:**
- `Voavel` (Pássaro, Avião, Drone - não relacionados, mas voam)
- `Comparable` (qualquer coisa pode ser comparável)
- `Serializable` (qualquer coisa pode ser serializada)

#### Use **Classe Abstrata** quando:
- ✓ Quer compartilhar código entre classes relacionadas
- ✓ Tem estado (atributos) comum a compartilhar
- ✓ Quer definir comportamento padrão (métodos concretos)
- ✓ Precisa de construtores para inicializar estado
- ✓ Classes formam uma hierarquia natural
- ✓ Quer controlar a inicialização

**Exemplos:**
- `Animal` → `Mamifero` → `Cachorro` (hierarquia natural)
- `Veiculo` → `Carro`, `Moto` (compartilham atributos)
- `FormaGeometrica` → `Circulo`, `Quadrado` (código comum)

### Podem Trabalhar Juntas

Um padrão comum é usar **classe abstrata como base** e **interface para capacidades adicionais**:

```java
// Classe abstrata com estado e comportamento comum
public abstract class Motor {
    protected int codigo;
    protected String fabricante;
    protected boolean ligado;
    
    public Motor(int codigo, String fabricante) {
        this.codigo = codigo;
        this.fabricante = fabricante;
        this.ligado = false;
    }
    
    public abstract void ligar();
    public abstract void desligar();
    
    public void esfriar() {
        System.out.println("Esfriando...");
    }
}

// Interface para capacidade adicional
public interface Turbo {
    void acionar();
    void resetar();
}

// Classe concreta HERDA de Motor e IMPLEMENTA Turbo
public class MotorTurbo extends Motor implements Turbo {
    // Herda: codigo, fabricante, ligado, esfriar()
    // Deve implementar: ligar(), desligar() (de Motor)
    // Deve implementar: acionar(), resetar() (de Turbo)
    
    public MotorTurbo(int codigo, String fabricante) {
        super(codigo, fabricante);
    }
    
    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Motor turbo ligado");
    }
    
    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Motor turbo desligado");
    }
    
    @Override
    public void acionar() {
        System.out.println("Turbo acionado!");
    }
    
    @Override
    public void resetar() {
        System.out.println("Turbo resetado");
    }
}
```

### Regra de Ouro

> **"Se você precisa apenas de métodos, crie uma interface. Se precisar de mais coisas (atributos, implementações parciais, construtores), crie uma classe abstrata."**

### Decisão Prática

```java
// CENÁRIO 1: Apenas comportamento → Interface
public interface Nadador {
    void nadar();
}

// CENÁRIO 2: Comportamento + Estado + Implementação → Classe Abstrata
public abstract class Veiculo {
    protected int velocidade;    // Estado
    protected String placa;      // Estado
    
    public abstract void acelerar();  // Obrigatório
    
    public void mostrarInfo() {       // Implementação pronta
        System.out.println("Placa: " + placa);
    }
}

// CENÁRIO 3: Combinação (melhor dos dois mundos)
public abstract class Carro extends Veiculo implements Nadador {
    // Herda estado e comportamento de Veiculo
    // Deve implementar nadar() de Nadador
    // Carro anfíbio!
}
```

---

## Classes Internas (Inner Classes)

### Conceito

Uma **classe interna** é uma classe definida dentro de outra classe. Ela pode acessar membros (inclusive privados) da classe externa e é útil para encapsular lógica que só faz sentido no contexto da classe externa.

### Por que Usar Classes Internas?

✅ **Vantagens**:
1. **Encapsulamento**: A classe interna só existe no contexto da externa
2. **Acesso privilegiado**: Pode acessar membros privados da classe externa
3. **Organização**: Agrupa classes relacionadas
4. **Ocultação**: A classe interna não é visível fora da classe externa

### Tipos Principais

1. **Classe Interna Normal**: Membro da classe externa
2. **Classe Interna Privada**: Visível apenas dentro da classe externa
3. **Classe Interna Estática**: Não precisa de instância da classe externa
4. **Classe Anônima**: Sem nome, usada uma única vez

### Exemplo: Classe Interna Privada

```java
public class Pedido {
    public int numero;
    public String dataEmissao;
    public List<Item> itens = new ArrayList<Item>();
    
    // Método que usa a classe interna
    public void addItem(String produto, int quantidade, float precoUnitario) {
        Item i = new Item();  // Cria instância da classe interna
        i.produto = produto;
        i.quantidade = quantidade;
        i.precoUnitario = precoUnitario;
        itens.add(i);
    }
    
    public void mostrar() {
        System.out.println("Pedido " + numero + " - " + dataEmissao);
        System.out.println("Itens:");
        for(Item item : itens) {
            item.mostrar();  // Chama método da classe interna
        }
    }
    
    // CLASSE INTERNA PRIVADA
    private class Item {
        public String produto;
        public int quantidade;
        public float precoUnitario;
        
        public void mostrar() {
            float subtotal = quantidade * precoUnitario;
            System.out.println(produto + " - Qtd: " + quantidade + 
                             " - R$" + precoUnitario + " - Subtotal: R$" + subtotal);
        }
        
        public float calcularSubtotal() {
            return quantidade * precoUnitario;
        }
    }
}
```

### Uso Prático

```java
public static void main(String[] args) {
    Pedido p = new Pedido();
    p.numero = 100;
    p.dataEmissao = "24/10/2025";
    
    p.addItem("Sabão em pó", 10, 14.99f);
    p.addItem("Sabonete", 20, 2.99f);
    p.addItem("Detergente", 5, 3.50f);
    
    p.mostrar();
    
    // Note que Item NÃO é acessível aqui!
    // Pedido.Item i = new Pedido.Item(); // ERRO! É privada
}
```

**Saída:**
```
Pedido 100 - 24/10/2025
Itens:
Sabão em pó - Qtd: 10 - R$14.99 - Subtotal: R$149.9
Sabonete - Qtd: 20 - R$2.99 - Subtotal: R$59.8
Detergente - Qtd: 5 - R$3.5 - Subtotal: R$17.5
```

### Quando Usar Classes Internas?

**Use quando:**
- ✓ Uma classe só faz sentido no contexto de outra
- ✓ Quer implementar detalhes internos que não devem ser públicos
- ✓ Precisa de acesso privilegiado a membros privados da classe externa
- ✓ Quer organizar código relacionado junto

**Exemplos do mundo real:**
- 🛒 `Pedido` → `Item` (item só existe em um pedido)
- 🏠 `Casa` → `Comodo` (cômodo só existe em uma casa)
- 🎓 `Universidade` → `Departamento` (departamento só existe em uma universidade)
- 📄 `Documento` → `Paragrafo` (parágrafo só existe em um documento)

### Classe Interna Estática

```java
public class Calculadora {
    // Classe interna estática (não precisa de instância da externa)
    public static class Operacao {
        public static double somar(double a, double b) {
            return a + b;
        }
        
        public static double subtrair(double a, double b) {
            return a - b;
        }
    }
}

// Uso sem instanciar Calculadora
double resultado = Calculadora.Operacao.somar(10, 5);
```

---

## Boas Práticas com Interfaces

### 1. Mantenha Interfaces Pequenas (Interface Segregation Principle)

```java
// ✅ BOM: Interface focada
public interface Motor {
    void ligar();
    void desligar();
}

// ✅ BOM: Interface focada
public interface Acelerable {
    void acelerar();
    void frear();
}

// ❌ RUIM: Interface com muitos métodos não relacionados (God Interface)
public interface VeiculoCompleto {
    void ligar();
    void desligar();
    void abrirPorta();
    void fecharPorta();
    void tocarBuzina();
    void ajustarRetrovisor();
    void ligarLimpador();
    void desligarLimpador();
    // ... muitos outros métodos não relacionados
}
```

**Princípio**: Clientes não devem ser forçados a depender de métodos que não usam.

### 2. Use Nomes Descritivos

**Convenções de nomenclatura:**

- **Interfaces de capacidade**: Sufixo `-avel` ou `-able`
  ```java
  public interface Comparavel { }
  public interface Serializavel { }
  public interface Executavel { }
  ```

- **Interfaces de contrato**: Nome do serviço
  ```java
  public interface Motor { }
  public interface ProcessadorPagamento { }
  public interface RepositorioUsuario { }
  ```

- **Interfaces de callback**: Sufixo `-Listener` ou `-Handler`
  ```java
  public interface ClickListener { }
  public interface EventHandler { }
  ```

### 3. Cuidado ao Modificar Interfaces Existentes

**IMPORTANTE**: Ao adicionar um novo método em uma interface, você deve implementá-lo em **todas** as classes que usam essa interface!

```java
// Se você adiciona um método aqui:
public interface Motor {
    void ligar();
    void desligar();
    void diagnosticar();  // ⚠️ NOVO método
}

// Todas essas classes precisam ser atualizadas:
// - Moto         → deve implementar diagnosticar()
// - Aviao        → deve implementar diagnosticar()
// - Automovel    → deve implementar diagnosticar()
// - Caminhao     → deve implementar diagnosticar()
```

**Solução (Java 8+)**: Use `default methods`:
```java
public interface Motor {
    void ligar();
    void desligar();
    
    // Método com implementação padrão
    default void diagnosticar() {
        System.out.println("Diagnóstico padrão");
    }
}
```

### 4. Programe para Interface, Não para Implementação

```java
// ✅ BOM: Usa a interface
Motor m = new Moto();
m.ligar();

// ❌ EVITE (quando possível): Usa a classe concreta
Moto m = new Moto();
m.ligar();
```

**Por quê?**
- Facilita trocar implementações depois
- Torna código mais flexível e testável
- Reduz acoplamento

### 5. Use Interfaces para Injeção de Dependências

```java
// ✅ BOM: Depende de interface
public class ServicoEmail {
    private final Repositorio repositorio;  // Interface
    
    public ServicoEmail(Repositorio repositorio) {
        this.repositorio = repositorio;
    }
}

// ❌ EVITE: Depende de implementação concreta
public class ServicoEmail {
    private final RepositorioMySQL repositorio;  // Classe concreta
    
    public ServicoEmail() {
        this.repositorio = new RepositorioMySQL();  // Acoplado!
    }
}
```

### 6. Documente o Contrato da Interface

```java
/**
 * Interface que define operações básicas de um motor.
 * 
 * Implementações desta interface devem garantir que:
 * - ligar() só funciona se o motor estiver desligado
 * - desligar() só funciona se o motor estiver ligado
 * - acelerar() só funciona se o motor estiver ligado
 */
public interface Motor {
    /**
     * Liga o motor.
     * @throws IllegalStateException se o motor já estiver ligado
     */
    void ligar();
    
    /**
     * Desliga o motor.
     * @throws IllegalStateException se o motor já estiver desligado
     */
    void desligar();
    
    /**
     * Acelera o motor.
     * @throws IllegalStateException se o motor estiver desligado
     */
    void acelerar();
}
```

### 7. Prefira Composição a Herança (também com Interfaces)

```java
// ✅ BOM: Composição com interfaces
public class Carro {
    private Motor motor;
    private Sistema som;
    private SistemaNavegacao gps;
    
    public Carro(Motor motor, SistemaAudio som, SistemaNavegacao gps) {
        this.motor = motor;
        this.som = som;
        this.gps = gps;
    }
}

// Flexível: pode trocar qualquer componente
```

### 8. Evite Interfaces Marcadoras Vazias

```java
// ❌ EVITE (era comum no passado)
public interface Serializavel {
    // Vazia - apenas marca a classe
}

// ✅ MELHOR (Java moderno): Use anotações
@Serializable
public class Produto {
    // ...
}
```

---

# PARTE V: EXEMPLOS E REFERÊNCIAS

## Exemplos Práticos Completos

### 1. Sistema de Gerenciamento de Biblioteca

```java
import java.io.*;
import java.util.*;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    
    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    
    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado: " + livro.getTitulo());
    }
    
    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado: " + usuario.getNome());
    }
    
    public boolean emprestarLivro(String isbn, String idUsuario) {
        Livro livro = buscarLivroPorISBN(isbn);
        Usuario usuario = buscarUsuarioPorId(idUsuario);
        
        if (livro != null && usuario != null && livro.isDisponivel()) {
            livro.setDisponivel(false);
            usuario.adicionarLivro(livro);
            return true;
        }
        
        return false;
    }
    
    public boolean devolverLivro(String isbn, String idUsuario) {
        Livro livro = buscarLivroPorISBN(isbn);
        Usuario usuario = buscarUsuarioPorId(idUsuario);
        
        if (livro != null && usuario != null) {
            livro.setDisponivel(true);
            usuario.removerLivro(livro);
            return true;
        }
        
        return false;
    }
    
    private Livro buscarLivroPorISBN(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }
    
    private Usuario buscarUsuarioPorId(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }
}

class Livro implements Serializable {
    private String isbn;
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;
    
    public Livro(String isbn, String titulo, String autor, int ano) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true;
    }
    
    // Getters e Setters
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAno() { return ano; }
    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }
    
    @Override
    public String toString() {
        return String.format("Livro[isbn=%s, titulo=%s, autor=%s, ano=%d, disponivel=%s]",
                            isbn, titulo, autor, ano, disponivel ? "Sim" : "Não");
    }
}

class Usuario implements Serializable {
    private String id;
    private String nome;
    private List<Livro> livrosEmprestados;
    
    public Usuario(String id, String nome) {
        this.id = id;
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }
    
    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }
    
    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }
    
    // Getters
    public String getId() { return id; }
    public String getNome() { return nome; }
    public List<Livro> getLivrosEmprestados() { return livrosEmprestados; }
    
    @Override
    public String toString() {
        return String.format("Usuario[id=%s, nome=%s, livros=%d]",
                            id, nome, livrosEmprestados.size());
    }
}
```

### 2. Hierarquia de Formas Geométricas

```java
public abstract class FormaGeometrica {
    protected String cor;
    
    public FormaGeometrica(String cor) {
        this.cor = cor;
    }
    
    // Métodos abstratos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    // Método concreto
    public void exibirInfo() {
        System.out.println("Cor: " + cor);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}

public class Circulo extends FormaGeometrica {
    private double raio;
    
    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    @Override
    public String toString() {
        return String.format("Círculo[cor=%s, raio=%.2f]", cor, raio);
    }
}

public class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;
    
    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return largura * altura;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
    
    @Override
    public String toString() {
        return String.format("Retângulo[cor=%s, largura=%.2f, altura=%.2f]", 
                            cor, largura, altura);
    }
}

// Demonstração de polimorfismo
public class TesteFormas {
    public static void main(String[] args) {
        FormaGeometrica[] formas = {
            new Circulo("Vermelho", 5.0),
            new Retangulo("Azul", 4.0, 6.0),
            new Circulo("Verde", 3.0)
        };
        
        for (FormaGeometrica forma : formas) {
            System.out.println("\n" + forma);
            forma.exibirInfo();
        }
    }
}
```

---

## Boas Práticas

### Nomenclatura e Convenções

```java
// ✅ Boas práticas
public class CalculadoraFinanceira {  // PascalCase para classes
    private static final double TAXA_JUROS_PADRAO = 0.05;  // MAIÚSCULO para constantes
    
    /**
     * Calcula juros compostos
     * @param capitalInicial valor inicial do investimento
     * @param taxaAnual taxa de juros anual
     * @param periodoAnos período em anos
     * @return valor final com juros
     */
    public static double calcularJurosCompostos(double capitalInicial, 
                                               double taxaAnual, 
                                               int periodoAnos) {  // camelCase para métodos
        return capitalInicial * Math.pow(1 + taxaAnual, periodoAnos);
    }
}
```

### Organização de Classes

```java
// ✅ Classe bem estruturada
public class Pessoa {
    // 1. Constantes
    private static final int IDADE_MAXIMA = 120;
    
    // 2. Atributos
    private String nome;
    private int idade;
    private String email;
    
    // 3. Construtores
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);  // Usar setter para validação
    }
    
    // 4. Métodos públicos
    public void setIdade(int idade) {
        if (idade < 0 || idade > IDADE_MAXIMA) {
            throw new IllegalArgumentException("Idade inválida: " + idade);
        }
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }
    
    // 5. Métodos privados (auxiliares)
    private boolean isIdadeValida(int idade) {
        return idade >= 0 && idade <= IDADE_MAXIMA;
    }
    
    // 6. toString, equals, hashCode
    @Override
    public String toString() {
        return String.format("Pessoa{nome='%s', idade=%d}", nome, idade);
    }
}
```

### Tratamento de Erros Robusto

```java
public class ValidadorDados {
    /**
     * Valida CPF
     * @param cpf o CPF a ser validado
     * @return true se válido, false caso contrário
     */
    public static boolean validarCPF(String cpf) {
        // Validação de entrada
        if (cpf == null || cpf.trim().isEmpty()) {
            return false;
        }
        
        // Remover caracteres não numéricos
        String somenteNumeros = cpf.replaceAll("[^0-9]", "");
        
        // Verificar tamanho
        if (somenteNumeros.length() != 11) {
            return false;
        }
        
        // Verificar se todos os dígitos são iguais
        if (somenteNumeros.matches("(\\d)\\1{10}")) {
            return false;
        }
        
        return true;  // Simplificado - validação completa requer cálculo dos dígitos
    }
    
    /**
     * Valida email
     * @param email o email a ser validado
     * @return true se válido, false caso contrário
     */
    public static boolean validarEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        
        return email.contains("@") && 
               email.contains(".") &&
               email.indexOf("@") < email.lastIndexOf(".");
    }
}
```

### Performance e Otimização

```java
public class OtimizacaoBestPractices {
    
    // ✅ Use StringBuilder para múltiplas concatenações
    public static String criarRelatorio(String[] dados) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== RELATÓRIO ===\n");
        
        for (String item : dados) {
            sb.append("- ").append(item).append("\n");
        }
        
        return sb.toString();
    }
    
    // ✅ Cache valores calculados
    private static final Map<Integer, Long> cacheFactorial = new HashMap<>();
    
    public static long calcularFactorial(int n) {
        if (cacheFactorial.containsKey(n)) {
            return cacheFactorial.get(n);
        }
        
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        
        cacheFactorial.put(n, resultado);
        return resultado;
    }
}
```

---

## Glossário

| Termo | Significado |
|-------|-------------|
| **Classe** | Modelo/blueprint para criar objetos |
| **Objeto** | Instância concreta de uma classe |
| **Instanciação** | Processo de criar um objeto a partir de uma classe |
| **Atributo** | Característica/propriedade do objeto (estado) |
| **Método** | Ação/comportamento do objeto |
| **Encapsulamento** | Proteção de dados internos |
| **Getter** | Método que retorna valor de atributo |
| **Setter** | Método que define valor de atributo |
| **Construtor** | Método especial para inicializar objetos |
| **this** | Referência ao objeto atual |
| **static** | Pertence à classe, não ao objeto |
| **final** | Valor constante, não pode ser alterado |
| **Composição** | Relacionamento forte "todo-parte" (◆) |
| **Agregação** | Relacionamento fraco "todo-parte" (◇) |
| **Injeção de Dependências** | Padrão de receber objetos de fora (agregação) |
| **Serialização** | Conversão de objeto em bytes |
| **Thread** | Processo de execução paralela |
| **synchronized** | Controle de acesso concorrente |
| **Override** | Sobrescrever método da superclasse |
| **Sobrecarga** | Múltiplos métodos com mesmo nome |
| **Herança** | Classe que estende outra classe |
| **Polimorfismo** | Múltiplas formas para mesma ação |
| **Classe Abstrata** | Classe que não pode ser instanciada |
| **Interface** | Contrato que define métodos obrigatórios |
| **Provider** | Classe que implementa e fornece funcionalidades |
| **Consumer** | Classe que usa e consome funcionalidades |
| **Classe Interna** | Classe definida dentro de outra classe |
| **super** | Referência à superclasse |
| **protected** | Modificador de acesso para herança |
| **implements** | Palavra-chave para implementar interface |
| **extends** | Palavra-chave para herdar de classe |

---

## Quadro Comparativo de Conceitos

### Composição vs Agregação

| Critério | Composição ◆ | Agregação ◇ |
|----------|--------------|-------------|
| **Símbolo UML** | ◆ Losango preto | ◇ Losango branco |
| **Relacionamento** | Forte ("todo-parte") | Fraco ("todo-parte") |
| **Criação** | Objetos criados juntos | Objetos criados separadamente |
| **Responsabilidade** | Classe cria os objetos | Recebe objetos prontos |
| **Ciclo de vida** | Dependente (morrem juntos) | Independente |
| **Compartilhamento** | Exclusivos | Podem ser compartilhados |
| **Acoplamento** | Forte (tight coupling) | Fraco (loose coupling) |
| **Exemplo** | Casa → Cômodos | Funcionário → Cargo |
| **Frase-chave** | "Nasce junto, morre junto" | "Cada um na sua" |

### Interface vs Classe Abstrata

| Critério | Interface | Classe Abstrata |
|----------|-----------|-----------------|
| **Métodos** | Só abstratos (Java < 8) | Abstratos e concretos |
| **Atributos** | Só constantes (final) | Qualquer tipo |
| **Estado** | Não tem | Pode ter |
| **Construtores** | Não pode ter | Pode ter |
| **Herança** | Múltipla (implements) | Simples (extends) |
| **Implementação** | Nenhuma | Parcial permitida |
| **Uso** | Contrato de comportamento | Classe base com código |
| **Flexibilidade** | Menos recursos | Mais recursos |
| **Quando usar** | Definir capacidade | Compartilhar código |
| **Exemplo** | `Comparable`, `Motor` | `Animal`, `Veiculo` |

### Static vs Não-Static

| Critério | Static | Não-Static |
|----------|--------|------------|
| **Pertence a** | Classe | Objeto (instância) |
| **Quantidade** | Uma cópia única | Uma cópia por objeto |
| **Acesso** | `Classe.membro` | `objeto.membro` |
| **Pode acessar** | Apenas membros static | Todos os membros |
| **Memória** | Criado ao carregar classe | Criado ao instanciar |
| **Compartilhamento** | Compartilhado entre todos | Exclusivo do objeto |
| **Uso comum** | Constantes, utilitários | Estado e comportamento |
| **Exemplo** | `Math.PI`, `Arrays.sort()` | `pessoa.nome`, `carro.acelerar()` |

### Encapsulamento: Público vs Privado

| Critério | public | private |
|----------|--------|---------|
| **Visibilidade** | Irrestrita (todos) | Apenas dentro da classe |
| **Acesso externo** | ✅ Permitido | ❌ Bloqueado |
| **Proteção** | Nenhuma | Máxima |
| **Alteração** | Pode ser acessado diretamente | Só via getters/setters |
| **Uso comum** | Métodos de interface | Atributos e métodos auxiliares |
| **Segurança** | Baixa | Alta |
| **Exemplo** | `public void depositar()` | `private double saldo` |

### Herança vs Composição

| Critério | Herança (is-a) | Composição (has-a) |
|----------|----------------|-------------------|
| **Relacionamento** | "É um" | "Tem um" |
| **Acoplamento** | Forte | Fraco |
| **Flexibilidade** | Menos flexível | Mais flexível |
| **Mudanças** | Afeta subclasses | Localizada |
| **Reutilização** | Via herança | Via objeto |
| **Múltipla** | Não (Java) | Sim |
| **Quando usar** | Relacionamento natural | Adicionar funcionalidades |
| **Exemplo** | `Cachorro extends Animal` | `Carro has Motor` |

### Override vs Overload (Sobrescrita vs Sobrecarga)

| Critério | Override | Overload |
|----------|----------|----------|
| **Definição** | Redefinir método herdado | Múltiplos métodos mesmo nome |
| **Classe** | Subclasse | Mesma classe |
| **Assinatura** | Mesma | Diferente |
| **Parâmetros** | Mesmos | Diferentes |
| **Retorno** | Mesmo tipo (ou covariante) | Pode ser diferente |
| **Polimorfismo** | Sim (runtime) | Não (compile time) |
| **Anotação** | `@Override` | Nenhuma |
| **Exemplo** | `@Override void comer()` | `void somar(int a)` e `void somar(double a)` |

### Modificadores de Acesso

| Modificador | Classe | Pacote | Subclasse | Todos |
|-------------|--------|--------|-----------|-------|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `default` | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

### Tipos de Relacionamentos UML

| Relacionamento | Símbolo | Significado | Exemplo |
|----------------|---------|-------------|---------|
| **Herança** | ─▷ | "É um" (is-a) | Cachorro ─▷ Animal |
| **Implementação** | ┈▷ | "Realiza" | Pessoa ┈▷ Fisio |
| **Composição** | ◆── | "Tem um" (forte) | Casa ◆── Quarto |
| **Agregação** | ◇── | "Tem um" (fraco) | Funcionário ◇── Cargo |
| **Associação** | ──── | "Usa" | Professor ──── Disciplina |
| **Dependência** | ┈> | "Depende de" | Pedido ┈> PagamentoService |

### Palavras-Chave Importantes

| Palavra-chave | Uso | Exemplo |
|---------------|-----|---------|
| `new` | Instanciar objetos | `new Pessoa()` |
| `this` | Referência ao objeto atual | `this.nome = nome` |
| `super` | Referência à superclasse | `super.metodo()` |
| `extends` | Herança de classe | `class Gato extends Animal` |
| `implements` | Implementar interface | `class Pessoa implements Fisio` |
| `abstract` | Classe/método abstrato | `abstract class Animal` |
| `interface` | Declarar interface | `interface Motor` |
| `final` | Constante ou classe final | `final double PI = 3.14` |
| `static` | Membro da classe | `static int contador` |
| `@Override` | Sobrescrita de método | `@Override public void comer()` |

---

## Dicas Rápidas de Memorização

### Para Composição vs Agregação

**COMPOSIÇÃO** ◆:
- 🏠 **Casa e Cômodos**: "Se a casa cai, os cômodos caem junto"
- 🔒 **Cria dentro** do construtor
- 💀 **Morrem juntos**
- 🔒 **Exclusivos**

**AGREGAÇÃO** ◇:
- 👨‍💼 **Professor e Disciplina**: "Professor pode trocar de disciplina"
- 💉 **Injeta de fora**
- ♻️ **Vivem independentes**
- 🔄 **Compartilháveis**

### Para Interface vs Classe Abstrata

**INTERFACE**:
- 📋 Apenas **CONTRATO** (o que fazer)
- 🚫 Sem **ESTADO** (atributos)
- ✌️ **MÚLTIPLA** implementação

**CLASSE ABSTRATA**:
- 🏗️ **BASE** com código
- 📦 Com **ESTADO** (atributos)
- ☝️ **SIMPLES** herança

### Para Polimorfismo

**Lembre-se**: "Muitas formas, uma chamada"

```java
Animal a = new Gato();  // Polimorfismo
a.emitirSom();          // "Miau" (comportamento do Gato)

a = new Cachorro();     // Troca de forma
a.emitirSom();          // "Au au" (comportamento do Cachorro)
```

---

## Recursos Adicionais

### Documentação Oficial
- **Oracle Java Tutorials**: https://docs.oracle.com/javase/tutorial/
- **Java API Docs**: https://docs.oracle.com/en/java/javase/

### Ferramentas
- **IDE**: IntelliJ IDEA, Eclipse, VS Code
- **Build**: Maven, Gradle
- **Testes**: JUnit

### Práticas
- **Exercism**: Exercícios práticos de Java
- **HackerRank**: Desafios de programação
- **LeetCode**: Problemas algorítmicos

**Documentação compilada e unificada**
*Contém conceitos fundamentais, POO, herança e polimorfismo*