# Documentação Java - Conceitos Fundamentais

## Índice
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
16. [Exemplos Práticos Completos](#exemplos-práticos-completos)
17. [Boas Práticas](#boas-práticas)

---

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

### Exemplo Prático - Validação de Entrada
```java
public class ValidadorEntrada {
    /**
     * Lê um inteiro com validação e retry automático
     * @param mensagem mensagem para o usuário
     * @param min valor mínimo aceito
     * @param max valor máximo aceito
     * @return número válido ou -1 se usuário cancelar
     */
    public static int lerInteiro(String mensagem, int min, int max) {
        while (true) {
            try {
                String entrada = JOptionPane.showInputDialog(
                    mensagem + " (" + min + " a " + max + "):");
                
                if (entrada == null) return -1;  // Cancelou
                
                int numero = Integer.parseInt(entrada.trim());
                
                if (numero >= min && numero <= max) {
                    return numero;
                } else {
                    JOptionPane.showMessageDialog(null, 
                        "Número deve estar entre " + min + " e " + max);
                }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros");
            }
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

### Aplicações Práticas

#### Gerador de Senhas
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

#### Sorteio de Elementos
```java
public class Sorteador {
    public static <T> T sortear(T[] elementos) {
        Random random = new Random();
        int indiceAleatorio = random.nextInt(elementos.length);
        return elementos[indiceAleatorio];
    }
    
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo"};
        String sorteado = sortear(nomes);
        System.out.println("Pessoa sorteada: " + sorteado);
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

### Validação e Formatação
```java
public class ValidadorTexto {
    public static boolean isEmailValido(String email) {
        return email != null && 
               email.contains("@") && 
               email.contains(".") &&
               email.indexOf("@") < email.lastIndexOf(".");
    }
    
    public static boolean isCPFValido(String cpf) {
        if (cpf == null) return false;
        
        // Remover pontuação
        String somenteNumeros = cpf.replaceAll("[^0-9]", "");
        
        return somenteNumeros.length() == 11;
    }
    
    public static String formatarCPF(String cpf) {
        String numeros = cpf.replaceAll("[^0-9]", "");
        if (numeros.length() != 11) return cpf;
        
        return numeros.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", 
                                  "$1.$2.$3-$4");
    }
}
```

---

## Tratamento de Exceções

### Tipos de Exceções

**Exceções Checked (Verificadas):**
- Verificadas em tempo de compilação
- **Devem** ser tratadas obrigatoriamente com try-catch ou throws
- Exemplo: `IOException`, `FileNotFoundException`, `SQLException`

**Exceções Unchecked (Não verificadas):**
- Verificadas em tempo de execução  
- **Podem** ser tratadas opcionalmente
- Exemplo: `RuntimeException`, `NumberFormatException`, `NullPointerException`

### Estrutura Try-Catch-Finally
```java
try {
    // Código que pode gerar exceção
    String entrada = JOptionPane.showInputDialog("Digite sua idade:");
    int idade = Integer.parseInt(entrada);
    System.out.println("Idade: " + idade);
    
} catch (NumberFormatException e) {
    // Tratamento específico para erro de conversão
    System.out.println("Erro: Digite apenas números inteiros!");
    System.out.println("Detalhes: " + e.getMessage());
    
} catch (Exception e) {
    // Captura qualquer outra exceção
    System.out.println("Erro inesperado: " + e.getMessage());
    
} finally {
    // SEMPRE executa - usado para limpeza de recursos
    System.out.println("Bloco finally executado.");
}
```

### Múltiplas Exceções Específicas
```java
try {
    String entrada = JOptionPane.showInputDialog("Digite um número:");
    int numero = Integer.parseInt(entrada);     // NumberFormatException
    int resultado = 100 / numero;               // ArithmeticException
    
    System.out.println("Resultado: " + resultado);
    
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Digite apenas números válidos!");
    
} catch (ArithmeticException e) {
    JOptionPane.showMessageDialog(null, "Divisão por zero não permitida!");
    
} catch (NullPointerException e) {
    JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário.");
}
```

### Try-Catch em Loops com Validação
```java
public static int lerIdadeComValidacao() {
    while (true) {
        try {
            String entrada = JOptionPane.showInputDialog("Digite sua idade (0-120):");
            
            // Verificar se usuário cancelou
            if (entrada == null) {
                return -1;  // Código especial para cancelamento
            }
            
            int idade = Integer.parseInt(entrada.trim());
            
            // Validação de negócio
            if (idade < 0 || idade > 120) {
                JOptionPane.showMessageDialog(null, "Idade deve estar entre 0 e 120 anos");
                continue;  // Volta ao início do loop
            }
            
            return idade;  // Idade válida
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números inteiros!");
            // Loop continua automaticamente
        }
    }
}
```

### Tratamento de Arquivos
```java
import java.io.*;

public static boolean salvarTexto(String conteudo, String nomeArquivo) {
    PrintWriter arquivo = null;
    
    try {
        arquivo = new PrintWriter(new FileWriter(nomeArquivo));
        arquivo.println(conteudo);
        return true;  // Sucesso
        
    } catch (IOException e) {
        System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        return false;  // Falha
        
    } finally {
        // SEMPRE fechar arquivo para liberar recursos
        if (arquivo != null) {
            arquivo.close();
        }
    }
}
```

### Lançando Exceções Personalizadas
```java
public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

public static void validarIdade(int idade) throws IdadeInvalidaException {
    if (idade < 0 || idade > 120) {
        throw new IdadeInvalidaException("Idade deve estar entre 0 e 120 anos. Recebido: " + idade);
    }
}

// Uso
public static void main(String[] args) {
    try {
        validarIdade(150);
    } catch (IdadeInvalidaException e) {
        System.out.println("Erro de validação: " + e.getMessage());
    }
}
```

### Try-with-resources (Java 7+)
```java
// Fechamento automático de recursos
public static void lerArquivo(String nomeArquivo) {
    try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
        String linha;
        while ((linha = reader.readLine()) != null) {
            System.out.println(linha);
        }
        // reader.close() é chamado automaticamente
        
    } catch (IOException e) {
        System.out.println("Erro ao ler arquivo: " + e.getMessage());
    }
}
```

---

## Interface Gráfica (Swing)

### Componentes Básicos com JOptionPane
```java
import javax.swing.JOptionPane;

// Mensagem simples
JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema!");

// Entrada de dados
String nome = JOptionPane.showInputDialog("Digite seu nome:");

// Confirmação
int opcao = JOptionPane.showConfirmDialog(null, 
    "Deseja salvar as alterações?", 
    "Confirmação", 
    JOptionPane.YES_NO_OPTION);

if (opcao == JOptionPane.YES_OPTION) {
    JOptionPane.showMessageDialog(null, "Dados salvos!");
}

// Seleção de opções
String[] opcoes = {"Cadastrar", "Consultar", "Excluir", "Sair"};
int escolha = JOptionPane.showOptionDialog(null,
    "Escolha uma opção:",
    "Menu Principal",
    JOptionPane.DEFAULT_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    opcoes,
    opcoes[0]);
```

### Janela Completa com Swing
```java
import javax.swing.*;
import java.awt.event.*;

public class CalculadoraGUI extends JFrame {
    private JTextField tfNumero1, tfNumero2, tfResultado;
    private JButton btSomar, btSubtrair, btMultiplicar, btDividir, btLimpar;
    
    public CalculadoraGUI() {
        configurarJanela();
        criarComponentes();
        configurarEventos();
    }
    
    private void configurarJanela() {
        setTitle("Calculadora Java");
        setBounds(100, 100, 400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
    }
    
    private void criarComponentes() {
        // Labels
        JLabel lblNum1 = new JLabel("Primeiro número:");
        lblNum1.setBounds(20, 20, 120, 25);
        add(lblNum1);
        
        JLabel lblNum2 = new JLabel("Segundo número:");
        lblNum2.setBounds(20, 60, 120, 25);
        add(lblNum2);
        
        JLabel lblResult = new JLabel("Resultado:");
        lblResult.setBounds(20, 200, 120, 25);
        add(lblResult);
        
        // TextFields
        tfNumero1 = new JTextField();
        tfNumero1.setBounds(150, 20, 200, 25);
        add(tfNumero1);
        
        tfNumero2 = new JTextField();
        tfNumero2.setBounds(150, 60, 200, 25);
        add(tfNumero2);
        
        tfResultado = new JTextField();
        tfResultado.setBounds(150, 200, 200, 25);
        tfResultado.setEditable(false);
        add(tfResultado);
        
        // Botões
        btSomar = new JButton("+");
        btSomar.setBounds(50, 110, 60, 30);
        add(btSomar);
        
        btSubtrair = new JButton("-");
        btSubtrair.setBounds(120, 110, 60, 30);
        add(btSubtrair);
        
        btMultiplicar = new JButton("*");
        btMultiplicar.setBounds(190, 110, 60, 30);
        add(btMultiplicar);
        
        btDividir = new JButton("/");
        btDividir.setBounds(260, 110, 60, 30);
        add(btDividir);
        
        btLimpar = new JButton("Limpar");
        btLimpar.setBounds(150, 160, 100, 30);
        add(btLimpar);
    }
    
    private void configurarEventos() {
        btSomar.addActionListener(e -> calcular("+"));
        btSubtrair.addActionListener(e -> calcular("-"));
        btMultiplicar.addActionListener(e -> calcular("*"));
        btDividir.addActionListener(e -> calcular("/"));
        btLimpar.addActionListener(e -> limpar());
    }
    
    private void calcular(String operacao) {
        try {
            double num1 = Double.parseDouble(tfNumero1.getText().trim());
            double num2 = Double.parseDouble(tfNumero2.getText().trim());
            double resultado = 0;
            
            switch (operacao) {
                case "+" -> resultado = num1 + num2;
                case "-" -> resultado = num1 - num2;
                case "*" -> resultado = num1 * num2;
                case "/" -> {
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(this, "Divisão por zero!");
                        return;
                    }
                    resultado = num1 / num2;
                }
            }
            
            tfResultado.setText(String.valueOf(resultado));
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite apenas números válidos!");
        }
    }
    
    private void limpar() {
        tfNumero1.setText("");
        tfNumero2.setText("");
        tfResultado.setText("");
        tfNumero1.requestFocus();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraGUI().setVisible(true);
        });
    }
}
```

---

## Exemplos Práticos Completos

### 1. Sistema de Validação de Mês
```java
public class ValidadorMes {
    public static final int MES_MINIMO = 1;
    public static final int MES_MAXIMO = 12;
    
    /**
     * Valida se um número representa um mês válido
     * @param mes o número do mês
     * @return true se válido, false caso contrário
     */
    public static boolean isValido(int mes) {
        return mes >= MES_MINIMO && mes <= MES_MAXIMO;
    }
    
    /**
     * Converte número do mês para nome por extenso
     * @param mes o número do mês (1-12)
     * @return nome do mês ou "Inválido"
     */
    public static String getNomeExtenso(int mes) {
        if (!isValido(mes)) return "Mês inválido";
        
        String[] meses = {"", "Janeiro", "Fevereiro", "Março", "Abril", 
                         "Maio", "Junho", "Julho", "Agosto", "Setembro", 
                         "Outubro", "Novembro", "Dezembro"};
        return meses[mes];
    }
    
    /**
     * Determina a estação do ano baseada no mês
     * @param mes número do mês
     * @return nome da estação
     */
    public static String getEstacao(int mes) {
        if (!isValido(mes)) return "Mês inválido";
        
        return switch (mes) {
            case 12, 1, 2 -> "Verão";
            case 3, 4, 5 -> "Outono";
            case 6, 7, 8 -> "Inverno";
            case 9, 10, 11 -> "Primavera";
            default -> "Desconhecida";
        };
    }
    
    public static void main(String[] args) {
        while (true) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite o mês (1-12) ou 0 para sair:");
                if (entrada == null || entrada.trim().equals("0")) break;
                
                int mes = Integer.parseInt(entrada.trim());
                
                if (isValido(mes)) {
                    String info = String.format(
                        "Mês %d: %s\nEstação: %s", 
                        mes, getNomeExtenso(mes), getEstacao(mes)
                    );
                    JOptionPane.showMessageDialog(null, info);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Mês deve ser entre 1 e 12");
                }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números");
            }
        }
    }
}
```

### 2. Analisador de RA (Registro Acadêmico)
```java
public class AnalisadorRA {
    /**
     * Extrai informações completas do RA
     * @param ra o registro acadêmico
     * @return objeto com informações do RA ou null se inválido
     */
    public static InfoRA analisar(String ra) {
        if (ra == null || ra.length() != 13) {
            return null;
        }
        
        try {
            // Validar se contém apenas números
            Long.parseLong(ra);
            
            String unidade = ra.substring(0, 3);
            String curso = ra.substring(3, 6);
            String ano = "20" + ra.substring(6, 8);
            String semestre = ra.substring(8, 9).equals("1") ? 
                             "1º semestre" : "2º semestre";
            String sequencial = ra.substring(9);
            
            return new InfoRA(ra, unidade, curso, ano, semestre, sequencial);
            
        } catch (NumberFormatException e) {
            return null;
        }
    }
    
    public static void main(String[] args) {
        String ra = JOptionPane.showInputDialog("Digite o RA (13 dígitos):");
        
        if (ra != null) {
            InfoRA info = analisar(ra.trim());
            
            if (info != null) {
                JOptionPane.showMessageDialog(null, info.toString());
            } else {
                JOptionPane.showMessageDialog(null, "RA inválido! Deve ter 13 dígitos numéricos.");
            }
        }
    }
}

class InfoRA {
    private String ra, unidade, curso, ano, semestre, sequencial;
    
    public InfoRA(String ra, String unidade, String curso, String ano, String semestre, String sequencial) {
        this.ra = ra;
        this.unidade = unidade;
        this.curso = curso;
        this.ano = ano;
        this.semestre = semestre;
        this.sequencial = sequencial;
    }
    
    @Override
    public String toString() {
        return String.format(
            "=== ANÁLISE DO RA ===\n" +
            "RA: %s\n" +
            "Unidade: %s\n" +
            "Curso: %s\n" +
            "Ano: %s\n" +
            "Semestre: %s\n" +
            "Sequencial: %s",
            ra, unidade, curso, ano, semestre, sequencial
        );
    }
}
```

### 3. Gerador de Senhas Avançado
```java
public class GeradorSenhas {
    private static final String NUMEROS = "0123456789";
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String SIMBOLOS = "!@#$%^&*()_+-=[]{}|;:,.<>?";
    
    public enum TipoSenha {
        NUMERICA(NUMEROS),
        SIMPLES(NUMEROS + MINUSCULAS),
        COMPLETA(NUMEROS + MINUSCULAS + MAIUSCULAS),
        COMPLEXA(NUMEROS + MINUSCULAS + MAIUSCULAS + SIMBOLOS);
        
        private final String caracteres;
        
        TipoSenha(String caracteres) {
            this.caracteres = caracteres;
        }
        
        public String getCaracteres() {
            return caracteres;
        }
    }
    
    /**
     * Gera senha do tipo especificado
     * @param tipo tipo da senha
     * @param tamanho tamanho desejado
     * @return senha gerada
     */
    public static String gerar(TipoSenha tipo, int tamanho) {
        if (tamanho <= 0) return "";
        
        StringBuilder senha = new StringBuilder();
        String pool = tipo.getCaracteres();
        
        for (int i = 0; i < tamanho; i++) {
            int indice = (int)(Math.random() * pool.length());
            senha.append(pool.charAt(indice));
        }
        
        return senha.toString();
    }
    
    /**
     * Avalia a força da senha
     * @param senha a senha a ser avaliada
     * @return força da senha (0-100)
     */
    public static int avaliarForca(String senha) {
        if (senha == null || senha.isEmpty()) return 0;
        
        int pontos = 0;
        
        // Tamanho
        if (senha.length() >= 8) pontos += 25;
        else if (senha.length() >= 6) pontos += 15;
        else if (senha.length() >= 4) pontos += 10;
        
        // Variedade de caracteres
        boolean temMinuscula = false, temMaiuscula = false;
        boolean temNumero = false, temSimbolo = false;
        
        for (char c : senha.toCharArray()) {
            if (Character.isLowerCase(c)) temMinuscula = true;
            else if (Character.isUpperCase(c)) temMaiuscula = true;
            else if (Character.isDigit(c)) temNumero = true;
            else temSimbolo = true;
        }
        
        if (temMinuscula) pontos += 15;
        if (temMaiuscula) pontos += 15;
        if (temNumero) pontos += 15;
        if (temSimbolo) pontos += 30;
        
        return Math.min(100, pontos);
    }
    
    public static String getClassificacao(int forca) {
        if (forca < 30) return "Muito Fraca";
        if (forca < 50) return "Fraca";
        if (forca < 70) return "Média";
        if (forca < 90) return "Forte";
        return "Muito Forte";
    }
}
```

### 4. Sistema de Menu Interativo
```java
public class SistemaMenu {
    public static void main(String[] args) {
        while (true) {
            String[] opcoes = {"Validar Mês", "Analisar RA", "Gerar Senha", "Sair"};
            
            int escolha = JOptionPane.showOptionDialog(null,
                "Escolha uma opção:",
                "Sistema Integrado",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);
            
            switch (escolha) {
                case 0 -> ValidadorMes.main(null);
                case 1 -> AnalisadorRA.main(null);
                case 2 -> menuGeradorSenhas();
                case 3, -1 -> {
                    JOptionPane.showMessageDialog(null, "Sistema encerrado!");
                    System.exit(0);
                }
            }
        }
    }
    
    private static void menuGeradorSenhas() {
        try {
            String[] tipos = {"Numérica", "Simples", "Completa", "Complexa"};
            int tipoEscolhido = JOptionPane.showOptionDialog(null,
                "Escolha o tipo de senha:",
                "Gerador de Senhas",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                tipos,
                tipos[2]);
                
            if (tipoEscolhido == -1) return;
            
            String tamanhoStr = JOptionPane.showInputDialog("Tamanho da senha (4-50):");
            if (tamanhoStr == null) return;
            
            int tamanho = Integer.parseInt(tamanhoStr);
            if (tamanho < 4 || tamanho > 50) {
                JOptionPane.showMessageDialog(null, "Tamanho deve estar entre 4 e 50!");
                return;
            }
            
            GeradorSenhas.TipoSenha[] tiposEnum = GeradorSenhas.TipoSenha.values();
            String senha = GeradorSenhas.gerar(tiposEnum[tipoEscolhido], tamanho);
            
            int forca = GeradorSenhas.avaliarForca(senha);
            String classificacao = GeradorSenhas.getClassificacao(forca);
            
            String resultado = String.format(
                "Senha gerada: %s\n\nForça: %d/100 (%s)",
                senha, forca, classificacao
            );
            
            JOptionPane.showMessageDialog(null, resultado);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido!");
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

// ❌ Evitar
public class calculadora {  // Minúsculo - incorreto
    private static final double taxa = 0.05;  // Constante sem padrão
    
    public static double Calcular_Juros(double c, double t) {  // Inconsistente
        return c * t;  // Nomes não descritivos
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
public class ProcessadorTexto {
    /**
     * Processa arquivo de texto de forma segura
     * @param nomeArquivo nome do arquivo a processar
     * @return resultado do processamento
     */
    public static ResultadoProcessamento processarArquivo(String nomeArquivo) {
        // Validação de entrada
        if (nomeArquivo == null || nomeArquivo.trim().isEmpty()) {
            return ResultadoProcessamento.erro("Nome do arquivo não pode estar vazio");
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            StringBuilder conteudo = new StringBuilder();
            String linha;
            int numeroLinhas = 0;
            
            while ((linha = reader.readLine()) != null) {
                conteudo.append(linha).append("\n");
                numeroLinhas++;
            }
            
            return ResultadoProcessamento.sucesso(conteudo.toString(), numeroLinhas);
            
        } catch (FileNotFoundException e) {
            return ResultadoProcessamento.erro("Arquivo não encontrado: " + nomeArquivo);
            
        } catch (IOException e) {
            return ResultadoProcessamento.erro("Erro ao ler arquivo: " + e.getMessage());
            
        } catch (Exception e) {
            return ResultadoProcessamento.erro("Erro inesperado: " + e.getMessage());
        }
    }
}

class ResultadoProcessamento {
    private final boolean sucesso;
    private final String conteudo;
    private final int numeroLinhas;
    private final String mensagemErro;
    
    private ResultadoProcessamento(boolean sucesso, String conteudo, int numeroLinhas, String mensagemErro) {
        this.sucesso = sucesso;
        this.conteudo = conteudo;
        this.numeroLinhas = numeroLinhas;
        this.mensagemErro = mensagemErro;
    }
    
    public static ResultadoProcessamento sucesso(String conteudo, int numeroLinhas) {
        return new ResultadoProcessamento(true, conteudo, numeroLinhas, null);
    }
    
    public static ResultadoProcessamento erro(String mensagem) {
        return new ResultadoProcessamento(false, null, 0, mensagem);
    }
    
    // Getters...
    public boolean isSucesso() { return sucesso; }
    public String getConteudo() { return conteudo; }
    public String getMensagemErro() { return mensagemErro; }
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
    
    // ✅ Evite criação desnecessária de objetos
    public static boolean isEmailValido(String email) {
        return email != null && 
               email.contains("@") && 
               email.lastIndexOf(".") > email.indexOf("@");
        // Melhor que usar regex para validações simples
    }
}
```

### Documentação Completa
```java
/**
 * Utilitário para cálculos estatísticos básicos
 * 
 * <p>Esta classe fornece métodos estáticos para realizar
 * operações estatísticas comuns em arrays de números.</p>
 * 
 * <p>Exemplo de uso:</p>
 * <pre>
 * double[] numeros = {1.0, 2.0, 3.0, 4.0, 5.0};
 * double media = EstatisticaUtil.calcularMedia(numeros);
 * double desvio = EstatisticaUtil.calcularDesvioPadrao(numeros);
 * </pre>
 * 
 * @author Rafael
 * @version 2.0
 * @since 1.0
 */
public class EstatisticaUtil {
    
    /**
     * Calcula a média aritmética de um conjunto de valores
     * 
     * @param valores array de valores numéricos
     * @return a média aritmética dos valores
     * @throws IllegalArgumentException se o array for null ou vazio
     * @throws ArithmeticException se ocorrer overflow no cálculo
     * 
     * @see #calcularMediana(double[])
     * @see #calcularModa(double[])
     */
    public static double calcularMedia(double[] valores) {
        validarArray(valores);
        
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        
        return soma / valores.length;
    }
    
    /**
     * Valida se o array é válido para cálculos
     * @param array array a ser validado
     * @throws IllegalArgumentException se inválido
     */
    private static void validarArray(double[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array não pode ser null");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Array não pode estar vazio");
        }
    }
}
```

### Testes e Validação
```java
public class TestadorSistema {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO TESTES ===");
        
        testarValidadorMes();
        testarGeradorSenhas();
        testarAnalisadorRA();
        
        System.out.println("=== TESTES CONCLUÍDOS ===");
    }
    
    private static void testarValidadorMes() {
        System.out.println("\n--- Testando ValidadorMes ---");
        
        // Casos válidos
        assert ValidadorMes.isValido(1) : "Mês 1 deveria ser válido";
        assert ValidadorMes.isValido(12) : "Mês 12 deveria ser válido";
        
        // Casos inválidos
        assert !ValidadorMes.isValido(0) : "Mês 0 deveria ser inválido";
        assert !ValidadorMes.isValido(13) : "Mês 13 deveria ser inválido";
        
        // Teste de nomes
        assert "Janeiro".equals(ValidadorMes.getNomeExtenso(1)) : "Nome do mês 1 incorreto";
        
        System.out.println("ValidadorMes: ✅ Todos os testes passaram");
    }
    
    private static void testarGeradorSenhas() {
        System.out.println("\n--- Testando GeradorSenhas ---");
        
        String senha = GeradorSenhas.gerar(GeradorSenhas.TipoSenha.NUMERICA, 8);
        assert senha.length() == 8 : "Tamanho da senha incorreto";
        assert senha.matches("\\d+") : "Senha numérica contém caracteres não numéricos";
        
        int forca = GeradorSenhas.avaliarForca("Abc123!@#");
        assert forca > 50 : "Avaliação de força incorreta";
        
        System.out.println("GeradorSenhas: ✅ Todos os testes passaram");
    }
    
    private static void testarAnalisadorRA() {
        System.out.println("\n--- Testando AnalisadorRA ---");
        
        InfoRA info = AnalisadorRA.analisar("1050482423017");
        assert info != null : "RA válido deveria ser analisado";
        
        InfoRA infoInvalida = AnalisadorRA.analisar("123");
        assert infoInvalida == null : "RA inválido deveria retornar null";
        
        System.out.println("AnalisadorRA: ✅ Todos os testes passaram");
    }
}
```

---

## Resumo e Próximos Passos

### Conceitos Fundamentais Cobertos
1. **✅ Sintaxe Básica**: Classes, métodos, variáveis
2. **✅ Tipos de Dados**: Primitivos e objetos
3. **✅ Estruturas de Controle**: Condicionais e loops
4. **✅ Arrays**: Manipulação de coleções simples
5. **✅ Métodos**: Modularização e reutilização de código
6. **✅ Tratamento de Exceções**: Programação defensiva
7. **✅ Strings**: Manipulação de texto
8. **✅ Interface Gráfica**: Básico do Swing
9. **✅ Boas Práticas**: Código limpo e manutenível

### Checklist de Domínio
- [ ] Consigo criar classes e métodos sem consulta
- [ ] Domino todas as estruturas de repetição e condicionais  
- [ ] Sei tratar exceções adequadamente
- [ ] Entendo a diferença entre tipos primitivos e objetos
- [ ] Consigo manipular strings eficientemente
- [ ] Sei criar interfaces gráficas básicas
- [ ] Aplico boas práticas de nomenclatura e documentação
- [ ] Consigo debugar erros comuns
- [ ] Entendo conceitos de modularização (métodos)
- [ ] Sei quando usar arrays vs outras estruturas

### Próximos Tópicos de Estudo

#### Nível Intermediário
- **Programação Orientada a Objetos**:
  - Encapsulamento, herança, polimorfismo
  - Classes abstratas e interfaces
  - Modificadores de acesso avançados

- **Collections Framework**:
  - ArrayList, LinkedList, HashMap
  - Iteradores e streams
  - Comparators e sorting

#### Nível Avançado
- **Generics**: Tipos parametrizados
- **Threads**: Programação concorrente
- **I/O Streams**: Manipulação avançada de arquivos
- **JDBC**: Conexão com bancos de dados
- **Design Patterns**: Padrões de projeto

#### Ferramentas e Frameworks
- **Maven/Gradle**: Gerenciamento de dependências
- **JUnit**: Testes unitários automatizados
- **Spring Framework**: Desenvolvimento empresarial
- **JavaFX**: Interfaces gráficas modernas

### Dicas de Estudo
1. **Pratique diariamente**: Implemente pequenos projetos
2. **Leia código**: Estude código de projetos open source
3. **Documente tudo**: Mantenha o hábito da documentação
4. **Teste sempre**: Valide suas implementações
5. **Refatore**: Melhore código existente continuamente

**Lembre-se**: A programação é uma habilidade prática. Quanto mais você codificar, melhor será!

---