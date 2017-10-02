package iam4208017.escoladeltreball.org.conversores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn_convert);

        button.setOnClickListener((view) -> convertir());
    }

    /**
     * convierte euro a dollar
     */
    private void convertir() {
        EditText et1, et2;
        et1 = (EditText)findViewById(R.id.txt_euro);
        et2 = (EditText)findViewById(R.id.txt_dollar);
        String valor_euro = et1.getText().toString();
        Toast.makeText(this, ""+valor_euro, Toast.LENGTH_LONG).show();

        Double conv = Double.valueOf(valor_euro) * 1.17;

        et2.setText(String.valueOf(conv));
    }
}
