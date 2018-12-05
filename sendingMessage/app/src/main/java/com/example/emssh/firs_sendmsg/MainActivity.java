package com.example.emssh.firs_sendmsg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendData(View view) {
        EditText et = findViewById(R.id.etSend);
        String message = et.getText().toString();
        Intent i = new Intent(this,Main2Activity.class);
        i.putExtra("EXTRA_MESSAGE",message);
        startActivity(i);
    }
}
