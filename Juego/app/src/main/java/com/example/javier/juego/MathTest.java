package com.example.javier.juego;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Javier on 28/11/2015.
 */
public class MathTest extends AppCompatActivity {

    byte quizcount=1, correctans=0, wrongans=0;

    TextView mathnumb, mathquiz,totalcorr, totalwrong, correctcount, wrongcount;
    Button mathans1, mathans2, mathans3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mathtest);

        mathnumb = (TextView) findViewById(R.id.mathquestNum);
        mathquiz = (TextView) findViewById(R.id.mathquestQuiz);
        mathans1 = (Button) findViewById(R.id.mathans1);
        mathans2 = (Button) findViewById (R.id.mathans2);
        mathans3 = (Button) findViewById (R.id.mathans3);
        totalcorr = (TextView) findViewById(R.id.totalCorr);
        totalwrong = (TextView) findViewById(R.id.totalWrong);
        correctcount = (TextView) findViewById(R.id.correctans);
        wrongcount = (TextView) findViewById(R.id.wrongans);


        mathnumb.setText(R.string.quiz+quizcount);
        mathquiz.setText(R.string.mathquiz1);
        mathans1.setText(R.string.mathans1_1);
        mathans2.setText(R.string.mathans1_2);
        mathans3.setText(R.string.mathans1_3);
        totalcorr.setText(R.string.correctans);
        totalwrong.setText(R.string.wrongans);
    }

    public void mathPuls1 (View view){
        if(quizcount==1 || quizcount==7){
            //It´s correct, so add the correct counter +1.
            correctans++;
            Log.i("1.","1.");
            correctcount.setText(""+correctans);
            Log.i("1.1.","1.1.");

        }else{
            wrongans++;
            wrongcount.setText(""+wrongans);
        }

        changeText();
        quizcount++;
    }


    public void mathPuls2 (View view){

        if(quizcount==2 || quizcount == 6){
            correctans++;
            correctcount.setText("" + correctans);
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
    public void mathPuls3 (View view){
        if(quizcount==3 || quizcount==4 || quizcount==5){
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
            mathnumb.setText(R.string.quiz+quizcount);
            mathquiz.setText(R.string.mathquiz2);
            mathans1.setText(R.string.mathans2_1);
            mathans2.setText(R.string.mathans2_2);
            mathans3.setText(R.string.mathans2_3);
            totalcorr.setText(R.string.correctans);
            totalwrong.setText(R.string.wrongans);
        }

        if(quizcount==2){
            mathnumb.setText(R.string.quiz+quizcount);
            mathquiz.setText(R.string.mathquiz3);
            mathans1.setText(R.string.mathans3_1);
            mathans2.setText(R.string.mathans3_2);
            mathans3.setText(R.string.mathans3_3);
            totalcorr.setText(R.string.correctans);
            totalwrong.setText(R.string.wrongans);
        }

        if(quizcount==3){
            mathnumb.setText(R.string.quiz+quizcount);
            mathquiz.setText(R.string.mathquiz4);
            mathans1.setText(R.string.mathans4_1);
            mathans2.setText(R.string.mathans4_2);
            mathans3.setText(R.string.mathans4_3);
            totalcorr.setText(R.string.correctans);
            totalwrong.setText(R.string.wrongans);
        }

        if(quizcount==4){
            mathnumb.setText(R.string.quiz+quizcount);
            mathquiz.setText(R.string.mathquiz5);
            mathans1.setText(R.string.mathans5_1);
            mathans2.setText(R.string.mathans5_2);
            mathans3.setText(R.string.mathans5_3);
            totalcorr.setText(R.string.correctans);
            totalwrong.setText(R.string.wrongans);
        }

        if(quizcount==5){
            mathnumb.setText(R.string.quiz+quizcount);
            mathquiz.setText(R.string.mathquiz6);
            mathans1.setText(R.string.mathans6_1);
            mathans2.setText(R.string.mathans6_2);
            mathans3.setText(R.string.mathans6_3);
            totalcorr.setText(R.string.correctans);
            totalwrong.setText(R.string.wrongans);
        }

        if(quizcount==6){
            mathnumb.setText(R.string.quiz+quizcount);
            mathquiz.setText(R.string.mathquiz7);
            mathans1.setText(R.string.mathans7_1);
            mathans2.setText(R.string.mathans7_2);
            mathans3.setText(R.string.mathans7_3);
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

