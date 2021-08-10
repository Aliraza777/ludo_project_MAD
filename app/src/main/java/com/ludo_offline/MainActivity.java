package com.ludo_offline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnplay = findViewById(R.id.enter);
    }
//
//    void setUpListner(){
//        btnplay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext() , LudoActivity.class);
//            }
//        });
//    }

    public void onPlayClick(View v)
    {
        startActivity(new Intent(getApplicationContext(),LudoActivity.class));
    }
}
