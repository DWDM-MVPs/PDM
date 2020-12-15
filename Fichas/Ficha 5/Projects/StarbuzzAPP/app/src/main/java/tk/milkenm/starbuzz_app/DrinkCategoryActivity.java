package tk.milkenm.starbuzz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends AppCompatActivity {

    public static final String EXTRA_TYPE = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        String type = (String) getIntent().getExtras().get(EXTRA_TYPE);

        ListView list = (ListView) findViewById(R.id.listView_options);
        if (type.equals("drink")) {
            ArrayAdapter<Drink> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Drink.drinks);
            list.setAdapter(listAdapter);
        } else if (type.equals("food")) {
            ArrayAdapter<Food> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Food.foods);
            list.setAdapter(listAdapter);
        } else if (type.equals("shop")) {
            ArrayAdapter<Shop> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Shop.shops);
            list.setAdapter(listAdapter);
        }

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
                i.putExtra("TYPE", type);
                i.putExtra(DrinkActivity.EXTRA_DRINKID, (int) id);
                startActivity(i);
            }
        };

        list.setOnItemClickListener(itemClickListener);
    }
}