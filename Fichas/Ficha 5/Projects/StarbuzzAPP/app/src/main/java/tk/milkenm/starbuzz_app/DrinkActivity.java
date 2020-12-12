package tk.milkenm.starbuzz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKID = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkId = (Integer)getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkId];

        TextView name = (TextView)findViewById(R.id.label_name);
        name.setText(drink.getName());

        TextView description = (TextView)findViewById(R.id.label_description);
        description.setText(drink.getDescription());

        ImageView photo = (ImageView)findViewById(R.id.pictureBox_photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
    }
}