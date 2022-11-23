package hr.dante_ri.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = findViewById(R.id.editTextTextPersonName);

                Editable editable;
                editable = editText.getText();
                String name;
                name = editable.toString();

                String poruka = "Pozdrav, " + name;
                Toast.makeText(getApplicationContext(), poruka, Toast.LENGTH_SHORT).show();
            }
        });
    }
}