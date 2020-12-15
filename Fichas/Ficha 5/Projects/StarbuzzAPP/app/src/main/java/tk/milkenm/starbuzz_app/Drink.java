package tk.milkenm.starbuzz_app;

public class Drink {
    // PROPRIEDADES DA CLASSE "DRINK"
    private String name;
    private String description;
    private int imageResourceId;

    // UMA ARRAY DE DRINKS PARA SER USADA NA LISTAGEM DOS PRODUTOS
    public static final Drink[] drinks = {
            new Drink("MeiaLeita", "Um copo de Café com leite", R.drawable.latte),
            new Drink("Cappuccino", "Café com leite em espuma", R.drawable.cappuccino),
            new Drink("Café", "Café lote ouro", R.drawable.filter)
    };

    // CONSTRUTOR DA CLASSE QUE LEVA UM NOME, DESCRIÇÃO E O RECURSO DA IMAGEM
    private Drink(String name, String description, int imageResouceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResouceId;
    }

    // DEVOLVE A DESCRIÇÃO DA DRINK
    public String getDescription() {
        return description;
    }

    // DEVOLVE O NOME DA DRINK
    public String getName() {
        return name;
    }

    // DEVOLVE A IMAGEM DA DRINK
    public int getImageResourceId() {
        return imageResourceId;
    }

    // DEVOLVE O NOME DA DRINK
    public String toString() {
        return this.name;
    }
}



