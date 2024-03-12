package Negocio;

import Modelagem.Livro;

public class Livraria {
	private Livro[] livros;
    private int tamanho;
    private final int capacidadeInicial = 10;

    public Livraria() {
        livros = new Livro[capacidadeInicial];
        tamanho = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (tamanho == livros.length) {
            Livro[] novoArray = new Livro[livros.length * 2];
            System.arraycopy(livros, 0, novoArray, 0, livros.length);
            livros = novoArray;
        }
        livros[tamanho++] = livro;
    }

    public String listarLivros() {
        StringBuilder lista = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            lista.append(livros[i].getTitulo()).append(" - ").append(livros[i].getAutor()).append("\n");
        }
        return lista.toString();
    }
}