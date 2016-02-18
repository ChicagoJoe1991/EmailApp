package com.example.walter.emailapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class EmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);



    }

    public void onClickButton1(View view){
        EditText emailText = (EditText) findViewById(R.id.editText1);
        String emailaddress = emailText.getText().toString();

        EditText message = (EditText) findViewById(R.id.editText2);
        String messageText = message.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setType("text/plain");

        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        intent.putExtra(Intent.EXTRA_EMAIL,emailaddress);

        startActivity(intent);

    }


}
