package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText pass;

    Button lgin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        pass = findViewById(R.id.password);
        lgin = findViewById(R.id.login);

    }

    public void login(View view) {


        String sname = name.getText().toString();
        String spass = pass.getText().toString();

        if (sname.equals("umar") && spass.equals("123")) {
            Intent i1 = new Intent(this, page2.class);
            startActivity(i1);
        } else {
            Toast.makeText(MainActivity.this, "Wrong Credentials", Toast.LENGTH_LONG).show();
        }
    }
}