package com.abbaize;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void bsignup(View view) {
        Intent bsignup_= new Intent(this,SignUpActivity.class);
        startActivity(bsignup_);
    }

    public void blogin(View view) {
        Intent blogin_= new Intent(this,LoginActivity.class);
        startActivity(blogin_);
    }
}
