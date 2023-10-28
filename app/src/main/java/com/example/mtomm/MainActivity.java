package com.example.mtomm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mtomm.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
            final EditText metersEditText = findViewById(R.id.metersEditText);
            final Button convertButton = findViewById(R.id.convertButton);
            final TextView resultTextView = findViewById(R.id.resultTextView);

            convertButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Get the input from the EditText
                    String metersString = metersEditText.getText().toString();

                    if (!metersString.isEmpty()) {
                        try {
                            // Convert meters to millimeters (1 meter = 1000 millimeters)
                            double meters = Double.parseDouble(metersString);
                            double millimeters = meters * 1000;

                            // Display the result
                            resultTextView.setText(millimeters + " millimeters");
                        } catch (NumberFormatException e) {
                            resultTextView.setText("Invalid input");
                        }
                    } else {
                        resultTextView.setText("Please enter a value in meters");
                    }
                }
            });





        }
    }
}