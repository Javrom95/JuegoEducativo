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
public class BioTest extends AppCompatActivity {

    byte quizcount=1, correctans=0, wrongans=0;

    TextView bionumb, bioquiz, totalcorr, totalwrong, correctcount, wrongcount;
    Button bioans1, bioans2, bioans3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biotest);

        bionumb = (TextView) findViewById(R.id.bioquestNum);
        bioquiz = (TextView) findViewById(R.id.bioquestQuiz);
        bioans1 = (Button) findViewById(R.id.bioans1);
        bioans2 = (Button) findViewById(R.id.bioans2);
        bioans3 = (Button) findViewById(R.id.bioans3);
        totalcorr = (TextView) findViewById(R.id.totalCorr);
        totalwrong = (TextView) findViewById(R.id.totalWrong);
        correctcount = (TextView) findViewById(R.id.correctans);
        wrongcount = (TextView) findViewById(R.id.wrongans);

        bionumb.setText(R.string.quiz+quizcount);
        bioquiz.setText(R.string.bioquiz1);
        bioans1.setText(R.string.bioans1_1);
        bioans2.setText(R.string.bioans1_2);
        bioans3.setText(R.string.bioans1_3);
        totalcorr.setText(R.string.correctans);
        totalwrong.setText(R.string.wrongans);

    }

    public void bioPuls1 (View view){
        if(quizcount==5 || quizcount==7){
            //It´s correct, so add the correct counter +1.
            correctans++;
            correctcount.setText(""+correctans);

        }else{
            wrongans++;
            wrongcount.setText(""+wrongans);
        }

        changeText();
        quizcount++;
        //Changes all the text for the next question:
        //
        //
    }


    public void bioPuls2 (View view){

        if(quizcount==1 || quizcount == 2){
            correctans++;
            correctcount.setText(""+correctans);
        }else{
            wrongans++;
            wrongcount.setText(""+wrongans);
        }

        changeText();
        quizcount++;
        //Changes all the text for the next question:
        //
        //
    }
    public void bioPuls3 (View view){
        if(quizcount==3 || quizcount==4 || quizcount==6){
            correctans++;
            correctcount.setText(""+correctans);
        }else{
            wrongans++;
            wrongcount.setText(""+wrongans);
        }

        changeText();
        quizcount++;
        //Changes all the text for the next question:
        //
        //
    }

    public void changeText(){

        if(quizcount==1){
            bionumb.setText(R.string.quiz+quizcount);
            bioquiz.setText(R.string.bioquiz2);
            bioans1.setText(R.string.bioans2_1);
            bioans2.setText(R.string.bioans2_2);
            bioans3.setText(R.string.bioans2_3);
            totalcorr.setText(R.string.correctans);
            totalwrong.setText(R.string.wrongans);
        }

        if(quizcount==2){
            bionumb.setText(R.string.quiz+quizcount);
            bioquiz.setText(R.string.bioquiz3);
            bioans1.setText(R.string.bioans3_1);
            bioans2.setText(R.string.bioans3_2);
            bioans3.setText(R.string.bioans3_3);
            totalcorr.setText(R.string.correctans);
            totalwrong.setText(R.string.wrongans);
        }

        if(quizcount==3){
            bionumb.setText(R.string.quiz+quizcount);
            bioquiz.setText(R.string.bioquiz4);
            bioans1.setText(R.string.bioans4_1);
            bioans2.setText(R.string.bioans4_2);
            bioans3.setText(R.string.bioans4_3);
            totalcorr.setText(R.string.correctans);
            totalwrong.setText(R.string.wrongans);
        }

        if(quizcount==4){
            bionumb.setText(R.string.quiz+quizcount);
            bioquiz.setText(R.string.bioquiz5);
            bioans1.setText(R.string.bioans5_1);
            bioans2.setText(R.string.bioans5_2);
            bioans3.setText(R.string.bioans5_3);
            totalcorr.setText(R.string.correctans);
            totalwrong.setText(R.string.wrongans);
        }

        if(quizcount==5){
            bionumb.setText(R.string.quiz+quizcount);
            bioquiz.setText(R.string.bioquiz6);
            bioans1.setText(R.string.bioans6_1);
            bioans2.setText(R.string.bioans6_2);
            bioans3.setText(R.string.bioans6_3);
            totalcorr.setText(R.string.correctans);
            totalwrong.setText(R.string.wrongans);
        }

        if(quizcount==6){
            bionumb.setText(R.string.quiz+quizcount);
            bioquiz.setText(R.string.bioquiz7);
            bioans1.setText(R.string.bioans7_1);
            bioans2.setText(R.string.bioans7_2);
            bioans3.setText(R.string.bioans7_3);
            totalcorr.setText(R.string.correctans);
            totalwrong.setText(R.string.wrongans);
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
