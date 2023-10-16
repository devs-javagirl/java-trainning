public class Produto {

    private String descricao;

    public Produto() {
    }
    public Produto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        if(descricao == null) {
            throw new NullPointerException("Descrição não preenchida.");
        }
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
