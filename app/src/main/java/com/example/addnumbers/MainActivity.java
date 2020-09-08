package com.example.addnumbers;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addNos(View view){
        int n1, n2, sum;
        EditText first = (EditText)findViewById(R.id.firstNo);
        EditText second = (EditText)findViewById(R.id.secondNo);
        TextView result = (TextView) findViewById(R.id.result);
        n1 = Integer.parseInt(first.getText().toString());
        n2 = Integer.parseInt(second.getText().toString());
        sum = n1+n2;
        result.setText(Integer.toString(sum));

    }



}