package com.thomaskioko.mycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * @author Thomas Kioko
 */

public class LoginActivity extends AppCompatActivity {

    //Global variables.
    private Button btnSignIn;
    private EditText etEmail;
    private EditText etPassword;
    private String strEmail;
    private String strPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Initialise Views
        btnSignIn = (Button) findViewById(R.id.btnSignUp);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (v.getId() == R.id.btnSignUp) {

                    strEmail = etEmail.getText().toString();
                    strPassword = etPassword.getText().toString();

                    Toast.makeText(LoginActivity.this, strEmail, Toast.LENGTH_SHORT).show();


                }

            }
        });


    }


}

