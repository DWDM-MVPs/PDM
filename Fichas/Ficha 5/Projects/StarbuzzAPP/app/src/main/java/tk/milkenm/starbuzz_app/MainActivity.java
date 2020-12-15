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

        // CRIA UM NOVO CLICK EVENT PARA QUANDO O UTILIZADOR CLICAR EM CIMA DE UMA OPÇAO CORRA O CORIGO DO "onItemClick"
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            // OVERRIDE DO METODO PARA PODERMOS COLOCAR LA O NOSSO CODIGO, POIS ELE JA EXISTE
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // CRIAR UM NOVO INTENT PARA PODER PASSAR INFORMAÇÕES PARA A PRÓXIMA ATIVIDADE
                Intent i = new Intent(MainActivity.this, DrinkCategoryActivity.class);
                // VERIFICA O INDEX EM QUE O UTILIZADOR CLICOU
                if (position == 0) {
                    // CASO SEJA "0" (PRIMEIRO) SIGNIFICA QUE É A OPÇÃO "drink"
                    i.putExtra(DrinkCategoryActivity.EXTRA_TYPE, "drink");
                } else if (position == 1) {
                    // CASO SEJA "1" (SEGUNDO) SIGNIFICA QUE É A OPÇÃO "food"
                    i.putExtra(DrinkCategoryActivity.EXTRA_TYPE, "food");
                } else if (position == 2) {
                    // CASO SEJA "2" (TERCEIRO) SIGNIFICA QUE É A OPÇÃO "shop"
                    i.putExtra(DrinkCategoryActivity.EXTRA_TYPE, "shop");
                }
                // COMEÇA A NOVA ACTIVITY ("DrinkCategoryActivity") COM O INTENT ACIMA
                startActivity(i);
            }
        };

        // VAI BUSCAR A LIST VIEW PARA UMA VARIAVEL PARA MAIS FACIL USO
        ListView listView = (ListView) findViewById(R.id.listView_menu);
        // DEFINE O CLICK LISTENER DA LISTVIEW PARA O QUE CRIAMOS ACIMA, POIS SEM ISSO CLICAR NA LIST VIEW NÃO FARIA NADA
        listView.setOnItemClickListener(itemClickListener);
    }
}

