package lista02;



import java.util.List;
import java.util.Random;


public class Exercicio {

    /**
     * Método que recebe uma palavra e apresenta em tela todas as letras desta palavra separadamente.
     * 
     * @param palavra - a palavra a ser analisada
     */
    public void mostrarLetras(String palavra) {
        if (palavra == null || palavra.isEmpty()) {
            System.out.println("Palavra inválida!");
        } else {
            System.out.println("Letras da palavra '" + palavra + "':");
            for (int i = 0; i < palavra.length(); i++) {
                System.out.println("Letra " + (i + 1) + ": " + palavra.charAt(i));
            }
        }
    }

    /**
     * Método que recebe um número entre 1 e 10 e apresenta em tela a tabuada desse número.
     * Caso o número fornecido esteja fora da faixa, imprime em tela a mensagem "número inválido".
     * 
     * @param numero - o número para calcular a tabuada (deve estar entre 1 e 10)
     */
    public void mostrarTabuada(int numero) {
        if (numero < 1 || numero > 10) {
            System.out.println("número inválido");
        } else {
            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }

    /**
     * Método que imprime em tela cinco números inteiros aleatórios
     * (os valores devem estar entre 1 e 100).
     */
    public void imprimirNumerosAleatorios() {
        Random random = new Random();
        System.out.println("Cinco números aleatórios entre 1 e 100:");
        for (int i = 0; i < 5; i++) {
            int numeroAleatorio = random.nextInt(100) + 1;
            System.out.println("Número " + (i + 1) + ": " + numeroAleatorio);
        }
    }

    /**
     * Método que recebe um número inteiro entre 1 e 7 e mostra em tela
     * domingo, segunda .... ou sábado, ou ainda "inexistente" caso o valor esteja fora da faixa.
     * 
     * @param numero - o número correspondente ao dia da semana (1-7)
     */
    public void mostrarDiaSemana(int numero) {
        String dia;
        switch (numero) {
            case 1: dia = "domingo"; break;
            case 2: dia = "segunda"; break;
            case 3: dia = "terça"; break;
            case 4: dia = "quarta"; break;
            case 5: dia = "quinta"; break;
            case 6: dia = "sexta"; break;
            case 7: dia = "sábado"; break;
            default: dia = "inexistente"; break;
        }
        System.out.println("Dia da semana: " + dia);
    }

    /**
     * Método que recebe uma lista de nomes (use List do pacote java.util) e
     * apresente em tela todos os nomes existentes na lista.
     * 
     * @param nomes - lista de nomes a serem exibidos
     */
    public void exibirNomes(List<String> nomes) {
        if (nomes == null || nomes.isEmpty()) {
            System.out.println("Lista de nomes vazia!");
        } else {
            System.out.println("Nomes existentes na lista:");
            for (String nome : nomes) {
                System.out.println("- " + nome);
            }
        }
    }

    /**
     * Método que recebe uma lista (use List do pacote java.util) contendo
     * diversos valores inteiros e retorna a quantidade de números pares.
     * 
     * @param numeros - lista de números inteiros
     * @return A quantidade de números pares na lista
     */
    public int contarNumerosPares(List<Integer> numeros) {
        int quantidadePares = 0;
        if (numeros != null) {
            for (Integer numero : numeros) {
                if (numero != null && numero % 2 == 0) {
                    quantidadePares++;
                }
            }
        }
        return quantidadePares;
    }

    /**
     * Método que recebe um array de 10 elementos contendo valores inteiros e
     * retorna a soma desses valores.
     * 
     * @param valores - array de 10 números inteiros
     * @return A soma dos valores do array, ou 0 se o array for inválido
     */
    public int somar(int[] valores) {
        int soma = 0;
        if (valores == null || valores.length != 10) {
            System.out.println("Erro: Array deve conter exatamente 10 elementos!");
            return 0;
        } else {
            for (int valor : valores) {
                soma += valor;
            }
        }
        return soma;
    }

    /**
     * Método que recebe qualquer quantidade de notas de prova e retorna a média
     * aritmética dessas notas.
     * 
     * @param notas - quantidade variável de notas (varargs)
     * @return A média aritmética das notas
     */
    public double calcularMedia(double... notas) {
        double media = 0.0;
        if (notas != null && notas.length > 0) {
            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            media = soma / notas.length;
        }
        return media;
    }

    /**
     * Método que recebe dois números inteiros (n1 e n2) e retorna um vetor contendo
     * n1 valores gerados aleatoriamente cujos valores estejam compreendidos entre 0 e n2.
     * 
     * @param n1 - quantidade de elementos do vetor
     * @param n2 - valor máximo para os números aleatórios (inclusive)
     * @return Array com n1 elementos aleatórios entre 0 e n2
     */
    public int[] gerar(int n1, int n2) {
        int[] vetor;
        if (n1 <= 0 || n2 < 0) {
            System.out.println("Erro: n1 deve ser maior que zero e n2 deve ser não-negativo!");
            vetor = new int[0];
        } else {
            vetor = new int[n1];
            Random random = new Random();
            for (int i = 0; i < n1; i++) {
                vetor[i] = random.nextInt(n2 + 1);
            }
        }
        return vetor;
    }

    /**
     * Método que recebe um número de CPF e retorna verdadeiro caso ocorram as seguintes condições:
     * a. deve conter 11 algarismos
     * b. deve conter o formato xxx.xxx.xxx/xx (os algarismos devem estar no lugar de cada x)
     * 
     * @param cpf - string contendo o CPF a ser validado
     * @return true se o CPF atender aos critérios básicos, false caso contrário
     */
    public boolean validarCPF(String cpf) {
        if (cpf == null) {
            return false;
        }
        
        if (!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            return false;
        }
        
        String cpfLimpo = cpf.replaceAll("[^0-9]", "");
        return cpfLimpo.length() == 11;
    }
}