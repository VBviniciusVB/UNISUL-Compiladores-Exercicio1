package tabeladesimbolos;

public class Simbolo {

    private String nome;
    private String categoria;
    private int nivel;
    private int geralA;
    private int geralB;

    private Simbolo proximo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getGeralA() {
        return geralA;
    }

    public void setGeralA(int geralA) {
        this.geralA = geralA;
    }

    public int getGeralB() {
        return geralB;
    }

    public void setGeralB(int geralB) {
        this.geralB = geralB;
    }

    public Simbolo getProximo() {
        return proximo;
    }

    public void setProximo(Simbolo proximo) {
        this.proximo = proximo;
    }
}
