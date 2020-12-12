package tk.milkenm.videoteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    String[] movieNames = {"Santana", "Lucifer", "Gambito de Dama", "Origens Secretas", "Os Simpsons", "Enola Holmes", "Tudo Bem no Natal Que Vem", "Phineas and Ferb The Movie: Candance Against the Universe", "Fear the Walking Dead", "A Guerra dos Tronos", "Angela's Christmas Wish", "Riverdale", "Campo de Magia", "The Boys", "Umbrella Academy"};
    int[] movieImages = {R.drawable.santana, R.drawable.lucifer, R.drawable.gambito_de_dama, R.drawable.origens_secretas, R.drawable.os_simpsons, R.drawable.enola_holmes, R.drawable.tudo_bem_no_natal_que_vem, R.drawable.phineas_and_ferb_the_movie_candance_against_the_universe, R.drawable.fear_the_walking_dead, R.drawable.a_guerra_dos_tronos, R.drawable.angelas_christmas_wish, R.drawable.riverdale, R.drawable.campo_de_magia, R.drawable.the_boys, R.drawable.umbrella_academy};
    String[] movieDirectors = {"Maradona Dias Dos Santos & Chris Roland", "Tom Kapinos", "Scott Frank & Allan Scott", "David Galán Galindo", "Matt Groening", "Harry Bradbeer", "Roberto Santucci", "Bob Bowen", "Dave Erickson & Robert Kirkman", "David Benioff & D. B. Weiss", "Damien O'Connor", "Roberto Aguirre-Sacasa", "Mark Waters", "Eric Kripke", "Criador(a)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView_filmes);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), GridItemActivity.class);
                i.putExtra("name", movieNames[position]);
                i.putExtra("image", movieImages[position]);
                i.putExtra("directors", movieDirectors[position]);
                startActivity(i);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return movieImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.raw_data, null);

            TextView name = view1.findViewById(R.id.label_movieDirectors);
            ImageView image = view1.findViewById(R.id.pictureBox_movieImage);

            name.setText(movieNames[i]);
            image.setImageResource(movieImages[i]);
            return view1;
        }
    }
}