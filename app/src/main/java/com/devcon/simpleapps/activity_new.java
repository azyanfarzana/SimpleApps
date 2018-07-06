package com.devcon.simpleapps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 6/7/2018.
 */

public class activity_new extends AppCompatActivity {

    private Button btnNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        btnNumber = findViewById(R.id.button_number);

        btnNumber.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Number.class);
                startActivity(intent);
            }

        });
    }
}
