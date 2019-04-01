package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private Button soma;
    private Button sub;
    private Button mult;
    private Button limpar;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.numberUm);
        numero2 = (EditText) findViewById(R.id.numberDois);
        soma = (Button) findViewById(R.id.buttonSoma);
        sub =(Button) findViewById(R.id.buttonSubtracao);
        mult = (Button) findViewById(R.id.buttonMultiplicacao);
        limpar = (Button) findViewById(R.id.buttonLimpar);
        result = (TextView) findViewById(R.id.textViewResultado);



        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                   Double num1 = Double.parseDouble(numero1.getText().toString());
                   Double num2 = Double.parseDouble(numero2.getText().toString());
                   Double total = num1 + num2;

                   result.setText("O valor da adição é: "+total);


                }catch (Exception E){

                    Toast.makeText(MainActivity.this, "Estamos no Beta. Obrigado pela compreensão", Toast.LENGTH_LONG).show();

                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double num1 = Double.parseDouble(numero1.getText().toString());
                    Double num2 = Double.parseDouble(numero2.getText().toString());
                    Double total = num1 - num2;

                    result.setText("O valor da subtração é: "+total);


                }catch (Exception E){

                    Toast.makeText(MainActivity.this, "Estamos no Beta. Obrigado pela compreensão", Toast.LENGTH_LONG).show();

                }
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Double num1 = Double.parseDouble(numero1.getText().toString());
                    Double num2 = Double.parseDouble(numero2.getText().toString());
                    Double total = num1 * num2;

                    result.setText("O valor da multiplicação é: "+total);

                }catch (Exception E){
                    Toast.makeText(MainActivity.this, "Estamos no Beta. Obrigado pela compreensão", Toast.LENGTH_LONG).show();
                }
            }
        });


        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1.setText("");
                numero2.setText("");
            }
        });


    }
}
