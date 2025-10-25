package atividade_relacionamento;

public class Imagem {
    private String titulo;
    private String formato;
    private int largura;
    private int altura;
    
    /**
     * construtor da classe Imagem.
     * @param titulo o título da imagem
     * @param formato o formato do arquivo
     * @param largura a largura da imagem
     * @param altura a altura da imagem
     */
    public Imagem(String titulo, String formato, int largura, int altura) {
        this.titulo = titulo;
        this.formato = formato;
        this.largura = largura;
        this.altura = altura;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getFormato() {
        return formato;
    }
    
    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    public int getLargura() {
        return largura;
    }
    
    public void setLargura(int largura) {
        this.largura = largura;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    /**
     * exibe no console as informações completas da imagem.
     * mostra o título, formato e dimensões (largura x altura).
     */
    public void exibirInfo() {
        System.out.println("Imagem: " + titulo + " | Formato: " + formato + 
                         " | Dimensões: " + largura + "x" + altura);
    }
}