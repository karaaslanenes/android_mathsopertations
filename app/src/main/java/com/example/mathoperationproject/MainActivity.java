package com.example.mathoperationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText inputXEdit_text;
    private EditText inputYEdit_text;
    private TextView additionText_View;
    private TextView subtractionText_View;
    private TextView multiplicationText_View;
    private TextView divisionText_View;
    private Button calculatorButton;

    private  Double x;
    private Double y;
    private  Double sum;
    private Double subtraction;
    private Double multiplication;
    private Double division;
    private Double twoDecimalPlace;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


calculatorButton=(Button) findViewById(R.id.calculator_button);
calculatorButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        inputXEdit_text=(EditText) findViewById(R.id.input_x_edit_text);
        x=Double.parseDouble(inputXEdit_text.getText().toString());

        inputYEdit_text=(EditText) findViewById(R.id.input_y_edit_text);
        y=Double.parseDouble(inputYEdit_text.getText().toString());

        sum=x+y;
        additionText_View=(TextView) findViewById(R.id.addition_text_view) ;
        additionText_View.setText("Addition of x and y  is :"+String.valueOf(sum));

        subtraction=x-y;
        subtractionText_View=(TextView) findViewById(R.id.subtraction_text_view);
        subtractionText_View.setText("Subtract y from x is :"+String.valueOf(subtraction));

        multiplication=x*y;
        multiplicationText_View=(TextView) findViewById(R.id.multiplication_text_view);
        multiplicationText_View.setText("Product of x and y is :"+String.valueOf(multiplication));

        division=x/y;
        divisionText_View=(TextView) findViewById(R.id.division_text_view);
        twoDecimalPlace=Math.round(division * 100.0) / 100.0;;

        //divisionText_View.setText("Divide x/y ="+String.format("%.2f",String.valueOf(division)));
        divisionText_View.setText("Divide x/y ="+String.valueOf(twoDecimalPlace));



    }
});



    }
}