package gvp.modelo;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Look implements Serializable {
    private static final long serialVersionUID = 936089135051008160L;
	private String nome;
    private List<Item> itens;
    private List<String> historicoUso;

    public Look(String nome) {
        this.nome = nome;
        this.itens = new ArrayList<>();
        this.historicoUso = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void registrarUso(String descricao) {
        historicoUso.add(descricao);
    }

    public String getNome() {
        return nome;
    }

    public List<Item> getItens() {
        return itens;
    }

    public List<String> getHistoricoUso() {
        return historicoUso;
    }
}
