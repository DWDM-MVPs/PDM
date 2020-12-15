package tk.milkenm.starbuzz_app;

public class Shop {
    // PROPRIEDADES DA CLASSE "SHOP"
    private String name;
    private String description;
    private int imageResourceId;

    // UMA ARRAY DE SHOPS PARA SER USADA NA LISTAGEM DOS PRODUTOS
    public static final Shop[] shops = {
            new Shop("D. Sancho", "Situado no primeiro andar de uma casa medieval", R.drawable.d_sancho),
            new Shop("Varanda da Estrela", "Um local onde o detalhe é importante", R.drawable.varanda_da_estrela),
            new Shop("O Pescador", "Um ambiente descontraído", R.drawable.o_pescador)
    };

    // CONSTRUTOR DA CLASSE QUE LEVA UM NOME, DESCRIÇÃO E O RECURSO DA IMAGEM
    private Shop(String name, String description, int imageResouceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResouceId;
    }

    // DEVOLVE A DESCRIÇÃO DA SHOP
    public String getDescription() {
        return description;
    }

    // DEVOLVE O NOME DA SHOP
    public String getName() {
        return name;
    }

    // DEVOLVE A IMAGEM DA SHOP
    public int getImageResourceId() {
        return imageResourceId;
    }

    // DEVOLVE O NOME DA SHOP
    public String toString() {
        return this.name;
    }
}
