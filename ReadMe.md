# Documentação Java - Conceitos Fundamentais

## Índice
1. [Introdução](#introdução)
2. [Estrutura Básica](#estrutura-básica)
3. [Tipos de Dados](#tipos-de-dados)
4. [Variáveis e Constantes](#variáveis-e-constantes)
5. [Arrays](#arrays)
6. [Entrada e Saída de Dados](#entrada-e-saída-de-dados)
7. [Estruturas Condicionais](#estruturas-condicionais)
8. [Estruturas de Repetição](#estruturas-de-repetição)
9. [Interface Gráfica (Swing)](#interface-gráfica-swing)
10. [Métodos em Java](#métodos-em-java)
11. [Classe Math](#classe-math)
12. [Classe Random](#classe-random)
13. [Manipulação de Strings](#manipulação-de-strings)
14. [Tratamento de Exceções](#tratamento-de-exceções)
15. [Operadores](#operadores)
16. [Exemplos Práticos Completos](#exemplos-práticos-completos)
17. [Boas Práticas](#boas-práticas)

---

## Introdução

Java é uma linguagem de programação orientada a objetos, multiplataforma e amplamente utilizada no desenvolvimento de aplicações. Este guia apresenta os conceitos fundamentais através de exemplos práticos.

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
```

## Tipos de Dados

### Tipos Primitivos
```java
// Números inteiros
byte idade = 127;           // -128 a 127
int i = 10;                 // -2,147,483,648 a 2,147,483,647

// Números decimais
float myFloat = 5.99f;      // Precisão simples (usar 'f')
double myDouble = 5.99;     // Precisão dupla

// Caractere
char myChar = 'D';          // Um único caractere

// Booleano
boolean verdadeiro = true;
```

### Tipos Não-Primitivos
```java
// String - sequência de caracteres
String myString = "olaaaaa";
```

**Diferença entre primitivos e não-primitivos:**
- **Primitivos**: Armazenam apenas valores
- **Não-primitivos**: Possuem métodos e funcionalidades adicionais

## Variáveis e Constantes

### Variáveis
```java
int mesUsuario = 6;  // Valor pode ser alterado
```

### Constantes
```java
final int MESES_DO_ANO = 12;  // Valor fixo, não pode ser alterado

// Classe específica para constantes
public class Constantes {
    public static final byte MES_MINIMO = 1;
    public static final byte MES_MAXIMO = 12;
}
```

**Convenções:**
- Constantes em **MAIÚSCULO**
- Usar `final` para tornar imutável
- `static` permite acesso sem instanciar a classe

## Arrays

### Declaração e Inicialização
```java
// Forma 1: Declaração com valores
String[] vetor = {"10", "20"};
int[] x = {1, 2};

// Forma 2: Declaração com tamanho
String[] v = new String[2];
v[0] = "30";
v[1] = "40";

// Array de objetos
String[] nomes = new String[10];
```

### Percorrendo Arrays
```java
// Loop tradicional
for(int i = 0; i < nomes.length; i++) {
    System.out.println(nomes[i]);
}

// Enhanced for (Iterator)
for(String s : nomes) {
    System.out.println(s);
}
```

## Entrada e Saída de Dados

### Console
```java
System.out.println("Mensagem");  // Saída no console
```

### Interface Gráfica com JOptionPane
```java
import javax.swing.JOptionPane;

// Entrada de dados
String entrada = JOptionPane.showInputDialog("Digite um valor:");

// Saída de dados
JOptionPane.showMessageDialog(null, "Resultado: " + valor);
```

### Conversão de Tipos
```java
// String para números
int numero = Integer.parseInt(stringNumero);
float decimal = Float.parseFloat(stringDecimal);
double precisao = Double.parseDouble(stringPrecisao);
```

## Estruturas Condicionais

### If-Else
```java
if (mes >= Constantes.MES_MINIMO && mes <= Constantes.MES_MAXIMO) {
    System.out.println("Mês válido");
} else {
    System.out.println("Mês inválido");
}
```

### Switch-Case
```java
String mesExtenso = "";
switch(mes) {
    case 1: mesExtenso = "Janeiro"; break;
    case 2: mesExtenso = "Fevereiro"; break;
    case 3: mesExtenso = "Março"; break;
    default: mesExtenso = "Desconhecido";
}
```

### Validações de String
```java
String s = JOptionPane.showInputDialog("Digite algo:");

// Verificar se é null
if (s != null) {
    // Verificar se está vazio
    if (!s.equals("")) {
        // String válida para processamento
    }
}
```

## Estruturas de Repetição

### For Tradicional
```java
for(int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

### For com Caracteres
```java
for(char a = 'A'; a <= 'z'; a++) {
    System.out.println(a + " = " + (int)a);  // Casting para ASCII
}
```

### Enhanced For (For-Each)
```java
for(String nome : arrayNomes) {
    System.out.println(nome);
}
```

## Interface Gráfica (Swing)

### Componentes Básicos
```java
import javax.swing.*;
import java.awt.event.*;

public class GuiMes extends JFrame {
    private JButton btMostrar, btSair;
    private JTextField tfMes, tfResultado;
    
    public GuiMes() {
        // Configurações da janela
        setTitle("Código de meses");
        setBounds(200, 200, 600, 400);
        setResizable(false);
        setLayout(null);
        
        // Criação dos componentes
        btMostrar = new JButton("Mostrar");
        tfMes = new JTextField();
        tfResultado = new JTextField();
        tfResultado.setEditable(false);
        
        // Posicionamento
        btMostrar.setBounds(180, 100, 200, 25);
        tfMes.setBounds(90, 50, 400, 25);
        
        // Adicionar à janela
        add(btMostrar);
        add(tfMes);
        
        // Event Listeners
        btMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = tfMes.getText();
                // Processar entrada
            }
        });
    }
}
```

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
- `public`: **Modificador de acesso**
- `static`: **Modificador de escopo** (pertence à classe)
- `float`: **Tipo de retorno**
- `somar`: **Nome do método**
- `(float a, float b)`: **Assinatura/Parâmetros**
- `{ return a + b; }`: **Corpo/Implementação**

### Modificadores de Acesso

#### UML - Unified Modeling Language
```
+ public    → Acessível de qualquer lugar
- private   → Acessível apenas na mesma classe  
# protected → Acessível no pacote e subclasses
```

```java
public class ExemplosAcesso {
    public void metodoPublico() {
        // Pode ser chamado de qualquer classe
    }
    
    private void metodoPrivado() {
        // Só pode ser chamado dentro desta classe
    }
}
```

### Escopo: Static vs Não-Static

#### Métodos Estáticos (Escopo de Classe)
```java
// Pertencem à CLASSE
public static void somar(float a, float b) {
    System.out.println(a + b);
}

// Chamada: NomeClasse.nomeMetodo()
Calculadora.somar(10, 20);
```

#### Métodos de Instância (Escopo de Objeto)
```java
// Pertencem ao OBJETO
public void somase(float a, float b) {
    System.out.println(a + b);
}

// Chamada: objeto.nomeMetodo()
Calculadora c = new Calculadora();
c.somase(10, 20);
```

**Diferença prática:**
- **Static**: Uma função genérica da classe
- **Não-static**: Um método específico do objeto

### Tipos de Retorno

```java
// void - Não retorna nada
public static void imprimir(String texto) {
    System.out.println(texto);
}

// Retorna um valor específico
public static String espelhar(String texto) {
    String resultado = "";
    for(int i = texto.length()-1; i >= 0; i--) {
        resultado += texto.charAt(i);
    }
    return resultado;  // DEVE retornar uma String
}

// Retorna boolean para indicar sucesso/falha
public static boolean salvar(String conteudo, String arquivo) {
    try {
        PrintWriter pw = new PrintWriter(arquivo);
        pw.print(conteudo);
        pw.close();
        return true;  // Sucesso
    } catch (Exception e) {
        return false; // Falha
    }
}
```

### Parâmetros vs Argumentos

```java
// Parâmetros = variáveis do método (a, b)
public static void somar(float a, float b) {
    System.out.println(a + b);
}

// Argumentos = valores passados (10, 20)
somar(10, 20);
```

**Características dos parâmetros:**
- São **variáveis locais** (existem apenas durante a execução)
- **Tempo de vida**: apenas durante a execução do método
- **Escopo**: visíveis apenas dentro do método

### Sobrecarga de Métodos (Overloading)

**Definição**: Métodos com o **mesmo nome** mas **assinaturas diferentes** na mesma classe.

```java
public class Calculadora {
    // Assinatura: somar(float, float)
    public static void somar(float a, float b) {
        System.out.println(a + b);
    }
    
    // Assinatura: somar(int, float) - DIFERENTE!
    public static void somar(int a, float b) {
        System.out.println(a + b);
    }
    
    // Assinatura: somar(float, float, float) - DIFERENTE!
    public static void somar(float a, float b, float c) {
        System.out.println(a + b + c);
    }
}
```

#### Exemplo Prático - Classe Impressora
```java
public class Impressora {
    // Versão básica
    public static void imprimir() {
        System.out.println("Apostila de Java");
    }
    
    // Com texto personalizado
    public static void imprimir(String texto) {
        System.out.println(texto);
    }
    
    // Com repetição
    public static void imprimir(String texto, int quantidadeVezes) {
        for(int i = 1; i <= quantidadeVezes; i++) {
            System.out.println(texto);
        }
    }
    
    // Com formatação
    public static void imprimir(String texto, String caixa) {
        if(caixa.equalsIgnoreCase("alta")) {
            System.out.println(texto.toUpperCase());
        } else {
        JOptionPane.showMessageDialog(null, "Erro inesperado: " + erro);
    }
}
```

### Manipulação de Arquivos
```java
import java.io.*;

PrintWriter arquivo = null;
try {
    // Criar/sobrescrever arquivo
    arquivo = new PrintWriter("caminho/arquivo.txt");
    
    // Ou anexar ao arquivo existente
    arquivo = new PrintWriter(new FileWriter("caminho/arquivo.txt", true));
    
    arquivo.write("Conteúdo do arquivo\n");
    
} catch(FileNotFoundException e) {
    System.out.println("Arquivo não encontrado: " + e);
} catch(IOException e) {
    System.out.println("Erro de I/O: " + e);
} finally {
    // SEMPRE fechar o arquivo para liberar recursos
    if(arquivo != null) {
        arquivo.close();
    }
}
```

### Loop com Tratamento de Exceções
```java
while(true) {
    try {
        String s = JOptionPane.showInputDialog("Mês? ");
        
        // Permitir saída
        if(s == null || s.equals("")) break;
        
        int mes = Integer.parseInt(s);
        
        // Validação de negócio
        if(mes < 1 || mes > 12) {
            JOptionPane.showMessageDialog(null, "Mês inválido!");
        } else {
            JOptionPane.showMessageDialog(null, "Mês " + mes + " é válido!");
            break;  // Sair do loop quando válido
        }
        
    } catch(NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Digite apenas números inteiros");
    } finally {
        // Executado a cada iteração
        System.out.println("Fim de uma tentativa");
    }
}
```

### Exemplo Prático - Entrada de Dados com Tratamento
```java
public static int lerIdade() {
    while(true) {
        try {
            String entrada = JOptionPane.showInputDialog("Digite sua idade:");
            if(entrada == null) return -1;  // Usuário cancelou
            
            int idade = Integer.parseInt(entrada);
            
            if(idade < 0 || idade > 120) {
                JOptionPane.showMessageDialog(null, "Idade deve estar entre 0 e 120 anos");
                continue;
            }
            
            return idade;  // Idade válida
            
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números");
        }
    }
}
```

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
x++;      // x = x + 1;  → Pós-incremento
++x;      // x = x + 1;  → Pré-incremento
x--;      // x = x - 1;  → Pós-decremento
--x;      // x = x - 1;  → Pré-decremento
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
if(x && metodoCaroPraTeste()) {  // Se x for false, método não é executado
    // ...
}
```

### Operador Ternário
```java
// Sintaxe: condição ? valorSeVerdadeiro : valorSeFalso
int idade = 20;
String categoria = (idade >= 18) ? "Maior de idade" : "Menor de idade";

// Equivale a:
String categoria2;
if(idade >= 18) {
    categoria2 = "Maior de idade";
} else {
    categoria2 = "Menor de idade";
}

// Exemplo prático - determinar semestre
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
        if(!isValido(mes)) return "Mês inválido";
        
        String[] meses = {"", "Janeiro", "Fevereiro", "Março", "Abril", 
                         "Maio", "Junho", "Julho", "Agosto", "Setembro", 
                         "Outubro", "Novembro", "Dezembro"};
        return meses[mes];
    }
    
    public static void main(String[] args) {
        while(true) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite o mês (1-12):");
                if(entrada == null || entrada.trim().equals("")) break;
                
                int mes = Integer.parseInt(entrada.trim());
                
                if(isValido(mes)) {
                    String mensagem = "Mês " + mes + ": " + getNomeExtenso(mes);
                    JOptionPane.showMessageDialog(null, mensagem);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Mês deve ser entre 1 e 12");
                }
                
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números");
            }
        }
    }
}
```

### 2. Gerador de Senhas Avançado
```java
public class GeradorSenhas {
    private static final String NUMEROS = "0123456789";
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String SIMBOLOS = "!@#$%^&*()_+-=[]{}|;:,.<>?";
    
    /**
     * Gera senha apenas numérica
     * @param tamanho quantidade de dígitos
     * @return senha numérica
     */
    public static String gerarNumerica(int tamanho) {
        return gerarSenha(NUMEROS, tamanho);
    }
    
    /**
     * Gera senha simples (números + letras)
     * @param tamanho quantidade de caracteres
     * @return senha alfanumérica
     */
    public static String gerarSimples(int tamanho) {
        return gerarSenha(NUMEROS + MINUSCULAS + MAIUSCULAS, tamanho);
    }
    
    /**
     * Gera senha complexa (números + letras + símbolos)
     * @param tamanho quantidade de caracteres
     * @return senha complexa
     */
    public static String gerarComplexa(int tamanho) {
        return gerarSenha(NUMEROS + MINUSCULAS + MAIUSCULAS + SIMBOLOS, tamanho);
    }
    
    /**
     * Método base para geração de senhas
     * @param caracteres pool de caracteres disponíveis
     * @param tamanho tamanho da senha
     * @return senha gerada
     */
    private static String gerarSenha(String caracteres, int tamanho) {
        StringBuilder senha = new StringBuilder();
        for(int i = 0; i < tamanho; i++) {
            int indice = (int)(Math.random() * caracteres.length());
            senha.append(caracteres.charAt(indice));
        }
        return senha.toString();
    }
    
    /**
     * Avalia força da senha
     * @param senha a senha a ser avaliada
     * @return força da senha (Fraca/Média/Forte/Muito Forte)
     */
    public static String avaliarForca(String senha) {
        int pontos = 0;
        
        if(senha.length() >= 8) pontos += 2;
        if(senha.length() >= 12) pontos += 1;
        
        boolean temMinuscula = false, temMaiuscula = false;
        boolean temNumero = false, temSimbolo = false;
        
        for(char c : senha.toCharArray()) {
            if(Character.isLowerCase(c)) temMinuscula = true;
            else if(Character.isUpperCase(c)) temMaiuscula = true;
            else if(Character.isDigit(c)) temNumero = true;
            else temSimbolo = true;
        }
        
        if(temMinuscula) pontos++;
        if(temMaiuscula) pontos++;
        if(temNumero) pontos++;
        if(temSimbolo) pontos += 2;
        
        if(pontos < 3) return "Fraca";
        if(pontos < 5) return "Média";
        if(pontos < 7) return "Forte";
        return "Muito Forte";
    }
}
```

### 3. Analisador de RA (Registro Acadêmico)
```java
public class AnalisadorRA {
    /**
     * Extrai informações do RA
     * @param ra o registro acadêmico
     * @return string com informações formatadas
     */
    public static String analisar(String ra) {
        if(ra == null || ra.length() != 13) {
            return "RA inválido - deve ter exatamente 13 dígitos";
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
            
            StringBuilder resultado = new StringBuilder();
            resultado.append("=== ANÁLISE DO RA ===\n");
            resultado.append("RA: ").append(ra).append("\n");
            resultado.append("Unidade: ").append(unidade).append("\n");
            resultado.append("Curso: ").append(curso).append("\n");
            resultado.append("Ano: ").append(ano).append("\n");
            resultado.append("Semestre: ").append(semestre).append("\n");
            resultado.append("Sequencial: ").append(sequencial);
            
            return resultado.toString();
            
        } catch(NumberFormatException e) {
            return "RA inválido - deve conter apenas números";
        }
    }
    
    public static void main(String[] args) {
        String ra = JOptionPane.showInputDialog("Digite o RA (13 dígitos):");
        if(ra != null) {
            String resultado = analisar(ra.trim());
            JOptionPane.showMessageDialog(null, resultado);
        }
    }
}
```

### 4. Calculadora com Interface Gráfica
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
            
            switch(operacao) {
                case "+": resultado = num1 + num2; break;
                case "-": resultado = num1 - num2; break;
                case "*": resultado = num1 * num2; break;
                case "/":
                    if(num2 == 0) {
                        JOptionPane.showMessageDialog(this, "Divisão por zero!");
                        return;
                    }
                    resultado = num1 / num2;
                    break;
            }
            
            tfResultado.setText(String.valueOf(resultado));
            
        } catch(NumberFormatException ex) {
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

## Boas Práticas

### Nomenclatura
```java
// ✅ Boas práticas
public class CalculadoraFinanceira {  // PascalCase para classes
    private static final int IDADE_MINIMA = 18;  // MAIÚSCULO para constantes
    
    public static double calcularJuros(double capital, double taxa) {  // camelCase
        return capital * taxa;
    }
}

// ❌ Evitar
public class calculadora {  // Minúsculo
    private static final int idademinima = 18;  // Sem padrão
    
    public static double Calcular_Juros(double c, double t) {  // Inconsistente
        return c * t;
    }
}
```

### Documentação JavaDoc
```java
/**
 * Classe utilitária para operações matemáticas básicas
 * @author Rafael Tadeu
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
        if(numeros == null) {
            throw new IllegalArgumentException("Array não pode ser null");
        }
        
        if(numeros.length == 0) return 0;
        
        double soma = 0;
        for(double num : numeros) {
            soma += num;
        }
        return soma / numeros.length;
    }
}
```

### Tratamento de Entrada de Usuário
```java
public class EntradaSegura {
    
    /**
     * Lê um inteiro com validação e retry automático
     * @param mensagem mensagem para o usuário
     * @param min valor mínimo aceito
     * @param max valor máximo aceito
     * @return número válido ou -1 se usuário cancelar
     */
    public static int lerInteiro(String mensagem, int min, int max) {
        while(true) {
            try {
                String entrada = JOptionPane.showInputDialog(mensagem + 
                    " (" + min + " a " + max + "):");
                
                if(entrada == null) return -1;  // Cancelou
                
                int numero = Integer.parseInt(entrada.trim());
                
                if(numero >= min && numero <= max) {
                    return numero;
                } else {
                    JOptionPane.showMessageDialog(null, 
                        "Número deve estar entre " + min + " e " + max);
                }
                
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros");
            }
        }
    }
}
```

### Separação de Responsabilidades
```java
// ✅ Classe focada em uma responsabilidade
public class ValidadorCPF {
    public static boolean isValido(String cpf) {
        // Lógica específica de validação de CPF
        return cpf != null && cpf.matches("\\d{11}");
    }
}

public class FormatadorCPF {
    public static String formatar(String cpf) {
        // Lógica específica de formatação
        return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", 
                             "$1.$2.$3-$4");
    }
}

// ❌ Classe com muitas responsabilidades
public class CPFUtil {
    public static boolean validar(String cpf) { /* ... */ }
    public static String formatar(String cpf) { /* ... */ }
    public static String extrairNumeros(String cpf) { /* ... */ }
    public static void salvarEmArquivo(String cpf) { /* ... */ }
    public static void enviarPorEmail(String cpf) { /* ... */ }
}
```

### Constantes Organizadas
```java
public class Constantes {
    // Validações gerais
    public static final class Validacao {
        public static final int IDADE_MINIMA = 0;
        public static final int IDADE_MAXIMA = 120;
        public static final int CPF_TAMANHO = 11;
    }
    
    // Mensagens de erro
    public static final class Mensagens {
        public static final String ERRO_NUMERO = "Digite apenas números";
        public static final String ERRO_IDADE = "Idade deve estar entre 0 e 120";
        public static final String SUCESSO_SALVAMENTO = "Dados salvos com sucesso!";
    }
    
    // Configurações de arquivo
    public static final class Arquivo {
        public static final String DIRETORIO_LOGS = "logs/";
        public static final String EXTENSAO_LOG = ".txt";
    }
}
```

### Main Method Limpo
```java
// ✅ Main focado apenas em inicialização
public class Aplicacao {
    public static void main(String[] args) {
        try {
            inicializarAplicacao();
            executarFluxoPrincipal();
        } catch(Exception e) {
            tratarErroFatal(e);
        }
    }
    
    private static void inicializarAplicacao() {
        // Configurações iniciais
    }
    
    private static void executarFluxoPrincipal() {
        // Lógica principal
    }
    
    private static void tratarErroFatal(Exception e) {
        JOptionPane.showMessageDialog(null, "Erro fatal: " + e.getMessage());
        System.exit(1);
    }
}

// ❌ Main com muita lógica
public class AplicacaoRuim {
    public static void main(String[] args) {
        // 200 linhas de código misturando inicialização,
        // lógica de negócio, interface gráfica, etc.
    }
}
```

---

## Resumo dos Conceitos Fundamentais

### Pilares da Programação Java
1. **Orientação a Objetos**: Classes, objetos, métodos
2. **Tratamento de Exceções**: Try-catch-finally, tipos de exceções
3. **Manipulação de Dados**: Strings, arrays, tipos primitivos
4. **Interface com Usuário**: Console, JOptionPane, Swing
5. **Boas Práticas**: Nomenclatura, documentação, organização

### Checklist de Qualidade
- [ ] Todos os métodos documentados com JavaDoc
- [ ] Nomes descritivos para classes, métodos e variáveis
- [ ] Constantes em MAIÚSCULO e organizadas
- [ ] Tratamento adequado de exceções
- [ ] Validação de entrada do usuário
- [ ] Separação clara de responsabilidades
- [ ] Código limpo e bem estruturado

### Próximos Passos
- **Programação Orientada a Objetos**: Herança, polimorfismo, encapsulamento
- **Collections**: ArrayList, HashMap, Set
- **Threads**: Programação concorrente
- **JDBC**: Acesso a banco de dados
- **Frameworks**: Spring, Hibernate
- **Testes Unitários**: JUnit

---

**Lembre-se**: A prática é fundamental! Implemente projetos pequenos usando esses conceitos para consolidar o aprendizado.
            System.out.println(texto.toLowerCase());
        }
    }
}
```

**Uso:**
```java
Impressora.imprimir();                        // "Apostila de Java"
Impressora.imprimir("Oi!");                   // "Oi!"
Impressora.imprimir("Java", 3);               // Imprime "Java" 3 vezes
Impressora.imprimir("java", "alta");          // "JAVA"
```

### Documentação de Métodos (JavaDoc)

**Regra fundamental**: **TODOS OS MÉTODOS DEVEM SER DOCUMENTADOS**

```java
/**
 * Calcula a soma de dois números
 * @param a primeiro número
 * @param b segundo número
 * @return a soma dos dois números
 */
public static float somar(float a, float b) {
    return a + b;
}

/**
 * Inverte o texto recebido
 * @param texto o texto a ser invertido
 * @return o texto invertido
 */
public static String espelhar(String texto) {
    String resultado = "";
    for(int i = texto.length()-1; i >= 0; i--) {
        resultado += texto.charAt(i);
    }
    return resultado;
}

/**
 * Salva texto em arquivo
 * @param conteudo o texto a ser salvo
 * @param caminho caminho do arquivo
 * @param nomeArquivo nome do arquivo
 * @return mensagem de status da operação
 */
public static String salvar(String conteudo, String caminho, String nomeArquivo) {
    try {
        PrintWriter pw = new PrintWriter(caminho + "/" + nomeArquivo);
        pw.print(conteudo);
        pw.close();
        return "Arquivo salvo com sucesso!";
    } catch (FileNotFoundException e) {
        return "Falha ao gravar arquivo: " + e;
    }
}
```

### Práticas Recomendadas

#### Nomenclatura
- **Usar verbos no infinitivo**: `somar()`, `calcular()`, `imprimir()`
- **CamelCase**: `calcularMedia()`, `verificarIdade()`

#### Design de Métodos
```java
// ❌ Evitar void quando possível
public static void calcular() {
    // Sem retorno, difícil de testar
}

// ✅ Preferir retornos
public static double calcular(double a, double b) {
    return a + b;  // Fácil de testar e reutilizar
}

// ✅ Ideal: um único ponto de retorno
public static String validarIdade(int idade) {
    if(idade < 0) {
        return "Idade inválida";
    }
    if(idade < 18) {
        return "Menor de idade";
    }
    return "Maior de idade";
}
```

#### Tratamento de Erros
```java
// Versão que apenas salva
public static void salvar(String texto, String arquivo) {
    try {
        PrintWriter pw = new PrintWriter(arquivo);
        pw.print(texto);
        pw.close();
        System.out.println("Sucesso!");
    } catch (FileNotFoundException e) {
        System.out.println("Erro: " + e);
    }
}

// Versão que retorna sucesso/falha
public static boolean salvarComStatus(String texto, String arquivo) {
    try {
        PrintWriter pw = new PrintWriter(arquivo);
        pw.print(texto);
        pw.close();
        return true;
    } catch (FileNotFoundException e) {
        return false;
    }
}

// Versão que retorna mensagem detalhada
public static String salvarComMensagem(String texto, String arquivo) {
    try {
        PrintWriter pw = new PrintWriter(arquivo);
        pw.print(texto);
        pw.close();
        return "Arquivo salvo com sucesso!";
    } catch (FileNotFoundException e) {
        return "Erro ao salvar: " + e.getMessage();
    }
}
```

### Exemplo Completo - Classe Utilitária
```java
public class Texto {
    /**
     * Imprime texto invertido no console
     * @param texto o texto a ser invertido
     */
    public static void inverter(String texto) {
        for(int i = texto.length()-1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();
    }
    
    /**
     * Retorna o texto invertido
     * @param texto o texto a ser invertido
     * @return o texto invertido
     */
    public static String espelhar(String texto) {
        String resultado = "";
        for(int i = texto.length()-1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }
        return resultado;
    }
    
    /**
     * Gera senha numérica aleatória
     * @param quantidadeDigitos número de dígitos da senha
     * @return senha gerada
     */
    public static String gerarSenha(int quantidadeDigitos) {
        String senha = "";
        for(int i = 1; i <= quantidadeDigitos; i++) {
            senha += (int)(Math.random() * 10);
        }
        return senha;
    }
}
```

### Comunicação Entre Objetos (Mensagens)

Em programação orientada a objetos, objetos se comunicam através de **mensagens** (chamadas de métodos):

```
Objeto A ----mensagem(dados)----> Objeto B
         <-------resposta--------
```

```java
// Exemplo de comunicação
public class UsaTexto {
    public static void main(String[] args) {
        String original = "Java";
        
        // Enviando mensagem "espelhar" para a classe Texto
        String invertido = Texto.espelhar(original);
        
        // Resultado: "avaJ"
        System.out.println(original + " → " + invertido);
    }
}
```

### Assinatura de Método

**Assinatura** = Nome do método + Tipos dos parâmetros

```java
// Assinatura: somar(int, int)
public static int somar(int a, int b) { return a + b; }

// Assinatura: somar(float, float) - DIFERENTE da anterior
public static float somar(float a, float b) { return a + b; }

// Assinatura: somar(int, float) - DIFERENTE das anteriores
public static float somar(int a, float b) { return a + b; }
```

**Importante**: O tipo de retorno **NÃO** faz parte da assinatura!

### Terminologia

- **Método**: Função associada a um objeto (não-static)
- **Função**: Método estático (genérico, não precisa de objeto)
- **Mensagem**: Sinônimo para método em orientação a objetos
- **Parâmetros**: Variáveis definidas no método
- **Argumentos**: Valores passados ao chamar o método

## Classe Math

### Métodos Básicos
```java
// Valor absoluto
int absoluto = Math.abs(-10);  // Retorna 10

// Máximo e mínimo
int maior = Math.max(5, 8);    // Retorna 8
int menor = Math.min(5, 8);    // Retorna 5

// Para 3 ou mais valores
int maior3 = Math.max(Math.max(3, 7), 5);  // Retorna 7
```

### Arredondamento
```java
double numero = 85.7;

// Arredonda para cima (teto)
int paraCima = (int)Math.ceil(numero);    // 86

// Arredonda para baixo (chão)
int paraBaixo = (int)Math.floor(numero);  // 85
```

**Exemplo prático - Cálculo de ônibus:**
```java
final int PASSAGEIROS_POR_ONIBUS = 40;
float numeroAlunos = 85;

// Quantos ônibus são necessários?
int onibusNecessarios = (int)Math.ceil(numeroAlunos / PASSAGEIROS_POR_ONIBUS);
// Resultado: 3 ônibus (para 85 alunos)
```

### Potenciação e Raiz
```java
double base = 2;
double expoente = 16;

// Potenciação: 2^16
double potencia = Math.pow(base, expoente);  // 65536.0

// Raiz quadrada
double raiz = Math.sqrt(16);  // 4.0
```

### Números Aleatórios com Math.random()
```java
// Gera número entre 0.0 e 1.0 (exclusivo)
double aleatorio = Math.random();

// Número inteiro entre 1 e 60 (loteria)
int numero = (int)(1 + Math.random() * 60);

// Gerador de cartões da mega-sena
for(int cartao = 1; cartao <= 10; cartao++) {
    System.out.print("Cartão " + cartao + ": ");
    for(int x = 0; x < 6; x++) {
        System.out.print((int)(1 + Math.random() * 60) + " ");
    }
    System.out.println();
}
```

## Classe Random

### Vantagens sobre Math.random()
```java
import java.util.Random;

Random r = new Random();

// Números com intervalo específico
int numeroEntre10e20 = r.nextInt(10, 20);  // Entre 10 e 19
float decimal = r.nextFloat(10);           // Entre 0.0 e 10.0
double precisao = r.nextDouble(10);        // Entre 0.0 e 10.0
```

### Seeds (Reprodutibilidade)
```java
Random rSeed = new Random(100);  // Seed fixa
// Com seed, a sequência será sempre a mesma
// Útil para testes e depuração
```

### Aplicações Práticas

#### Geração de Senhas Numéricas
```java
String senha = "";
int qtdeNumeros = 10;
for(int i = 1; i <= qtdeNumeros; i++) {
    int n = (int)(Math.random() * 10);  // 0 a 9
    senha += n;
}
System.out.println(senha);  // Ex: "4729163580"
```

#### Geração de Senhas Complexas
```java
String caracteres = "0123456789abcdefghijklmnopqrstuvwxyz" +
                   "ABCDEFGHIJKLMNOPQRSTUVWXYZ.,@#%*&!";
int tamanho = caracteres.length();
String senha = "";

for(int i = 1; i <= 10; i++) {
    int indice = (int)(Math.random() * tamanho);
    senha += caracteres.charAt(indice);
}
System.out.println(senha);  // Ex: "aB3#mK9@xZ"
```

#### Seleção Aleatória de Arrays
```java
String[] alunos = {"Eduardo", "Jorge", "Cleiton", "Pedro", "Beatriz"};
int indiceAleatorio = (int)(Math.random() * alunos.length);
System.out.println("Aluno sorteado: " + alunos[indiceAleatorio]);
```

## Manipulação de Strings

### Métodos Básicos
```java
String s = "Rafael Tadeu";

// Conversão de caso
System.out.println(s.toUpperCase());  // "RAFAEL TADEU"
System.out.println(s.toLowerCase());  // "rafael tadeu"

// Tamanho
System.out.println(s.length());       // 12
```

### Acesso a Caracteres
```java
String texto = "Programação Orientada a Objetos";

// Obter caractere por índice
char letra = texto.charAt(3);  // 'g'

// Percorrer string caractere por caractere
for(int i = 0; i < texto.length(); i++) {
    System.out.print(texto.charAt(i));
}

// Percorrer string ao contrário
for(int i = texto.length() - 1; i >= 0; i--) {
    System.out.print(texto.charAt(i));
}
```

### Busca e Validação
```java
String termosProibidos = "sexo sexual droga";
String entrada = "minha pesquisa";

// Verificar se contém termo
if(termosProibidos.contains(entrada.toLowerCase())) {
    System.out.println("Termo proibido!");
} else {
    System.out.println("Liberado!");
}
```

### Substring - Extraindo Partes
```java
String ra = "1050482423017";

// Extrair partes específicas (início, fim exclusivo)
String unidade = ra.substring(0, 3);    // "105"
String curso = ra.substring(3, 6);      // "048"
String ano = "20" + ra.substring(6, 8); // "2024"

// Operador ternário para semestre
String semestre = (ra.substring(8, 9).equals("1") ? 
                  "Primeiro " : "Segundo ") + "semestre";
```

### Split - Dividindo Strings
```java
String frase = "Programação Orientada a Objetos";
String numeros = "1,2,3,4,5,6,7,8,9,0";

// Dividir por espaço
String[] palavras = frase.split(" ");

// Dividir por vírgula
String[] arrayNumeros = numeros.split(",");

// Percorrer arrays resultantes
for(String palavra : palavras) {
    System.out.println(palavra);
}
```

### Trim - Removendo Espaços
```java
String ra1 = "1293120  ";      // Espaços no final
String ra2 = "   2132443  ";   // Espaços início e fim

System.out.println(ra1.length());        // 10
System.out.println(ra1.trim().length()); // 7

System.out.println(ra2.length());        // 12  
System.out.println(ra2.trim().length()); // 7
```

## Tratamento de Exceções

### Tipos de Exceções

**Exceções Checked (Verificadas):**
- Verificadas em **tempo de compilação**
- **Devem** ser tratadas obrigatoriamente
- Exemplo: `FileNotFoundException`, `InterruptedException`

**Exceções Unchecked (Não verificadas):**
- Verificadas em **tempo de execução**
- **Podem** ser tratadas opcionalmente
- Exemplo: `NumberFormatException`, `ArithmeticException`

```java
// Exceção Checked - deve ser tratada
try {
    Thread.sleep(1000);  // InterruptedException
} catch(InterruptedException e) {
    System.out.println("Erro: " + e);
}

// Exceção Unchecked - pode ser tratada
int numero = Integer.parseInt("abc");  // NumberFormatException (opcional)
```

### Estrutura Try-Catch-Finally
```java
try {
    // Código que pode gerar exceção
    int n = Integer.parseInt(JOptionPane.showInputDialog("Idade? "));
    System.out.println("Parabéns, você digitou um valor inteiro");
    
} catch(NumberFormatException erro) {
    // Tratamento específico
    System.out.println("Erro: você não digitou um valor inteiro " + erro);
    
} finally {
    // SEMPRE executa - usado para liberar recursos
    JOptionPane.showMessageDialog(null, "Passou.");
}
```

### Múltiplas Exceções
```java
try {
    String s = JOptionPane.showInputDialog("Mês? ");
    int n = Integer.parseInt(s);     // NumberFormatException
    int resultado = 30 / n;          // ArithmeticException
    
} catch(NumberFormatException erro) {
    JOptionPane.showMessageDialog(null, "Digite um número inteiro");
    
} catch(ArithmeticException erro) {
    JOptionPane.showMessageDialog(null, "Divisão por zero não permitida");
    
} catch(Exception erro) {
    // Captura qualquer outra exceção (usar com cuidado)
    JOptionPane.showMessageDialog(null, "Erro geral: " + erro);
}
```

### Tratamento Inteligente de Exceções
```java
try {
    String s = JOptionPane.showInputDialog("Mês? ");
    if(s == null || s.equals("")) break;  // Usuário cancelou
    
    int n = Integer.parseInt(s);
    int resultado = 30 / n;
    
    // Validação de negócio
    if(n < 1 || n > 12) {
        JOptionPane.showMessageDialog(null, "Mês inválido!");
    } else {
        JOptionPane.showMessageDialog(null, "Mês válido!");
    }
    
} catch(Exception erro) {
    // Verificar tipo de erro pela mensagem
    if(erro.toString().contains("Number")) {
        JOptionPane.showMessageDialog(null, "Digite apenas números");
    } else if(erro.toString().contains("Arithmetic")) {
        JOptionPane.showMessageDialog(null, "Não é possível dividir por zero");
    } else {
        JOptionPane.showMessageDialog(null, "Erro: "+erro)
    }finally {
        JOptionPane.showMessageDialog(null, "Passou aqui.");
    }
}