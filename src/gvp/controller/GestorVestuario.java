package gvp.controller;
import gvp.modelo.*;
import java.util.*;
import java.io.*;

public class GestorVestuario {
    private List<Item> itens;
    private List<Look> looks;

    public GestorVestuario() {
        itens = new ArrayList<>();
        looks = new ArrayList<>();
        carregarDados();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
        salvarDados();
    }

    public void removerItem(Item item) {
        itens.remove(item);
        salvarDados();
    }

    public void adicionarLook(Look look) {
        looks.add(look);
        salvarDados();
    }

    public List<Item> getItens() {
        return itens;
    }

    public List<Look> getLooks() {
        return looks;
    }

    private void salvarDados() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("dados.ser"))) {
            out.writeObject(itens);
            out.writeObject(looks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void carregarDados() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("dados.ser"))) {
            itens = (List<Item>) in.readObject();
            looks = (List<Look>) in.readObject();
        } catch (Exception e) {
            itens = new ArrayList<>();
            looks = new ArrayList<>();
        }
    }
}

