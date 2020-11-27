package tk.milkenm.registo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        String nome = ((EditText) findViewById(R.id.editText_nome)).getText().toString();
        String telefone = ((EditText) findViewById(R.id.editText_telefone)).getText().toString();
        String email = ((EditText) findViewById(R.id.editText_email)).getText().toString();

        if (nome.equals("") || telefone.equals("") || email.equals("")) {
            showToast("Preencha todos os campos!");
            return;
        }
        
        if (telefone.length() > 9)
        {
            showToast("O número de telefone não pode ser maior que 9 números");
            return;
        }

        Intent ci = new Intent(ContactsContract.Intents.Insert.ACTION)
                .setType(ContactsContract.RawContacts.CONTENT_TYPE)
                .putExtra(ContactsContract.Intents.Insert.NAME, nome)
                .putExtra(ContactsContract.Intents.Insert.PHONE, telefone)
                .putExtra(ContactsContract.Intents.Insert.EMAIL, email);
        startActivityForResult(ci, 1);
    }

    public void showToast(String message) {
        Context context = getApplicationContext();
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}