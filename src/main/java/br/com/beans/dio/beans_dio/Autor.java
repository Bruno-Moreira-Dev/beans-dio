package br.com.beans.dio.beans_dio;

public class Autor implements IAutor {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirAutor() {
        System.out.println(nome);
    }
}
