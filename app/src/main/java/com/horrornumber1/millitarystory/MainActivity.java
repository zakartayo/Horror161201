package com.horrornumber1.millitarystory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button millitaryBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        millitaryBtn = (Button)findViewById(R.id.millitary_btn);
        millitaryBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent millitary = new Intent(MainActivity.this, MillitaryActivity.class);
                startActivity(millitary);
            }
        });
    }
}
