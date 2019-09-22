package com.example.challenge01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    Button firstPageButton,firstpageButtonTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        firstPageButton= findViewById(R.id.pageOne); //finding button by id and setting it to the object
//        firstPageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"you are on first Page",Toast.LENGTH_LONG).show();
//            }
//        });
//        firstpageButtonTwo=findViewById(R.id.button2);
//        firstpageButtonTwo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(android.view.View view) {
//                Intent pageTwo = new Intent(MainActivity.this, Activity_two.class);
//                startActivity(pageTwo);
//            }
//        });
    }

}
