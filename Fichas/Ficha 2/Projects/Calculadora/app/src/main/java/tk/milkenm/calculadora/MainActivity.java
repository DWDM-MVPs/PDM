package tk.milkenm.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v)
    {
        String num1 = ((EditText)findViewById(R.id.editText_number1)).getText().toString();
        String num2 = ((EditText)findViewById(R.id.editText_number2)).getText().toString();

        if (num1.equals("") || num2.equals(""))
        {
            showToast("Preencha todos os campos!");
            return;
        }

        Button b = (Button)v;

        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);

        double result = 0;
        switch (b.getText().toString())
        {
            case "+":
                result = n1 + n2;
                    break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
        }

        ((TextView)findViewById(R.id.textView2)).setText("Resultado: " + result);
    }

    public void showToast(String message)
    {
        Context context = getApplicationContext();
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}