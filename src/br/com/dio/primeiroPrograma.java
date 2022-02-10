package br.com.dio;

import model.Cat;

public class primeiroPrograma {
    public static void main(String[] args) {

        Cat cat = new Cat();
        System.out.println(cat);


        Livro livro1 = new Livro("The best book",300);
        System.out.println(livro1);


        /*int a = 5;
        int b = 3;


        System.out.println("hi there" + (a+b));
*/
    }
}
class Livro {

    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}


