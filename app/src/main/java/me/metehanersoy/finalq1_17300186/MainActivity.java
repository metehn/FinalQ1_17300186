package me.metehanersoy.finalq1_17300186;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button buttonToast, buttonCount, buttonRandom;
    TextView textViewCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("CMSE419_Final_Q1");

        buttonToast = findViewById(R.id.buttonToast);
        buttonCount =findViewById(R.id.buttonCount);
        buttonRandom = findViewById(R.id.buttonRandom);

        textViewCount = findViewById(R.id.textViewCount);


        if(Count.count != 0){
            textViewCount.setText(Integer.toString(Count.count));

        }else {

            // do nothing
        }



        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Metehan Ersoy 17300186" , Toast.LENGTH_SHORT).show();
            }
        });


        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Count.count +=1;
                textViewCount.setText(Integer.toString(Count.count));

            }
        });

        buttonRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int number = (int) (Math.random() * Count.count);

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });




    }
}