package com.example.app;

import android.content.Intent;
import android.net.Uri;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    Button   btn,btn2;

    Nombres n = new Nombres();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        textView = findViewById(R.id.texto);
        textView.setMovementMethod(new ScrollingMovementMethod());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i=0;i<=234;i++){ //012 5 5 5

                  textView.append(n.generarPalabras());


                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               llamar();
            }
        });
    }

    public void llamar(){

        Uri uri = Uri.parse("tel:2214103546");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);


    }
}