package gvp.modelo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Roupa extends Item implements IEmprestavel, ILavavel {
    private static final long serialVersionUID = 3437487021941729408L;
	private String tipo; // camisa, calça etc.
    private LocalDateTime dataEmprestimo;
//    private String emprestadoPara;
    private int lavagens;

    public Roupa(String nome, String tipo, String cor, String tamanho, String lojaOrigem, String conservacao, String imagem) {
        super(nome, cor, tamanho, lojaOrigem, conservacao, imagem);
        this.tipo = tipo;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void registrarEmprestimo(String nomePessoa, LocalDateTime data) {
//        this.emprestadoPara = nomePessoa;
        this.dataEmprestimo = data;
    }

    @Override
    public long quantidadeDeDiasDesdeOEmprestimo() {
        if (dataEmprestimo == null) return -1;
        return ChronoUnit.DAYS.between(dataEmprestimo, LocalDateTime.now());
    }

    @Override
    public void registrarDevolucao() {
        this.dataEmprestimo = null;
//        this.emprestadoPara = null;
    }

    @Override
    public void registrarLavagem(LocalDateTime data) {
        lavagens++;
    }

    public int getLavagens() {
        return lavagens;
    }
}
