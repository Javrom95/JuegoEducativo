package com.example.javier.juego;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Javier on 28/11/2015.
 */
public class GeoTest extends AppCompatActivity {
 String numbquiz, quiz, ans1, ans2, ans3;
    byte quizcount=1, correctans=0, wrongans=0;

    TextView geonumb,totalcorr, totalwrong, geoquiz, correctcount, wrongcount;
    Button geoans1, geoans2, geoans3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.geotest);

        geonumb = (TextView) findViewById(R.id.geoquestNum);
        geoquiz = (TextView) findViewById(R.id.geoquestQuiz);
        geoans1 = (Button) findViewById(R.id.geoans1);
        geoans2 = (Button) findViewById (R.id.geoans2);
        geoans3 = (Button) findViewById (R.id.geoans3);
        totalcorr = (TextView) findViewById(R.id.totalCorr);
        totalwrong = (TextView) findViewById(R.id.totalWrong);
        correctcount = (TextView) findViewById(R.id.correctnum);
        wrongcount = (TextView) findViewById(R.id.wrongnum);

        geonumb.setText(R.string.quiz+quizcount);
        geoquiz.setText(R.string.geoquiz1);
        geoans1.setText(R.string.geoans1_1);
        geoans2.setText(R.string.geoans1_2);
        geoans3.setText(R.string.geoans1_3);
        totalcorr.setText(R.string.correctans);
        totalwrong.setText(R.string.wrongans);


    }


    public void geoPuls1 (View view){
        if(quizcount==1 || quizcount==4){
            //It´s correct, so add the correct counter +1.
            correctcount.setText(""+correctans);

        }else{
            wrongans++;
            wrongcount.setText(""+wrongans);
        }

        changeText();
        quizcount++;

     }


    public void geoPuls2 (View view){

        if(quizcount==3 || quizcount == 5){
            correctans++;
            correctcount.setText(""+correctans);
        }else{
            wrongans++;
            wrongcount.setText(""+wrongans);
        }
       changeText();
        quizcount++;

    }
    public void geoPuls3 (View view){
if(quizcount==2 || quizcount==6 || quizcount==7){
    correctans++;
    correctcount.setText(""+correctans);
}else{
    wrongans++;
    wrongcount.setText(""+wrongans);
}

        changeText();
        quizcount++;
    }

    public void changeText(){

        if(quizcount==1){
            geonumb.setText(R.string.quiz+quizcount);
            geoquiz.setText(R.string.geoquiz2);
            geoans1.setText(R.string.geoans2_1);
            geoans2.setText(R.string.geoans2_2);
            geoans3.setText(R.string.geoans2_3);

        }

        if(quizcount==2){
            geonumb.setText(R.string.quiz+quizcount);
            geoquiz.setText(R.string.geoquiz3);
            geoans1.setText(R.string.geoans3_1);
            geoans2.setText(R.string.geoans3_2);
            geoans3.setText(R.string.geoans3_3);

        }

        if(quizcount==3){
            geonumb.setText(R.string.quiz+quizcount);
            geoquiz.setText(R.string.geoquiz4);
            geoans1.setText(R.string.geoans4_1);
            geoans2.setText(R.string.geoans4_2);
            geoans3.setText(R.string.geoans4_3);

        }

        if(quizcount==4){
            geonumb.setText(R.string.quiz+quizcount);
            geoquiz.setText(R.string.geoquiz5);
            geoans1.setText(R.string.geoans5_1);
            geoans2.setText(R.string.geoans5_2);
            geoans3.setText(R.string.geoans5_3);

        }

        if(quizcount==5){
            geonumb.setText(R.string.quiz+quizcount);
            geoquiz.setText(R.string.geoquiz6);
            geoans1.setText(R.string.geoans6_1);
            geoans2.setText(R.string.geoans6_2);
            geoans3.setText(R.string.geoans6_3);

        }

        if(quizcount==6){
            geonumb.setText(R.string.quiz+quizcount);
            geoquiz.setText(R.string.geoquiz7);
            geoans1.setText(R.string.geoans7_1);
            geoans2.setText(R.string.geoans7_2);
            geoans3.setText(R.string.geoans7_3);

        }

        if(quizcount==7){
            Intent intent = new Intent(getApplicationContext(),Results.class);
            String note = ""+correctans;
            intent.putExtra("nota",note);
            String total =""+quizcount;
            intent.putExtra("total",total);
            startActivity(intent);
        }



    }











}

