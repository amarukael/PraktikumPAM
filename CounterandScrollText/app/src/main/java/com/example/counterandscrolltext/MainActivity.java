package com.example.counterandscrolltext;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
//Create By
//M. Fahmi Amaruddin
//(19.11.3008)

public class MainActivity extends AppCompatActivity {
    private int cntr = 0;
    private TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.txtcount);
    }

    public void btnplus(View view){
        cntr++;
        if (txt != null)
            txt.setText(Integer.toString(cntr));
    }

    public void btnreset(View view) {
        cntr = 0;
        txt.setText(Integer.toString(cntr));
    }
}