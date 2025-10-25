package atividade_relacionamento;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String isbn;
    private int anoPublicacao;
    private int numPaginas;
    private Autor autor;
    private List<Capitulo> capitulos;
    private List<Imagem> imagens;
    
    /**
     * construtor da classe Livro.
     * @param titulo o título do livro
     * @param isbn o código ISBN do livro
     * @param anoPublicacao o ano em que o livro foi publicado
     * @param numPaginas o numero total de páginas do livro
     */
    public Livro(String titulo, String isbn, int anoPublicacao, int numPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.numPaginas = numPaginas;
        this.capitulos = new ArrayList<>();
        this.imagens = new ArrayList<>();
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    public int getNumPaginas() {
        return numPaginas;
    }
    
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public Autor getAutor() {
        return autor;
    }
    
    /**
     * adiciona um novo capitulo à lista de capítulos do livro.
     * @param capitulo o capitulo a ser adicionado ao livro
     */
    public void adicionarCapitulo(Capitulo capitulo) {
        capitulos.add(capitulo);
    }
    
    /**
     * remove um capítulo específico da lista de capítulos do livro.
     * @param capitulo o capitulo a ser removido do livro
     */
    public void removerCapitulo(Capitulo capitulo) {
        capitulos.remove(capitulo);
    }
    
    public List<Capitulo> getCapitulos() {
        return capitulos;
    }
    
    /**
     * adiciona uma nova imagem à lista de imagens do livro.
     * @param imagem A imagem a ser adicionado ao livro
     */
    public void adicionarImagem(Imagem imagem) {
        imagens.add(imagem);
    }
    
    /**
     * remove uma imagem específica da lista de imagens do livro.
     * @param imagem a magem a ser removido do livro
     */
    public void removerImagem(Imagem imagem) {
        imagens.remove(imagem);
    }
    
    public List<Imagem> getImagens() {
        return imagens;
    }
    
    /**
     * Exibe no console todas as informações completas do livro, com capitulos, imagens e autores.
     */
    public void exibirInfo() {
        System.out.println("\n=== INFORMAÇÕES DO LIVRO ===");
        System.out.println("Título: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Número de Páginas: " + numPaginas);
        
        if (autor != null) {
            System.out.println("\n--- Autor ---");
            autor.exibirInfo();
        }
        
        if (!capitulos.isEmpty()) {
            System.out.println("\n--- Capítulos (" + capitulos.size() + ") ---");
            for (Capitulo cap : capitulos) {
                cap.exibirInfo();
            }
        }
        
        if (!imagens.isEmpty()) {
            System.out.println("\n--- Imagens (" + imagens.size() + ") ---");
            for (Imagem img : imagens) {
                img.exibirInfo();
            }
        }
    }
}