package com.example.javier.juego;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Javier on 10/12/2015.
 */
public class Results extends AppCompatActivity{

    TextView maintext, resulttext;
    Button cont, share;
    String notafinal ="Algo.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reult);

        maintext = (TextView) findViewById(R.id.textView2);
        resulttext = (TextView) findViewById(R.id.textView3);
        cont = (Button) findViewById(R.id.contbutton);
        share = (Button) findViewById(R.id.button);

        maintext.setText(R.string.result);
        cont.setText(R.string.volver);
        share.setText(R.string.share);
        Bundle bund = getIntent().getExtras();
        String nota = bund.getString("nota");
        String total = bund.getString("total");
        resulttext.setText("" + nota + " sobre " + total);
        String resul="Resul";

        if(Integer.parseInt(nota)>=4){
            resul =""+R.string.aprobado;
        }else if(Integer.parseInt(nota)<4)
            resul=""+R.string.suspenso;




        Toast toast = Toast.makeText(getApplicationContext(),
                resul, Toast.LENGTH_SHORT) ;
        toast.show();

    }
    public void pulsar(View view){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }

   public void share(View view){
       Intent send = new Intent();
       send.setAction(Intent.ACTION_SEND);
       send.putExtra(Intent.EXTRA_TEXT, "text");
       send.setType("text/plain");
       startActivity(send);

   }
}