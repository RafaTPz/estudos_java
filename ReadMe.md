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
18. [Atributos e Métodos](#atributos-e-métodos)
19. [Encapsulamento](#encapsulamento)
20. [Getters e Setters](#getters-e-setters)
21. [Construtores](#construtores)
22. [Métodos Especiais (toString)](#métodos-especiais-tostring)
23. [Static - Atributos e Métodos Estáticos](#static-atributos-e-métodos-estáticos)
24. [Serialização](#serialização)
25. [Threads e Sincronização](#threads-e-sincronização)
26. [Recursividade](#recursividade)

### Parte III: Herança e Polimorfismo
27. [Herança](#herança)
28. [Modificadores de Acesso](#modificadores-de-acesso)
29. [Classes Abstratas](#classes-abstratas)
30. [Polimorfismo](#polimorfismo)
31. [Override (Sobrescrita)](#override-sobrescrita)
32. [Palavra-chave super](#palavra-chave-super)

### Parte IV: Recursos Avançados
33. [Exemplos Práticos Completos](#exemplos-práticos-completos)
34. [Boas Práticas](#boas-práticas)
35. [Glossário](#glossário)

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

# PARTE IV: RECURSOS AVANÇADOS

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
| **Atributo** | Característica/propriedade do objeto (estado) |
| **Método** | Ação/comportamento do objeto |
| **Encapsulamento** | Proteção de dados internos |
| **Getter** | Método que retorna valor de atributo |
| **Setter** | Método que define valor de atributo |
| **Construtor** | Método especial para inicializar objetos |
| **this** | Referência ao objeto atual |
| **static** | Pertence à classe, não ao objeto |
| **final** | Valor constante, não pode ser alterado |
| **Serialização** | Conversão de objeto em bytes |
| **Thread** | Processo de execução paralela |
| **synchronized** | Controle de acesso concorrente |
| **Override** | Sobrescrever método da superclasse |
| **Sobrecarga** | Múltiplos métodos com mesmo nome |
| **Herança** | Classe que estende outra classe |
| **Polimorfismo** | Múltiplas formas para mesma ação |
| **Classe Abstrata** | Classe que não pode ser instanciada |
| **super** | Referência à superclasse |
| **protected** | Modificador de acesso para herança |

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

### Livros Recomendados
- "Effective Java" - Joshua Bloch
- "Clean Code" - Robert C. Martin
- "Head First Java" - Kathy Sierra

---

**Documentação compilada e unificada**
*Contém conceitos fundamentais, POO, herança e polimorfismo*