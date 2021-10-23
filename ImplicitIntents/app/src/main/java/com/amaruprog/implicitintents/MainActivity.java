package com.amaruprog.implicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
//    M. Fahmi Amaruddin(19.11.3008)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @SuppressLint("NonConstantResourceId")
    public void doSomething(View view) {
        switch (view.getId()){
            case R.id.b1:
                Intent il = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(il);
                break;
            case R.id.b2:
                Intent ill = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:082317726313"));
                startActivity(ill);
                break;
            case R.id.b3:
                Intent illl = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:7.7599,110.4090"));
                startActivity(illl);
                break;
        }
    }
}