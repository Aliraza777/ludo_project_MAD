package com.ludo_offline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnplay,p2,p4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnplay = findViewById(R.id.enter);
        p2=findViewById(R.id.player_2);
        p4=findViewById(R.id.player_4);

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,LudoActivity.class);
                intent.putExtra("player","2");
                startActivity(intent);
                finish();
            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,LudoActivity.class);
                intent.putExtra("player","4");
                startActivity(intent);
                finish();
            }
        });
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
//
//    public void onPlayClick(View v)
//    {
//        startActivity(new Intent(getApplicationContext(),LudoActivity.class));
//    }
}
