package atividade15.model;

public class Biblioteca {
    public String nome;
    public String endereco;
    public Livro[] acervo;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.acervo = new Livro[100];
    }

    public void cadastrarLivro(Livro livro) {
        for (int i = 0; i < this.acervo.length; i++) {
            if (this.acervo[i] == null) {
                this.acervo[i] = livro;
                break;
            }
        }
    }

    public Livro buscarPorTitulo(String titulo) {
        for (int i = 0; i < this.acervo.length; i++) {
            if (this.acervo[i] != null && this.acervo[i].titulo.equalsIgnoreCase(titulo)) {
                return this.acervo[i];
            }
        }
        return null;
    }

    public Livro buscarPorAutor(String autor) {
        for (int i = 0; i < this.acervo.length; i++) {
            if (this.acervo[i] != null && this.acervo[i].autor.equalsIgnoreCase(autor)) {
                return this.acervo[i];
            }
        }
        return null;
    }

    public boolean verificarDisponibilidade(Livro livro) {
        Livro livroAcervo = this.buscarPorTitulo(livro.titulo);
        return livroAcervo != null && livroAcervo.quantidadeEmEstoque > 0;
    }

    public void devolverLivro(Livro livro) {
        Livro livroAcervo = this.buscarPorTitulo(livro.titulo);
        if (livroAcervo != null && this.verificarDisponibilidade(livroAcervo)) {
            livroAcervo.quantidadeEmEstoque++;
            System.out.printf("\"%s\" devolvido para biblioteca\n", livro.titulo);
        } else {
            System.out.println("Não há nenhum exemplar deste livro disponível no estoque");
        }
    }


    public void emprestarLivro(Livro livro) {
        Livro livroAcervo = this.buscarPorTitulo(livro.titulo);
        if (livroAcervo != null && this.verificarDisponibilidade(livroAcervo)) {
            livro.quantidadeEmEstoque--;
            System.out.printf("\"%s\" emprestado pela biblioteca\n", livro.titulo);
        } else {
            System.out.println("Não há nenhum exemplar deste livro disponível no estoque");
        }
    }

    public void exibirInfo() {
        System.out.printf("Nome:  %s\n", this.nome);
        System.out.printf("Endereço:  %s\n", this.endereco);
        for (int i = 0; i < this.acervo.length; i++) {
            if (this.acervo[i] != null) {
                this.acervo[i].exibirInfo();
            }
        }
    }
}
