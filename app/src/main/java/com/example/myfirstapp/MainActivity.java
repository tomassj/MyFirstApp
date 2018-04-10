package com.example.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

//import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        // Do something in response to button
    }

    /** Called when the user taps the Send button */
    /*public void callPhone(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity2.class);
        EditText editText2 = findViewById(R.id.editText2);
        String message = editText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        *//*Uri number = Uri.parse(message);
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);*//*
        startActivity(intent);
        // Do something in response to button
    }*/

    /** Called when the user taps the Call buttom */
    public void callPhone(View view) {
        EditText editText2 = findViewById(R.id.editText2);
        String message = editText2.getText().toString();
        String message2 = "tel:"+ message;
        //String message = "tel:0705462999";
        Uri number = Uri.parse(message2);
        //Uri number = Uri.parse("tel:0705462999");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
        // Do something in response to button
    }

}
