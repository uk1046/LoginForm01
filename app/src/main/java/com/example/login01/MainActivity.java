package com.example.login01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bttn;
    EditText txt1,txt2;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bttn = (Button)findViewById(R.id.btn01);
        txt1 = (EditText)findViewById(R.id.userId);
        txt2 = (EditText) findViewById(R.id.pass);
        tv1 = (TextView) findViewById(R.id.msg);
        bttn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(txt1.getText().toString().isEmpty() && txt2.getText().toString().isEmpty()){
                tv1.setText("Enter\nAll\nFields!");
                }
                else{
                    tv1.setText("Login\nSuccessful!");
                }
            }

        });

    }
}