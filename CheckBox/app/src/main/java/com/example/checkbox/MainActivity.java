package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox milkcheckBox, sugarcheckBox, watercheckBox;
    private Button showButton;
    private TextView resultTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkcheckBox = findViewById(R.id.milkid);
        sugarcheckBox = findViewById(R.id.sugarid);
        watercheckBox = findViewById(R.id.waterid);

        showButton = findViewById(R.id.btnid);

        resultTextView = findViewById(R.id.txtviewid);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                if(milkcheckBox.isChecked()) {
                    String value = milkcheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered\n");
                }if(sugarcheckBox.isChecked()) {
                    String value = sugarcheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered\n");
                }if(watercheckBox.isChecked()) {
                    String value = watercheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered\n");
                }

                resultTextView.setText(stringBuilder);
            }
        });
    }
}