package atividade_relacionamento;

public class Autor {
    private String nome;
    private String nacionalidade;
    private String dataNascimento;
    
    /**
     * construtor da classe Autor.
     * @param nome o nome completo do autor
     * @param nacionalidade a nacionalidade do autor
     * @param dataNascimento a data de nascimento do autor
     */
    public Autor(String nome, String nacionalidade, String dataNascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public String getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    /**
     * exibe as informações completas do autor.
     */
    public void exibirInfo() {
        System.out.println("Autor: " + nome + " | Nacionalidade: " + nacionalidade + 
                         " | Data Nascimento: " + dataNascimento);
    }
}