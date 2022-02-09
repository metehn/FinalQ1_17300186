package me.metehanersoy.finalq1_17300186;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textViewTitle, textViewSub;
    Button buttonMain;

    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("CMSE419_Final_Q1");


        buttonMain = findViewById(R.id.buttonMain);

        textViewTitle = findViewById(R.id.textViewTitle);
        textViewSub = findViewById(R.id.textViewSub);


        int number2 = Count.count;
        int number = (int) (Math.random() * number2);
        textViewTitle.setText("Random number between 0 and "+Count.count);
        textViewSub.setText(Integer.toString(number));


        buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);

            }
        });



    }
}