package br.com.injecao_dependencia;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {
    public static void main(String[] args) {
        Condutor condutor = new Condutor(new Carro());
        condutor.automovel();
    }

    @Autowired
    private final Veiculo veiculo;

    public Condutor(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void automovel() {
        veiculo.acao();
    }
}
