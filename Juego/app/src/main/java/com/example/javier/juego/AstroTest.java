package com.example.javier.juego;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Javier on 29/11/2015.
 */
public class AstroTest extends AppCompatActivity {

    byte quizcount=1;
    byte correctans=0, wrongans=0;

    TextView astronumb, astroquiz,totalcorr, totalwrong, correctcount, wrongcount;
    Button astroans1, astroans2, astroans3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.astrotest);

        astronumb = (TextView) findViewById(R.id.astroquestNum);
        astroquiz = (TextView) findViewById(R.id.astroquestQuiz);
        astroans1 = (Button) findViewById(R.id.astroans1);
        astroans2 = (Button) findViewById (R.id.astroans2);
        astroans3 = (Button) findViewById (R.id.astroans3);
        totalcorr = (TextView) findViewById(R.id.totalCorr);
        totalwrong = (TextView) findViewById(R.id.totalWrong);
        correctcount = (TextView) findViewById(R.id.correctans);
        wrongcount = (TextView) findViewById(R.id.wrongans);

    }

    public void astroPuls1 (View view){

        if(quizcount==1 || quizcount==7){
            //It´s correct, so add the correct counter +1.
            correctans++;
            correctcount.setText(""+correctans);

        }else{
            wrongans++;
            wrongcount.setText(""+wrongans);
        }
        quizcount++;

        //Changes all the text for the next question:
        //
        //
    }


    public void astroPuls2 (View view){

        if(quizcount==2 || quizcount == 6){
            correctans++;
            correctcount.setText(""+correctans);
        }else{
            wrongans++;
            wrongcount.setText(""+wrongans);
        }
        quizcount++;
        //Changes all the text for the next question:
        //
        //
    }
    public void astroPuls3 (View view){
        if(quizcount==3 || quizcount==4 || quizcount==5){
            correctans++;
            correctcount.setText(""+correctans);
        }else{
            wrongans++;
            wrongcount.setText(""+wrongans);
        }
        quizcount++;
        //Changes all the text for the next question:
        //
        //
    }




}
