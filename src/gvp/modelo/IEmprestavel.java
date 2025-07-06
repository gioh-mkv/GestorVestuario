package gvp.modelo;

import java.time.LocalDateTime;

public interface IEmprestavel {
    void registrarEmprestimo(String nomePessoa, LocalDateTime data);
    long quantidadeDeDiasDesdeOEmprestimo();
    void registrarDevolucao();
}