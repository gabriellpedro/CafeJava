
package cafejava;

public class Cappuccino extends Cafe {
    
    public Cappuccino(String nome, double preco, String descricao, Integer qtdMl) {
        super(nome, preco, descricao, qtdMl);
    }
    
     @Override
    public String toString() {
        return String.format("Nome: %s\nPreco: %s\nDescricao: %s\nQuantidade Ml: %s", 
                this.nome, 
                this.preco, 
                this.descricao,
                this.qtdMl);
    }
    
}
