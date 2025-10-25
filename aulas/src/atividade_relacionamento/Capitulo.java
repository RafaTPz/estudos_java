package atividade_relacionamento;

public class Capitulo {
    private int numero;
    private String titulo;
    private int numPaginas;
    
    /**
     * construtor da classe Capitulo.
     * @param numero o número do capítulo no livro
     * @param titulo o título do capítulo
     * @param numPaginas a quantidade de páginas que o capitulo tem
     */
    
    public Capitulo(int numero, String titulo, int numPaginas) {
        this.numero = numero;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getNumPaginas() {
        return numPaginas;
    }
    
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    /**
     * mostra as informações do capítulo de forma formatada.
     * mostra o número, título e quantidade de páginas do capítulo.
     */
    public void exibirInfo() {
        System.out.println("  Capítulo " + numero + ": " + titulo + 
                         " (" + numPaginas + " páginas)");
    }
}