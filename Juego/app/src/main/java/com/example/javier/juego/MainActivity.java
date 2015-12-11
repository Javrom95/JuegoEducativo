package com.example.javier.juego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView title;
    String maintext;
Button sig1, sig2, sig3, sig4;

    public void geoPuls(View view){
        Intent geoIntent = new Intent(getApplicationContext(),GeoTest.class);
        startActivity(geoIntent);
    }

    public void bioPuls(View view){
        Intent bioIntent = new Intent(getApplicationContext(),BioTest.class);
        startActivity(bioIntent);
    }

    public void mathPuls(View view){
        Intent mathIntent= new Intent(getApplicationContext(),MathTest.class);
        startActivity(mathIntent);
    }

    public void asrtoPuls(View view){
        Intent astroIntent= new Intent(getApplicationContext(),AstroTest.class);
        startActivity(astroIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        title = (TextView)findViewById(R.id.textView);
        sig1 = (Button) findViewById(R.id.bioQuiz);
        sig2 = (Button) findViewById(R.id.geoQuiz);
        sig3 = (Button) findViewById(R.id.mathQuiz);
        sig4 = (Button) findViewById(R.id.astroQuiz);

        title.setText(R.string.maintext);
        sig1.setText(R.string.subject1);
        sig2.setText(R.string.subject2);
        sig3.setText(R.string.subject3);
        sig4.setText(R.string.subject4);


    }
}
