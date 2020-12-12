package tk.milkenm.videoteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class GridItemActivity extends AppCompatActivity {

    TextView label_movieName;
    ImageView pictureBox_movieImage;
    TextView label_movieDirectors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item);

        label_movieName = findViewById(R.id.label_movieName);
        pictureBox_movieImage = findViewById(R.id.pictureBox_moviePicture);
        label_movieDirectors = findViewById(R.id.label_movieDirectors2);

        Intent i = getIntent();
        label_movieName.setText(i.getStringExtra("name"));
        pictureBox_movieImage.setImageResource(i.getIntExtra("image", 0));
        label_movieDirectors.setText(i.getStringExtra("directors"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}