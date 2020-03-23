package com.example.matala4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int num1, num2, num3, num4, num5, count = 0;
    int answer;
    String st1, st2, st3;
    ImageView v1, v2, v3;
    EditText e1, e2, e3;
    TextView tv1, tv2, tv3, tv4, tv5, tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = findViewById(R.id.imageView);
        v2 = findViewById(R.id.imageView2);
        v3 = findViewById(R.id.imageView3);
        tv1 = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        tv4 = findViewById(R.id.textView4);
        tv5 = findViewById(R.id.textView5);
        tv6 = findViewById(R.id.textView6);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);
    }

    public void NewEx(View view) {
        count = 0;
        num5 = (int) (Math.random() * 99 + 10);
        num4 = (int) (Math.random() * 99 + 10);
        v1.setVisibility(view.INVISIBLE);
        v2.setVisibility(view.INVISIBLE);
        v3.setVisibility(view.INVISIBLE);
        num1 = (int) (Math.random() * 99 + 10);
        tv3.setText(num1 + "");
        num2 = (int) (Math.random() * 99 + 10);
        tv4.setText(num2 + "");
        tv1.setText("");
        tv2.setText("");
        tv5.setText("");
        tv6.setText("");
    }

    public void Thirdtime(View view) {
        st3 = e3.getText().toString();
        if (st3.isEmpty())
            Toast.makeText(this, "you didn't enter any number", Toast.LENGTH_SHORT).show();
        else {
            answer = Integer.parseInt(st3);
            if (num3 + num4 + num5 == answer) {
                v2.setVisibility(view.VISIBLE);
                v2.setImageResource(R.drawable.vsign);
                count++;
            } else {
                v2.setVisibility(view.VISIBLE);
                v2.setImageResource(R.drawable.xsign);
            }
            Toast.makeText(this, count + "/" + 3 + "", Toast.LENGTH_SHORT).show();}
        }

    public void Secondtime(View view) {
        st2 = e2.getText().toString();
        if (st2.isEmpty())
            Toast.makeText(this, "you didn't enter any number", Toast.LENGTH_SHORT).show();
        else {
                tv2.setText(num3 + num4 + "");
                tv6.setText(num5 + "");
                answer = Integer.parseInt(st2);
                if (num4 + num1 + num2 == answer) {
                    v1.setVisibility(view.VISIBLE);
                    v1.setImageResource(R.drawable.vsign);
                    count++;
                } else {
                    v1.setVisibility(view.VISIBLE);
                    v1.setImageResource(R.drawable.xsign);}
                }
            }

    public void Firsttime(View view) {
        num3 = num1 + num2;
        st1 = e1.getText().toString();
        if(st1.isEmpty())
            Toast.makeText(this, "you didn't enter any number", Toast.LENGTH_SHORT).show();
            else{
                tv1.setText(num1 + num2 + "");
                tv5.setText(num4 + "");
                answer = Integer.parseInt(st1);
                if (num1 + num2 == answer) {
                    v3.setVisibility(view.VISIBLE);
                    v3.setImageResource(R.drawable.vsign);
                    count++;
                } else {
                    v3.setVisibility(view.VISIBLE);
                    v3.setImageResource(R.drawable.xsign);}
            }
        }
    }



