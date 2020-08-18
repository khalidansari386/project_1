package com.example.project_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class navigation extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        Button BtnActivitiyOne = findViewById(R.id.BtnActivitiyOne);
        Button BtnActivitiyTwo = findViewById(R.id.BtnActivitiyTwo);
        Button BtnActivitiyThree = findViewById(R.id.BtnActivitiyThree);

        BtnActivitiyOne.setOnClickListener(this);
        BtnActivitiyTwo.setOnClickListener(this);
        BtnActivitiyThree.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.BtnActivitiyOne:
                Intent intent = new Intent(navigation.this,activity_login.class);
                startActivity(intent);
                break;

            case R.id.BtnActivitiyTwo:
                Intent imerse = new Intent(navigation.this,activity_contact.class);
                startActivity(imerse);
                break;

            case R.id.BtnActivitiyThree:
                Intent imniv = new Intent(navigation.this,activity_about.class);
                startActivity(imniv);
                break;
        }

    }
}