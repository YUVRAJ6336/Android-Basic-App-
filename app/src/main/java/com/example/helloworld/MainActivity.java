package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onRegisterBtnClick (View view) {
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText firstNameEntry = findViewById(R.id.firstNameEntry);
        EditText lastNameEntry = findViewById(R.id.lastNameEntry);
        EditText emailEntry = findViewById(R.id.emailEntry);

        txtFirstName.setText("First Name : " + firstNameEntry.getText().toString());
        txtLastName.setText("Last Name : " + lastNameEntry.getText().toString());
        txtEmail.setText("Email : " + emailEntry.getText().toString());

    }
}