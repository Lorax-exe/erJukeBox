package com.example.erjukeboxls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button visualizza;
        Button conta;
        Button play;
        TextView numero;
        int c=0;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visualizza = findViewById(R.id.button);
        numero = findViewById(R.id.contatore);

        conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int contatore = 2;
                numero.setText(contatore);
            }
        });

        visualizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(this, "test", Toast.LENGTH_LONG);
                t.show();
                conta = findViewById(R.id.button2);
            }
        });
    }


}