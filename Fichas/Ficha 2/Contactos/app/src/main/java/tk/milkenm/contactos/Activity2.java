package tk.milkenm.contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ((TextView)findViewById(R.id.textView_nome)).setText(getIntent().getStringExtra("nome"));
        ((TextView)findViewById(R.id.textView_sobrenome)).setText(getIntent().getStringExtra("sobrenome"));
    }

    public void onClick(View v)
    {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}