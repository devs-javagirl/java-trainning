public class ServicoProduto {
    public static void main(String[] args) {
        try {
            mostrarDescricaoPreenchida();
            mostrarDescricaoNula();
            mostrarDescricaoOjetoNulo();

        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void mostrarDescricaoOjetoNulo() {
        System.out.println("Produto Nulo:");
        Produto produto = null;
        String descricao = produto.getDescricao();
        System.out.println(descricao);
    }


    public static void mostrarDescricaoNula() {
        System.out.println("Produto Sem Descrição:");
        Produto produto = new Produto();
        String descricao = produto.getDescricao();
        System.out.println(descricao);
    }

    public static void mostrarDescricaoPreenchida() {
        System.out.println("Produto com Descrição:");
        Produto produto = new Produto("Livro 'A Vida de Ada Lovelace'");
        String descricao = produto.getDescricao();
        System.out.println(descricao);
    }
}
