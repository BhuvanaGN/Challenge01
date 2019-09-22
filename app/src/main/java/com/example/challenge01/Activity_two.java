package com.example.challenge01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
public class Activity_two extends AppCompatActivity {

    Button secondPageButton1,secondPageButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        secondPageButton1=(Button)findViewById(R.id.page2button1);
        secondPageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you are on Second Page",Toast.LENGTH_LONG).show();
            }
        });
        secondPageButton2=findViewById(R.id.page2button2);
        secondPageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pageOne=new Intent(Activity_two.this,MainActivity.class);
                startActivity(pageOne);
            }
        });
    }
}
