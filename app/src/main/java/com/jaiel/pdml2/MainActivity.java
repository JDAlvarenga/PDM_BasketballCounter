package com.jaiel.pdml2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView scoreA;
    private TextView scoreB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreA= findViewById(R.id.txt_scA);
        scoreB= findViewById(R.id.txt_scB);


    }

    public void scored(View v){
        switch (v.getId()){
            case R.id.btn_A1: scoreA.setText((Integer.parseInt(scoreA.getText().toString())+1)+"");
            break;
            case R.id.btn_A2: scoreA.setText((Integer.parseInt(scoreA.getText().toString())+2)+"");
            break;
            case R.id.btn_A3: scoreA.setText((Integer.parseInt(scoreA.getText().toString())+3)+"");
            break;

            case R.id.btn_B1: scoreB.setText((Integer.parseInt(scoreB.getText().toString())+1)+"");
            break;
            case R.id.btn_B2: scoreB.setText((Integer.parseInt(scoreB.getText().toString())+2)+"");
            break;
            case R.id.btn_B3: scoreB.setText((Integer.parseInt(scoreB.getText().toString())+3)+"");
            break;

        }

    }

    public void reset(View v){
        scoreA.setText("0");
        scoreB.setText("0");
    }
}

