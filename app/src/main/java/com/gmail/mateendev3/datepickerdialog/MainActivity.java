package com.gmail.mateendev3.datepickerdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_set_date).setOnClickListener(v -> {
            DialogFragment dialog = new MyDatePickerDialog();
            dialog.show(getSupportFragmentManager(), "SHOW_DATE");
        });

        findViewById(R.id.iv_intent).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });
    }
}