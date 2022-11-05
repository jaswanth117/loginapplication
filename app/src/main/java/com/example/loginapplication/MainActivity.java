package com.example.loginapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // These are the global variables
    EditText password;
    EditText username;
    TextView result;
    Button loginbtn;
    Button resetbtn;
    Button forgotpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        result = (TextView) findViewById(R.id.tvResult);
        loginbtn = (Button) findViewById(R.id.loginbtn);
        resetbtn = (Button) findViewById(R.id.resetbtn);
        forgotpass = (Button) findViewById(R.id.forgotpass);
/*
loginbtn
*/
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString();
                String Password = password.getText().toString();
                result.setText("Name:\t" + name + "\nPassword:\t" + Password);
                //
                if (username.getText().toString().equals("ADMIN") && password.getText().toString().equals("scooby")) {
                    //correct
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                } else
                    //incorrect
                    Toast.makeText(MainActivity.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
            }
        });
/*
Reset Button
*/
        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.setText("");
                password.setText("");
                result.setText("");
                username.requestFocus();
            }
        });
        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forgotpassword();
            }
        });
    }
    public void forgotpassword(){
        Intent intent=new Intent(MainActivity.this,forgotpassword.class);
        startActivity(intent);
        finish();
}
}
