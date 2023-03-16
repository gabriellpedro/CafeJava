package cafejava;

public abstract class Cafe {
    
    String nome;
    double preco;
    String descricao;
    Integer qtdMl;

    public Cafe(String nome, double preco, String descricao, Integer qtdMl){
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.qtdMl = qtdMl;
    }

    public Integer getQtdMl() {
        return qtdMl;
    }

    public void setQtdMl(Integer qtdMl) {
        this.qtdMl = qtdMl;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return null;
    }
   
    
    
}
