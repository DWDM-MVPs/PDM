package tk.milkenm.starbuzz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, DrinkCategoryActivity.class);
                if (position == 0) {
                    i.putExtra(DrinkCategoryActivity.EXTRA_TYPE, "drink");
                } else if (position == 1) {
                    i.putExtra(DrinkCategoryActivity.EXTRA_TYPE, "food");
                } else if (position == 2) {
                    i.putExtra(DrinkCategoryActivity.EXTRA_TYPE, "shop");
                }
                startActivity(i);
            }
        };

        ListView listView = (ListView) findViewById(R.id.listView_menu);
        listView.setOnItemClickListener(itemClickListener);
    }
}