public class ServicoProduto {
    public static void main(String[] args) {
        try {
            mostrarDescricaoPreenchida();
            mostrarDescricaoNula();

        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void mostrarDescricaoPreenchida() {
        System.out.println("Produto 1:");
        Produto produto = new Produto("Livro 'A Vida de Ada Lovelace'");
        String descricao = produto.getDescricao();
        System.out.println(descricao);
    }

    public static void mostrarDescricaoNula() {
        System.out.println("Produto 2:");
        Produto produto = new Produto();
        String descricao = produto.getDescricao();
        System.out.println(descricao);
    }
}
