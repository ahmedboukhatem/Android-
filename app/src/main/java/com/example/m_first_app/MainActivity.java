package com.example.m_first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Taille;
    EditText Mass;
    Button button;
    TextView result;
    ImageView img;
    int ans=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Mass=(EditText) findViewById(R.id.editTextTextPersonName3);
        Taille=(EditText) findViewById(R.id.editTextTextPersonName4);
      button=(Button) findViewById(R.id.button3);
        result = (TextView) findViewById(R.id.textView2);
        img = (ImageView)findViewById(R.id.imageView) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double Mas = Double.parseDouble(Mass.getText().toString());
                double Taill = Double.parseDouble(Taille.getText().toString());
                double resulti = Mas /((Taill)*(Taill));
                if (resulti<6){

                result.setText(Double.toString(resulti)+" you need to eat this ");

                img.setImageResource(R.drawable.img1);}
                if (resulti>40){

                    result.setText(Double.toString(resulti)+" dont eat  ");

                img.setImageResource(R.drawable.img2);}




            }

        });






}}