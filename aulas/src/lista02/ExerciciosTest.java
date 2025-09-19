package lista02;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class ExerciciosTest {
    
    public static void main(String[] args) {
        Exercicio exercicio = new Exercicio();
                
        System.out.println("a) Mostrar letras da palavra:");
        exercicio.mostrarLetras("Programação");
        System.out.println();
        
        System.out.println("b) Mostrar tabuada:");
        exercicio.mostrarTabuada(7);
        System.out.println("\nTestando número fora da faixa:");
        exercicio.mostrarTabuada(15);
        System.out.println();
        
        System.out.println("c) Imprimir números aleatórios:");
        exercicio.imprimirNumerosAleatorios();
        System.out.println();
        
        System.out.println("d) Mostrar dia da semana:");
        System.out.print("Número 1: ");
        exercicio.mostrarDiaSemana(1);
        System.out.print("Número 5: ");
        exercicio.mostrarDiaSemana(5);
        System.out.print("Número 7: ");
        exercicio.mostrarDiaSemana(7);
        System.out.print("Número 10 (fora da faixa): ");
        exercicio.mostrarDiaSemana(10);
        System.out.println();
        
        System.out.println("e) Exibir nomes:");
        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Carlos");
        exercicio.exibirNomes(nomes);
                
        System.out.println("f) Contar números pares:");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);  
        numeros.add(21);  
        numeros.add(30);  
        numeros.add(45); 
        numeros.add(50);  
        numeros.add(33);  
        int quantidadePares = exercicio.contarNumerosPares(numeros);
        System.out.println("Lista: " + numeros);
        System.out.println("Quantidade de números pares na lista: " + quantidadePares);
        
        System.out.println("g) Somar array de 10 elementos:");
        int[] arrayDezElementos = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        System.out.println("Array: " + Arrays.toString(arrayDezElementos));
        int soma = exercicio.somar(arrayDezElementos);
        System.out.println("Soma dos elementos: " + soma);
        
        int[] arrayInvalido = {1, 2, 3}; // só 3 elementos
        System.out.println("\nTeste com array de tamanho incorreto:");
        int somaInvalida = exercicio.somar(arrayInvalido);
        System.out.println("Resultado da soma: " + somaInvalida);
        
        System.out.println("h) Calcular média de notas:");
        double media1 = exercicio.calcularMedia(7.5, 8.0, 9.0, 6.5);
        System.out.println("Notas: 7.5, 8.0, 9.0, 6.5");
        System.out.println("Média: " + String.format("%.2f", media1));
        
        double media2 = exercicio.calcularMedia(10.0, 9.5, 8.7);
        System.out.println("\nNotas: 10.0, 9.5, 8.7");
        System.out.println("Média: " + String.format("%.2f", media2));
        
        System.out.println("i) Gerar vetor com valores aleatórios:");
        int[] vetorAleatorio = exercicio.gerar(8, 50);
        System.out.println("Vetor gerado com 8 posições e valores entre 0 e 50:");
        System.out.println(Arrays.toString(vetorAleatorio));
        
        System.out.println("j) Validar CPF:");
        String cpf1 = "123.456.789-01"; 
        String cpf2 = "987.654.321-00"; 
        String cpf3 = "12345678901";   
        String cpf4 = "123.456.789/01"; 
        String cpf5 = "123.456.789-0";  
        
        System.out.println("CPF: " + cpf1 + " - Válido: " + exercicio.validarCPF(cpf1));
        System.out.println("CPF: " + cpf2 + " - Válido: " + exercicio.validarCPF(cpf2));
        System.out.println("CPF: " + cpf3 + " - Válido: " + exercicio.validarCPF(cpf3));
        System.out.println("CPF: " + cpf4 + " - Válido: " + exercicio.validarCPF(cpf4));
        System.out.println("CPF: " + cpf5 + " - Válido: " + exercicio.validarCPF(cpf5));
    }
}