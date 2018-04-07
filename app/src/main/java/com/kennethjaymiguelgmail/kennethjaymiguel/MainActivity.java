package com.kennethjaymiguelgmail.kennethjaymiguel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText oho;
    private Button butt;
    private EditText oha;
    EditText editTextToclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        oho = findViewById(R.id.oho);
        oha = findViewById(R.id.oha);
        butt = findViewById(R.id.Butt);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextToclear.setText("");
                int num1 = Integer.parseInt(oho.getText().toString());
                int num2 = Integer.parseInt(oha.getText().toString());

                int rel = num1 + num2;


                Toast.makeText(MainActivity.this, "The Sum of two numbers:" + String.valueOf(rel).toString(),Toast.LENGTH_LONG).show();

            }
        });
        
    }
}
