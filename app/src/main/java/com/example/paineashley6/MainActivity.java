package com.example.paineashley6;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    int ch = 1;
    float font = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // FIX 1: Changed 'txt' to 'TextView'
        final TextView textView = findViewById(R.id.txtHelloWorld);

        Button b1 = findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // FIX 2: Added TypedValue.COMPLEX_UNIT_SP for proper scaling
                textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, font);
                font = font + 5;
                if (font == 50) {
                    font = 30;
                }
            }
        });

        Button b2 = findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ch) {
                    case 1:
                        textView.setTextColor(Color.RED);
                        break;
                    case 2:
                        textView.setTextColor(Color.GREEN);
                        break;
                    case 3:
                        textView.setTextColor(Color.BLUE);
                        break;
                    case 4:
                        textView.setTextColor(Color.CYAN);
                        break;
                    case 5:
                        textView.setTextColor(Color.YELLOW);
                        break;
                    case 6:
                        textView.setTextColor(Color.MAGENTA);
                        break;
                }
                ch++;
                if (ch == 7) {
                    ch = 1;
                }
            }
        });
    }
}