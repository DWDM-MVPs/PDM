package tk.milkenm.contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v)
    {
        Intent i = new Intent(this, Activity2.class);
        i.putExtra("nome", ((EditText)findViewById(R.id.editText_nome)).getText().toString());
        i.putExtra("sobrenome", ((EditText)findViewById(R.id.editText_sobrenome)).getText().toString());

        startActivity(i);
        finish();
    }
}