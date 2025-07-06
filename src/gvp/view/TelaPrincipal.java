package gvp.view;

import gvp.controller.GestorVestuario;
import gvp.modelo.*;
import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {
    private static final long serialVersionUID = 1L;
	private GestorVestuario gestor;

    public TelaPrincipal() {
        gestor = new GestorVestuario();
        setTitle("GVP - Gestor de Vestuário Pessoal");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        montarInterface();
    }

    private void montarInterface() {
        JPanel painel = new JPanel();
        JButton btnAddRoupa = new JButton("Adicionar Roupa");
        btnAddRoupa.addActionListener(e -> {
            Roupa r = new Roupa("Camisa Azul", "camisa", "azul", "M", "Renner", "boa", "");
            gestor.adicionarItem(r);
            JOptionPane.showMessageDialog(this, "Roupa adicionada!");
        });

        painel.add(btnAddRoupa);
        add(painel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaPrincipal().setVisible(true));
    }
}
