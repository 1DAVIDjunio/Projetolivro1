package Visao;

import javax.swing.JOptionPane;

import Modelagem.Livro;
import Negocio.Livraria;

public class Main {

	 public static void main(String[] args) {
	        Livraria livraria = new Livraria();

	        while (true) {
	            String escolha = JOptionPane.showInputDialog("Escolha uma opção:\n1. Adicionar Livro\n2. Listar Livros\n3. Sair");
	            if (escolha == null || escolha.equals("3")) {
	                break;
	            }
	            switch (escolha) {
	                case "1":
	                    String titulo = JOptionPane.showInputDialog("Digite o título do livro:");
	                    String autor = JOptionPane.showInputDialog("Digite o autor do livro:");
	                    livraria.adicionarLivro(new Livro(titulo, autor));
	                    JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!");
	                    break;
	                case "2":
	                    JOptionPane.showMessageDialog(null, "Lista de Livros:\n" + livraria.listarLivros());
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Opção inválida!");
	            }
	        }
	    }
	}