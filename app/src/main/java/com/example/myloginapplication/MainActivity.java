package com.example.myloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText uname,pwd;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname=(EditText) findViewById(R.id.uname);
        pwd=(EditText) findViewById(R.id.pwd);
        login=(Button) findViewById(R.id.btn);

        login.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Validate(uname.getText().toString(),pwd.getText().toString());


    }
    public void Validate(String uname,String pwd){
        if(uname.equals("admin") && pwd.equals("1234")){
            Intent intent=new Intent(this,SuccessActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(),"Failed Attempt!",Toast.LENGTH_LONG).show();
        }

    }
}