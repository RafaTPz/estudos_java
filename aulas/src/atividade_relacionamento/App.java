package atividade_relacionamento;

public class App {
    public static void main(String[] args) {
        System.out.println("APP RODANDO\n");
        
        Autor autor = new Autor("Machado de Assis", "Brasileiro", "21/06/1839");
        System.out.println("Autor criado:");
        autor.exibirInfo();
        
        Livro livro = new Livro("Dom Casmurro", "978-8535908770", 1899, 256);
        livro.setAutor(autor);
        
        livro.adicionarCapitulo(new Capitulo(1, "Do título", 8));
        livro.adicionarCapitulo(new Capitulo(2, "Do livro", 6));
        livro.adicionarCapitulo(new Capitulo(3, "A denúncia", 10));
        livro.adicionarCapitulo(new Capitulo(4, "Um dever amaríssimo", 12));
        livro.adicionarCapitulo(new Capitulo(5, "O agregado", 15));
        
        livro.adicionarImagem(new Imagem("Capa do Livro", "JPG", 800, 1200));
        livro.adicionarImagem(new Imagem("Retrato de Capitu", "PNG", 600, 800));
        livro.adicionarImagem(new Imagem("Ilustração Capítulo 3", "PNG", 1024, 768));
        
        livro.exibirInfo();
        
        Capitulo capRemover = livro.getCapitulos().get(1);
        System.out.println("Removendo capítulo: " + capRemover.getTitulo());
        livro.removerCapitulo(capRemover);
        
        Imagem imgRemover = livro.getImagens().get(0);
        System.out.println("Removendo imagem: " + imgRemover.getTitulo());
        livro.removerImagem(imgRemover);
        
        livro.exibirInfo();
        
    }
}