package tk.milkenm.restaurante;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // DEFINE A TOOLBAR "toolbar" COMO A TOOLBAR PREDEFINIDA DA JANELA "MainActivity"
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // ADICIONA ITEMS NA ACTION BAR, NESTE CASO NA TOOLBAR "toolbar"
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    // OCORRE QUANDO O UTILIZADOR CLICA EM UM ITEM PRESENTE NA "toolbar"
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // FAZ UM SWTICH PELO ID DO ITEM CLICADO
        switch (item.getItemId()) {
            case R.id.action_create_order:
                // CASO TENHA SIDO O "action_create_order" CRIA UM INTENT PARA COMEÇAR UMA NOVA ATIVIDADE
                Intent intent = new Intent(this, OrderActivity.class);
                // QUE NESTE CASO E A ATIVIDADE "OrderActivity"
                startActivity(intent);
                return true;
            default:
                // CASO NAO O SWITCH NAO TENHA A OPÇÃO CLICADA, USA O EVENTO "DEFAULT"
                return super.onOptionsItemSelected(item);
        }
    }
}