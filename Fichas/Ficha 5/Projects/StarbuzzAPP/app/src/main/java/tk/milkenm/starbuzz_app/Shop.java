package tk.milkenm.starbuzz_app;

public class Shop {
    private String name;
    private String description;
    private int imageResourceId;
    //shops is an array of Shops
    public static final Shop[] shops = {
            new Shop("D. Sancho", "Situado no primeiro andar de uma casa medieval", R.drawable.d_sancho),
            new Shop("Varanda da Estrela", "Um local onde o detalhe é importante", R.drawable.varanda_da_estrela),
            new Shop("O Pescador", "Um ambiente descontraído", R.drawable.o_pescador)
    };

    //Each Drink has a name, description, and an image resource
    private Shop(String name, String description, int imageResouceId) {
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
