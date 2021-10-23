package com.amaruprog.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
//    M. Fahmi Amaruddin
//    19.11.3008
    EditText el;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        el = (EditText) findViewById(R.id.edit1);
    }

    public void doSomething(View view) {
        Intent il = new Intent(this,Second.class);
        il.putExtra("user",el.getText().toString());
        startActivity(il);
    }
}