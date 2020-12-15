package tk.milkenm.starbuzz_app;

public class Food {
    // PROPRIEDADES DA CLASSE "FOOD"
    private String name;
    private String description;
    private int imageResourceId;

    // UMA ARRAY DE FOODS PARA SER USADA NA LISTAGEM DOS PRODUTOS
    public static final Food[] foods = {
            new Food("Pastéis de bacalhau", "6 deliciosos pastéis de bacalhau", R.drawable.pasteis_de_bacalhau),
            new Food("Bacalhau à brás", "Um prato típico portugues", R.drawable.bacalhau_a_bras),
            new Food("Alheira de Mirandela", "Um prato clássico da gastronomia portuguesa", R.drawable.alheira_de_mirandela)
    };

    // CONSTRUTOR DA CLASSE QUE LEVA UM NOME, DESCRIÇÃO E O RECURSO DA IMAGEM
    private Food(String name, String description, int imageResouceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResouceId;
    }

    // DEVOLVE A DESCRIÇÃO DA FOOD
    public String getDescription() {
        return description;
    }

    // DEVOLVE O NOME DA FOOD
    public String getName() {
        return name;
    }

    // DEVOLVE A IMAGEM DA FOOD
    public int getImageResourceId() {
        return imageResourceId;
    }

    // DEVOLVE O NOME DA FOOD
    public String toString() {
        return this.name;
    }
}
