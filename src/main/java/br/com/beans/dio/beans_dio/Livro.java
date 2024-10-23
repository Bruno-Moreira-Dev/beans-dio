package br.com.beans.dio.beans_dio;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {

    private String nome;
    private String codigo;

    @Autowired
    IAutor autorLivro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public IAutor getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(IAutor autorLivro) {
        this.autorLivro = autorLivro;
    }

    public void exibir() {
        System.out.println(nome  + " - " + codigo);
        autorLivro.exibirAutor();
    }
}
