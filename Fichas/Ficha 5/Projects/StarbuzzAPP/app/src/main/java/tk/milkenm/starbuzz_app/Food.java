package tk.milkenm.starbuzz_app;

public class Food {
    private String name;
    private String description;
    private int imageResourceId;
    //drinks is an array of Foods
    public static final Food[] foods = {
            new Food("Pastéis de bacalhau", "6 deliciosos pastéis de bacalhau", R.drawable.pasteis_de_bacalhau),
            new Food("Bacalhau à brás", "Um prato típico portugues", R.drawable.bacalhau_a_bras),
            new Food("Alheira de Mirandela", "Um prato clássico da gastronomia portuguesa", R.drawable.alheira_de_mirandela)
    };

    //Each Drink has a name, description, and an image resource
    private Food(String name, String description, int imageResouceId) {
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
