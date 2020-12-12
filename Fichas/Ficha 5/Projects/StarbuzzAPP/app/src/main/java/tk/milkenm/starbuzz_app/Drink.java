package tk.milkenm.starbuzz_app;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;
    //drinks is an array of Drinks
    public static final Drink[] drinks = {
            new Drink("MeiaLeita", "Um copo de Café com leite", R.drawable.latte),
            new Drink("Cappuccino", "Café com leite em espuma", R.drawable.cappuccino),
            new Drink("Café", "Café lote ouro", R.drawable.filter)
    };
    //Each Drink has a name, description, and an image resource
    private Drink(String name, String description, int imageResouceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResouceId;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String toString() {
        return this.name;
    }
}
