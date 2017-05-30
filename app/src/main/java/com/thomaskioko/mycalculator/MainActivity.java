package com.thomaskioko.mycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    //Declare Global Variables.
    private EditText etFirstNumber;
    private EditText etSecondNumber;
    private Button btnCalculate;
    private TextView tvResult;
    private RadioButton rbAddition;
    private RadioButton rbSubtraction;
    private RadioButton rbMultiplication;
    private String strFirstNumber;
    private String strSecondNumber;
    private int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialise views.
        etFirstNumber = (EditText) findViewById(R.id.etFirstNumber);
        etSecondNumber = (EditText) findViewById(R.id.etSecondNumber);
        btnCalculate = (Button) findViewById(R.id.btnCalculate);
        tvResult = (TextView) findViewById(R.id.tvResult);
        rbAddition = (RadioButton) findViewById(R.id.rbAddition);
        rbMultiplication = (RadioButton) findViewById(R.id.rbMultiplication);
        rbSubtraction = (RadioButton) findViewById(R.id.rbSubtraction);

        //Add listener to radioButtons
        rbAddition.setOnCheckedChangeListener(this);
        rbMultiplication.setOnCheckedChangeListener(this);
        rbSubtraction.setOnCheckedChangeListener(this);

        //Set onClick Listener on the button
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Get user input from the editText.
                strFirstNumber = etFirstNumber.getText().toString();
                strSecondNumber = etSecondNumber.getText().toString();

                //Convert String to Integer
                int firstNumber = Integer.parseInt(strFirstNumber);
                int secondNumber = Integer.parseInt(strSecondNumber);

                int answer;

                switch (flag){
                    case 1:
                        answer = firstNumber + secondNumber;
                        tvResult.setText("Answer is:: + "answer);
                        break;
                    case 2:
                        answer = firstNumber - secondNumber;
                        tvResult.setText("Answer is:: + "answer);
                        break;
                    case 3:
                        answer = firstNumber * secondNumber;
                        tvResult.setText("Answer is:: + "answer);
                        break;
                    default:
                        break;
                }


            }
        });
    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

        if (compoundButton.getId() == R.id.rbAddition && isChecked) {
            flag = 1;

        } else if (compoundButton.getId() == R.id.rbSubtraction && isChecked) {
            flag = 2;

        } else if (compoundButton.getId() == R.id.rbMultiplication && isChecked) {
            flag = 3;
        }
    }
}
