package com.example.app;

import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    Button   btn;

    Nombres n = new Nombres();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        textView = findViewById(R.id.texto);
        textView.setMovementMethod(new ScrollingMovementMethod());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i=0;i<=335;i++){

                  textView.append(n.generarPalabras(4));


                }
            }
        });
    }
}