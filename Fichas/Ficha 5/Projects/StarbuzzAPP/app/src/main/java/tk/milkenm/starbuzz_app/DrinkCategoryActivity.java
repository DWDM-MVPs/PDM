package tk.milkenm.starbuzz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends AppCompatActivity {

    // "PLACEHOLDER" PARA UM VALOR ENVIADO PELA ATIVIDADE ANTERIOR ATRAVES DO INTENT
    public static final String EXTRA_TYPE = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        // VAI BUSCAR A CATEGORIA ENVIADA PELA ATIVIDADE ANTERIOR ATRAVES DO INTENT
        String type = (String) getIntent().getExtras().get(EXTRA_TYPE);

        // CRIA UMA LISTVIEW PARA OS ITEMS
        ListView list = (ListView) findViewById(R.id.listView_options);
        if (type.equals("drink")) {
            // CRIA UM LIST ADAPTER COM O LAYOUT "simple_list_item_1" PARA A LISTVIEW "listView_options"
            ArrayAdapter<Drink> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Drink.drinks);
            // DEFINE O ADAPTER DA LIST "listView_options" PARA O QUE CRIAMOS ACIMA PARA QUE OS ITEMS APAREÇAM
            list.setAdapter(listAdapter);
        } else if (type.equals("food")) {
            // O MESMO QUE AS DRINKS, SÓ QUE COM "FOOD"
            ArrayAdapter<Food> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Food.foods);
            list.setAdapter(listAdapter);
        } else if (type.equals("shop")) {
            // O MESMO QUE AS DRINKS, SÓ QUE COM "SHOP"
            ArrayAdapter<Shop> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Shop.shops);
            list.setAdapter(listAdapter);
        }

        // ADICIONA UM EVENTO DE QUANDO O UTILIZADOR CLICA NUM ITEM NA LISTVIEW
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            // DA OVERRIDE NO EVENTO QUE JÁ EXISTE PARA QUE NÓS POSSAMOS CRIAR UM NOSSO
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // QUANDO O UTILIZADOR CLICAR EM UM ITEM CRIA UM INTENT COM INFORMAÇÕES PARA PASSAR PARA A PRÓXIMA ATIVIDADE
                Intent i = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
                // METE O TIPO, NESTE CASO "drink", "food" OU "shop"
                i.putExtra("TYPE", type);
                // METE OUTRO EXTRA COM O INDEX QUE UTILIZADOR CLICOU, DADO PELO EVENTO
                i.putExtra(DrinkActivity.EXTRA_DRINKID, (int) id);
                // COMEÇA A NOVA ATIVIDADE ("DrinkActivity") COM O INTENT CRIADO ACIMA
                startActivity(i);
            }
        };
        // DEFINE O EVENT LISTENER PARA O QUE CRIAMOS ACIMA
        list.setOnItemClickListener(itemClickListener);
    }
}