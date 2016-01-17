package com.example.project;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    String total = "";
    double  v1,v2;
    String sign = "";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public void onClick(View v) {
        Button button = (Button) v;
        String str = button.getText().toString();
        total += str;
        EditText edit = (EditText) findViewById(R.id.editText);
        edit.setText(total);
    }

    public void OnAdd(View v){
        v1 = Double.parseDouble(total);
        total = "";
        Button button = (Button)v;
        String str = button.getText().toString();
        sign = str;
        EditText edit = (EditText)findViewById(R.id.editText);
        edit.setText("");
    }

    public void OnCalculate(View v){
        EditText edit = (EditText)findViewById(R.id.editText);
        String str2 = edit.getText().toString();
        v2 = Double.parseDouble(str2);
        double grand_total = 0;
        if (sign.equals("+")){
            grand_total = v1+v2;
        }
        else if (sign.equals("-")){
            grand_total = v1-v2;
        }
        else if (sign.equals("*")){
            grand_total = v1*v2;
        }
        else if (sign.equals("/")){
            grand_total = v1/v2;
        }
        edit.setText(grand_total+"");
    }
    public void OnClear(View v){
        EditText edit = (EditText)findViewById(R.id.editText);
        edit.setText("");
        total = "";
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate();
//        return super.onCreateOptionsMenu(menu);
//    }
}