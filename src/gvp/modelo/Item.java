package gvp.modelo;

import java.io.Serializable; //interface de marcador(não possui metodos)
// Ela é usada para indicar que um objeto de uma determinada classe pode ser serializado
// Serialização: É o processo de transformar um objeto Java em uma sequência de bytes, permitindo que ele seja 
// armazenado ou transmitido

public abstract class Item implements Serializable {
    private static final long serialVersionUID = 7733109681743863668L;
	protected String nome;
    protected String cor;
    protected String tamanho;
    protected String lojaOrigem;
    protected String conservacao;
    protected String imagem;

    public Item(String nome, String cor, String tamanho, String lojaOrigem, String conservacao, String imagem) {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
        this.lojaOrigem = lojaOrigem;
        this.conservacao = conservacao;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public abstract String getTipo(); // camisa, calça, etc
}

