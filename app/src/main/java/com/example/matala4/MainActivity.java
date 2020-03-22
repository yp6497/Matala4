package com.example.matala4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int num1,num2,num3,num4,num5,count=0;
    String st1,st2,st3;
    EditText e1,e2,e3;
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.textView);
        tv2=findViewById(R.id.textView2);
        tv3=findViewById(R.id.textView3);
        tv4=findViewById(R.id.textView4);
        tv5=findViewById(R.id.textView5);
        tv6=findViewById(R.id.textView6);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        st1=e1.getText().toString();
       // if(st1=="") {

       // }
        st2=e1.getText().toString();
        st3=e1.getText().toString();

    }


    public void NewEx(View view) {
        num1=(int) (Math.random()*99+10);
        tv3.setText(num1+"");
        num2=(int) (Math.random()*99+10);
        tv4.setText(num2+"");
        tv1.setText("");
        tv2.setText("");
        tv5.setText("");
        tv6.setText("");
    }

    public void Thirdtime(View view) {
        Toast.makeText(this, count/3+"", Toast.LENGTH_SHORT).show();

    }

    public void Secondtime(View view) {

        tv2.setText(num3+num4+"");
        num5=(int) (Math.random()*99+10);
        tv6.setText(num5+"");
    }

    public void Firsttime(View view) {
        num3=num1+num2;
        //if(num3==e(int)
        //count++;
        tv1.setText(num1+num2+"");
        num4=(int) (Math.random()*99+10);
        tv5.setText(num4+"");
    }
}
