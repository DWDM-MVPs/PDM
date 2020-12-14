package tk.milkenm.starbuzz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_TYPE = null;
    public static final String EXTRA_DRINKID = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int id = (Integer) getIntent().getExtras().get(EXTRA_DRINKID);
        String type = (String) getIntent().getExtras().get(EXTRA_TYPE);

        TextView name = (TextView) findViewById(R.id.label_name);
        TextView description = (TextView) findViewById(R.id.label_description);
        ImageView photo = (ImageView) findViewById(R.id.pictureBox_photo);

        if (type.equals("drink")) {

            Drink drink = Drink.drinks[id];
            name.setText(drink.getName());
            description.setText(drink.getDescription());
            photo.setImageResource(drink.getImageResourceId());
            photo.setContentDescription(drink.getName());
        } else if (type.equals("food")) {
            Food food = Food.foods[id];
            name.setText(food.getName());
            description.setText(food.getDescription());
            photo.setImageResource(food.getImageResourceId());
            photo.setContentDescription(food.getName());
        } else if (type.equals("shop")) {
            Shop shop = Shop.shops[id];
            name.setText(shop.getName());
            description.setText(shop.getDescription());
            photo.setImageResource(shop.getImageResourceId());
            photo.setContentDescription(shop.getName());
        }
    }
}