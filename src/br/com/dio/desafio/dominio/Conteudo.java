package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final Double XP_PADRAO = 10d; //protected dá acesso aos "filhos" de Conteudo e static significa que posso usar fora dessa classe
    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
