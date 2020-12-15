package tk.milkenm.starbuzz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    // "PLACEHODLER" PARA UM VALOR QUE É ENVIADO PELA ATIVIDADE ANTERIOR
    public static final String EXTRA_DRINKID = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        // USADO PARA IR BUSCAR OS VALORES ENVIADOS ATRAVES DO INTENT PELA ATIVIDADE ANTERIOR
        String type = (String) getIntent().getExtras().get("TYPE");
        int id = (Integer) getIntent().getExtras().get(EXTRA_DRINKID);

        // VARIAVEIS COM AS VIEWS PARA FACILITAR O ACESSO
        TextView name = (TextView) findViewById(R.id.label_name);
        TextView description = (TextView) findViewById(R.id.label_description);
        ImageView photo = (ImageView) findViewById(R.id.pictureBox_photo);

        // IF-ELSE DOS TIPOS QUE PODE HAVER (USAR 1 ATIVIDADE PARA AS 3 COISAS)
        if (type.equals("drink")) {
            // VAI BUSCAR A DRINK COM O ID QUE FOI CLICADO (ENVIADO PELA ATIVIDADE ANTERIOR)
            Drink drink = Drink.drinks[id];

            // METE O TEXTO DA TEXTVIEW NOME PARA O NOME DA DRINK
            name.setText(drink.getName());
            // METE O TEXTO DA TEXTVIEW DESCRIÇÃO PARA A DESCRIÇÃO DA DRINK
            description.setText(drink.getDescription());
            // METE A IMAGEM DA IMAGEVIEW PARA A FOTO DA DRINK
            photo.setImageResource(drink.getImageResourceId());
            // METE A DESCRIÇÃO DA IMAGEVIEW PARA A DESCRIÇÃO DA DRINK
            photo.setContentDescription(drink.getName());
        } else if (type.equals("food")) {
            // VAI BUSCAR A FOOD COM O ID QUE FOI CLICADO (ENVIADO PELA ATIVIDADE ANTERIOR)
            Food food = Food.foods[id];

            // METE O TEXTO DA TEXTVIEW NOME PARA O NOME DA FOOD
            name.setText(food.getName());
            // METE O TEXTO DA TEXTVIEW DESCRIÇÃO PARA A DESCRIÇÃO DA FOOD
            description.setText(food.getDescription());
            // METE A IMAGEM DA IMAGEVIEW PARA A FOTO DA FOOD
            photo.setImageResource(food.getImageResourceId());
            // METE A DESCRIÇÃO DA IMAGEVIEW PARA A DESCRIÇÃO DA FOOD
            photo.setContentDescription(food.getName());
        } else if (type.equals("shop")) {
            // VAI BUSCAR A SHOP COM O ID QUE FOI CLICADO (ENVIADO PELA ATIVIDADE ANTERIOR)
            Shop shop = Shop.shops[id];

            // METE O TEXTO DA TEXTVIEW NOME PARA O NOME DA SHOP
            name.setText(shop.getName());
            // METE O TEXTO DA TEXTVIEW DESCRIÇÃO PARA A DESCRIÇÃO DA SHOP
            description.setText(shop.getDescription());
            // METE A IMAGEM DA IMAGEVIEW PARA A FOTO DA SHOP
            photo.setImageResource(shop.getImageResourceId());
            // METE A DESCRIÇÃO DA IMAGEVIEW PARA A DESCRIÇÃO DA SHOP
            photo.setContentDescription(shop.getName());
        }
    }
}