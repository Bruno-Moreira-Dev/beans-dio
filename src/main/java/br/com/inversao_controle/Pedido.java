package br.com.inversao_controle;

public class Pedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.gravar();
    }

    private final EnviarEmails enviarEmails = EnviarEmails.obterDadosEmail();

    public void gravar() {
        enviarEmails.retornar("Pedido criado!");
    }
}
